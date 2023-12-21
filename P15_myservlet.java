Practical : 15
Write a JSP program to display how many times user has visited website by using Cookies.
*Input :
Index.html page
<html>
<head>
<title>TODO supply a title</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div>TODO write content</div>
<form action="myservlet" method="get">
<input type="text" name="name">
<input type="submit" name="btnadd" value="add">
</form>
</body>
</html>
Servlet Page :
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/myservlet"})
public class myservlet extends HttpServlet {
int i;
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("Text/html");
PrintWriter out= response.getWriter();
// String name =request.getParameter("name");
// out.println("Enter the text : "+name);
Cookie c=new Cookie("visit" ,String.valueOf(i));
response.addCookie(c);
int j=Integer.parseInt(c.getValue());
if(j==1){
out.println("welcome user");}
else{
out.println("u have visited this website "+j +" times");}
i++;}}
*Output
