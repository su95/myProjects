import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


@SuppressWarnings("serial")
public class FoodOrderMenu extends JFrame{
	
	private static JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10,
				discount, coupon, total, tax, subtotal;
	
	private static JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
				item1plus, item2plus, item3plus, item4plus, item5plus, item6plus, item7plus, item8plus, item9plus, item10plus, 
				item1minus, item2minus, item3minus, item4minus, item5minus, item6minus, item7minus, item8minus, item9minus, 
				item10minus;
	
	private static JTextField tfTotal, tfCoupon, tfDiscount, tfTax, tfSubtotal,
				price1, price2, price3, price4, price5, price6, price7, price8, price9, price10;
	
	private static double totalPrice, item1Price, item2Price, item3Price, item4Price, item5Price,
				item6Price, item7Price, item8Price, item9Price, item10Price, taxPrice, discountPrice,
				subTotalPrice;
	
	private static int   item1Count, item2Count, item3Count, item4Count, item5Count, item6Count,
				item7Count, item8Count, item9Count, item10Count;
	
	
	public static void main(String[] args) {
		
		new FoodOrderMenu();
		
	}
	
	public FoodOrderMenu() {
		
		JFrame frame = new JFrame();
		
		frame.setSize(400,600);
		
		frame.setLocationRelativeTo(null);
		
		frame.setTitle("Food Menu");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel thePanel = new JPanel();
		
		JPanel foodPanel = new JPanel();
		
		JPanel billPanel = new JPanel();
		
		thePanel.setLayout(new GridBagLayout());
		
		
		
		
		
		
		label1 = new JLabel("Item 1");
		label2 = new JLabel("Item 2");
		label3 = new JLabel("Item 3");
		label4 = new JLabel("Item 4");
		label5 = new JLabel("Item 5");
		label6 = new JLabel("Item 6");
		label7 = new JLabel("Item 7");
		label8 = new JLabel("Item 8");
		label9 = new JLabel("Item 9");
		label10 = new JLabel("Item 10");
		
		discount = new JLabel("Discount Applied: ");
		coupon = new JLabel("Coupon: ");
		total = new JLabel("Total: ");
		tax = new JLabel("Tax: ");
		subtotal = new JLabel("Subtotal: ");
		
		
		
		price1 = new JTextField("0$", 5);
		price2 = new JTextField("0$", 5);
		price3 = new JTextField("0$", 5);
		price4 = new JTextField("0$", 5);
		price5 = new JTextField("0$", 5);
		price6 = new JTextField("0$", 5);
		price7 = new JTextField("0$", 5);
		price8 = new JTextField("0$", 5);
		price9 = new JTextField("0$", 5);
		price10 = new JTextField("0$", 5);
		

		button1 = new JButton("1$");
		button2 = new JButton("2$");
		button3 = new JButton("3$");
		button4 = new JButton("4$");
		button5 = new JButton("5$");
		button6 = new JButton("6$");
		button7 = new JButton("7$");
		button8 = new JButton("8$");
		button9 = new JButton("9$");
		button10 = new JButton("10$");
		
		
		item1plus = new JButton("+");
		item2plus = new JButton("+");
		item3plus = new JButton("+");
		item4plus = new JButton("+");
		item5plus = new JButton("+");
		item6plus = new JButton("+");
		item7plus = new JButton("+");
		item8plus = new JButton("+");
		item9plus = new JButton("+");
		item10plus = new JButton("+");
		
		
		item1minus = new JButton("-");
		item2minus = new JButton("-");
		item3minus = new JButton("-");
		item4minus = new JButton("-");
		item5minus = new JButton("-");
		item6minus = new JButton("-");
		item7minus = new JButton("-");
		item8minus = new JButton("-");
		item9minus = new JButton("-");
		item10minus = new JButton("-");
		
		
		item1Price = 1;
		item2Price = 2;
		item3Price = 3; 
		item4Price = 4;
		item5Price = 5;
		item6Price = 6;
		item7Price = 7;
		item8Price = 8;
		item9Price = 9;
		item10Price = 10;
		totalPrice = 0;
		subTotalPrice = 0;
		taxPrice = 0; 
		discountPrice = 0;
		
		tfCoupon = new JTextField("Enter Coupon Here", 10);
		
		tfTotal = new JTextField("Total", 15);
		
		tfDiscount = new JTextField("Discount", 15);
		
		tfTax = new JTextField("Tax", 10);
		
		tfSubtotal = new JTextField("Subtotal", 10);
		
		Font font = new Font("Helvetica", Font.PLAIN, 18);
		tfCoupon.setFont(font);
		tfTotal.setFont(font);
		tfDiscount.setFont(font);
		tfTax.setFont(font);
		tfSubtotal.setFont(font);
		
	
		// action listeners
		
		ListenerForFoodOrderMenu lForButton = new ListenerForFoodOrderMenu();
		
		item1plus.addActionListener(lForButton);
		item2plus.addActionListener(lForButton);
		item3plus.addActionListener(lForButton);
		item4plus.addActionListener(lForButton);
		item5plus.addActionListener(lForButton);
		item6plus.addActionListener(lForButton);
		item7plus.addActionListener(lForButton);
		item8plus.addActionListener(lForButton);
		item9plus.addActionListener(lForButton);
		item10plus.addActionListener(lForButton);
		
		item1minus.addActionListener(lForButton);
		item2minus.addActionListener(lForButton);
		item3minus.addActionListener(lForButton);
		item4minus.addActionListener(lForButton);
		item5minus.addActionListener(lForButton);
		item6minus.addActionListener(lForButton);
		item7minus.addActionListener(lForButton);
		item8minus.addActionListener(lForButton);
		item9minus.addActionListener(lForButton);
		item10minus.addActionListener(lForButton);
		
		
		// the addComp method syntax
		// addComp(thePanel,  component,  xPos,  yPos,  compWidth,  compHeight,  place,  stretch)
		
		
		addComp(thePanel, label1, 1, 1, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, label2, 1, 2, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, label3, 1, 3, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, label4, 1, 4, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, label5, 1, 5, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, label6, 1, 6, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, label7, 1, 7, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, label8, 1, 8, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, label9, 1, 9, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, label10, 1, 10, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		
		
		
		addComp(thePanel, button1, 3, 1, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, button2, 3, 2, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, button3, 3, 3, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, button4, 3, 4, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, button5, 3, 5, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, button6, 3, 6, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, button7, 3, 7, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, button8, 3, 8, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, button9, 3, 9, 1, 1,   GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, button10, 3, 10, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	
		
		
		
		
		
		
		addComp(thePanel, item1plus, 8, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item2plus, 8, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item3plus, 8, 3, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item4plus, 8, 4, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item5plus, 8, 5, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item6plus, 8, 6, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item7plus, 8, 7, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item8plus, 8, 8, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item9plus, 8, 9, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item10plus,8,10, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		
		
		addComp(thePanel, item1minus, 9, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item2minus, 9, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item3minus, 9, 3, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item4minus, 9, 4, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item5minus, 9, 5, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item6minus, 9, 6, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item7minus, 9, 7, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item8minus, 9, 8, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item9minus, 9, 9, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, item10minus, 9, 10, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		
		addComp(thePanel, price1, 10, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, price2, 10, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, price3, 10, 3, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, price4, 10, 4, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, price5, 10, 5, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, price6, 10, 6, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, price7, 10, 7, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, price8, 10, 8, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, price9, 10, 9, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, price10, 10, 10, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		
		
		
		
		
		addComp(thePanel, subtotal, 1, 11, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, tax,      1, 12, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, coupon,   1, 13, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, discount, 1, 14, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, total,    1, 15, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		
		addComp(thePanel, tfSubtotal, 3, 11, 10, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, tfTax,      3, 12, 10, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, tfCoupon,   3, 13, 10, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);	
		addComp(thePanel, tfDiscount, 3, 14, 10, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		addComp(thePanel, tfTotal,    3, 15, 10, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		
		frame.add(thePanel);
		
		frame.setVisible(true);
		
	}
	
	private void addComp(JPanel thePanel, JComponent comp, int xPos, int yPos, int compWidth, int compHeight, int place, int stretch){
		
		GridBagConstraints gridConstraints = new GridBagConstraints();
		
		gridConstraints.gridx = xPos;
		gridConstraints.gridy = yPos;
		gridConstraints.gridwidth = compWidth;
		gridConstraints.gridheight = compHeight;
		gridConstraints.weightx = 100;
		gridConstraints.weighty = 100;
		gridConstraints.insets = new Insets(5,5,5,5);
		gridConstraints.anchor = place;
		gridConstraints.fill = stretch;

		
		thePanel.add(comp, gridConstraints);
		
	}
	
	// Implement Listeners
	private class ListenerForFoodOrderMenu implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			// Listeners for each item
			
			// item1
			if(e.getSource() == item1plus || e.getSource() == item1minus) {
				
				if (e.getSource() == item1plus) { item1Count++; }
					
				else if (e.getSource() == item1minus) {
					
					item1Count--;
					
					if(item1Count < 0) { item1Count = 0; }
					
				}
				
				if(item1Count >= 0) { price1.setText(item1Count * item1Price  + "$"); }
					 
				else                { price1.setText("0.0$"); }
						
			}
			
			// item2
			else if(e.getSource() == item2plus || e.getSource() == item2minus) {
				
				if (e.getSource() == item2plus) { item2Count++; }
					
				else if (e.getSource() == item2minus) {
					
					item2Count--;
					
					if(item2Count < 0) { item2Count = 0; }
					
				}
				
				if(item2Count >= 0) { price2.setText(item2Count * item2Price  + "$"); }
					
				else                { price2.setText("0.0$"); }
					
			} // end of item2
			
			// item3
			else if(e.getSource() == item3plus || e.getSource() == item3minus) {
				
				if (e.getSource() == item3plus) { item3Count++; }
					
				else if (e.getSource() == item3minus) {
					
					item3Count--;
					
					if(item3Count < 0) { item3Count = 0; }
					
				}
				
				if(item3Count >= 0) { price3.setText(item3Count * item3Price  + "$"); }
					 
				else                { price3.setText("0.0$"); }
					
			} // end of item3
			
			// item4
			else if(e.getSource() == item4plus || e.getSource() == item4minus) {
				
				if (e.getSource() == item4plus) { item4Count++; }
				
				else if (e.getSource() == item4minus) {
					
					item4Count--;
					
					if(item4Count < 0) {
						item4Count = 0;
					}
					
				}
				
				if(item4Count >= 0) { price4.setText(item4Count * item4Price  + "$"); }
				
				else                { price4.setText("0.0$"); }
					
			} // end of item4
			
			// item5
			else if(e.getSource() == item5plus || e.getSource() == item5minus) {
				
				if (e.getSource() == item5plus) { item5Count++;}
				
				else if (e.getSource() == item5minus) {
					
					item5Count--;
					
					if(item5Count < 0) { item5Count = 0; }
					
				}
				
				if(item5Count >= 0) { price5.setText(item5Count * item5Price  + "$"); }
				
				else                { price5.setText("0.0$"); }
					
			} // end of item5
			
			// item6
			else if(e.getSource() == item6plus || e.getSource() == item6minus) {
							
				if (e.getSource() == item6plus) { item6Count++; }
							
				else if (e.getSource() == item6minus) {
								
					item6Count--;
								
					if(item6Count < 0) { item6Count = 0; }
								
					}
							
				if(item6Count >= 0) { price6.setText(item6Count * item6Price  + "$"); }
				
				else                { price6.setText("0.0$"); }
								
			} // end of item6
			
			// item7
			else if(e.getSource() == item7plus || e.getSource() == item7minus) {
			
				if (e.getSource() == item7plus) { item7Count++; }
				
				else if (e.getSource() == item7minus) {
											
					item7Count--;
											
					if(item7Count < 0) { item7Count = 0; }
				}
										
				if(item7Count >= 0) { price7.setText(item7Count * item7Price  + "$"); }

				else                { price7.setText("0.0$"); }	
				
			} // end of item7
							
			// item8
			else if(e.getSource() == item8plus || e.getSource() == item8minus) {
				
				if (e.getSource() == item8plus) { item8Count++; }
				
				else if (e.getSource() == item8minus) {
											
					item8Count--;
											
					if(item8Count < 0) { item8Count = 0; }
					
				}			
				
				if(item8Count >= 0) { price8.setText(item8Count * item8Price  + "$"); }
										
				else                { price8.setText("0.0$"); }
			
			} // end of item 8

			// item9
			else if(e.getSource() == item9plus || e.getSource() == item9minus) {
										
				if (e.getSource() == item9plus) { item9Count++; }
																	
				else if (e.getSource() == item9minus) {
											
					item9Count--;
											
					if(item9Count < 0) { item9Count = 0; } 
					
				}
			
				if(item9Count >= 0) { price9.setText(item9Count * item9Price  + "$"); }
								
				else                { price9.setText("0.0$"); }
				
			} // end of item9
								
			// item10
			else if(e.getSource() == item10plus || e.getSource() == item10minus) {
										
				if (e.getSource() == item10plus) { item10Count++; }
																	
				else if (e.getSource() == item10minus) {
											
					item10Count--;
											
					if(item10Count < 0) { item10Count = 0; } 
					
				}
																
				if(item10Count >= 0) { price10.setText(item10Count * item10Price  + "$"); }
													
				else                 { price10.setText("0.0$"); } 
			
			} // end of item10
								
											
							
			
		subTotalPrice = (item1Price * item1Count) + (item2Price * item2Count) + (item3Price * item3Count) +
					(item4Price * item4Count) +  (item5Price * item5Count) +(item6Price * item6Count) +
					(item7Price * item7Count) + (item8Price * item8Count) + (item9Price * item9Count) +
					(item10Price * item10Count) ;
			
		tfSubtotal.setText(subTotalPrice + "$");
		
		taxPrice = 0.05 * subTotalPrice;
		
		// round to two places after decimal point
		
		DecimalFormat df = new DecimalFormat("#.##");
		taxPrice = Double.valueOf(df.format(taxPrice));
		
		tfTax.setText(taxPrice + "$");
		
		totalPrice = subTotalPrice + taxPrice;
		
		tfTotal.setText(totalPrice + "$");
		
				
		}
		
	} // END OF ACTION LISTENER

	
}