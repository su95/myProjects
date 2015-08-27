import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")

public class Dialer extends JFrame{
	
	JButton but1, but2, but3, but4, but5, but6, but7, but8, but9, but0,
	butPlus, butMinus, call, clear, contacts;

	JTextField numberField;
	
	String num = "";
	
	public static void main(String[] args) {
		
		new Dialer();
		
	}
	
	public Dialer() {
		
		JFrame dialerFrame = new JFrame();
		
		dialerFrame.setSize(400, 400);
		
		dialerFrame.setLocationRelativeTo(null);
		
		dialerFrame.setTitle("Dialer");
		
		dialerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel thePanel = new JPanel();		

		thePanel.setLayout(new GridBagLayout());
		
		numberField = new JTextField("Enter phone number", 20);
		
		Font font = new Font("Helvetica", Font.PLAIN, 18);
		numberField.setFont(font);
		
		
		but1 = new JButton("1");
		but2 = new JButton("2");
		but3 = new JButton("3");
		but4 = new JButton("4");
		but5 = new JButton("5");
		but6 = new JButton("6");
		but7 = new JButton("7");
		but8 = new JButton("8");
		but9 = new JButton("9");
		but0 = new JButton("0");
		butPlus = new JButton("*");
		butMinus = new JButton("#");
		call =  new JButton("Call");
		clear = new JButton("clear");
		contacts = new JButton("contacts");
		
		ListenerForDialer lForButton = new ListenerForDialer();
		
		but1.addActionListener(lForButton);
		but2.addActionListener(lForButton);
		but3.addActionListener(lForButton);
		but4.addActionListener(lForButton);
		but5.addActionListener(lForButton);
		but6.addActionListener(lForButton);
		but7.addActionListener(lForButton);
		but8.addActionListener(lForButton);
		but9.addActionListener(lForButton);
		but0.addActionListener(lForButton);
		butPlus.addActionListener(lForButton);
		butMinus.addActionListener(lForButton);
		clear.addActionListener(lForButton);
		call.addActionListener(lForButton);
		contacts.addActionListener(lForButton);
		
		
		
		// the addComp method syntax
		// addComp(thePanel,  component,  xPos,  yPos,  compWidth,  compHeight,  place,  stretch)
		
		addComp(thePanel, numberField, 1, 1, 20, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		
		addComp(thePanel, but1, 1, 2, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, but2, 5, 2, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, but3, 9, 2, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, but4, 1, 3, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, but5, 5, 3, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, but6, 9, 3, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, but7, 1, 4, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, but8, 5, 4, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, but9, 9, 4, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		
		addComp(thePanel, butPlus,  1, 5, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, but0,     5, 5, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, butMinus, 9, 5, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
				
		addComp(thePanel, contacts, 1, 6, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, call,     5, 6, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, clear,    9, 6, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		
		
		dialerFrame.add(thePanel);
		
		dialerFrame.setVisible(true);
		
	}
	
	private void addComp(JPanel thePanel, JComponent comp, int xPos, int yPos, int compWidth, int compHeight, int place, int stretch){
		
		GridBagConstraints gridConstraints = new GridBagConstraints();
		
		gridConstraints.gridx = xPos;
		gridConstraints.gridy = yPos;
		gridConstraints.gridwidth = compWidth;
		gridConstraints.gridheight = compHeight;
		gridConstraints.weightx = 1;
		gridConstraints.weighty = 1;
		gridConstraints.insets = new Insets(5,5,5,5);
		gridConstraints.anchor = place;
		gridConstraints.fill = stretch;

		
		thePanel.add(comp, gridConstraints);
		
	}
	
private class ListenerForDialer implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			if     (e.getSource() == but1)     { num += 1; }
				
			else if(e.getSource() == but2)     { num += 2; }
				
			else if(e.getSource() == but3)     { num += 3; }
				
			else if(e.getSource() == but4)     { num += 4; }
				
			else if(e.getSource() == but5)     { num += 5; }
				
			else if(e.getSource() == but6)     { num += 6; }
				
			else if(e.getSource() == but7)     { num += 7; }
				
			else if(e.getSource() == but8)     { num += 8; }
				
			else if(e.getSource() == but9)     { num += 9; }
				
			else if(e.getSource() == but0)     { num += 0; }
				  
			else if(e.getSource() == butPlus)  { num += "*"; }
				
			else if(e.getSource() == butMinus) { num += "#"; }
				
			else if(e.getSource() == clear) {
				
				if(num.length() > 0) { num = num.substring(0, num.length() - 1); }
				
			}
			
			else if(e.getSource() == call) {
				
				if(num.length() > 0) { 
					
					String outputString = num;
					JOptionPane.showMessageDialog(Dialer.this, outputString, "Calling", JOptionPane.INFORMATION_MESSAGE);
					
				} else {
					
					String outputString = "Please enter phone number";
					JOptionPane.showMessageDialog(Dialer.this, outputString, "Error", JOptionPane.ERROR_MESSAGE);
				}
					
			}
			
			else if(e.getSource() == contacts) {
				
				String outputString = "No Contacts Found";
				JOptionPane.showMessageDialog(Dialer.this, outputString, "Error", JOptionPane.ERROR_MESSAGE);
				
			}
			
			if(num.length() > 0) { numberField.setText(num + ""); }
			
			else                 { numberField.setText("Enter phone number"); }
			
			
		}
		
	} // END OF ACTION LISTENER

}