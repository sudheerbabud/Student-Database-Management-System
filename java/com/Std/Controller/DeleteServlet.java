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
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println(username);
		MyModel m = new MyModel();
		m.setUsername(username);
		MyDao d = new MyDao();
		String status = d.deleteStudent(m);
		System.out.println(status);
		if(status.equals("Success")) {
			RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("listpage.jsp");
			rd.forward(request, response);
		}
	}

}
