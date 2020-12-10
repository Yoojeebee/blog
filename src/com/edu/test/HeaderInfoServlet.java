package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/HeaderInfoServlet")
public class HeaderInfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=EUC-KR");

        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>");
        out.print("요청 헤더 정보");
        out.print("</title>");
        out.print("<body>");
        Enumeration<String> em = request.getHeaderNames();
        while(em.hasMoreElements()) {
            String name = em.nextElement();
            out.println(name + " : " + request.getHeader(name) + "<br/>");
        }
        out.print("</body>");
        out.print("</head>");
        out.print("</html>");

        out.close();
    }
}
