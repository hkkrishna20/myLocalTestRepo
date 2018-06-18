import java.awt.*;
import java.applet.*;
/*
<applet code="appin9" width=400 height=500>
</applet>
*/
public class appin9 extends Applet
{
public void paint(Graphics g)
{
 Color c1=new Color(255,100,100);
 Color c2=new Color(100,255,100);
 Color c3=new Color(100,100,255);
 g.setColor(c1);
 g.drawLine(0,0,100,100);
 g.drawLine(100,100,100,100);
 g.setColor(c2);
 g.drawLine(40,25,250,180);
 g.drawLine(75,90,400,400);
 g.setColor(c3);
 g.drawLine(20,150,400,400);
 g.drawLine(5,290,80,190);
 g.setColor(Color.red);
 g.drawOval(10,10,50,50);
 g.drawOval(70,90,140,100);
 g.setColor(Color.blue);
 g.drawOval(190,10,90,30);
 g.drawRect(10,10,10,50);
}
}
