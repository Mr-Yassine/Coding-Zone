package com.example.codingzone.Servlets;

import com.example.codingzone.DAO.DAOFactory;
import com.example.codingzone.Models.StaffModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Staff", value = "/Staff")
public class Staff extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("register.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        StaffModel s = new StaffModel();

        try {


            s.setUsername(username);
            s.setEmail(email);
            s.setPassword(password);

            boolean staff = DAOFactory.register(s);

            if (staff) {
                HttpSession session = request.getSession();
                session.setAttribute("staff", true);
                response.sendRedirect("login.jsp");

            } else {
                response.sendRedirect("register.jsp");
            }


        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

}
