import java.io.*;
class f4
{
public static void main(String args[]) throws Exception
{
  InputStream f=new FileInputStream("f1.java");
  int size;
  size=f.available();
  for(int i=0;i<size;i++)
  {
  System.out.print((char)f.read());
  }
  f.close();
  }}
