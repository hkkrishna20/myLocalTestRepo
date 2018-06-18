import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
  <applet code="prog18" width=500 height=450>
  </applet>
*/
   
public class prog18 extends Applet 
implements ActionListener 
{
int x=0,y=0,z=0;
        String s1,s2,s3;
      	
TextField text1,text2,text3;
Button yes;
 public void init()
 {

//Container c = getContentPane();
//c.setLayout(new FlowLayout());

	text1=new TextField(8);
	text2=new TextField(8);
	text3=new TextField(8);
        yes=new Button("yes");
	add(text1);
	add(text2);
	add(text3);
	add(yes);
	text1.setText("0");
	text2.setText("0");
	text3.setText("0");
 yes.addActionListener(this);
 }
public void actionPerformed(ActionEvent ae)
  {
	s1=text1.getText();
	x=Integer.parseInt(s1);
        s2=text2.getText();
	y=Integer.parseInt(s2);
        s3=text3.getText();
	z=Integer.parseInt(s3);

       x=(x*360)/300;
       y=(y*360)/300;
       z=(z*360)/300;


   repaint();
   }

public void paint(Graphics g)
{
       setForeground (Color.red);
    
          g.fillArc(100,300,150,150,0,x);
    setForeground (Color.blue);
       
          g.fillArc(100,300,150,150,0,y);
 setForeground (Color.yellow);
    
         g.fillArc(100,300,150,150,0,z);
 
 }

}
