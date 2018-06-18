public class sam8
{

public static void sort(int[] a)
{
int i,j,t;
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
}

public static void print(int[] a)
{
int i;
System.out.println("Array  :");
for(i=0;i<a.length;i++)
System.out.print("   " + a[i]);
}

public static void main(String[] args)
{
int[] a={10,34,65,13,45,2,7};
print(a);
sort(a);
print(a);
}


}

