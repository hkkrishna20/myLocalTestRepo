import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
  <applet code="swing6" width=250 height=300>
  </applet>
*/
  
public class swing6 extends JApplet 
implements ActionListener {
  JTextField jtf;

  public void init() {

    // Get content pane
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    // Add buttons to content pane
    ImageIcon france = new ImageIcon("i1.gif");
    JButton jb = new JButton(france);
    jb.setActionCommand("France");
    jb.addActionListener(this);
    contentPane.add(jb);

    ImageIcon germany = new ImageIcon("i2.gif");
    jb = new JButton(germany);
    jb.setActionCommand("Germany");
    jb.addActionListener(this);
    contentPane.add(jb);

    ImageIcon italy = new ImageIcon("i3.gif");
    jb = new JButton(italy);
    jb.setActionCommand("Italy");
    jb.addActionListener(this);
    contentPane.add(jb);

    ImageIcon japan = new ImageIcon("i4.gif");
    jb = new JButton(japan);
    jb.setActionCommand("Japan");
    jb.addActionListener(this);
    contentPane.add(jb);

    // Add text field to content pane
    jtf = new JTextField(15);
    contentPane.add(jtf);
  }

  public void actionPerformed(ActionEvent ae) {
    jtf.setText(ae.getActionCommand());
  }
}




JButton(Icon i)

JButton(Strng s,Icon i)

JButton(Strng s)


String getText()

void setText(String s)

