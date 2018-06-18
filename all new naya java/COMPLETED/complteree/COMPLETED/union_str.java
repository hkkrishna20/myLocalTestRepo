import java.io.*;
class uni
{
public static void main(String args[])throws Exception
{
String h[]=new String[10];
String q[]=new String[10];
BufferedReader hari=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter number of strings in the first set");
int a=Integer.parseInt(hari.readLine());
for(int i=0;i<a;i++)
{
h[i]=hari.readLine();
}
System.out.println("enter number of strings in the second set");
int b=Integer.parseInt(hari.readLine());
for(int i=0;i<b;i++)
{
q[i]=hari.readLine();
}
System.out.println("union of these two sets is:");
for(int i=0;i<a;i++)
{
System.out.println(h[i]);
}
for(int i=0;i<b;i++)
{
int ref=0;
for(int j=0;j<a;j++)
{
if(q[i].equals(h[j]))
{
ref=1;
break;
}
}
if(ref==0)
System.out.println(q[i]);
}
}
}