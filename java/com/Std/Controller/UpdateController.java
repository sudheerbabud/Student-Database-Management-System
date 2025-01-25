package com.Std.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Std.utility.AdminDBConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



import com.Std.DAO.MyDao;
import com.Std.Model.MyModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class UpdateController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String phonenumber = request.getParameter("phonenumber");

        try (Connection con = AdminDBConnection.connect()) {
            String query = "UPDATE userlogin SET password=?, email=?, phonenumber=? WHERE username=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, password);
            ps.setString(2, email);
            ps.setString(3, phonenumber);
            ps.setString(4, username);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                request.setAttribute("message", "Details successfully updated.");
            } else {
                request.setAttribute("message", "Update failed. Please try again.");
            }
            request.getRequestDispatcher("updateSuccess.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
