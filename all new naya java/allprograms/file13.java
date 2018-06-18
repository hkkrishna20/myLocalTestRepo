import java.io.*;

class file12
{
public static void main(String args[]) throws IOException {
DataInputStream in=new DataInputStream(System.in);

int n;
System.out.println("Input a number: ");
n=in.readInt();
System.out.println(n);

float f;
System.out.println("Input a number: ");
f=in.readFloat();
System.out.println(f);

double d;
System.out.println("Input a number: ");
d=in.readDouble();
System.out.println(d);

}

}
