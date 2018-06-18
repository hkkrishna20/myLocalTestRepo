import java.awt.*;
import java.applet.*;
/*
<applet code="madhav2" width=800 height=700 ></applet>*/
public class madhav2 extends Applet implements Runnable
{
 String msg="venu:  ";
// int state;
 boolean sf;
 Thread t=null;
 public void init()
 {
  setBackground(Color.orange);
  setForeground(Color.cyan);
 }
  public void start()
  {
   t=new Thread(this);
   sf=false;
   t.start();
  }
   public void run()
   {
    char ch;
    for(; ;)
    {
     try
     {
      repaint();
      Thread.sleep(200);
      ch=msg.charAt(0);
      msg=msg.substring(1,msg.length());
      msg+=ch;
      if(sf)
      break;
     } catch (InterruptedException e){ }
     }
     }
     public void stop()
     {
      sf=true;
      t=null;
      }
      public void paint(Graphics g)
      {
       g.drawString(msg,50,30);
       }
       }
  

