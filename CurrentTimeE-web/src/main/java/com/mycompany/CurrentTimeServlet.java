package com.mycompany;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrentTimeServlet extends HttpServlet {

    @EJB
    CurrentTimeBean currentTimeBean;
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet CurrentTimeServlet</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<p>" + currentTimeBean.getTime() + "</p>");
                out.println("</body>");
                out.println("</html>");
            }
    }
}