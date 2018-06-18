import java.io.*;
class file9
{
public static void main(String args[]) throws IOException {
FileReader fr = new FileReader("file9.java");
BufferedReader br = new BufferedReader(fr);
String s;
while((s=br.readLine()) != null) {
System.out.print(s);
}
fr.close();
}
}

/*FileReader(String filepath);
FileReader(String fileObj);*/

