import javax.swing.*;

public class swing3 {
  public static void main(String[] args) {
    JLabel label = new JLabel("A Very Simple Text Label");

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(label); 
// adds to CENTER
    frame.pack();
    frame.setVisible(true);
  }
}
