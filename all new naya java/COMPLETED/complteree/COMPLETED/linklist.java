/*             name: m.harikrishna
               rollnumber:10906011 
		branch:computerscience and engineering*/
import java.io.*;
class node
{
public int item;
public node next;
node(int a)
{
item=a;
}
void print()
{
System.out.println(item+"  ");
}
}

class linked
{
private node head;
linked()
{
head=null;
}
void insert(int a,int p)
{
node newnode=new node(a);
newnode.next=null;
head=newnode;
}
void insert(int a)
{
node newnode=new node(a);
node ref=head;
while(ref.next!=null)
ref=ref.next;
ref.next=newnode;
}
void display()
{
System.out.println("list is:\n");
node ref=head;
while(ref!=null)
{
ref.print();
ref=ref.next;
}
}
}

class linklist
{
public static void main(String args[])throws IOException
{
linked link=new linked();
int choice;
do{
System.out.println("1.create list\n2.display\n");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
choice=Integer.parseInt(br.readLine());
switch(choice)
{
case 1:System.out.println("enter data\n");
int data=Integer.parseInt(br.readLine());
link.insert(data,2);
do
{
System.out.println("enter 0 to stop\n");
data=Integer.parseInt(br.readLine());
if(data!=0)
link.insert(data);
}while(data!=0);
break;
case 2:
link.display();
break;
}
System.out.println("press 1 to continue\n");
choice=Integer.parseInt(br.readLine());
}while(choice==1);

}
}


/* output*/
/*     
1.create list
2.display

2
list is:

press 1 to continue

1
1
enter data

5467
enter 0 to stop

0
press 1 to continue

1
2
list is:

5467
press 1 to continue
*/