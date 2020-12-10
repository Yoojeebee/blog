package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

//@WebServlet("/AdditionalInfoServlet")
public class AdditionalInfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=EUC-KR");

        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>");
        out.print("추가적인 요청 정보");
        out.print("</title>");
        out.print("<body>");
        out.print("Request Method : " + request.getMethod() + "<br/>");
        out.print("Path Info : " + request.getPathInfo() + "<br/>");
        out.print("Query String : " + request.getQueryString() + "<br/>");
        out.print("Content Length : " + request.getContentLength() + "<br/>");
        out.print("Content Type : " + request.getContentType() + "<br/>");
        out.print("</body>");
        out.print("</head>");
        out.print("</html>");

        out.close();
    }

}
