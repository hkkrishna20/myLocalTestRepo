import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="madhav9" width=434 height=345></applet>*/
public class madhav9 extends Applet implements ItemListener
{
 String msg=" ";
 Choice os,browser;
 public void init()   
 {
  os=new Choice();
  browser=new Choice();

  os.add("win98");
  os.add("winnt");
  os.add("solaries");
  os.add("mac");
  browser.add("net scape1.1");
  browser.add("net scape2.1");
  browser.add("net scape3.1");
  browser.add("net scape4.1");
  add(os);
  add(browser);

  os.addItemListener(this);
  browser.addItemListener(this);
  }
  public void itemStateChanged(ItemEvent ie)
  {
   repaint();
   }
   public void paint(Graphics g)
   {
   msg="curent OS: ";
   msg+=os.getSelectedItem();
   g.drawString(msg,6,200);
   msg="current Browser: ";
   msg+=browser.getSelectedItem();
   g.drawString(msg,6,240);
   }
   }

