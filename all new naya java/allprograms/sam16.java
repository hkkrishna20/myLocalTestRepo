class Box
{
private double width;
private double height;
private double depth;
private double vol;

Box()
{
width=height=depth=0;
}

Box(double x,double y,double z)
{
width=x;
height=y;
depth=z;
}

void put()
{
vol=(width * height * depth);
System.out.println("Volume=   " + vol);
}

}

class sam16
{
public static void main(String args[]) {

Box mybox1 = new Box();
mybox1.put();

Box mybox2 = new Box(12,4,5);
mybox2.put();

}
}




