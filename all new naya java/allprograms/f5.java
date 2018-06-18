import java.io.*;

class madhav18
{
 public static void main(String args[]) throws Exception
 {
  String source="fkfkljffjf"+"fkfjfjkfffk";
  byte buf[]=source.getBytes();
  OutputStream f=new FileOutputStream("sam1.txt");
  int size;
  for(int i=0;i<buf.length;i++)
  {
  f.write(buf[i]);
  }
  f.close();
  OutputStream f1=new FileOutputStream("sam2.txt");
  f1.write(buf);
  f1.close();
  OutputStream f2=new FileOutputStream("sam3.txt");
  f2.write(buf,buf.length-buf.length/4,buf.length/4);
  f2.close();
  }
  }

