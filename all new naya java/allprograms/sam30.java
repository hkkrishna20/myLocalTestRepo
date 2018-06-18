class Box
{
double width;
double height;
double depth;


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
}

class sale extends BoxWeight
{
double cost;

sale(sale ob)
{
super(ob);
cost=ob.cost;
}
sale(double w,double h,double d, double m,double c)
{
super(w,h,d,m);
cost=c;
}
sale()
{
super();
cost=-1;
}
}

class sam30
{
public static void main(String args[])
{
sale  s1 = new sale(10,20,15,10,34.5);
sale  s2 = new sale(10,20,15,0.56,34.5);
double vol;

vol=s1.volume();
System.out.println(" volume  of s1 is : " + vol);
System.out.println(" Weight  " + s1.weight);
System.out.println(" Cost  " + s1.cost);

vol=s2.volume();
System.out.println(" volume  of s2 is : " + vol);
System.out.println(" Weight  " + s2.weight);
System.out.println(" Cost  " + s2.cost);

}
}





