package clicker.ui;

import java.awt.event.*;

import javax.swing.JLabel;

import clicker.applicationlogic.Calculator;

public class ClickListener implements ActionListener
{
	Calculator myCount;
	JLabel number;
	
	public ClickListener(Calculator calculator, JLabel number)
	{
		myCount = calculator;
		this.number = number;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		myCount.increase();
		
		number.setText(String.valueOf(myCount.giveValue()));
	}

}
