class Example16
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int i,j,f=0;
for(i=1;i<=n;i++)
{
    for(j=1,f=0;j<=i;j++)
    {
	if(i%j==0)
        f++;  
     }
      if(f==2)
      System.out.print("  " + i);  
}
}
}







/*
for(exp1;exp2;exp3)
{
statements;


}
*/