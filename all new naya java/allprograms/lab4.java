class lab4
{
public static void rec(int a,int b)
{


}

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

       
