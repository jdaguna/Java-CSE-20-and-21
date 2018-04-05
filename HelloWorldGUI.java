import javax.swing.*;
/**
 * @author Josh Daguna
 */
public class HelloWorldGUI extends JPanel {
   public HelloWorldGUI() {
      JLabel label;
      //Create the label.
      label = new JLabel("Hello World from Josh");
      //Add the label.
      add(label);
   }
   /**
    * Create the GUI and show it. For thread safety,
    * this method should be
    * invoked from the event dispatch thread.
    */
   private static void createAndShowGUI() {
      //Create and set up the window.
      JFrame frame = new JFrame("Hello World");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //Add content to the window.
      frame.add(new HelloWorldGUI());
      //Display the window.
      frame.pack();
      frame.setVisible(true);
   }
   public static void main(String[] args) {
      //Schedule a job for the event dispatch thread:
      //creating and showing this application's GUI.
      SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            createAndShowGUI();
          }
      });
   }
}
