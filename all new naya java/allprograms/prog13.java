import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="prog13" width=434 height=345>
</applet>*/


public class prog13 extends Applet
implements ActionListener
{
TextField text1,text2,text3;
Button yes;
 public void init()
 {
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
   repaint();
   }
 

 public void paint(Graphics g)
 {
	String s1,s2,s3,str,r;
	double x=0,y=0;
        int i,c=0,z=0;
//        str=getParameter("month");
  //       Boolean per=new Boolean(str);
	s1=text1.getText();
	x=Double.parseDouble(s1);
        s2=text2.getText();
	y=Double.parseDouble(s2);
        s3=text3.getText();
	z=Integer.parseInt(s3);

//	if(per)
//	c=z*12;
//	else
	c=z;	
	for( i=1;i<=c;i++)
	x+=x*y;
r=String.valueOf(x);
g.drawString(" The Sum is: ",20,100);
g.drawString(r,20,150);

 }
}