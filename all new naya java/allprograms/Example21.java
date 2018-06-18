
class Example21
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);

int[] a=new int[n];
int i,s=0;

for(i=0;i<a.length;i++)
{
a[i]=i+1;
s+=a[i];
}

for(i=0;i<a.length;i++)
System.out.print(a[i]+ "+ ");
System.out.println("Sum =" +s);


}}

//datatype arr_name[]=new datatype[size];




