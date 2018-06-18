import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;


public class labp1 extends HttpServlet
 {

	 Statement st=null;
	 Connection con=null;
       	 
        public void init(ServletConfig config) throws         ServletException
       {
          super.init(config);
	
        try{
		          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con =          DriverManager.getConnection("jdbc:odbc:sam2","","");
           }
	catch(Exception e) {
		e.printStackTrace();
		con = null;
			   }
        }




public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
 {
 	
        HttpSession hs = req.getSession(true);

 	PrintWriter pw = res.getWriter();
 	String frmName	= req.getParameter("frmname");
	res.setContentType("text/html");
        String empid,ename,td,fd,ltype;
	
  
                
         empid =req.getParameter("eid");
         ename =req.getParameter("name");
         fd =req.getParameter("fd");
         td =req.getParameter("td");
         ltype =req.getParameter("ltype");

         try{ st = con.createStatement(); }
         catch(Exception e){e.printStackTrace();}
          try{
        String inquery = "insert into emp values('"+empid+"','"+ename+"','"+fd+"','"+td+"','"+ltype+"');";
                       pw.println(inquery);
                        pw.println("query read...");
                        boolean nos= st.execute(inquery);
                        pw.println("records inserted"  );
                        st.close();
 }
    catch(Exception e){e.printStackTrace(); }
                        
        
            
 	 	pw.close(); 


 }   //doGet close

 public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
   {
      doGet(req,res);
   }
 
  }    // class close
