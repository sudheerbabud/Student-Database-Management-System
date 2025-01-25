package com.Std.Controller;

import java.io.IOException;

import com.Std.DAO.MyDao;
import com.Std.Model.MyModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/register")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("IndexController");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phonenumber = request.getParameter("phonenumber");
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
		System.out.println(phonenumber);

		MyModel m = new MyModel();
		m.setUsername(username);
		m.setPassword(password);
		m.setEmail(email);
		m.setPhonenumber(phonenumber);

		MyDao d = new MyDao();
		String status = d.insertData(m);
		System.out.println(status);

		if (status.equals("Success")) {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("errorMessage", "Username already exists!!");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}
}
