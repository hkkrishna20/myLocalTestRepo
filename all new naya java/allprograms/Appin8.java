import java.awt.*;
import java.applet.*;
/*
<applet code="appin8" width=500 height=600>
</applet>
*/
public class appin8 extends Applet
{
 public void paint(Graphics g)
{
 int xpoints[]={30,200,30,200,30};
 int ypoints[]={30,30,100,200,30};
 int num=5;
 g.drawPolygon(xpoints,ypoints,num);


 }
}
