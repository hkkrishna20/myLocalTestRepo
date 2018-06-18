//Handling HTTP GET Request

The Example contains two files:
ColorGet.htm:
-----------------

<html>
<body>
<center>
<form name="Form1"
method="post"
action="http://localhost:8080/servlet/ColorGetServlet">
<B> Color:</B>
<select name="color" size="1">
<option value="Red">Red</option>
<option value="Green">Green</option>
<option value="Blue">Blue</option>
</select>
<br><br>
<input type=submit value="Submit">
</form>
</body>
</html>




Servlet File:
-------------

import java.io.*;
import javax.servelet.*;
import javax.servlet.http.*;

public class ColorGetServelet extends HttpServelet{
public void doGet(HttpServeletRequest request,HttpServeletResponse response)
throws ServeletException,IOException {
String color=request.getParameter("color");
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
pw.println("<B> The Selected color is:   ");
pw.print(color);
pw.close();
}
}
