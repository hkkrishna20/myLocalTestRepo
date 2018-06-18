class Box
{

double width;
double height;
double depth;

Box(Box ob)
{
width=ob.width;
height=ob.height;
depth=ob.depth;
}

Box(double x,double y,double z)
{
width=x;
height=y;
depth=z;
}

Box()
{
width=-1;
height=-1;
depth=-1;
}

Box(double len)
{
width=height=depth=len;
}
double volume()
{
return (width * height * depth);
}
}

class Example33
{
public static void main(String args[]) {
Box mybox1 = new Box(12,4,5);
Box mybox2 = new Box();
Box mybox3 = new Box(6);
Box sample= new Box(mybox1);

double vol;

vol=mybox1.volume();
System.out.println(" Volume of Mybox1 is  " + vol);

vol=mybox2.volume();
System.out.println(" Volume of Mybox2 is  " + vol);

vol=mybox3.volume();
System.out.println(" Volume of Mybox3 is  " + vol);

vol=sample.volume();
System.out.println(" Volume of sample is  " + vol);

}
}




