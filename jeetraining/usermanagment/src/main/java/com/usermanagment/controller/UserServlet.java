package com.usermanagment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.usermanagment.dao.UserDao;
import com.usermanagment.dto.UserDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/save")
public class UserServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserDto user = new UserDto();
		
		user.setUid(Integer.parseInt(req.getParameter("uid")));
		user.setUsername(req.getParameter("username"));
		user.setPassword(req.getParameter("password"));
		user.setAddr(req.getParameter("addr"));
		user.setContact(req.getParameter("contact"));
		
		UserDao dao = new UserDao();
		dao.insertUsers(user);
		
		PrintWriter out = resp.getWriter();
		out.println("<center> <h1> Data Saved </h1></center>");
		
	}

}
