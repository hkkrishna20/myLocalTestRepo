import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="madhav13" width=455 height=234></applet>*/
class MenuFrame extends Frame
{
 String msg=" ";
 CheckboxMenuItem debug,test;
 MenuFrame(String title)
 {
  super(title);
  MenuBar mbar=new MenuBar();
  setMenuBar(mbar);
  Menu file=new Menu("file");
  MenuItem item1, item2,item3,item4,item5;
  file.add(item1=new MenuItem("new:"));
  file.add(item2=new MenuItem("open:"));
  file.add(item3=new MenuItem("close:"));
  file.add(item4=new MenuItem("quit:"));
  file.add(item5=new MenuItem("-:"));
  mbar.add(file);
  Menu edit=new Menu("edit");
  MenuItem  item6,item7,item8,item9;
  edit.add(item6=new MenuItem("cut"));
  edit.add(item7=new MenuItem("copy"));
  edit.add(item8=new MenuItem("paste"));
  edit.add(item9=new MenuItem("-"));
  Menu sub=new Menu("special");
  MenuItem item10,item11,item12;
  sub.add(item10=new MenuItem("first"));
  sub.add(item11=new MenuItem("second"));
  sub.add(item12=new MenuItem("third"));
  edit.add(sub);
  debug=new CheckboxMenuItem("debug");
  edit.add(debug);
  test=new CheckboxMenuItem("testing");
  edit.add(test);
  mbar.add(edit);
  MyMenuHandler handler=new MyMenuHandler(this);
   item1.addActionListener(handler);
   item2.addActionListener(handler);
   item3.addActionListener(handler);
   item4.addActionListener(handler);
   item5.addActionListener(handler);
    item6.addActionListener(handler);
    item7.addActionListener(handler);
   item8.addActionListener(handler);
   item9.addActionListener(handler);
   item10.addActionListener(handler);
   item11.addActionListener(handler);
   item12.addActionListener(handler);
   debug.addItemListener(handler);
   test.addItemListener(handler);
   MyWindowAdapter adapter=new MyWindowAdapter(this);
   addWindowListener(adapter);
   }
   public void paint(Graphics g)
   {
   g.drawString(msg,10,200);
   if(debug.getState())
   g.drawString("debug is on",10,220);
   else
   g.drawString("debug is off",10,220);
   if(test.getState())
   g.drawString("testing is on",10,240);
   else
   g.drawString("testing is off",10,240);
   }
   }
   class MyWindowAdapter extends WindowAdapter
   {
   MenuFrame menuFrame;
   public MyWindowAdapter(MenuFrame menuframe)
   {
   this.menuFrame=menuFrame;
   }
   public void WindowClosing(WindowEvent we)
   {
   menuFrame.setVisible(false);
   }
   }
   class MyMenuHandler implements ActionListener,ItemListener
   {
   MenuFrame menuFrame;
   public MyMenuHandler(MenuFrame menuframe)
   {
   this.menuFrame=menuFrame;
   }
   public void actionPerformed(ActionEvent ae)
   {
   String msg=("u selected:");
   String arg=(String)ae.getActionCommand();
   if(arg.equals("new:"))
   msg+="new";
   else if(arg.equals("new:"))
   msg+="new";
   else if(arg.equals("close:"))
   msg+="close";
   else if(arg.equals("quit:"))
   msg+="quit";
   else if(arg.equals("edit:"))
   msg+="edit";
   else if(arg.equals("cut:"))
   msg+="cut";
   else if(arg.equals("copy:"))
   msg+="copy";
   else if(arg.equals("paste:"))
   msg+="paste";
   else if(arg.equals("first:"))
   msg+="first";
   else if(arg.equals("second:"))
   msg+="second";
   else if(arg.equals("debug:"))
   msg+="debug";
   else if(arg.equals("test:"))
   msg+="test";
   menuFrame.msg=msg;
   menuFrame.repaint();
   }
   public void itemStateChanged(ItemEvent ie)
   {
   menuFrame.repaint();
   }
   }
   public class madhav13 extends Applet
   {
   Frame f;
   public void init()
   {
     f=new MenuFrame("menudemo");
     int width=Integer.parseInt(getParameter("width"));
     int height=Integer.parseInt(getParameter("height"));
     setSize(new Dimension(width,height));
     f.setSize(width,height);
     f.setVisible(true);
     }
     public void start()
     {
     f.setVisible (true);
     }
     public void stop()
     {
      f.setVisible(false);
      }
      }

   
