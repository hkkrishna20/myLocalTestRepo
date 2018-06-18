//Create a second thread.
class NewThread implements Runnable  {
      Thread t;

      NewThread() {
           //Create a  new , second thread
           t=new Thread(this, "Demo thread");
           System.out.println("Child thread:  "+t);
           t.start();  //Start the thread
      }

      //This is the entry point for the second thread. 
      public void run () {
           try {
                for(int i=5;i>0;i--)  {
                   System.out.println("Child Thread:  " + i );
                   Thread.sleep(500);
                }
            } catch (InterruptedException  e)  {
              System.out.println("Child interrupted.");
            }
            System.out.println("Exiting child thread.");
      }
}

class Mt2  {
      public static void main(String args[])  {
           new  NewThread();//Create a  new thread 

           try {
                for (int i=5;i>0;i--)  {
                     System.out.println("Main Thread:  " + i);
                     Thread.sleep(600);
                }
            } catch (InterruptedException  e)  {
              System.out.println("Main thread interrupted.");
           }
           System.out.println("Main thread exiting.");
     }
}






