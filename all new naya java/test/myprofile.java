package test;

public class myprofile
{

String n;
int age;
double s,da,hra,gs;

public myprofile(String x, int y,double z)
{
n=x;
age=y;
s=z;
hra=s*0.05;
da=s*0.02;
gs=s+hra+da;
}

public void put() 
{
System.out.println(" Name : " + n);
System.out.println(" age : " + age);
System.out.println(" Basic  : " + s);
System.out.println(" Hra : " + hra);
System.out.println(" Da : " + da);
System.out.println(" Gs : " + gs);

}

}