public class sam3c
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int i,s=0,temp;
temp=n;
for(;n!=0;n=n/10)
{
i=n%10;
s=s+(i*i*i);
}

if(temp==s)
System.out.println(temp +"is Armstrong number");
else
System.out.println(temp +"is not a Armstrong number");

}

}

/*
for(exp1;exp2;exp3)
{
statements;


}
*/