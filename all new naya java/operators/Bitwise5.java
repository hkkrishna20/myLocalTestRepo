class Bitwise5
{
final static int SET=8;

public static void main(String args[])
{
int a=8,b=-8;
System.out.println(" a= " + a + "  b=" +b);
System.out.println(" a >> 2 = " + (a >> 2) );
System.out.println(" a << 1 = " + (a << 1) );
System.out.println(" a >>> 1 = " + (a >>> 1));
System.out.println(" b >> 1 = " + (b >> 2) );
System.out.println(" b >>> 1 = " + (b >>> 1));
}
}
/*0000 1000   >>2
0000 0010

0000 1000
0001 0000   << 1*/




