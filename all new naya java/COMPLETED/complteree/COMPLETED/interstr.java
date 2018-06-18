/*               intersection on string data*/
/* name: m.harikrishna*/
/* rollnumbeer: 10906011
branch : computer science and engineering*/
import java.io.*;
class interstr
{
public static void main(String args[])throws Exception
{
String p[]=new String[50];
String t[]=new String[50];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter number of strings in the first set");
int a=Integer.parseInt(br.readLine());
for(int i=0;i<a;i++)
{
p[i]=br.readLine();
}
System.out.println("enter number of strings in the second set");
int b=Integer.parseInt(br.readLine());
for(int i=0;i<b;i++)
{
t[i]=br.readLine();
}
System.out.println("intersection of these two sets is:");
for(int i=0;i<a;i++)
{
int ref=0;
for(int j=0;j<b;j++)
{
if(p[i].equals(t[j]))
ref=1;
}
if(ref==1)
System.out.println(p[i]);
}
}
}
/*               output*/
/*
enter number of strings in the first set
5
harikrishna
hari
ravi
sani
vanti
enter number of strings in the second set
4
naveen
manmeeth
nanda
rajesj
intersection of these two sets is:
*/