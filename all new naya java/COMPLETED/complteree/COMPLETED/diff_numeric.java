/* 
				Assignment No: 2
Reg No:10906039
Name: G.viswa
Ques: Determining set difference of two sets of numeric data.
*/
import java.io.*;
class diff_numeric
{
public static void main(String args[])throws Exception
{
int a[]=new int[100];
int b[]=new int[100];
int c[]=new int [20];
BufferedReader br;
InputStreamReader isr;
isr=new InputStreamReader(System.in);
br=new BufferedReader(isr);
System.out.println("enter number of elements in first set");
int num1=Integer.parseInt(br.readLine());
System.out.println("enter elements in first array");
for(int i=0;i<num1;i++)
a[i]=Integer.parseInt(br.readLine());
System.out.println("enter number of elements in second set");
int num2=Integer.parseInt(br.readLine());
System.out.println("enter elements in second array");
for(int i=0;i<num2;i++)
b[i]=Integer.parseInt(br.readLine());
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
System.out.println("output is...");
for(int i=0;i<p;i++)
{
int s=c[i];
System.out.println(a[s]);
}
}
}
/*				OUTPUT
b109639@ccc193:~/java> javac diff_numeric.java
b109639@ccc193:~/java> java diff_numeric
enter number of elements in first set
4
enter elements in first array
1
2
3
4
enter number of elements in second set
5
enter elements in second array
3
4
9
7
1
output is...
2
*/




