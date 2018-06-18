import java.io.*;
class f3
{
 public static void main(String args[]) throws Exception{
 int size;
 InputStream f=new FileInputStream("f1.java");
 System.out.println("total available bytes:"+(size=f.available()));
 int n=size/40;
 System.out.println("first"+n+"bytes of file one read()at a time");
 for(int i=0;i<n;i++)
  {
  System.out.println((char)f.read());
  }
  
System.out.println("\n still available:"+f.available());
  System.out.println("read file"+n+"with one read(b[])");
  
byte b[]=new byte[n];
  if(f.read(b)!=n)
  {
   System.out.println("couldnt read"+n+"bytes");
   }
 
System.out.println(new String(b,0,n));

 System.out.println("skip half of bytes skip()");

 f.skip(size/2);
 System.out.println("Still avail:"+f.available());
 System.out.println("reading"+n/2+"into end:");
 
if(f.read(b,n/2,n/2)!=n/2)
 {
  System.out.println("cant read"+n/2+"bytes");
  }
  
System.out.println(new String(b,0,b.length));
  System.out.println("\n STILL AVAILE"+f.available());
 f.close();
 }
 }





  
