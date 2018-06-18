import java.io.*;
import javax.servlet.*;
public class sr1 extends GenericServlet{
public void service(ServletRequest request, ServletResponse response)
throws ServletException,IOException {
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
pw.println("<b> Hello!");
pw.close();
}
}
