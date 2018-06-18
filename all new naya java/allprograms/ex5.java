//Handling HTTP POST Request

The Example contains two files:
ColorPost.htm:
-----------------

<html>
<body>
<center>
<form name="Form1"
method="post"
action="http://localhost:8080/servlet/ColorPostServlet">
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

public class ColorPostServelet extends HttpServelet{
public void doPost(HttpServeletRequest request,HttpServeletResponse response)
throws ServeletException,IOException {
String color=request.getParameter("color");
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
pw.println("<B> The Selected color is:   ");
pw.print(color);
pw.close();
}
}
