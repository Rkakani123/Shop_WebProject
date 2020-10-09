package Com.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Com.Model.Customer;
import Com.Model.Product;

@WebServlet("/PayController")
public class PayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		try
		{
			
			res.setContentType("text/html");
		
			HttpSession session = req.getSession(true);
			Customer c = (Customer)session.getAttribute("Bill");
			Database db = new Database();
			db.createTable(c.getcId());
			if(!session.isNew())
			{
				session.removeAttribute("Bill");
				session.invalidate();
				ProductController pc = new ProductController();
				pc.destroy();
				System.out.println("Destroyed");
			}
			PrintWriter pw = res.getWriter();
			pw.println("<script type=\"text/javascript\">");
		    pw.println("alert('Item Purchasing Successful..! Cart Will Be Empty Now..!');");
		    pw.println("window.location.href = \"Product.jsp\";");
		    pw.println("</script>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
