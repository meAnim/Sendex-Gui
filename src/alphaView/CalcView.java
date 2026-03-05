package alphaView;



import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalcView extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	JLabel label = new JLabel("Anim Calculator");
	
	public CalcView(){
		this.setTitle("Anim Calculator");
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);
		
		
		this.add(label);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	

}
