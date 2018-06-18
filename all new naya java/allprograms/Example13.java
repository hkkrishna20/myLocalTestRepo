class Example13
{

public static void main(String[] args)
{

int i=Integer.parseInt(args[0]);

System.out.println("REVERSE OF "+ i);

for(;i!=0;i=i/10)
{
switch(i%10)
{
case 1:
System.out.print("ONE");
break;
case 2:
System.out.print("TWO");
break;
case 3:
System.out.print("THREE");
break;
case 4:
System.out.print("FOUR");
break;
case 5:
System.out.print("FIVE");
break;
case 6:
System.out.print("SIX");
break;
case 7:
System.out.print("SEVEN");
break;
case 8:
System.out.print("EIGHT");
break;
case 9:
System.out.print("NINE");
break;
default:
System.out.print("ZERO");

}
}
}
}
