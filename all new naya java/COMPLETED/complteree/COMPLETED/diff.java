/*                        program for difference in two numeric sets*/
/* nam: m.harikrishna*/
/* roll number: 10906011*/
import java.io.*;
class diff
{
public static void main(String args[])throws Exception
{
int a[]=new int[100];
int b[]=new int[100];
int c[]=new int [20];
BufferedReader r;
InputStreamReader sr;
sr=new InputStreamReader(System.in);
r=new BufferedReader(sr);
System.out.println("enter number of elements in first set");
int num1=Integer.parseInt(r.readLine());
System.out.println("enter elements in first array");
for(int i=0;i<num1;i++)
a[i]=Integer.parseInt(r.readLine());
System.out.println("enter number of elements in second set");
int num2=Integer.parseInt(r.readLine());
System.out.println("enter elements in second array");
for(int i=0;i<num2;i++)
b[i]=Integer.parseInt(r.readLine());
int ref,p=0;
for(int i=0;i<num1;i++)
{
ref=0;
for(int j=0;j<num2;j++)
{
if(a[i]==b[j])
{
ref=1;
break;
}
}
if(ref!=1)
{
c[p]=i;
p++;
}
}
System.out.println("difference of two given sets are");
for(int i=0;i<p;i++)
{
int s=c[i];
System.out.println(a[s]);
}
}
}
/*              output*/
/*
enter number of elements in first set
6
enter elements in first array
1
2
3
4
5
6
enter number of elements in second set
4
enter elements in second array
1
5
6
2
difference of two given sets are
3
4
*/




