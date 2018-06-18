class Excep2
{
public static void main(String args[])
{
int a[]={1,5,6,7,5};
int index=Integer.parseInt(args[0]);
int x;
try
{
x=a[index]+5;
System.out.println(" x value in  try block:  "+ x);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(" Array index OOB:   Error ");
x=a[3]+5;
System.out.println(" x value in catch block: "+ x);

}
}
}

