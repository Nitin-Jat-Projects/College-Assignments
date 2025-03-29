package com.thinking.machines.hr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class zzz extends HttpServlet
{
public void doGet(HttpServletRequest request , HttpServletResponse response)
{
try
{
String name="";
String city="";
Cookie cookies[]=request.getCookies();
if(cookies!=null)
{
Cookie c;
int x;
for(x=0;x<cookies.length;x++)
{
c=cookies[x];
if(c.getName().equals("name")) 
{
name=c.getValue();
break;
}
}

for(x=0;x<cookies.length;x++)
{
c=cookies[x];
if(c.getName().equals("city")) 
{
city=c.getValue();
break;
}
}
}
System.out.println("Data Arrived");
System.out.println("Name : " +name);
System.out.println("City Name : " + city);


response.setContentType("text/html");
PrintWriter pw=response.getWriter();

pw.println("<!DOCTYPE html>");
pw.println("<head lang='en'>");
pw.println("<meta charset='utf-8'>");
pw.println("<title>My Fourth Web Application</title>");
pw.println("</head>");
pw.println("<body>");
pw.println("<center>");
pw.println("Name : "+ name +"<br>");
pw.println("City : "+ city +"<br>");
pw.println("<form action='/assignment/cookie.html'>");
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