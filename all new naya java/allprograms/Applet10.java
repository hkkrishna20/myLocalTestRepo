import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="applet10" width=434 height=345></applet>*/
public class applet10 extends Applet implements AdjustmentListener,MouseMotionListener

{
 String msg=" ";
 Scrollbar vertSB,horzSB;
 public void init()
 {
  int width=Integer.parseInt(getParameter("width"));
  int height=Integer.parseInt(getParameter("height"));
  vertSB=new Scrollbar(Scrollbar.VERTICAL,0,1,0,height);
  horzSB=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,width);

  add(vertSB);
  add(horzSB);
  vertSB.addAdjustmentListener(this);
  horzSB.addAdjustmentListener(this);
  addMouseMotionListener(this);
  }

  public void adjustmentValueChanged(AdjustmentEvent ae)
  {
   repaint();
   }
  public void mouseDragged(MouseEvent me)
  {
  int X=me.getX();
  int Y=me.getY();
  vertSB.setValue(Y);
  horzSB.setValue(X);
  }
   public void mouseMoved(MouseEvent me)
   { }

   public void paint(Graphics g)
   {
   msg="vertical"+vertSB.getValue();
   msg+="     ,horizontal :"+horzSB.getValue();
   g.drawString(msg,6,120);
   g.drawString("*",horzSB.getValue(),vertSB.getValue());
      }
   }

