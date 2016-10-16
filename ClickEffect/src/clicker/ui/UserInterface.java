package clicker.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

import clicker.applicationlogic.Calculator;

public class UserInterface implements Runnable 
{
	
    private JFrame frame;
    private Calculator calculator;
    
    public UserInterface(Calculator calculator)
    {
    	this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) 
    {
    	container.setLayout(new BorderLayout());
    	
    	JLabel text = new JLabel("0");
    	container.add(text, BorderLayout.CENTER);
    	JButton button = new JButton("Click!");
    	container.add(button, BorderLayout.SOUTH);
    	
    	button.addActionListener(new ClickListener(calculator, text));
    }

    public JFrame getFrame() 
    {
        return frame;
    }
    
}