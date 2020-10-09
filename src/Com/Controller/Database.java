package Com.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Com.Model.Customer;
import Com.Model.Product;

public class Database 
{
	public void addProduct(Product p)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","Rkakani");
			PreparedStatement ps = conn.prepareStatement("insert into cart values(?,?,?,?,?)");
			ps.setInt(1,p.getProdId());
			ps.setString(2,p.getProdName());
			ps.setDouble(3,p.getProdPrice());
			ps.setDouble(4,p.getProdQty());
			ps.setDouble(5,p.getProdAmt());
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void truncate()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","Rkakani");
			PreparedStatement ps = conn.prepareStatement("truncate cart");
			ps.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void createTable(int Id) throws Exception
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","Rkakani");
			PreparedStatement ps = conn.prepareStatement("create table "+Id+"cust as select * from cart");
			ps.execute();
			truncate();
		}
		catch(Exception e)
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","Rkakani");
			PreparedStatement ps = conn.prepareStatement("insert into "+Id+"cust select * from cart");
			ps.execute();
			truncate();
		}
	}
	
	/*public static void main(String[] args)
	{
		Database db = new Database();
		db.createTable(1234);
	}*/
	
	public void createCustomer(Customer c)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","Rkakani");
			PreparedStatement ps = conn.prepareStatement("");
			ps.execute();
			truncate();
		}
		catch(Exception e)
		{
		
		}
	}
}
