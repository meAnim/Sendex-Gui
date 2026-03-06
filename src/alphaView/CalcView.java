package alphaView;

import java.awt.BorderLayout;

import javax.swing.*;

public class CalcView extends JFrame{

	
	JLabel label = new JLabel("Calculator");
	JTextField calcInput = new JTextField(30);
	JPanel topInput  = new JPanel();
	
	
	public CalcView(){
		this.setTitle("Anim Calculator");
		this.setSize(500, 500);
		this.setLayout(new BorderLayout());
		
		this.add(topInput);
		topInput.add(label);
		topInput.add(calcInput);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	

}
