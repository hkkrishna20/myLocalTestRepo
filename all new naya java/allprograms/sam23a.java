                                             
class Employee
{
 String name;
 int age;

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

 String desig;

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

/*class sup_type
{
private datatype var1;
private datatype var2;
.......................

ret_type method1(args)
{
............
}
ret_type method2(args)
{
............
}
.......
}

class sub_type extends sup_type
{
private datatype var1;
private datatype var2;
.......................

ret_type method1(args)
{
............
}
ret_type method2(args)
{
............
}
.......
}

*/

















