package com.thinking.machines.hr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
public class qqq extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)
{
try
{
String name=request.getParameter("name");
String city=request.getParameter("city");
HttpSession ss=request.getSession();
ss.setAttribute("name",name);
ss.setAttribute("city",city);
System.out.println("Data Arrived");
System.out.println("Name : " +name);
System.out.println("City : " +city);
response.setContentType("text/html");
PrintWriter pw=response.getWriter();

pw.println("<!DOCTYPE HTML>");
pw.println("<head lang='en'>");
pw.println("<meta charset='utf-8'>");
pw.println("<title>My Fifth Web Application</title>");
pw.println("</head>");
pw.println("<body>");
pw.println("<center>");
pw.println("Name : "+name+"<br>");
pw.println("City : "+city+"<br>");
pw.println("<a href='/assignment/rrr'>save</a>");
pw.println("</center>");
pw.println("</body>");
pw.println("</html>");
}catch(Exception e)
{
System.out.println(e);//remove after testing
}
}
}