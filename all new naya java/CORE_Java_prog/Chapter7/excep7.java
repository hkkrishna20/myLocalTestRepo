// This program contains an error and will not compile.
class excep7 {
  static void throwOne() {
    System.out.println("Inside throwOne.");
    throw new IllegalAccessException("demo");
  }
  public static void main(String arbs[]) {
    throwOne();
  }
}
