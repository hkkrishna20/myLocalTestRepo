import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="madhav7" width=434 height=345></applet>*/
public class madhav7 extends Applet implements ItemListener
{
 String msg=" ";
 Checkbox win98,winnt,solaries,mac;
 public void init()
 {
  win98=new Checkbox("Win98",null,true);
  winnt=new Checkbox("winnt");
  solaries=new Checkbox("solaries");
  mac=new Checkbox("mac");

  add(win98);
  add(winnt);
  add(solaries);
  add(mac);
  win98.addItemListener(this);
  winnt.addItemListener(this);
   solaries.addItemListener(this);
  mac.addItemListener(this);
  }
  public void itemStateChanged(ItemEvent ie)
  {
   repaint();
   }
   public void paint(Graphics g)
   {
   msg="curent state:";
   g.drawString(msg,6,100);
   msg="win98 :  "+win98.getState();
   g.drawString(msg,6,120);
   msg="winnt : "+winnt.getState();
   g.drawString(msg,6,140);
   msg="solaries : "+solaries.getState();
   g.drawString(msg,6,160);
   msg="mac : "+mac.getState();
   g.drawString(msg,6,180);
   }
   }

