package com.usermanagment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.usermanagment.dto.UserDto;

public class UserDao {
	
	
	public UserDao() {
		
	}
	

	
	public void insertUsers(UserDto dto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perfecient_training", "root", "admin");
			PreparedStatement pt = con.prepareStatement("insert into userinfo values(?,?,?,?,?)");
			pt.setInt(1, dto.getUid());
			pt.setString(2, dto.getUsername());
			pt.setString(3, dto.getPassword());
			pt.setString(4, dto.getAddr());
			pt.setString(5, dto.getContact());
			pt.execute();
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public List<UserDto> getUsers(){
		List<UserDto> ul = new ArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perfecient_training", "root", "admin");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from userinfo;");
		
			while (rs.next()) {
				UserDto user = new UserDto();
				user.setUid(rs.getInt("uid"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setAddr(rs.getString("addr"));
				user.setContact(rs.getString("contact"));
				ul.add(user);
				
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return ul;
	}
	
	
	
}
