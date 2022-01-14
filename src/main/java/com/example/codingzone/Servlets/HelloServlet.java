package com.example.codingzone.Servlets;

import com.example.codingzone.Config.Config;

import java.io.*;
import java.sql.Connection;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;



    public void init() {

        message = "Hello World!";

        Connection conn = Config.getConnection();
        if (conn == null) {
            message = "Connection is null";
        }else {
            message = "Connection is not null";
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}