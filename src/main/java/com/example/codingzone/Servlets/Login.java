package com.example.codingzone.Servlets;

import com.example.codingzone.DAO.DAOFactory;
import com.example.codingzone.DAOImpl.StaffDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        try {
            Boolean user = DAOFactory.login(username,password);

            if(!user){
                out.println("<h1>Wrong username or password</h1>");
            }else {
                HttpSession session = request.getSession();
                session.setAttribute("user", false);
                response.sendRedirect("dashboard.jsp");
            }
        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }


    }
}
