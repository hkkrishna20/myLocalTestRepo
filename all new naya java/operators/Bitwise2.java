class Bitwise2
{

static final int TEST=8; /*represents 00...01000*/

public static void main(String args[])
{
int flag=Integer.parseInt(args[0]);

if((flag & TEST) != 0)
System.out.println( "Fourth bit is set" );
else
System.out.println( "Fourth bit is not set" );

}
}







