public class sam5
{

public static long fun(int high,int number)
{
long r=1;
int i;
for(i=1;i<=number;i++)
{
r=r*(high/i);
high--;
}
return r;
}

public static void main(String[] args)
{
int numbers=5;
int topnumber=50000;
long a=fun(topnumber,numbers);
System.out.println("Your odds are 1 in " + a + " .Good luck");

}

}

