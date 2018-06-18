import java.io.*;
class prog9
{
public static void main(String args[])
 throws IOException {
FileReader fr = new FileReader("prog9.java");
BufferedReader br = new BufferedReader(fr);
String s;
int c=1;
while((s=br.readLine()) != null) {
System.out.println("Line"+c+": "+s);
c++;
}
fr.close();
}
}

/*FileReader(String filepath);
FileReader(String fileObj);*/

