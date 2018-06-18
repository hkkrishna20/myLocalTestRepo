import java.io.File;

class f2
{
public static void main(String args[])
{
 String dirname="j2sdk1.4.1";
 File f1=new File(dirname);
 if(f1.isDirectory())
 {
  System.out.println("directory of"+dirname);
  String s[]=f1.list();
  for(int i=0;i<s.length;i++)
  {
   File f=new File(dirname+"/"+s[i]);
   if(f.isDirectory())
   {
    System.out.println(s[i]+"is a directory");
    }
else
    System.out.println(s[i]+"is a file");

    }
    }
    }
    }
