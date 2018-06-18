class Example17
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int i,s=0,t;

for(i=10;i<=n;i++)
{
    for(s=0,t=i;t!=0;t=t/10)
    s=(s*10)+(t%10);    
      if(s==i)
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