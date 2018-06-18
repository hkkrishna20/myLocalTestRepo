import java.awt.*;
import java.applet.*;
/*<applet code="madhav4" width=344 height=345></applet>*/
public class madhav4 extends Applet
{
int curx=0,cury=0;
public void init()
{
 Font f=new Font("kiran",Font.BOLD,12);
 setFont(f);
 }
 public void paint(Graphics g)
 {
 FontMetrics fm=g.getFontMetrics();
 nextline("this 1stline:",g);
 nextline("this 2ndline:",g);
 sameline("this 3rdline:",g);
 }
 void nextline(String s,Graphics g)
 {
  FontMetrics fm=g.getFontMetrics();
  cury+=fm.getHeight();
  curx=0;
  g.drawString(s,curx,cury);
  curx=fm.stringWidth(s);
  }
  void sameline(String s,Graphics g)
  {
   FontMetrics fm=g.getFontMetrics();
   g.drawString(s,curx,cury);
   curx=fm.stringWidth(s);
   }
   }










