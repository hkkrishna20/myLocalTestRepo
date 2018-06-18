import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="madhav6" width=434 height=345></applet>*/
public class madhav6 extends Applet implements ActionListener
{
 String msg=" ";
 Button yes,no,maybe;
 public void init()
 {
  yes=new Button("yes");
  no=new Button("no");
  maybe=new Button("undecided");
  add(yes);
  add(no);
  add(maybe);
  yes.addActionListener(this);
  no.addActionListener(this);
  maybe.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
   String str=ae.getActionCommand();
   if(str.equals("yes"))
   {
    msg="u pressed yes";
    }
  else if(str.equals("no"))
   {
    msg="u pressed no";
    }
   else
   {
    msg="u pressed undes";
    }
   repaint();
   }
   public void paint(Graphics g)
   {
   g.drawString(msg,6,100);
   }
   }

