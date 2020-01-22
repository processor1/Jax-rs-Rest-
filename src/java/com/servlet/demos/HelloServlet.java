/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet.demos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mobile Apps
 */
public class HelloServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String serverName = request.getServerName();
        int serverPort = request.getServerPort();
        String serverSheme = request.getScheme();
        String serverPath = request.getServletPath();
        String serverContext = request.getRemoteUser();

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");
            out.println("<style>");
            out.println("body{margin-left:300px;margin-right:300px;font-size:19px;font-family:monospace;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Server Infomration</h1>");

            out.println("<p> " + serverPort + " </p>");
            out.println("<p> " + serverSheme + " </p>");
            out.println("<p> " + serverContext + " </p>");
            out.println("<p> " + serverPath + " </p>");
            out.println("<p> " + request.getRemoteAddr() + " </p>");
            out.println("<p>" + request.getLocalAddr() + "</p>");
            out.println("<p>" + request.getLocalName() + "</p>");
            out.println("<p>" + request.getRequestURL() + "</p>");
            out.println("<p>" + request.getRequestedSessionId() + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
