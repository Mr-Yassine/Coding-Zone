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

        /*String title = "This is a login page";
        request.setAttribute("title_var", title);
        this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);*/


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html>");
        response.getWriter().println("<head>");
        response.getWriter().println("<meta>");
        response.getWriter().println("<title>Quiz</title>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Login</h1>");
        response.getWriter().println("<form action=\"Login\" method=\"post\">");
        response.getWriter().println("<p>Sign In</p>");
        response.getWriter().println("<input name=\"username\" placeholder=\"Enter username\"><br>");
        response.getWriter().println("<input name=\"password\" placeholder=\"Enter password\"><br>");
        response.getWriter().println("<input type=\"submit\" value=\"Submit\">");
        response.getWriter().println("</form>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");






    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        PrintWriter out = response.getWriter();

        StaffImpl StaffImpl = new StaffImpl();

        try {
            Boolean user = StaffImpl.login(username,password);

            if(!user){
                out.println("<h1>Wrong username or password</h1>");
            }else {
                System.out.println("Ana hna2");
                HttpSession session = request.getSession();
                session.setAttribute("user", false);
                out.println("<h1>Well Done</h1>");
            }
        } catch (Exception e){
            out.println("<h1>Error</h1>");
        }


    }
}
