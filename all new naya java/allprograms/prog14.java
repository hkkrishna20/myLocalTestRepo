import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="prog14" width=434 height=345>
</applet>*/


public class prog14 extends Applet
implements ActionListener
{
String str,opr;
int op1,op2,res;

TextField text1;
Button a[];
Button plus,minus,mul,div,mod,eq;
 public void init()
 {

setLayout(new GridLayout(5,4));
setFont(new Font("SansSerif",Font.BOLD,24));

	text1=new TextField(8);
        a=new Button[10];
	
	for(int i=0;i<10;i++)
        {
	a[i]=new Button(String.valueOf(i));
	add(a[i]);
	}

plus=new Button("+");
minus=new Button("-");
mul=new Button("*");
div=new Button("/");
mod=new Button("%");
eq=new Button("=");

add(plus);
add(minus);
add(mul);
add(div);
add(mod);
add(eq);        
add(text1);
	text1.setText("0");
for(int j=0;j<10;j++)
a[j].addActionListener(this);

plus.addActionListener(this);
minus.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
mod.addActionListener(this);
eq.addActionListener(this);;
 }


 public void actionPerformed(ActionEvent ae)
  {
 str=ae.getActionCommand();

if(str.equals("+")||str.equals("-")||
str.equals("*")||str.equals("/")||str.equals("%") )
{
op1=Integer.parseInt(text1.getText());
opr=str;
text1.setText("0");
}
else if(str.equals("="))
{
op2=Integer.parseInt(text1.getText());
	if(opr.equals("+"))
	res=op1+op2;
	else if(opr.equals("-"))
	res=op1-op2;
	else if(opr.equals("*"))
	res=op1*op2;
	else if(opr.equals("/"))
	res=op1/op2;
	else if(opr.equals("%"))
	res=op1%op2;
	text1.setText(String.valueOf(res));
}
else
{
String v=text1.getText();
v+=str;
text1.setText(v);
}
 repaint();
}
 

 public void paint(Graphics g)
 {

 }
}