//Overloading Methods 

class Demo
{

void test()
{
System.out.println("No parameters");
}

void test(int n)
{
System.out.println("One parameter   n:  " + n);
}

void test(int m,int n)
{
System.out.println("Two parameters   m:  " + m + "   n:   " + n);
}

double test(double a)
{
System.out.println(" double a:   "  + a);
return a * a;
}                                                            
}                                                            
                                                             
class sam18
{
public static void main(String args[]) {                     
  Demo x = new Demo();                                       
  double result;                                             
   x.test();                                                 
   x.test(10);
   x.test(20,34);
   result=x.test(123.2);
System.out.println(" Result    " + result);
}
}




