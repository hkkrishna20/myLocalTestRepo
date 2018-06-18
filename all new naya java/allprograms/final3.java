class A {

final int i=10;
void meth() {
    System.out.println("i =" + i);
i+=10;
    System.out.println("i =" + i);

  }
}


class final3{
public static void main(String[] a)
{
A b=new A();
b.meth();
}
}