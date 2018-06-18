class excep1
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c;
try
{
c=a/b;
System.out.println(" C value in try block:" + c);

}

catch(ArithmeticException e)
{
System.out.println(" Div:   Error ");
c=a/3;
System.out.println(" c value in catch block:  "+ c);

}
}
}




/*

try
{
......
......

}

catch(exceptiontype e)
{

......
.......
}


*/


