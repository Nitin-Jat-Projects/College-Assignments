package com.thinking.machines.hr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Login extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)
{
try
{
PrintWriter pw=response.getWriter();
String name=request.getParameter("name");
String password=request.getParameter("password");

boolean a=name.equals("admin");
boolean b=password.equals("admin");

if(a && b)
{
HttpSession ss=request.getSession();
ss.setAttribute("key","key");


System.out.println("correct username and password entered");
RequestDispatcher requestDispatcher=request.getRequestDispatcher("/welcomeServlet");
requestDispatcher.forward(request,response);
}
else
{
pw.println("<!doctype html>");

pw.println("<html lang='en'>");

pw.println("<head>");

pw.println("<meta charset='utf-8'>");

pw.println("</head>");

pw.println("<body>");


pw.println("<span style='color:red'>Incorrect name/password</span>");

pw.println("<br><br>");
pw.println("<b>Name and Password are predecided so use them to login </b>");

pw.println("<b>Name : admin   and   Password : admin</b>");

pw.println("<br>");

pw.println("<form action='/assignment/login'>");

pw.println("Name <input type='text' id='name' name='name'>");

pw.println("<br>");

pw.println("Password <input type='password' id='password' name='password'>");

pw.println("<br>");

pw.println("<button type='submit'>Login</button>");

pw.println("</form>");

pw.println("</body>");

pw.println("</html>");
}
}catch(Exception e)
{
System.out.println(e);//remove after testing
}
}
}