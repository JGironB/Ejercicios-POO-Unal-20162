package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable 
{

    private JFrame frame;

    @Override
    public void run() 
    {
    	frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) 
    {
    	BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
    	JLabel text = new JLabel("Are you?");
        container.add(text);
        
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
   
        container.add(yes);
        container.add(no);
        
        JLabel text1 = new JLabel("Why?");
        container.add(text1);
        
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(noReason);
        buttonGroup.add(fun);

        container.add(noReason);
        container.add(fun);
        
    	JButton button = new JButton("Done!");
        container.add(button);
         
    }
    
    public JFrame getFrame() 
    {
        return frame;
    }
    
}
