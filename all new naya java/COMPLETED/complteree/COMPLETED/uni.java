/*                   problem for FINDING THE UNION OF STRINGS            */
/*  NAME: M.HARIKRISHNA
    ROLLNO: 10906011
BRANCH : COMPUTER SCIENCE AND ENGINEERING*/


import java.io.*;
class uni
{
public static void main(String args[])throws Exception
{
String h[]=new String[10];
String q[]=new String[10];
BufferedReader hari=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter HOW MANY STRINGS YOU WANT  the first set");
int a=Integer.parseInt(hari.readLine());
for(int i=0;i<a;i++)
{
h[i]=hari.readLine();
}
System.out.println("enter HOW MANY strings OF  second set YOU WANT   ");
int b=Integer.parseInt(hari.readLine());
for(int i=0;i<b;i++)
{
q[i]=hari.readLine();
}
System.out.println("UNION of THE TWO ENTERED SETS ARE ");
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



/*                       out put         */
/*
enter HOW MANY STRINGS YOU WANT  the first set
5
HARIKRISHNA
COMPUTERSCIENCEANDENGINEERING
AMNMEETHSINGH
RAJIVSHULKLA
LALITMODI
enter HOW MANY strings OF  second set YOU WANT
5
SACHIN
DHONI
DRAVID
LAXMAN
GANGULY
UNION of THE TWO ENTERED SETS ARE
HARIKRISHNA
COMPUTERSCIENCEANDENGINEERING
AMNMEETHSINGH
RAJIVSHULKLA
LALITMODI
SACHIN
DHONI
DRAVID
LAXMAN
GANGULY

*/