package com.thinking.machines.hr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class rrr extends HttpServlet
{
public void doGet(HttpServletRequest request , HttpServletResponse response)
{
try
{
HttpSession ss=request.getSession();
String name=(String)ss.getAttribute("name");
String city=(String)ss.getAttribute("city");

System.out.println("Data Arrived");
System.out.println("Name : " +name);
System.out.println("City Name : " + city);



response.setContentType("text/html");
PrintWriter pw=response.getWriter();

pw.println("<!DOCTYPE html>");
pw.println("<head lang='en'>");
pw.println("<meta charset='utf-8'>");
pw.println("<title>My Fifth Web Application</title>");
pw.println("</head>");
pw.println("<body>");
pw.println("<center>");
pw.println("Name : "+ name +"<br>");
pw.println("City : "+ city +"<br>");
pw.println("<form action='/assignment/sessionObject.html'>");
pw.println("<button type='submit'>save</button>");
pw.println("</form> ");
pw.println("</center>");
pw.println("</body>");
pw.println("</html>");
}catch(Exception e)
{
System.out.println(e);
}
}
}