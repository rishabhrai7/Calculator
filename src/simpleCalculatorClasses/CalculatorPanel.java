package simpleCalculatorClasses;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorPanel extends JPanel implements ActionListener
{
	
	private JButton add;
	private JButton subtract;
	private JButton divide;
	private JButton multiply;
	private JButton mod;
	
	private JButton zero;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	
	private JButton backspace;
	private JButton clear;
	private JButton ans;
	private JButton equals;
	private JButton decimal;
	
	private JTextField display;
	private String displayString;
	private String operation;
	private String lastNum;
	private String thisNum;
	private String lastResult;
	private double result;
	
	public CalculatorPanel(int w, int h)
	{
		lastNum = "";
		thisNum = "";
		lastResult = "";
		
		this.setSize(w, h);
		this.setBackground(Color.DARK_GRAY);
		
		GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0,0,0,0);
		//gbc.gridwidth = 4;
		//gbc.gridheight = 6;
		
		
		/*gbc.gridwidth = 4;
		gbc.gridx = 0;
		gbc.gridy = 0;
		//gbc.ipadx = 292;
		display = new JLabel();
		display.setBounds(0, 0, 50, 15);
		display.setOpaque(true);
		display.setBackground(Color.WHITE);
		display.setForeground(Color.DARK_GRAY);
		display.setFont(new Font("TimesRoman", Font.PLAIN,21));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		//display.setBorder(new EmptyBorder(0,266,0,0));
		gbc.fill = SwingConstants.HORIZONTAL;
		display.setText("hellooooooo");
		this.add(display, gbc);*/
		
		gbc.gridwidth = 4;
		gbc.gridx = 0;
		gbc.gridy = 0;
		//gbc.ipadx = 292;
		display = new JTextField();
		display.setColumns(19);
		display.setEditable(false);
		display.setFont(new Font("TimesRoman", Font.PLAIN,21));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		displayString = "Yay! Time to mathematicate!";
		display.setText(displayString);
		this.add(display, gbc);
		
		gbc.gridwidth= 1;
		
		gbc.ipadx = 0;
		gbc.gridx = 0;
		gbc.gridy = 1;
		backspace= new JButton("DELETE");
		backspace.addActionListener(this);
		backspace.setActionCommand("delete");
		backspace.setBackground(Color.GRAY);
		this.add(backspace, gbc);
		
		gbc.ipadx = 5;
		gbc.gridx = 1;
		gbc.gridy = 1;
		clear= new JButton("CLEAR");
		clear.addActionListener(this);
		clear.setActionCommand("clear");
		clear.setBackground(Color.GRAY);
		this.add(clear, gbc);
		
		gbc.ipadx = 19;
		gbc.gridx = 2;
		gbc.gridy = 1;
		ans = new JButton("ANS");
		ans.addActionListener(this);
		ans.setActionCommand("ans");
		ans.setBackground(Color.GRAY);
		this.add(ans, gbc);
		
		gbc.ipadx = 36;
		gbc.gridx = 3;
		gbc.gridy = 1;
		add = new JButton("+");
		add.addActionListener(this);
		add.setActionCommand("add");
		add.setBackground(Color.GRAY);
		this.add(add, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		one = new JButton("1");
		one.addActionListener(this);
		one.setActionCommand("1");
		one.setBackground(Color.GRAY);
		this.add(one, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		two = new JButton("2");
		two.addActionListener(this);
		two.setActionCommand("2");
		two.setBackground(Color.GRAY);
		this.add(two, gbc);

		gbc.gridx = 2;
		gbc.gridy = 2;
		three = new JButton("3");
		three.addActionListener(this);
		three.setActionCommand("3");
		three.setBackground(Color.GRAY);
		this.add(three, gbc);
		
		gbc.ipadx = 39;
		gbc.gridx = 3;
		gbc.gridy = 2;
		subtract = new JButton("-");
		subtract.addActionListener(this);
		subtract.setActionCommand("subtract");
		subtract.setBackground(Color.GRAY);
		this.add(subtract, gbc);
		
		gbc.ipadx = 36;
		gbc.gridx = 0;
		gbc.gridy = 3;
		four = new JButton("4");
		four.addActionListener(this);
		four.setActionCommand("4");
		four.setBackground(Color.GRAY);
		this.add(four, gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		five = new JButton("5");
		five.addActionListener(this);
		five.setActionCommand("5");
		five.setBackground(Color.GRAY);
		this.add(five, gbc);

		gbc.gridx = 2;
		gbc.gridy = 3;
		six= new JButton("6");
		six.addActionListener(this);
		six.setActionCommand("6");
		six.setBackground(Color.GRAY);
		this.add(six, gbc);

		gbc.gridx = 3;
		gbc.gridy = 3;
		multiply = new JButton("x");
		multiply.addActionListener(this);
		multiply.setActionCommand("multiply");
		multiply.setBackground(Color.GRAY);
		this.add(multiply, gbc);

		gbc.gridx = 0;
		gbc.gridy = 4;
		seven = new JButton("7");
		seven.addActionListener(this);
		seven.setBackground(Color.GRAY);
		seven.setActionCommand("7");
		this.add(seven, gbc);

		gbc.gridx = 1;
		gbc.gridy = 4;
		eight = new JButton("8");
		eight.addActionListener(this);
		eight.setActionCommand("8");
		eight.setBackground(Color.GRAY);
		this.add(eight, gbc);

		gbc.gridx = 2;
		gbc.gridy = 4;
		nine = new JButton("9");
		nine.addActionListener(this);
		nine.setActionCommand("9");
		nine.setBackground(Color.GRAY);
		this.add(nine, gbc);
		
		gbc.ipadx = 40;
		gbc.gridx = 3;
		gbc.gridy = 4;
		divide = new JButton("/");
		divide.addActionListener(this);
		divide.setActionCommand("divide");
		divide.setBackground(Color.GRAY);
		this.add(divide, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		decimal = new JButton(".");
		decimal.addActionListener(this);
		decimal.setActionCommand(".");
		decimal.setBackground(Color.GRAY);
		this.add(decimal, gbc);
		
		gbc.ipadx = 36;
		
		gbc.gridx = 1;
		gbc.gridy = 5;
		zero = new JButton("0");
		zero.addActionListener(this);
		zero.setActionCommand("0");
		zero.setBackground(Color.GRAY);
		this.add(zero, gbc);

		gbc.gridx = 2;
		gbc.gridy = 5;
		equals = new JButton("=");
		equals.addActionListener(this);
		equals.setActionCommand("equals");
		equals.setBackground(Color.GRAY);
		this.add(equals, gbc);
		
		gbc.ipadx = 34;
		gbc.gridx = 3;
		gbc.gridy = 5;
		mod = new JButton("%");
		mod.addActionListener(this);
		mod.setActionCommand("mod");
		mod.setBackground(Color.GRAY);
		this.add(mod, gbc);

	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
	}
	
	public void actionPerformed(ActionEvent e) 
	{	
		String button = e.getActionCommand();
		switch(button)
		{
			case "1":
			{
				thisNum += button;
				displayString = thisNum;
				//System.out.println("hi");
				break;
			}
			
			case "2":
			{
				thisNum += button;
				displayString = thisNum;
				break;
			}
			
			case "3":
			{
				thisNum += button;
				displayString = thisNum;
				break;
			}
			
			case "4":
			{
				thisNum += button;
				displayString = thisNum;
				break;
			}
			
			case "5":
			{
				thisNum += button;
				displayString = thisNum;
				break;
			}
			
			case "6":
			{
				thisNum += button;
				displayString = thisNum;
				break;
			}
			
			case "7":
			{
				thisNum += button;
				displayString = thisNum;
				break;
			}
			
			case "8":
			{
				thisNum += button;
				displayString = thisNum;
				break;
			}
			
			case "9":
			{
				thisNum += button;
				displayString = thisNum;
				break;
			}
			
			case "0":
			{
				thisNum += button;
				displayString = thisNum;
				break;
			}
			
			case ".":
			{
				thisNum += button;
				displayString = thisNum;
				break;
			}

			case "add":
			{
				lastNum = thisNum;
				thisNum = "";
				operation = button;
				displayString = thisNum;
				break;
			}
			
			case "subtract":
			{
				lastNum = thisNum;
				thisNum = "";
				operation = button;
				displayString = thisNum;
				break;
			}
			
			case "multiply":
			{
				lastNum = thisNum;
				thisNum = "";
				operation = button;
				displayString = thisNum;
				break;
			}
			
			case "divide":
			{
				lastNum = thisNum;
				thisNum = "";
				operation = button;
				displayString = thisNum;
				break;
			}
			
			case "mod":
			{
				//System.out.println("hello");
				lastNum = thisNum;
				thisNum = "";
				operation = button;
				displayString = thisNum;
				break;
			}
			
			case "ans":
			{
				lastNum = lastResult;
				displayString = lastNum;
				break;
			}
			
			case "delete":
			{
				thisNum = "";
				displayString = "";
				break;
			}
			
			case "clear":
			{
				lastNum = "";
				thisNum = "";
				displayString = "";
				break;
			}
			
			case "equals":
			{
				//System.out.println("bye");
				lastResult = String.valueOf(result);
				switch(operation)
				{
					case "add":
					{
						result =  (double) Double.valueOf(lastNum) + Double.valueOf(thisNum);
						break;
					}
					case "subtract":
					{
						result =  (double) Double.valueOf(lastNum) - Double.valueOf(thisNum);
						break;
					}
					case "multiply":
					{
						result =  (double) Double.valueOf(lastNum) * Double.valueOf(thisNum);
						break;
					}
					case "divide":
					{
						result =  (double) Double.valueOf(lastNum) / Double.valueOf(thisNum);
						break;
					}
					case "mod":
					{
						result =  (double) Double.valueOf(lastNum) % Double.valueOf(thisNum);
						break;
					}
				}
				
				displayString = String.valueOf(result);
				break;
			}
		}
		
		display.setText(displayString);
		repaint();
	}
}
