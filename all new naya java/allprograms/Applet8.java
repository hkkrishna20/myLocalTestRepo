import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="madhav8" width=434 height=345></applet>*/
public class madhav8 extends Applet implements ItemListener
{
 String msg=" ";
 Checkbox win98,winnt,solaries,mac;
 CheckboxGroup cbg;
 public void init()
 {
  cbg=new CheckboxGroup();
  win98=new Checkbox("Win98",cbg,true);
  winnt=new Checkbox("winnt",cbg,false);
  solaries=new Checkbox("solaries",cbg,false);
  mac=new Checkbox("mac",cbg,false);

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
  msg+=cbg.getSelectedCheckbox().getLabel();
   g.drawString(msg,6,100);
   }
   }

