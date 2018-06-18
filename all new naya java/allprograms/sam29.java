class Box
{
double width;
double height;
double depth;
double vol;
Box(Box z)
{
width=z.width;
height=z.height;
depth=z.depth;
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
return width*height*depth;
}
}

class BoxWeight extends Box
{
double weight;
BoxWeight(double w,double h,double d,double m)
{
super(w,h,d);
weight=m;
}

BoxWeight(BoxWeight ob)
{
super(ob);
weight=ob.weight;
}
BoxWeight()
{
super();
weight=-1;
}
BoxWeight(double len,double m)
{
super(len);
weight=m;
}
}

class sam29
{
public static void main(String args[])
{
BoxWeight  mybox1 = new BoxWeight(10,20,15,34.5);
BoxWeight  mybox2 = new BoxWeight(2,3,4,0.0765);
BoxWeight  mybox3 = new BoxWeight();
BoxWeight  mybox4 = new BoxWeight(3,2);
BoxWeight  mybox5 = new BoxWeight(mybox1);
double vol;

vol=mybox1.volume();
System.out.println(" volume  of mybox1 is : " + vol);
System.out.println(" Weight  " + mybox1.weight);

vol=mybox2.volume();
System.out.println(" volume  of mybox2 is : " + vol);
System.out.println(" Weight  " + mybox2.weight);

vol=mybox3.volume();
System.out.println(" volume  of mybox3 is : " + vol);
System.out.println(" Weight  " + mybox3.weight);

vol=mybox4.volume();
System.out.println(" volume  of mybox4 is : " + vol);
System.out.println(" Weight  " + mybox4.weight);


vol=mybox5.volume();
System.out.println(" volume  of mybox5 is : " + vol);
System.out.println(" Weight  " + mybox5.weight);



}
}


