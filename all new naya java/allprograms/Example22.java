class Example22
{
public static void main(String[] args)
{
int[] a={10,34,65,13,45,2,7};
int i,j,t;

System.out.println("Array  :");
for(i=0;i<a.length;i++)
System.out.print("   " + a[i]);

for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("Array  :");
for(i=0;i<a.length;i++)
System.out.print("   " + a[i]);

}
}

