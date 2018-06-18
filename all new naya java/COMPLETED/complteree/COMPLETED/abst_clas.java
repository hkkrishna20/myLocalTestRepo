abstract class hari
{
int lenth;
int brth;
int heit;
hari(int a)
{
heit=a;
}
hari(int a,int b,int c)
{
lenth=a;
brth=b;
heit=c;
}
abstract void volume();
}
class cube extends hari
{
cube(int a,int b,int c)
{
super(a,b,c);
}
void volume()
{
System.out.println(lenth*brth*heit);
}
}
class sphere extends hari
{
sphere(int a)
{
super(a);
}
void volume()
{
System.out.println((1.73/4)*3.14*(heit/2)*(heit/2)*(heit/2));
}
}
class abst_clas
{
public static void main(String args[])
{
cube c=new cube(2,3,4);
sphere s=new sphere(4);
hari volumes;
volumes=c;
volumes.volume();
volumes=s;
volumes.volume();
}
}