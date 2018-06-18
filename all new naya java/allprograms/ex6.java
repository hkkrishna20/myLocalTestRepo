//Using Cookies

The Example contains three files:
Addcookie.htm:
-----------------

<html>
<body>
<center>
<form name="Form1"
method="post"
action="http://localhost:8080/servlet/AddCookieServlet">
<B> Enter a value for MyCookie:</B>

<input type=textbox name="data" size=25 value=" ">
<input type=submit value="Submit">
</form>
</body>
</html>




Servlet File:
-------------

import java.io.*;
import javax.servelet.*;
import javax.servlet.http.*;

public class AddCookiesServelet extends HttpServelet{
public void doPost(HttpServeletRequest request,HttpServeletResponse response)
throws ServeletException,IOException {
String data=request.getParameter("data");
//Create Cookie
Cookie cookie=new Cookie("MyCookie",data);
//Add Cookie to HTTP response
response.addCookie(cookie);
//Write output to browser
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
pw.println("<B> My Cookie has been set to:   ");
pw.println(data);
pw.close();
}
}

GetCookiesServlet.java:
-----------------------------


import java.io.*;
import javax.servelet.*;
import javax.servlet.http.*;

public class GetCookiesServelet extends HttpServelet{
public void doGet(HttpServeletRequest request,HttpServeletResponse response)
throws ServeletException,IOException {

Cookie[] cookies=request.getCookies();

response.setContentType("text/html");
PrintWriter pw=response.getWriter();
pw.println("<B>");
for(int  i=0;i<cookies.length;i++){
String name=cookies[i].getName();
String value=cookies[i].getValue();
pw.println("name =" + name + "; value=" + value);
}
pw.close();
}
}



