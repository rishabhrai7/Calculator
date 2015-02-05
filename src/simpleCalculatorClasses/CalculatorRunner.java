package simpleCalculatorClasses;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class CalculatorRunner 
{
	public static void main(String[] arg)
	{
		CalculatorFrame calcFrame = new CalculatorFrame(336, 212); //323, 223
		calcFrame.setResizable(true);
		calcFrame.setTitle("NoobCalc");
		
		try {
			calcFrame.setIconImage(ImageIO.read(new File("Calculator-icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		calcFrame.getContentPane().setBackground(Color.DARK_GRAY);
		calcFrame.add(new CalculatorPanel(calcFrame.getWidth(), calcFrame.getHeight()));		
		calcFrame.setVisible(true);
		calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*while(calcFrame.getWidth() != 100)
		{
			System.out.println(calcFrame.getDim());
		}*/
	}
}
