public class sam2a
{
public static void main(String[] args)
{
int i=1,n;
n=Integer.parseInt(args[0]);

while(i<=n)
{
if(i%3==0 && i%5==0)
System.out.print("    "+ i);
i++;
}
System.out.println("End");


}
}
/*i++;
if(i>5 && i<=7)
break;
}





while (condition)
{
statements;
......
}*/


