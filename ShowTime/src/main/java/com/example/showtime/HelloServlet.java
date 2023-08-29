package com.example.showtime;

import java.io.*;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/time-world")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 PrintWriter w = resp.getWriter();
 w.println("<html>");
 w.println("<h1>Hello World</h1>");
 w.println("</html>");

        w.println("<html>");
        Date today = new Date();
        w.println("<h1>"+today+"</h1>");
        w.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}