package jdbc_training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductInventory {

	public static void main(String[] args) {
		try {
			// Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perfecient_training", "root", "admin");
			
			// create the statement
			 Statement stmt= con.createStatement();
			 
			 //execute the statement
			 stmt.execute("insert into product values(1,'JavaBook',20,50)");
			 
			 //close the connection
			 con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
