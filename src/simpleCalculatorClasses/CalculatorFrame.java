package simpleCalculatorClasses;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class CalculatorFrame extends JFrame
{
	public CalculatorFrame(int w, int h)
	{
		setSize(w, h);
		this.setLayout(new FlowLayout());
		setLocationRelativeTo(null);
	}
	
	
	
	public String getDim()
	{
		int width = this.getWidth();
		int height = this.getHeight();
		return ("w = " + width + "\nh = " + height);
	}
}