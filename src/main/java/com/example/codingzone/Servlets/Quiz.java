package com.example.codingzone.Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "Quiz", value = "/Quiz")
public class Quiz extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html>");
        response.getWriter().println("<head>");
        response.getWriter().println("<meta>");
        response.getWriter().println("<title>Quiz</title>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Quiz</h1>");
        response.getWriter().println("<form action=\"Quiz\" method=\"post\">");
        response.getWriter().println("<p>What is JAVA?</p>");
        response.getWriter().println("<input type=\"radio\" name=\"answer\" value=\"1\">OOP Language<br>");
        response.getWriter().println("<input type=\"radio\" name=\"answer\" value=\"2\">Script Language<br>");
        response.getWriter().println("<input type=\"radio\" name=\"answer\" value=\"3\">Balise Language<br>");
        response.getWriter().println("<input type=\"submit\" value=\"Submit\">");
        response.getWriter().println("</form>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");


        //this.getServletContext().getRequestDispatcher("/WEB-INF/quiz.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
