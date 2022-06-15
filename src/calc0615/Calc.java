package calc0615;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;


public class Calc{

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calc() {
		initialize();
	}
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 476, 590);
		
		TextField mainTextField = new TextField(0,0, 460, 150);
		frame.getContentPane().add(mainTextField.getTextField());
		
		TextField signTextField = new TextField(20, 70, 20, 20);
		frame.getContentPane().add(signTextField.getTextField());
		
		
		NumButton Button_0 = new NumButton(115, 470, 115, 80, 3, mainTextField);
		NumButton Button_1 = new NumButton(0, 390, 115, 80, 1, mainTextField);
		NumButton Button_2 = new NumButton(115, 390, 115, 80, 2, mainTextField);
		NumButton Button_3 = new NumButton(230, 390, 115, 80, 3, mainTextField);
		NumButton Button_4 = new NumButton(0, 310, 115, 80, 4, mainTextField);
		NumButton Button_5 = new NumButton(115, 310, 115, 80, 5, mainTextField);
		NumButton Button_6 = new NumButton(230, 310, 115, 80, 6, mainTextField);
		NumButton Button_7 = new NumButton(0, 230, 115, 80, 7, mainTextField);
		NumButton Button_8 = new NumButton(115, 230, 115, 80, 8, mainTextField);
		NumButton Button_9 = new NumButton(230, 230, 115, 80, 9, mainTextField);
		
		OperatorButton plusButton = new OperatorButton(345, 390, 115, 80, "+", mainTextField);
		OperatorButton minusButton = new OperatorButton(345, 310, 115, 80, "-", mainTextField);
		OperatorButton multiButton = new OperatorButton(345, 230, 115, 80, "*", mainTextField);
		OperatorButton divisionButton = new OperatorButton(115, 150, 115, 80, "/", mainTextField);

		PercentButton percentButton = new PercentButton(0, 150, 115, 80, "%", mainTextField);
		ClearButton clearButton = new ClearButton(230, 150, 115, 80, "C", mainTextField);
		BackspaceButton backspaceButton = new BackspaceButton(345, 150, 115, 80, "BackSpace", mainTextField);
		SignButton signButton = new SignButton(0, 470, 115, 80,"+/-", mainTextField);
		PointButton pointButton = new PointButton(230, 470, 115, 80, ".", mainTextField);
		CalculateButton calculateButton = new CalculateButton(345, 470, 115, 80, mainTextField);
		
		frame.getContentPane().add(Button_1.getButton());
		frame.getContentPane().add(Button_2.getButton());
		frame.getContentPane().add(Button_3.getButton());
		frame.getContentPane().add(Button_4.getButton());
		frame.getContentPane().add(Button_5.getButton());
		frame.getContentPane().add(Button_6.getButton());
		frame.getContentPane().add(Button_7.getButton());
		frame.getContentPane().add(Button_8.getButton());
		frame.getContentPane().add(Button_9.getButton());
		frame.getContentPane().add(Button_0.getButton());
		
		frame.getContentPane().add(plusButton.getButton());
		frame.getContentPane().add(minusButton.getButton());
		frame.getContentPane().add(multiButton.getButton());
		frame.getContentPane().add(divisionButton.getButton());
		
		frame.getContentPane().add(percentButton.getButton());
		frame.getContentPane().add(clearButton.getButton());
		frame.getContentPane().add(backspaceButton.getButton());
		frame.getContentPane().add(signButton.getButton());
		
		frame.getContentPane().add(calculateButton.getButton());
		frame.getContentPane().add(pointButton.getButton());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	
}
