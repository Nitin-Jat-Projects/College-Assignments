package com.thinking.machines.hr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ServletOne extends HttpServlet
{
 public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        // Retrieve the initialization parameters from web.xml
        String message = config.getInitParameter("message");
               
               System.out.println("message recieved through servletConfig " + message);
    }





public void doGet(HttpServletRequest request,HttpServletResponse response)
{
try
{
String name=request.getParameter("name");
PrintWriter pw=response.getWriter();
pw.println("Welcome " +name+",I am Nitin from IET.");
}catch(Exception exception)
{
System.out.println(exception.getMessage());
}
}
}