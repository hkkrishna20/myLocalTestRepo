//Controlling the main Thread.
class mt1
{
    public static void main (String args[]) {
        Thread t=Thread.currentThread();

        System.out.println("Current thread:  " +t);

        //change the name of the thread
        t.setName("My Thread");
        System.out.println("After name change : "+t);
  
        try {
           for(int n=5;n>0;n--) {
              System.out.println(n);
              Thread.sleep(100);
           }
         }
         catch (InterruptedException e)
         {
          System.out.println("Main thread interrupted");
         }
    }
}


                       /* getName()
                        getPriority()
                        isAlive()
                        join()
                        run()
                        sleep()
                        start()*/




























