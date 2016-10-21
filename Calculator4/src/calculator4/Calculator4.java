package calculator4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

public class Calculator4 extends JFrame 
{
	
	private Container contentPane;

	private JPanel leftPanel; 
	private JPanel centerPanel; 
	private JPanel buttonPanel; 
	private JTextField input1TextField; 
	private JTextField input2TextField; 
	private JLabel answerLabel; 
	private JButton plusButton; 
	private JButton minusButton; 

	public Calculator4() 
	{	
		super("Simple Calculator");

		contentPane = this.getContentPane();
		this.setSize(250, 100);

		Dimension frameSize = this.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width - frameSize.width)/2, 
			             (screenSize.height - frameSize.height)/2);

		leftPanel = new JPanel();
		leftPanel.setLayout(new GridLayout(3, 1));
		leftPanel.add(new JLabel("Input 1:  "));
		leftPanel.add(new JLabel("Input 2:  "));
		leftPanel.add(new JLabel("Answer:  "));
		contentPane.add(leftPanel, BorderLayout.WEST);

		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(3, 1));
		input1TextField = new JTextField(10);
		input2TextField = new JTextField(10);
		answerLabel = new JLabel();
		centerPanel.add(input1TextField);
		centerPanel.add(input2TextField);
		centerPanel.add(answerLabel);
		contentPane.add(centerPanel, BorderLayout.CENTER);

		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(2, 1));
		plusButton = new JButton("+");
		minusButton = new JButton("-");
		buttonPanel.add(plusButton);
		buttonPanel.add(minusButton);
		contentPane.add(buttonPanel, BorderLayout.EAST);

		ActionListener l = new ActionListener() 
		{
			
		    public void actionPerformed(ActionEvent e) 
			{
		    	try 
		    	{
					double d1 = Double.parseDouble(input1TextField.getText());
					double d2 = Double.parseDouble(input2TextField.getText());

					if (e.getSource() == plusButton)
						answerLabel.setText("" + (d1 + d2));
					else
						answerLabel.setText("" + (d1 - d2));
				}
		    	
		    	catch (NumberFormatException ex)
		    	{
		    		ex.printStackTrace();
		    		
		    		if(input1TextField.getText().isEmpty() || input2TextField.getText().isEmpty())
			    	{
		    			JOptionPane.showMessageDialog(null, "Por favor no deje campos de texto vacíos");
		    			throw new IllegalStateException("Campos vacíos");
			    	}
		    
		    		else
		    			JOptionPane.showMessageDialog(null, "Por favor introduzca números en los campos de texto");
		    	}
		    }
			
		};

		plusButton.addActionListener(l);
		minusButton.addActionListener(l);

  		this.setVisible(true);
  	}

	public static void main(String[] args)
	{
		new Calculator4();
	}
	
}