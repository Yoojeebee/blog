package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("protected doGet() 메소드 실행!");

        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Test</title></head>");
        out.print("<body><h1>Have a nice Day!</h1></body>");
        out.print("</html>");
        out.close();
    }

}
