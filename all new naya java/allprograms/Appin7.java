import java.awt.*;
import java.applet.*;
/*
<Applet code="appin7" width=600 height=500>
</applet>
*/
public class appin7 extends Applet
{
 public void paint(Graphics g)
 {
  g.drawArc(10,40,70,70,70,75);
  g.fillArc(100,40,70,70,0,75);
  g.drawArc(190,10,60,50,15,15);
  g.fillArc(190,10,60,50,15,15);
  g.drawArc(10,20,10,20,0,360);
 }
}

