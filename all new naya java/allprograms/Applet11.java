import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="madhav11" width=555 height=234></applet>*/
public class madhav11 extends Applet implements ActionListener
{
 TextField name,pass;
 public void init()
 {
  Label namep=new Label("name:",Label.RIGHT);
  Label passp=new Label("password:",Label.RIGHT);
  name=new TextField(12);
  pass=new TextField(8);
  pass.setEchoChar('*');
  add(namep);
  add(name);
  add(passp);
  add(pass);
  name.addActionListener(this);
  pass.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
   repaint();
   }
   public void paint(Graphics g)
   {
   g.drawString("name:"+name.getText(),6,60);
   g.drawString("selected text in name:"+name.getSelectedText(),6,80);
   g.drawString("pass:"+pass.getText(),6,100);
}
}
