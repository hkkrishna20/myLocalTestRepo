/*  problem for tokernising */
/* name: m.harikrishna*/
/* rollnumber:10906011*/
import java.util.*;
import java.io.*;
class strtoken
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

/*                 output*/
/*
b109611@ccc161:~/java programs/hari labprograms> javac strtoken.java
b109611@ccc161:~/java programs/hari labprograms> java strtoken
enter file name to tokenize
enter file name
harikrishna
harikrishna
is
good
boy
he
is
studying
in
svu
and
computer
science
branch�
*/