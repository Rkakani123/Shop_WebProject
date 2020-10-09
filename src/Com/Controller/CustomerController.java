package Com.Controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Com.Model.Customer;
import Com.Model.Product;
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
   	{
   		try
   		{
   			res.setContentType("text/html");
   			int cId=Integer.parseInt(req.getParameter("cid"));
   			String cName=req.getParameter("cname");
   			long cMob=Long.parseLong(req.getParameter("cmob"));
   			String cAddress=req.getParameter("caddress");
   			List<Product> lst = null;
   			
   				HttpSession session = req.getSession(true);
				if(!session.isNew())
   				{
   					lst=(List<Product>)session.getAttribute("shop");
   					session.removeAttribute("shop");
   				}
   			
   			Customer c1 = new Customer(cId, cName, cAddress, cMob, lst);
   			req.setAttribute("Bill",c1);
   			//session.setAttribute("Bill",c1);
   			//System.out.println("Billing");
   			//res.sendRedirect("Bill.jsp");
   			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Bill.jsp");
   			rd.forward(req, res);
   		}
   		catch(Exception e)
   		{
   			e.printStackTrace();
   		}
   		
   	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
