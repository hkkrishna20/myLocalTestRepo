public class sam3
{
public static void main(String[] args)
{

double a=Double.parseDouble(args[0]);
double xnew= a / 2;
double xold;

do
{
xold=xnew;
xnew=(xold + a / xold) /2;
System.out.println(xnew);
}
while(Math.abs(xnew-xold)>1E-4);
}
}

       
