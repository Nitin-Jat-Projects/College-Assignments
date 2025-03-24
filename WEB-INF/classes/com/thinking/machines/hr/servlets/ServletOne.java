package com.thinking.machines.hr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ServletOne extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
try
{
String firstName=request.getParameter("firstName");
PrintWriter pw=response.getWriter();
pw.println(firstName);
}catch(Exception exception)
{
System.out.println(exception.getMessage());
}
}
}