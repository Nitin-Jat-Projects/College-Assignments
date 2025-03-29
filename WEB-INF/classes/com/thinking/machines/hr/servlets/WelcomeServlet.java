package com.thinking.machines.hr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class WelcomeServlet extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)
{
try
{
HttpSession sess=request.getSession();
if(sess.getAttribute("key")==null)
{
System.out.println("incorrect key");
RequestDispatcher r=request.getRequestDispatcher("/LoginForm.html");
r.forward(request,response);
}
else
{
System.out.println("correct key");
PrintWriter pw=response.getWriter();
pw.println("You entered correct username and password");
pw.println("This response is comming from WelcomeServlet");
}
}catch(Exception e)
{
System.out.println(e);//remove after testing
}
}
}