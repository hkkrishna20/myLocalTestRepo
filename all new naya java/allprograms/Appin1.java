import java.awt.*;
import java.applet.*;
/*
 <applet code="Appin1" width=400 height=400>
 </applet>
 */
 public class Appin1 extends Applet
 {
  String msg;
  
  public void init()
  {
    setBackground (Color.blue);
    setForeground (Color.white);
    msg="Inside init() ----";
   }
   public void start()
   {
     msg+="Inside Start()----";
   }
   public void paint(Graphics g)
   {
     msg+="Inside paint()----";
     g.drawString(msg,40,60);
   }
  }
    


