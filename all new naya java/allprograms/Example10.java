class Example10
{
public static void main(String[] args)
{

int a=0,b=1,c=a+b;
System.out.print(a+ "  " +b);
do
{
System.out.print("  "+c );
a=b;b=c;c=a+b;

}
while(c<100);
}
}

       
