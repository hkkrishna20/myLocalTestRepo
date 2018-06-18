import java.io.File;

class f1
{
public static void main(String args[])
{
File f1=new File("/sam2.java");

  System.out.println("name of file"+f1.getName());
  System.out.println("path:"+f1.getPath());
  System.out.println("abs path:"+f1.getAbsolutePath());
  System.out.println("parent:"+f1.getParent());
  System.out.println(f1.exists()? "exists":"doesnot exists");
  System.out.println(f1.canWrite()? "is write":"doesnot write");
  System.out.println(f1.canRead()? "is read":"doesnot read");
  System.out.println("is"+(f1.isDirectory()? "is a Directory    ":"not"+"a directory"));
  System.out.println(f1.isFile()?"is norm file":"might be a name:");
  System.out.println(f1.isAbsolute()?"is abs":"is not");
  System.out.println("file last modified:"+f1.lastModified());
  System.out.println("file size"+f1.length()+"bytes");
  }
  }



