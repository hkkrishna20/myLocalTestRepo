//NESTED TRY BLOCKS
class Excep5
{
static void nesttry(int a){
     try
     {
         if(a==1) a=a/(a-a);
         if(a==2)
         {
         int c[]={1};
         c[40]=99;
         }
      }  
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(" Array index OOB:   Error ");
}
}

public static void main(String args[])
{
try
{
int a=args.length;
int b= 40/a;
System.out.println(" a value is  " + a);
     nesttry(a);

  }
catch(ArithmeticException e)
{
System.out.println("Div by zero: error");
}

}
}

