package com.example.codingzone.Servlets;

import com.example.codingzone.DAOImpl.StaffImpl;
import com.example.codingzone.Models.Staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
        String title = "This is a login page";
        request.setAttribute("title_var", title);
        this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);*/
        response.sendRedirect("login.jsp");

    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        StaffImpl StaffImpl = new StaffImpl();

        try {
            Boolean user = StaffImpl.login(username,password);

            if(!user){
                out.println("<h1>Wrong username or password</h1>");
            }else {
                HttpSession session = request.getSession();
                session.setAttribute("user", false);
                response.sendRedirect("dashboard.jsp");
                //out.println("<h1>Welcome to dashboard</h1>");
            }
        } catch (Exception e){
            out.println("<h1>Error</h1>");
        }


    }
}
