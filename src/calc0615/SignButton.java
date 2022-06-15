package calc0615;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class SignButton{
	private JButton button;
	private String value;
	
	public SignButton(int x, int y, int width, int height, String name, TextField mainTextField) {
			
			this.value = "+";
			
			button = new JButton();
			button.setBounds(x, y, width, height);
			button.setBackground(Color.gray);
			button.setText(name);
			button.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
			button.setForeground(Color.white);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(getValue().equals("+")) {
						setValue("-");
					}else {
						setValue("+");
					}
					mainTextField.setNumTextFieldArr(value);
				}

				
			});
		}
	public void setValue(String string) {
		this.value = string;
		
	}
	public String getValue() {
		return value;
	}
	public JButton getButton() {
		return this.button;
	}
}
