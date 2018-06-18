//Reading Servelet Parameters

The Example contains two files:
PostParameters.htm:
------------------------

<html>
<body>
<center>
<form name="Form1"
method="post"
action="http://localhost:8080/servlet/PostParameterServlet">
<table>
<tr>
<td><b> Employee</td>

<td><INPUT TYPE=TEXTBOX NAME="e" size="25" value=" "></td>
</tr>
<tr>
<td><B>Phone</td>
<td><INPUT TYPE=TEXTBOX NAME="p" size="25" value=" "></td>
</tr>
</table>
<input type=submit value="Submit">
</body>
</html>




Servlet File:
-------------

import java.io.*;
import java.util.*;
import javax.servelet.*;
public class PostParametersServelet extends GenericServelet{
public void service(ServeletRequest request, ServeletResponse response)
throws ServeletException,IOException {
PrintWriter pw=response.getWriter();
//Get enumaration of parameter names
Enumaration e=request.getParameterNames();
//Display parameter names and values
while(e.hasMoreElements()){
String pname=(String)e.nextElement();
pw.print(pname + "=");
String pvalue=request.getParameter(pname);
pw.println(pvalue);
}
pw.close();
}
}
