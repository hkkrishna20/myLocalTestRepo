import java.io.*;
class file
{
public static void main(String args[])throws IOException
{
int i;
FileInputStream fin;
FileOutputStream fout;
char cond;
do{
System.out.println("enter which operation");
System.out.println("1.READ   2.WRITE   3.CREATE");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int choice=Integer.parseInt(br.readLine());
switch(choice)
{
case 1:
try
{
System.out.println("enter file name");
String name=br.readLine();
fin=new FileInputStream(name);
do{
i=fin.read();
if(i!=-1)
System.out.print((char)i);
}while(i!=-1);
}
catch(FileNotFoundException e)
{
System.out.println("file not found");
}
break;
case 2:
try
{
System.out.println("enter name of file to write");
String name=br.readLine();
fout=new FileOutputStream(name);
System.out.println("enter content of file to write");
String content=br.readLine();
for(int k=0;k<content.length();k++)
{
i=content.charAt(k);
fout.write(i);
}
}
catch(FileNotFoundException e)
{
System.out.println("file not found");
}
break;
case 3:
System.out.println("enter file name to create");
String n=br.readLine();
fout=new FileOutputStream(n);
fout.close();
break;
}
System.out.println("enter coice");
i=Integer.parseInt(br.readLine());
}while(i==1);
}
}