package com.thinking.machines.hr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class aaa extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)
{
try
{
String name=request.getParameter("name");
System.out.println("Data Arrived");
System.out.println("Name : " + name);
response.setContentType("text/html");
PrintWriter pw=response.getWriter();

pw.println("<!DOCTYPE html>");
pw.println("<head lang='en'>");
pw.println("<meta charset='utf-8'>");
pw.println("<title>My Third Web Application</title>");

pw.println("<script>");
pw.println("function validateForm(frm)");
pw.println("{");
pw.println("var cc=frm.city.value.trim();");
pw.println("if(cc.length==0)");
pw.println("{");
pw.println("alert('city required');");
pw.println("frm.city.focus();");
pw.println("return false;");
pw.println("}");
pw.println("return true;");
pw.println("}");
pw.println("</script>");


pw.println("</head>");
pw.println("<body>");
pw.println("<center>");
pw.println("<form action='/assignment/bbb' onsubmit='return validateForm(this)'>");
//pw.println("<input type='text' name='name' id='name'><br>");
//pw.println("<input type='text' name='name' id='name' value='Rajesh'><br>");
//pw.println("<input type='text' name='name' id='name' value='"+ name +"'><br>");

//session tracking technique using hidden form field
pw.println("<input type='hidden' name='name' id='name' value='"+ name +"'><br>");

pw.println("City");
pw.println("<input type='text' name='city' id='city'><br>");
pw.println("<button type='submit'>Next</button>");
pw.println("</form>");
pw.println("</center>");
pw.println("</body>");
pw.println("</html>");
}catch(Exception e)
{
System.out.println(e);//remove after testing
}
}
}