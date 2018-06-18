import java.awt.*;
import java.applet.*;

/*
<applet code="Appin2" width=500 height=600>
</applet>
*/

class Appin2 extends Applet
{
 public void init()
 {
   setBackground(Color.cyan);
 }
 public void paint(Graphics g)
 {
  g.drawString("this is the applet window",10,20);
  showStatus("this is shown in the status window");
 }

 }
