interface Callback {
  void callback(int param);
}


class Client implements Callback {
  public void callback(int p) {
    System.out.println("callback called with " + p);
  }
}

class interface1{
public static void main(String[]a)
{
Client c=new Client();
c.callback(10);
}
}