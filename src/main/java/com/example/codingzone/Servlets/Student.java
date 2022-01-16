package com.example.codingzone.Servlets;

import com.example.codingzone.DAO.DAOFactory;
import com.example.codingzone.Models.StudentModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Student", value = "/Student")
public class Student extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("signin.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String code = request.getParameter("code");

        PrintWriter out = response.getWriter();

        try {
            Boolean student = DAOFactory.signin(name, code);

            if(!student){
                out.println("<h1>Wrong code</h1>");
            }else {
                HttpSession session = request.getSession();
                session.setAttribute("student", true);
                out.println("<h1>Welcome to quiz page</h1>");
                response.sendRedirect("quiz.jsp");
            }
        } catch (Exception e){
            out.println("<h1>Error</h1>");
        }
    }
}
