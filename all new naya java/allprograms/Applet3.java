import java.awt.*;
import java.applet.*;
/*<applet code="madhav3" width=500 height=300></applet>*/
public class madhav3 extends Applet
{
 public void init()
 {
  setBackground(Color.red);
  setBackground(Color.cyan);
  }
  public void paint(Graphics g)
  {
   String msg=" ";
   String FontList[];
   GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
   FontList=ge.getAvailableFontFamilyNames();
   for(int i=0;i<FontList.length;i++)
   msg+=FontList[i]+" ";
   g.drawString(msg,4,17);
   }}
