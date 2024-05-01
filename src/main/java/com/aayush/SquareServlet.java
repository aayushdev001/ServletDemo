package com.aayush;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println("Hello from square");
        int sq = Integer.parseInt(req.getParameter("num1"))*Integer.parseInt(req.getParameter("num1"));
        out.println("Square of num1 is: "+sq);

    }
}
