import java.util.*;
import java.io.*;
class str_token
{
public static void main(String arps[])throws IOException
{
int i;
String str=" ";
FileInputStream fin;
System.out.println("enter file name to tokenize");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("enter file name");
String name=br.readLine();
fin=new FileInputStream(name);
do
{
i=fin.read();
str=str+(char)i;
}while(i!=-1);
}
catch(FileNotFoundException e)
{
System.out.println("file not found");
}
StringTokenizer st=new StringTokenizer(str,",.;: \n=()");
while(st.hasMoreTokens())
{
String val=st.nextToken();
System.out.println(val);
}
}
}