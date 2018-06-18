package sample;

public class mymath
{
double res;

public double power(double  x,double y) 
{
res=1.0;
for(int i=1;i<=y;i++)
res=res*x;
return res;
}

public double fact_num(double r)
{
res=1.0;
for(int i=1;i<=r;i++)
res=res*i;
return res;

}
}