/*  problem on abstraction */
/* name: m.harikrishna
rollnumber:10906011
branch :computer science and engineering*/

import java.io.*;
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
System.out.println("length*breath*height");
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
System.out.println("volume");
System.out.println((1.73/4)*3.14*(heit/2)*(heit/2)*(heit/2));
}
}
class abst
{
public static void main(String args[]) throws IOException
{
System.out.println("enter lentgh breadth height of a cube ");
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int z = Integer.parseInt(br.readLine());
int y = Integer.parseInt(br.readLine());
int x = Integer.parseInt(br.readLine());
cube c=new cube(z,y,x);
System.out.println("enter length of sphere ");
int d=Integer.parseInt(br.readLine());
sphere s=new sphere(d);
hari volumes;
volumes=c;
volumes.volume();
volumes=s;
volumes.volume();
}
}

/*  output*/
/*
enter lentgh breadth height of a cube
5
4
3
enter length of sphere
2
length*breath*height
60
volume
1.35805

*/