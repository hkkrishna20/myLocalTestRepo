class Example6
{
public static void main(String[] args)
{
double yoursales=Double.parseDouble(args[0]);
double target=Double.parseDouble(args[1]);
String performance="Fine";
double bonus;

if(yoursales >= 2 * target)
{
 performance = "Excellent";
 bonus = 1000;
 }
else if(yoursales >= 1.5 * target)
{
 performance = "Fine";
 bonus = 500;
}
else if(yoursales >= target)
{
performance = "Satisfactory";
bonus = 100;
}
else
{
System.out.println(" You're fired");
bonus=0;
performance = "poor";

}            
 System.out.println(" You'r Bonus" + bonus);
 System.out.println(" You'r status" + performance);

}
}
































