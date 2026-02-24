package alphaView;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame();
		
	    JButton myButton = new JButton();
	    myButton.setText("Submit");
	    myButton.setSize(160, 50);
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(500, 500);
		myFrame.add(myButton);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
		
	}

}
