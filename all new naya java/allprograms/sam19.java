//Overloading Methods 

class Demo
{

/*void sum(int m,int n)
{
int s;
s=m+n;
System.out.println("Sum   =  " + s);
}*/ 

void sum(double a,double b)
{
double s;
s= a+b;
System.out.println(" Sum of double :   "  + s);
} 
}

class sam19
{
public static void main(String args[]) {
Demo x = new Demo();
x.sum(20,34);
x.sum(123.2,345.6);
}
}




