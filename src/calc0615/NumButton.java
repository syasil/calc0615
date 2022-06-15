package calc0615;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class NumButton extends CalcButton{
	private int value;
	
	
	public NumButton(int x, int y, int width, int height, int value, TextField mainTextField) {
		
		this.value = value;
		
		button = new JButton();
		button.setBounds(x, y, width, height);
		button.setBackground(Color.DARK_GRAY);
		button.setText(value+"");
		button.setFont(new Font("���� ����", Font.PLAIN, 20));
		button.setForeground(Color.white);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTextField.setNumTextFieldArr(value);
			}
		});
	}
	public int getValue() {
		return value;
	}
	public JButton getButton() {
		return this.button;
	}
}
