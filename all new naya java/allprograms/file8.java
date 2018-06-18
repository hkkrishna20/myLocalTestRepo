import java.io.*;
class file8
{
public static void main(String args[]) throws IOException
{
ByteArrayOutputStream f= new ByteArrayOutputStream();
String s="This is should and up in the array";
byte buf[]= s.getBytes();
f.write(buf);
System.out.print("Buffer as a string");

System.out.print(f.toString());

System.out.print("Into array");

byte b[]=f.toByteArray();

for(int i=0;i<b.length;i++){
System.out.print((char) b[i]);
}

System.out.println("\n To an Output Stream() ") ;
OutputStream f2= new FileOutputStream("test.txt");
f.writeTo(f2);
f2.close();
for(int i=0;i<3;i++)
f.write('X');
System.out.println(f.toString());
}
}


/*ByteArrayOutputStream()
ByteArrayOutputStream(int numbytes)*/

