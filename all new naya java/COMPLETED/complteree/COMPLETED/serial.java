/*   name: harikrishna
rollnumber: 10906011*/
import java.io.*;
import java.util.*;
class serial
{
public static void main(String args[]) throws IOException
{
detail obj1=new detail(1,"harikrishna");
detail obj2=new detail(2,"manmeethsingh");
try
{
FileOutputStream fos=new FileOutputStream("file.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(obj1);
oos.writeObject(obj2);
oos.flush();
oos.close();
}
catch(FileNotFoundException e)
{System.out.println(e);}
try
{
FileInputStream fis=new FileInputStream("file.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
detail obj;
obj=(detail)ois.readObject();
System.out.println(obj);
obj=(detail)ois.readObject();
System.out.println(obj);
ois.close();
}
catch(ClassNotFoundException e)
{System.out.println(e);}
}
}
class detail implements Serializable
{
int sno;
String name;
detail(int s,String n)
{
this.sno=s;
this.name=n;
}
public String toString()
{
return sno+" "+name;
}
}
/*output*/
/*
b109611@ccc161:~/java programs/hari labprograms> javac serial.java
b109611@ccc161:~/java programs/hari labprograms> java serial
1 harikrishna
2 manmeethsingh
*/