package com.aayush;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int a = Integer.parseInt(req.getParameter("num1"));
        int b = Integer.parseInt(req.getParameter("num2"));
        int c = a + b;
        System.out.println(c);

        PrintWriter out = res.getWriter();
        out.println(c +" (from post)");

        RequestDispatcher rd = req.getRequestDispatcher("sqr");
        rd.forward(req, res);
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int a = Integer.parseInt(req.getParameter("num1"));
        int b = Integer.parseInt(req.getParameter("num2"));
        int c = a + b;
        System.out.println(c);

        PrintWriter out = res.getWriter();
        out.println(c +" (from get)");

    }
}
