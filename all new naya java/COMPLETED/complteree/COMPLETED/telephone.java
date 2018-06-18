import java.io.*;
class list
{
String name;
long cell;
int phone;
int fax;
void dir(String name1,int cell1,int phone1,int fax1)
{
name=name1;
cell=cell1;
phone=phone1;
fax=fax1;
}
void disp()
{
System.out.print("\nName: "+name+"\nCell: "+cell+"\nPhone: "+phone+"\nfax: "+fax+"\n");
}
}
class telephone
{
public static void main(String args[])throws IOException
{
int a=0;
list obj[]=new list[200];
for(int i=0;i<200;i++)
obj[i]=new list();
BufferedReader br;
InputStreamReader isr;
isr=new InputStreamReader(System.in);
br=new BufferedReader(isr);
int choice;
do
{
System.out.println("1. enter \n 2. display \n");
choice=Integer.parseInt(br.readLine());
switch(choice)
{
case 1:
System.out.println("enter name");
String name=br.readLine();
System.out.println("enter cell number");
int cell=Integer.parseInt(br.readLine());
System.out.println("enter phone");
int phone=Integer.parseInt(br.readLine());
System.out.println("enter fax");
int fax=Integer.parseInt(br.readLine());
obj[a].dir(name,cell,phone,fax);
a++;
break;
case 2:
System.out.println("enter name to diaplay  ");
String name1=br.readLine();
for(int i=0;i<200;i++)
{
if(name1.equals(obj[i].name))
{
obj[i].disp();
break;
}
}
break;
}
System.out.println("press 1 to continue");
choice=Integer.parseInt(br.readLine());
}while(choice==1);
}
}
