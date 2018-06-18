
import java.io.*;
class prog10
{
public static void main(String args[]) 
throws IOException {
 InputStream f=new FileInputStream("ex.txt");
char s;
int c=0,w=0,l=0;
int len=f.available();
for(int i=0;i<=len;i++)
{
s=(char)f.read(); 

System.out.print((char)s);
      if(Character.isLetter(s))
	c++;
      else if(Character.isSpaceChar(s))
      w++;
else if(s==Character.LINE_SEPARATOR)
{
  l++;
w++;
}
}
System.out.println("words: "+ w );
System.out.println("Char : "+ c);
System.out.println("Lines : "+ l);

f.close();
}
}

/*FileReader(String filepath);
FileReader(String fileObj);*/

