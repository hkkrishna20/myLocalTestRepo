class person
{
private String name;
private int age; 
person(person z)
{
name=z.name;
age=z.age;
}
person(String n,int y)
{
name=n;
age=y;
}

person()
{
name=" ";
age=-1;
}
void show()
{
System.out.println(" Name " + name);
System.out.println(" Age  " + age);
}
}

class Employee extends person
{
double sal;

Employee(String n,int x,double s)
{
super(n,x);
sal=s;
}

Employee(Employee s)
{
super(s);
sal=s.sal;
}

Employee()
{
super();
sal=0;
}

public void show()
{
super.show();
System.out.println(" Salary " + sal);
}
}

class sam28
{
public static void main(String args[])
{
Employee  e1 = new Employee(" raj ",  24, 4500);
Employee  e2 = new Employee(" ravi ", 30, 5000);
Employee  e3 = new Employee(e1);
Employee  e4 = new Employee();

e1.show();
e2.show();
e3.show();
e4.show();

}
}






