import java.io.*;
class merging_files
{
public static void main(String args[])throws IOException
{
int i;
FileInputStream fin,fin1;
FileOutputStream fout;
char cond;
System.out.println("enter first file name");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String name=br.readLine();
System.out.println("enter second file name");
String name1=br.readLine();
System.out.println("enter file name to merge two files");
String name2=br.readLine();
try
{
fin=new FileInputStream(name);
fin1=new FileInputStream(name1);
fout=new FileOutputStream(name2);
do{
i=fin.read();
if(i!=-1)
fout.write(i);
}while(i!=-1);
do{
i=fin1.read();
if(i!=-1)
fout.write(i);
}while(i!=-1);
fout.close();
fin.close();
fin1.close();
}
catch(FileNotFoundException e)
{
System.out.println("file not found");
}
}
}