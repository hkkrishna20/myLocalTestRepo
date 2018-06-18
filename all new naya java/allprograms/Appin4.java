import java.awt.*;
import java.applet.*;
/*
<applet code="jp3" width=400 height=500>
</applet>
*/
public class jp3 extends Applet
{
 public void paint(Graphics g)
 {
  g.drawRect (100,10,60,50);
  g.fillRect (100,10,60,50);
  g.drawRoundRect (190,10,60,50,15,15);
  g.fillRoundRect (190,10,60,50,15,15);
 }
}
