//MULTIPLE CATCH BLOCKS
class Excep3
{
public static void main(String args[])
{
int a[]={1,5,6,7,5};
int x,b=5;
x=args.length;

try
{
x=10*(b/x);
x=a[30]+5;
System.out.println(" try block ");
}
catch(ArithmeticException e)
{
System.out.println("Div by zero: error");
}

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(" Array index OOB:   Error ");
x=a[3]+5;
System.out.println(" x value "+ x);
}
}
}

