import java.io.*;
class open
{
int accno;
String name;
String dateoofbirth;
int minbal;
void disp()
{
System.out.println("account number is "+accno);
System.out.println("name is "+name);
System.out.println("date of birth is "+dateoofbirth);
System.out.println("his/her balance is is "+minbal);
}
}
interface transac
{
public int transaction(int bal,int money,int tranc);
}
class bank extends open implements transac
{
public int transaction(int bal,int amount,int tranc)
{
if(tranc==2)
return bal-amount;
else
return bal+amount;
}
}
class bankoper
{
public static void main(String args[])throws IOException
{
bank obj=new bank();
int money,ch;
BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter account number to be created");
obj.accno=Integer.parseInt(r.readLine());
System.out.println("enter name of the customer");
obj.name=r.readLine();
System.out.println("enter date of birth");
obj.dateoofbirth=r.readLine();
obj.minbal=500;
System.out.println("account has been  created and  minimum balance 500");
do
{
System.out.println("1.DISPLAY  2.WITHDRAWL  3.DEPOSITING");
ch=Integer.parseInt(r.readLine());
switch(ch)
{
case 1:
obj.disp();
break;
case 2:
System.out.println("enter amount ot withdraw");
money=Integer.parseInt(r.readLine());
obj.minbal=obj.transaction(obj.minbal,money,2);
break;
case 3:
System.out.println("enter amount ot deposit");
money=Integer.parseInt(r.readLine());
obj.minbal=obj.transaction(obj.minbal,money,3);
break;
}
System.out.println("press 1 to continue");
ch=Integer.parseInt(r.readLine());
}while(ch==1);
}
}
