package alphaView;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class CalcView extends JFrame{

	
	JLabel calculatorNamelabel = new JLabel("Calculator");
	JLabel resultslabel = new JLabel("Results");
	JTextField calcInput = new JTextField(30);
	JPanel northPanel  = new JPanel();
	JPanel centerPanel  = new JPanel(new GridLayout(4,3));
	JPanel southInput  = new JPanel();
	JPanel eastInput  = new JPanel();
	JPanel westInput  = new JPanel();
	JButton buttonZero = new JButton("0");
	JButton buttonEquals = new JButton("=");
	JButton buttonMultiply = new JButton("X");
	JButton buttonMinus = new JButton("-");
	JButton buttonDivide = new JButton("/");
	
	public CalcView(){
		
		this.setTitle("Anim Calculator");
		this.setSize(500, 500);
		this.setLayout(new BorderLayout());
		
		this.add(northPanel, BorderLayout.NORTH);
		northPanel.add(calculatorNamelabel);
		northPanel.add(calcInput);
		
		this.add(centerPanel, BorderLayout.CENTER);
		for(int i=0; i<9; i++) {
			Integer buttonNumber = i+1;	
			centerPanel.add(new JButton(buttonNumber.toString()));
		};
		centerPanel.add(buttonZero);
		centerPanel.add(buttonMultiply);
		centerPanel.add(buttonMinus);
		centerPanel.add(buttonDivide);
		
		this.add(southInput, BorderLayout.SOUTH);
		southInput.add(buttonEquals);
		southInput.add(resultslabel);
		
		
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	

}
