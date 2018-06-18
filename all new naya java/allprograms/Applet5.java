import java.awt.*;
import java.applet.*;
/*<applet code="madhav5" width=344 height=345></applet>*/
public class madhav5 extends Applet
{
final Font f=new Font("fafa",Font.BOLD,12);
 public void paint(Graphics g)
 {
 Dimension d=this.getSize();
 g.setColor(Color.red);
 g.fillRect(0,0,d.width,d.height);
 g.setColor(Color.black);
 g.setFont(f);
 drawCenteredstring("center:",d.width,d.height,g);
 g.drawRect(0,0,d.width-1,d.height-1);
 }
 public void drawCenteredstring(String s,int w,int h,Graphics g)
 {

 FontMetrics fm=g.getFontMetrics();
 int x=(w-fm.stringWidth(s))/2;
 int y=(fm.getAscent()+(h-(fm.getAscent()+fm.getDescent()))/2);
   g.drawString(s,x,y);
   }
   }










