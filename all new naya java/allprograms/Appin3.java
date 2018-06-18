import java.awt.*;
import java.applet.*;
/*
 <applet code=jp2 width=100 height=100>
 </applet>
*/
public class jp2 extends Applet
{
  public void paint(Graphics g)
  {
   g.drawLine(0,0,100,100);
   g.drawLine(0,100,100,0);
   g.drawLine(75,25,260,180);
   g.drawLine(20,150,400,400);

 }
}
