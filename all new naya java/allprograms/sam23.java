                                                        


class Employee
{
private String name;
private int age;
public Employee(String n,int a)
{
name=n;
age=a;
}
void display()
{
System.out.println(" Name " + name + "   Age   " + age);
}
}

class Manager extends Employee
{ 
private String desig;
public Manager(String n,int x,String y)
{
super(n,x);
desig=y;
}
public void put()
{           
super.display();
System.out.println(" Desig "+ desig);
}
}
class sam23
{
public static void main(String args[])
{
Manager  boss = new Manager("ravi",45,"accts");
boss.put();

}
}
