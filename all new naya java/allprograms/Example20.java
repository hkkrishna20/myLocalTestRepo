
class Example20
{
public static void main(String[] args)
{
int[] a=new int[args.length];
int i;

for(i=0;i<args.length;i++)
a[i]=Integer.parseInt(args[i]);


for(i=0;i<a.length;i++)
System.out.println("A[ " + i + " ] " +a[i]);
}}

//datatype arr_name[]=new datatype[size];




