class person
{
String name;
int age;

public void accept(String n,int a)
{
name=n;
age=a;
}

void display()
{
System.out.println(" Name: " + name + "\n Age: " + age);
}
}

class Manager extends person
{
String desig;

public void get(String d)
{
desig=d;
}

public void put()
{            
System.out.println(" Desig: "+ desig);
}
}

class Example39
{
public static void main(String args[])
{
Manager  boss = new Manager();
String n=args[0];
int age=Integer.parseInt(args[1]);
String desig=args[2];
boss.accept(n,age);
boss.get(desig);
boss.display();
boss.put();
}
}
