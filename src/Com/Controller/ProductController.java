package Com.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Com.Model.Product;
@WebServlet("/ProductController")
public class ProductController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
   	List<Product> lst=null;
	public void init()
	{
		lst=new LinkedList<Product>();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int prodId=Integer.parseInt(request.getParameter("pid"));
		String prodName=request.getParameter("pname");
		double prodPrice=Double.parseDouble(request.getParameter("pprice"));
		int prodQty=Integer.parseInt(request.getParameter("pqty"));
		
		HttpSession session=request.getSession(true);
		
		Product p1=new Product(prodId, prodName, prodPrice, prodQty, prodPrice*prodQty);
		lst.add(p1);
		Database db = new Database();
		db.addProduct(p1);
		
		session.setAttribute("shop",lst);
		response.sendRedirect("Product.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	/*@Override
	public void destroy() 
	{
		lst.clear();
		System.out.println("Destroyed..!");
	}*/

}
