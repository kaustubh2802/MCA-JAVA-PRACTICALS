Practical : 14
Develop a html form to input student data(roll number, name and marks). Validate this data by using a servlet.
Validations :
• All fields must b`` ` e filled
• Roll number must be valid integer
• Name must contain only alphabets. There should be no digits or special characters • Marks must contain int value in the range 1 to 100
*Input :
Index.html page :
<html>
<head>
<title>* Registration Form *</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div>* Registration Form *</div>
<form action="mydata" method="get">
<table align="left">
<tr>
<th align="left">Name:<input type="text" name="name" required></th><tr>
<tr><th align="left">middle name:<input type="text" name="mn" required></th><tr>
<tr><th align="left">Last name:<input type="text" name="ls" required=""></th></tr>
<tr><th align="left">Address:<textarea rows="4" name="ad" required=""></textarea></th>
<tr><th align="left">Roll no:<input type="text" name="mb" required></th></tr>
<tr><th align="left">email id:<input type="text" name="ed" required=""></th></tr>
<tr><th align="left">Password:<input type="text" name="ps" required></th></tr>
<tr><th><input type="submit" name="submit" value="Submit"> </th></tr>
</table>
</form>
</body>
</html>
*Servlet Page :
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/mydata"})
public class mydata extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("Text/html");
PrintWriter out= response.getWriter();
String name =request.getParameter("name");
String mn =request.getParameter("mn");
String ls =request.getParameter("ls");
String address =request.getParameter("ad");
String mb =request.getParameter("mb");
String email =request.getParameter("ed");
String pass =request.getParameter("ps");
//display
out.println("\tName : "+name);
out.println("\tMiddle Name : "+mn);
out.println("Last Name : "+ls);
out.println("Address : "+address);
out.println("Roll No : "+mb);
out.println("email : "+email);
out.println("pass : "+pass);}}
