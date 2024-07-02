package jdbc_training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		try {
			// Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered");
			
			// Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perfecient_training", "root", "admin");
			System.out.println("Connection Establishment");
			
			String sql = "insert into product values(?,?,?,?)";
			
			// create the statement
			 PreparedStatement ptstmt= con.prepareStatement(sql);
			 System.out.println("Statement creation");
			 
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter Product ID:: ");
			 Integer pid= sc.nextInt();
			 ptstmt.setInt(1, pid);
			 
			 System.out.println("Enter Product Name:: ");
			 String pname= sc.next();
			 ptstmt.setString(2, pname);
			 
			 System.out.println("Enter Product price:: ");
			 Integer price= sc.nextInt();
			 ptstmt.setInt(3, price);
			 
			 System.out.println("Enter Product units:: ");
			 Integer units= sc.nextInt();
			 ptstmt.setInt(4, units);
			 
			 //execute the statement
			 ptstmt.execute();
			 System.out.println("Data inserted");
			 //close the connection
			 con.close();
			 System.out.println("Connection close");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
