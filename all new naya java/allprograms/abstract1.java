// A Simple demonstration of abstract.

abstract class A {

abstract void callme();
//{
//System.out.println("This is a ABSTRACT method.");
//}

void callmetoo() {
System.out.println("This is a concrete method.");
  }
}

class B extends A {
 void callme() {
    System.out.println("B's implementation of callme.");
  }
}

class abstract1 {
  public static void main(String args[]) {
    B b = new B();
    b.callme();
    b.callmetoo();

	A a = new B();

    a.callme();
    a.callmetoo();
  }
}

