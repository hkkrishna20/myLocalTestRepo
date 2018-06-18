import java.awt.*;
import javax.swing.*;
/*
  <applet code="prog19" width=500 height=450>
  </applet>
*/
  
public class prog19 extends JApplet {

  public void init() {

//    Container contentPane = getContentPane();
  //  contentPane.setLayout(new FlowLayout());

  }
	public void paint(Graphics g)
{
   g.drawLine(20,4,150,4);

   g.drawRect (100,180,60,50);
   g.fillRect (200,180,60,50);
  g.drawRoundRect (300,180,60,50,15,15);
  g.fillRoundRect (400,180,60,50,15,15);
 
 int xpoints[]={30,200,30,200,30};
 int ypoints[]={30,30,100,200,30};
 int num=5;
  g.drawPolygon(xpoints,ypoints,num);
  
  g.drawArc(10,240,100,100,70,175);
  g.fillArc(100,240,170,170,0,75);
 

 }

}
