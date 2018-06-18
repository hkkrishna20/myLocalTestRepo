//Reading Initialization Parameters

The Example Contains Two Files servelet.properties and InitServelet.java
servlet.properties defines two properties for a servlet:
servlet.name.code   ,which enables you to associate a name with the class that 
contains the code for the servlet.
servelet.name.initargs  , which enables you to define sequence of comma-delimited 
parameter names and values.

servelet.properties File:
----------------------------

servlet.initservlet.code=InitServelet
servlet.initservlet.initArgs=\
country=Canada,\
city=Toronto



InitServelet.java File:
-------------------------



import java.io.*;
import javax.servelet.*;
public class InitServelet extends GenericServelet{
public void service(ServeletRequest request, ServeletResponse response)
throws ServeletException,IOException {
ServeletConfig sc=getServeletConfig();
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
pw.println("<b> Country" + sc.getInitParameter("country"));
pw.println("<br> City:   "+ sc.getInitParameter("city"));
pw.close();
}
}



