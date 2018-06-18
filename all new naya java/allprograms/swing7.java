import java.awt.*;
import javax.swing.*;
/*
  <applet code="swing7" width=300 height=50>
  </applet>
*/
  
public class swing7 extends JApplet {
  JTextField jtf;

  public void init() {

    // Get content pane
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    // Add text field to content pane
    jtf = new JTextField(15);
    contentPane.add(jtf);
  }
}
