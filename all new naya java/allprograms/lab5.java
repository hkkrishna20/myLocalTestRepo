class lab5
{
public static int fibo(int n)
{
int s=0;
if(n==0)
return 0;
else if(n==1)
return 1;
else
s=fibo(n-1)+fibo(n-2);
return s;
}

public static void main(String[] a)
{
int n=Integer.parseInt(a[0]);
for(int i=0;i<=n;i++)
System.out.print("    "
+fibo(i));
}
}
