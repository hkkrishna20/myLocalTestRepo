//Create multiple  threads.
class NewThread implements Runnable  {
     String name;// name of thread
     Thread  t;

     NewThread(String threadname)   {
           name= threadname;
           t=new Thread(this,name);
           System.out.println("New thread:" + t);
           t.start(); //Start the thread
     }

     //This is the entry piont for thread.
     public void run ()  {

    try {
        for(int i=5;i>0;i--)   {
           System.out.println(name + ": "+ i);
           Thread.sleep(1000);
       }
    } catch (InterruptedException  e)   {
    System.out.println(name + "Interrupted");
  }
}
}

class Example51 {
    public static void main (String args[])   {
  NewThread ob1=new NewThread("One");//start threads
         NewThread ob2=new NewThread("Two");
         NewThread ob3=new NewThread("Three");

   System.out.println(" Thread One is Alive  :" + ob1.t.isAlive());
   System.out.println(" Thread Two is Alive :" + ob2.t.isAlive());
   System.out.println(" Thread Three is Alive  :" + ob3.t.isAlive());

         try  {
             System.out.println("wait for other theads to end");
             ob1.t.join();
             ob2.t.join();
             ob3.t.join();

           } catch (InterruptedException  e)   {
             System.out.println("Main thread Interrupted");
           }
   System.out.println(" Thread One is Alive : " + ob1.t.isAlive());
   System.out.println(" Thread Two is Alive : " + ob2.t.isAlive());
   System.out.println(" Thread Three is Alive:  " + ob3.t.isAlive());


           System.out.println("Main thread exiting.");
     }
}
