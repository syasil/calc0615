package calc0615;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

class CalculateButton extends CalcButton{
	
	private JButton button;
	private ArrayList<String> calcList;
	
	
	public CalculateButton(int x, int y, int width, int height, TextField mainTextField) {
		
		button = new JButton();
		button.setBounds(x, y, width, height);
		button.setBackground(new Color(71,130,209));
		button.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		button.setForeground(Color.white);
		button.setText("=");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTextField.calculateTextFieldArr();
			}
		});
	}

	public JButton getButton() {
		
		return button;
	}

	public ArrayList<String> getCalcList() {
		return calcList;
	}

	public void setCalcList(ArrayList<String> calcList) {
		this.calcList = calcList;
	}
}

