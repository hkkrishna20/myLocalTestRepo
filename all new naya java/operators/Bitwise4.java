class Bitwise4
{
final static int SET=8;

public static void main(String args[])
{
int number=Integer.parseInt(args[0]);
number=number|SET;

if((number & SET)!=0)
System.out.println( "flag is set" );
}
}







