import java.io.*;
class file10
{
public static void main(String args[]) throws IOException {
String source =" hjgsdfjhdfjhdfjdhsfjhdfjksdhfjhdf\n "
+ "sdfghdfyudhfjkhfsdifusifhjsjkhfjufioff"
+ "kjcysdihfskjehfnsdkfhjsdiufsdjfhksd";
char buffer[]=new char[source.length()];

source.getChars(0,source.length(),buffer,0);

FileWriter f0=new FileWriter("file.txt");
for(int i=0;i<buffer.length;i+=2) {
f0.write(buffer[i]);
}
f0.close();
FileWriter f1=new FileWriter("file2.txt");
f1.write(buffer);
f1.close();

FileWriter f2=new FileWriter("file3.txt");
f2.write(buffer,buffer.length-buffer.length/4,buffer.length/4);
f2.close();
}
}

/*FileWriter(String filepath);
FileWriter(String filepath,boolen append);
FileWriter(String fileObj);      */
