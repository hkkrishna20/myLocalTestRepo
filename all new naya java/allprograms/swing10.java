import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
  <applet code="swing10" width=300 height=100>
  </applet>
*/
  
public class swing10 extends JApplet 
implements ItemListener {

  JLabel jl;

  public void init() {

    // Get content pane
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    // Create a combo box and add it
    // to the panel
    JComboBox jc = new JComboBox();
    jc.addItem("b1");
    jc.addItem("b2");
    jc.addItem("b3");
    jc.addItem("b4");
    jc.addItemListener(this);
    contentPane.add(jc);

    // Create label
    jl = new JLabel(new ImageIcon("b5.gif"));
    contentPane.add(jl);
  }

  public void itemStateChanged(ItemEvent ie) {
    String s = (String)ie.getItem();
    jl.setIcon(new ImageIcon(s + ".gif"));
  }
}
