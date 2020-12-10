package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/URLInfoServlet")
public class URLInfoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=EUC-KR");

        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>");
        out.print("Request 정보 출력 Servlet");
        out.print("</title>");
        out.print("<body>");
        out.print("<h3>네트워크 관련 요청 정보</h3>");
        out.print("Request URI : " + request.getRequestURI() + "<br/>");
        out.print("Request URL : " + request.getRequestURL() + "<br/>");
        out.print("Context Path : " + request.getContextPath() + "<br/>");
        out.print("Request Protocol : " + request.getProtocol() + "<br/>");
        out.print("Servlet Path : " + request.getServletPath() + "<br/>");
        out.print("</body>");
        out.print("</head>");
        out.print("</html>");

        out.close();
    }

}
