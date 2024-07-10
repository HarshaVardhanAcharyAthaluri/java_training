package com.usermanagment.controller;

import java.io.IOException;
import java.util.List;

import com.usermanagment.dao.UserDao;
import com.usermanagment.dto.UserDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/users")
public class UserDetailsServlet extends HttpServlet{

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	UserDao dao = new UserDao();
	List<UserDto> users= dao.getUsers();
	req.setAttribute("userlist", users);
	req.setAttribute("msg", "Data From Servlet");
	
	req.getRequestDispatcher("userdetails.jsp").forward(req, resp);
}
}
