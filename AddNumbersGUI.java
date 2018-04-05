import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @author Hal Mendoza
 */

public class AddNumbersGUI extends JPanel  implements ActionListener {
	JLabel instructionsLabel, answerLabel;
	JTextField num1TextField, num2TextField;
	JButton enterButton;

	public AddNumbersGUI() {

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		instructionsLabel = new JLabel("Enter two numbers to be added");
		add(instructionsLabel); // Add the label.

		num1TextField = new JTextField(30);
		add(num1TextField);		

		num2TextField = new JTextField(30);
		add(num2TextField);			
		
		enterButton = new JButton("Enter");
		add(enterButton);
		
		answerLabel = new JLabel();
		answerLabel.setPreferredSize(new Dimension(100, 30));
		add(answerLabel); // Add the label.
				
		enterButton.addActionListener(this);

	}

	/*******************************************************
	 * Called when user clicks buttons with ActionListeners.
	 */
	public void actionPerformed(ActionEvent e) {
		Double num1, num2, answer;
		if (e.getSource() == enterButton) {
			String str1, str2;
			str1 = num1TextField.getText();
			str2 = num2TextField.getText();
			num1 = Double.parseDouble(str1);
			num2 = Double.parseDouble(str2);
			answer = num1 + num2;
			answerLabel.setText(num1 + " + " + num2 + " = " + answer);
		}
	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Add Two Numbers");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add content to the window.
		frame.add(new AddNumbersGUI());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event dispatch thread:
		// creating and showing this application's GUI.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}