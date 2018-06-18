import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
  <applet code="swing8" width=400 height=50>
  </applet>
*/
  
public class swing8 extends JApplet 
implements ItemListener {
  JTextField jtf;

  public void init() {

    // Get content pane
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    // Create icons
    ImageIcon normal = new ImageIcon("normal1.gif");
    ImageIcon rollover = new ImageIcon("rollover1.gif");
    ImageIcon selected = new ImageIcon("selected1.gif");

    // Add check boxes to the content pane
    JCheckBox cb = new JCheckBox("C", normal);
    cb.setRolloverIcon(rollover);
    cb.setSelectedIcon(selected);
    cb.addItemListener(this);
    contentPane.add(cb);

    cb = new JCheckBox("C++", normal);
    cb.setRolloverIcon(rollover);
    cb.setSelectedIcon(selected);
    cb.addItemListener(this);
    contentPane.add(cb);

    cb = new JCheckBox("Java", normal);
    cb.setRolloverIcon(rollover);
    cb.setSelectedIcon(selected);
    cb.addItemListener(this);
    contentPane.add(cb);

    cb = new JCheckBox("Perl", normal);
    cb.setRolloverIcon(rollover);
    cb.setSelectedIcon(selected);
    cb.addItemListener(this);
    contentPane.add(cb);

    // Add text field to the content pane
    jtf = new JTextField(15);
    contentPane.add(jtf);
  }

  public void itemStateChanged(ItemEvent ie) {
    JCheckBox cb = (JCheckBox)ie.getItem();
    jtf.setText(cb.getText());
  }
}
