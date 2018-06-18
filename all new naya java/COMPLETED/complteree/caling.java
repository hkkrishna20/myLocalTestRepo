/* 
				Assignment No: 1
roll no:        10906011	
Name:          m.harikrishna
Design and develop a program in java for demonstrating the usage of synchronization in threads.
*/
class cald
{
int n;
String nam;
public void func1(int s,String naa)
{
n=s;
nam=naa;
System.out.println(n);
try
{
Thread.sleep(1000);
System.out.println(nam);
}
catch(InterruptedException e)
{
System.out.println("interrupted");
}
}
}
class call implements Runnable
{
String nam;
int sno;
Thread t;
cald obj;
call(cald item,int s,String naa)
{
nam=naa;
sno=s;
obj=item;
t=new Thread(this);
t.start();
}
public void run()
{
synchronized(obj)
{
obj.func1(sno,nam);
}
}
}
class caling
{
public static void main(String args[])
{
cald target=new cald();
call obj1=new call(target,1,"harikrishna");
call obj2=new call(target,2,"manmeethsingh");
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



/*
                          OUTPUT

b109611@ccc161:~/java programs/hari labprograms> javac caling.java
b109611@ccc161:~/java programs/hari labprograms> java caling
1
harikrishna
2
manmeethsingh
*/
