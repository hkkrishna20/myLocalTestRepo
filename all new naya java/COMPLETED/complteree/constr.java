/*                      name: m.harikrishna
			rollnumber:10906011
			branch:computer science and engineering*/

class oper
{
int a;
int b;
oper()
{
a=10;
b=5;
}
void add()
{
int c;
c=a+b;
System.out.println(c);
}
void sub()
{
int c;
c=a-b;
System.out.println(c);
}
void mul()
{
int c;
c=a*b;
System.out.println(c);
}
void div()
{
int c;
c=a/b;
System.out.println(c);
}
}
class constr
{
public static void main(String args[])
{
oper obj1=new oper();
obj1.add();
obj1.sub();
obj1.mul();
obj1.div();
}
}

/*       output*/
/*
b109611@ccc161:~/java programs/hari labprograms> javac constr.java
b109611@ccc161:~/java programs/hari labprograms> java constr
15
5
50
2
*/