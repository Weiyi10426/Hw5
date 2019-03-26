/*********************************************************************************
* Lab3: <The tip,>
*
* Description:
* <This program solves the problem about tip>
*
*
* Author: <Weiyi Meng> <me@twu.ca>
* Date: <March 8, 2019>
*
* Input: <charge>
* Output: <the tip>
*
*  I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source.
*  I have not given my code to any student.
*
*  Sign here: <Weiyi Meng>

********************************************************************************/

import javax.swing.*; // Needed for Swing classes


import java.awt.event.*; // Needed for ActionListener Interface
/**
The tipcaculate class displays a JFrame that
lets the user enter a charge. When
the Calculate button is clicked, a dialog box is
displayed with the tip.
*/
public class tipcaculate extends JFrame{
	private JPanel panel; // To reference a panel
	private JLabel messageLabel; // To reference a label
	private JLabel messageLabel2;
	private JLabel messageLabel3;
	private JLabel messageLabel4;
	
	
	
	private JTextField tipTextField; // To reference a text field
	private JButton calcButton; // To reference a button
	private final int WINDOW_WIDTH = 200; // Window width
	private final int WINDOW_HEIGHT = 300; // Window height
	/**
	Constructor
	*/
	public tipcaculate()
	{
	// Set the window title.
	setTitle("Resturant charge");
	// Set the size of the window.
	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	// Specify what happens when the close button is clicked.
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// Build the panel and add it to the frame.
	buildPanel();
	// Add the panel to the frame's content pane.
	add(panel);
	// Display the window.
	setVisible(true);
	}
	/**
	The buildPanel method adds a label, text field, and
	and a button to a panel.
	*/
	private void buildPanel()
	{
	// Create a label to display instructions.
	messageLabel = new JLabel("Resturant Charge");
	messageLabel2 = new JLabel("        Amount to tip");
	
	messageLabel3 = new JLabel();
	messageLabel4 = new JLabel("                 ");
	
	
	
	// Create a text field 10 characters wide.
	tipTextField = new JTextField(10);
	// Create a button with the caption "Calculate".
	calcButton = new JButton("Calculate Tip");
	// Add an action listener to the button.
	calcButton.addActionListener(new CalcButtonListener());
	// Create a text field 10 characters wide.
	tipTextField = new JTextField(10);
	// Create a button with the caption "Calculate Tip"
	// Create a JPanel object and let the panel
	// field reference it.

	panel = new JPanel();
	// Add the label, text field, and button
	// components to the panel.
	panel.add(messageLabel);
	
	panel.add(tipTextField);
	
	panel.add(calcButton);
	
	panel.add(messageLabel2);
	panel.add(messageLabel4);
	
	panel.add(messageLabel3);
	
	}
	/**
	CalcButtonListener is an action listener class for
	the Calculate button.
	*/
	private class CalcButtonListener implements ActionListener
	{
	/**
	The actionPerformed method executes when the user
	clicks on the Calculate button.
	@param e The event object.
	*/
	public void actionPerformed(ActionEvent e)
	{
		  
		final double tip = 0.15;
		String input; // To hold the user's input
		double result; // The number of result
		// Get the text entered by the user into the
		// text field.
		input = tipTextField.getText();
		result = Double.parseDouble(input) * tip;
		// Display the result.
		String Tip=String.format("%.2f",result);

	    messageLabel3.setText( Tip);      
	        }
	
	// For debugging, display a message indicating
	// the application is ready for more input.
	
	// Display the result.
	
	
	}
	 // End of tipcaculate class
	
	public static void main(String[] args)
	{
	new tipcaculate();
	}
	
	
}