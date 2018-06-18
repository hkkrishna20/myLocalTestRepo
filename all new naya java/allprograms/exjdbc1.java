import java.net.*;
import java.sql.*;
import java.io.*;
 
public class exjdbc1
{
Connection conn;

public static void main(String arg[])
{
exjdbc1 sq =new exjdbc1();
sq.initdb();
sq.testdb();
}

public void initdb()
{

try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 }
catch (java.lang.ClassNotFoundException e)
{
System.out.println("Driver message");
System.out.println(e.getMessage());
System.exit(1);
}

try
{
conn = DriverManager.getConnection("jdbc:odbc:sam","","");
}

catch (SQLException e)
{
System.out.println(" Database Connection Failed : ");
System.out.println(e.getMessage());
System.exit(1);
}
}

public void testdb() 
{

try
{
Statement stmt= conn.createStatement(ResultSet.FETCH_FORWARD);
String query= " select * from emp";
ResultSet rs= stmt.executeQuery(query);
ResultSetMetaData rsmd=rs.getMetaData();
int columnCount=rsmd.getColumnCount();

while(rs.next())
{
for(int i=1;i<=columnCount;i++)
{
if(i>1) System.out.print(", ");
System.out.print(rs.getString(i));
}
System.out.println();
}

rs.close();
}

catch(SQLException e)
{
System.out.println(e.getMessage());
System.exit(1);
}
}
}
