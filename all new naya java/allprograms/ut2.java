import java.util.StringTokenizer;

class ut2 {
  static String in = "name=ajay;" +
    "jab=Manager;" +
    "dept=Accounts;" +
    "salary=9200";

  public static void main(String args[]) {
    StringTokenizer st = new StringTokenizer(in, "=;");

    while(st.hasMoreTokens()) {
      String key = st.nextToken();
      String val = st.nextToken();
      System.out.println(key + "\t" + val);
    }
  }
}
