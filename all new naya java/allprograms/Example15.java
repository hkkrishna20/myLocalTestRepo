class Example15
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int i;
for(i=1;i<=n;i++)
{
if(i>=10 && i<=20)
continue;

System.out.print("  " +i);	
}

}
}






/*
for(exp1;exp2;exp3)
{
statements;


}
*/