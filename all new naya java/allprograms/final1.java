class A {
  final void meth() {
    System.out.println("This is a final method.");
  }
}

class B extends A {
  void meth() { // ERROR! Can't override.
    System.out.println("Illegal!");
  }
}

class final1{
public static void main(String[] a)
{
 B b=new B();
b.meth();
}
}