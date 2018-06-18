import java.io.*;
class file6
{
public static void main(String args[]) throws IOException {
String tmp="abcdefghijklmnopqrstuvwxyz";
byte b[]= tmp.getBytes();
ByteArrayInputStream input1= new ByteArrayInputStream(b);
ByteArrayInputStream input2 = new ByteArrayInputStream(b,0,0);
}
}

/*ByteArrayInputStream(byte array[])
ByteArrayInputStream(byte array[],int start,int numBytes)*/

