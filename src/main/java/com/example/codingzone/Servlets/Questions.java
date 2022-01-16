package com.example.codingzone.Servlets;

import com.example.codingzone.DAO.DAOFactory;
import com.example.codingzone.Models.QuestionsModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Questions", value = "/Questions")
public class Questions extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("questions.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String question = request.getParameter("question");
        String answer1 = request.getParameter("answer1");
        String answer2 = request.getParameter("answer2");
        String answer3 = request.getParameter("answer3");
        Integer correct = Integer.parseInt(request.getParameter("correct"));

        PrintWriter out = response.getWriter();
        QuestionsModel q = new QuestionsModel();

        try {

            q.setQuestion(question);
            q.setAnswer1(answer1);
            q.setAnswer2(answer2);
            q.setAnswer3(answer3);
            q.setCorrect(String.valueOf(correct));

            DAOFactory.addQuestion(q);

            HttpSession session = request.getSession();
            session.setAttribute("message", true);
            out.println("<h1>Question added successfully</h1>");

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
