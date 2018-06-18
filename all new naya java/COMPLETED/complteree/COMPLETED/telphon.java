/*           PROBLEM FOR MAINTAING telephone directory*/
/*             NAME: M.HARIKRISHNA*/
/*            ROLLNO:10906011*/


import java.io.*;
class list
{
String name;
long cell;
int phon;
int fx;
void dirt(String name1,int cell1,int phon1,int fx1)
{
name=name1;
cell=cell1;
phon=phon1;
fx=fx1;
}
void display()
{
System.out.print("\nName: "+name+"\nCell: "+cell+"\nPhone: "+phon+"\nfax: "+fx+"\n");
}
}
class telphon
{
public static void main(String args[])throws IOException
{
int a=0;
list obj[]=new list[200];
for(int i=0;i<200;i++)
obj[i]=new list();
BufferedReader r;
InputStreamReader sr;
sr=new InputStreamReader(System.in);
r=new BufferedReader(sr);
int enter;
do
{
System.out.println("1. enter \n 2. display \n");
enter=Integer.parseInt(r.readLine());
switch(enter)
{
case 1:
System.out.println("enter name");
String name=r.readLine();
System.out.println("enter cell number");
int cell=Integer.parseInt(r.readLine());
System.out.println("enter phone");
int phon=Integer.parseInt(r.readLine());
System.out.println("enter fax");
int fx=Integer.parseInt(r.readLine());
obj[a].dirt(name,cell,phon,fx);
a++;
break;
case 2:
System.out.println("enter name to diaplay  ");
String name1=r.readLine();
for(int i=0;i<200;i++)
{
if(name1.equals(obj[i].name))
{
obj[i].display();
break;
}
}
break;
}
System.out.println("press any key key except one1     to terminate");
enter=Integer.parseInt(r.readLine());
}while(enter==1);
}
}
/*                OUTPUT               */
/*                        1. enter
 2. display

1
enter name
HARIKRISHNA
enter cell number
9908359549
Exception in thread "main" java.lang.NumberFormatException: For input string: "9908359549"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:63)
        at java.lang.Integer.parseInt(Integer.java:493)
        at java.lang.Integer.parseInt(Integer.java:531)
        at telphon.main(telphon.java:48)
b109611@ccc161:~/java programs/hari labprograms> java telphon
1. enter
 2. display

1
enter name
HARIKRISHNA
enter cell number
12345
enter phone
21213
enter fax
456
press any key key except one1     to terminate
1
1. enter
 2. display

2
enter name to diaplay
HARIKRISHNA

Name: HARIKRISHNA
Cell: 12345
Phone: 21213
fax: 456
press any key key except one1     to terminate
              */