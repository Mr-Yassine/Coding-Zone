package com.example.codingzone.Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "Quiz", value = "/Quiz")
public class Quiz extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect("quiz.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        System.out.println(name);

        int q1 = Integer.parseInt(request.getParameter("q1"));
        int q2 = Integer.parseInt(request.getParameter("q2"));

        System.out.println(q1 + " " + q2);

        int total = q1 + q2 ;

        request.setAttribute("name", name);
        request.setAttribute("q1", q1);
        request.setAttribute("q2", q2);
        request.setAttribute("total", total);

        response.sendRedirect("quizresult.jsp");



        if (request.getParameter("submit") != null) {
            System.out.println("hna");

        }

    }
}
