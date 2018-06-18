class Box
{
private double width;
private double height;
private double depth;
void get(double x,double y,double z)
{
width=x;
height=y;
depth=z;
}

void volume()
{
System.out.println(" Volume is ");
System.out.println(width * height * depth);
}

}

class Example25
{
public static void main(String args[]) {

Box mybox1 = new Box();
Box mybox2= new Box();

mybox1.get(10,20,15);
mybox1.volume();

mybox2.get(2,5,6);
mybox2.volume();


}
}




