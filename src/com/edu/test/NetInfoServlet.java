package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/NetInfoServlet")
public class NetInfoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>");
        out.print("Request 정보 출력 Servlet");
        out.print("</title>");
        out.print("<body>");
        out.print("<h3>네트워크 관련 요청 정보</h3>");
        out.print("Request Scheme : " + request.getScheme() + "<br/>");
        out.print("Server Address : " + request.getServerName() + "<br/>");
        out.print("Server Port : " + request.getLocalAddr() + "<br/>");
        out.print("Client Address : " + request.getRemoteAddr() + "<br/>");
        out.print("Client Host : " + request.getRemoteHost() + "<br/>");
        out.print("Client Port : " + request.getRemotePort() + "<br/>");
        out.print("</body>");
        out.print("</head>");
        out.print("</html>");

        out.close();
    }
}
