/* 
				Assignment No: 1
Reg No:10906039
Name: G.viswa
Ques: Design and develop a program in java for demonstrating the usage of synchronization in threads.
*/
class called
{
int no;
String name;
public void func1(int s,String n)
{
no=s;
name=n;
System.out.println(no);
try
{
Thread.sleep(1000);
System.out.println(name);
}
catch(InterruptedException e)
{
System.out.println("interrupted");
}
}
}
class call implements Runnable
{
String name;
int sno;
Thread t;
called obj;
call(called item,int s,String n)
{
name=n;
sno=s;
obj=item;
t=new Thread(this);
t.start();
}
public void run()
{
synchronized(obj)
{
obj.func1(sno,name);
}
}
}
class calling
{
public static void main(String args[])
{
called target=new called();
call obj1=new call(target,1,"viswa");
call obj2=new call(target,2,"ramu");
try
{
obj1.t.join();
obj2.t.join();
}
catch(InterruptedException e)
{
System.out.println("interrupted");
}
}
}

/*				OUTPUT
b109639@ccc193:~/java> javac calling.java
b109639@ccc193:~/java> java calling
1
viswa
2
ramu
*/