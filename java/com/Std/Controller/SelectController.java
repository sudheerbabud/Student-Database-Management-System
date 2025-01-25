package com.Std.Controller;
import java.io.IOException;
import java.util.List;

import com.Std.DAO.MyDao;
import com.Std.Model.MyModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/myreg")
public class SelectController extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyDao md = new MyDao();
        List<MyModel> li = md.getAllDetails();
        
        for(MyModel cl:li) {
        	System.out.println("MyProjectController....");
        	System.out.println(cl.getUsername());
        	System.out.println(cl.getPassword());
        	System.out.println(cl.getEmail());
        	System.out.println(cl.getPhonenumber());
        	
        }

        if (li != null) {
            for (MyModel cl : li) {
                System.out.println(cl.getUsername() + " " + cl.getPassword() + " " + cl.getEmail()+ " "+ cl.getPhonenumber());
            }
        }
        
      
        if (li != null) {
            request.setAttribute("students", li);
        } else {
            request.setAttribute("students", null);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("listpage.jsp");
        
        dispatcher.forward(request, response);
        

	}

}