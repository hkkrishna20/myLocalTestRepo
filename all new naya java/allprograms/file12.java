import java.io.*;

class file12
{
public static void main(String args[]) throws IOException {

CharArrayWriter f= new CharArrayWriter();
String s ="hjgsdfjhdfjhdfjdhsfjhdfjksdhfjhdf\n ";
char buf[]=new char[s.length()];
s.getChars(0,s.length(),buf,0);
f.write(buf);
System.out.println("Buffer as a string : ");
System.out.println(f.toString());
System.out.println("Into Array : ");

char c[]= f.toCharArray();

for(int i=0;i<c.length;i++) {
System.out.print(c[i]);
}

System.out.println("\n To a fileWriter ()");

FileWriter f2=new FileWriter("test.txt");
f.writeTo(f2);
f2.close();
System.out.print(" Reset    :" );

f.reset();
for(int i=0;i<3;i++) 
f.write('X');
System.out.println(f.toString());
}

}
