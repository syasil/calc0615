package calc0615;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;

class TextField{
	protected JTextField textField;
	private ArrayList<String> textFieldArr = new ArrayList<String>();
	private String result;
	
	
	public TextField(int x, int y, int width, int height) {
		
		textFieldArr.add("");
		
		textField = new JTextField();
		textField.setBounds(x, y, width, height);
		textField.setBackground(Color.DARK_GRAY);
		textField.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN, 30));
		textField.setForeground(Color.white);
		textField.setHorizontalAlignment(JTextField.RIGHT);
	}
	public void setText() {
		textField.setText(String.join("", textFieldArr).replace(".0", ""));
		
		
	}
	public JTextField getTextField() {	
		return textField;
	}
	public void setNumTextFieldArr(int value){
		textFieldArr.set(textFieldArr.size()-1, (textFieldArr.get(textFieldArr.size()-1))+value);
		setText();
		for (int i = 0; i < textFieldArr.size(); i++) {
			System.out.println(textFieldArr.get(i));
		}
	}
	public void setNumTextFieldArr(String value){
		if(value.equals("-")) {
			if(textFieldArr.size()>=3) {
				textFieldArr.set(textFieldArr.size()-1, "("+value+(textFieldArr.get(textFieldArr.size()-1)+")"));
			}
			
			textFieldArr.set(textFieldArr.size()-1, value+(textFieldArr.get(textFieldArr.size()-1)));
			setText();
		}else {
			if(textFieldArr.size()>=3) {
				textFieldArr.set(textFieldArr.size()-1, (textFieldArr.get(textFieldArr.size()-1).replace("-", "").replace("(", "").replace(")", "")));
			}
			
			textFieldArr.set(textFieldArr.size()-1, (textFieldArr.get(textFieldArr.size()-1).replace("-", "")));
			setText();
		}
		for (int i = 0; i < textFieldArr.size(); i++) {
			System.out.println(textFieldArr.get(i));
		}
	}
	public void setOperatorTextFieldArr(String value){
		
		System.out.println(textFieldArr.size());
		
		if(textFieldArr.size()>=3) {
			Calculate();
		}
		textFieldArr.add(value);
		setText();
		textFieldArr.add("");
		for (int i = 0; i < textFieldArr.size(); i++) {
			System.out.println(textFieldArr.get(i));
			
		}
		
		
	}
	
	public ArrayList<String> getTextFieldArr(){
		return this.textFieldArr;
	}
	
	public void calculateTextFieldArr() {
		if(textFieldArr.size()>=3) {
			Calculate();
			}	
	}
	
	public void Calculate() {
		switch (textFieldArr.get(1)) {
		case "+":
			result = Double.parseDouble(textFieldArr.get(0))+Double.parseDouble(textFieldArr.get(2))+"";
			textFieldArr.clear();
			textFieldArr.add(result);
			
			setText();
			
			
			break;
		case "-":
			result = Double.parseDouble(textFieldArr.get(0))-Double.parseDouble(textFieldArr.get(2))+"";
			textFieldArr.clear();
			textFieldArr.add(result);
			
			setText();
			
			break;
		case "*":
			result = Double.parseDouble(textFieldArr.get(0))*Double.parseDouble(textFieldArr.get(2))+"";
			textFieldArr.clear();
			textFieldArr.add(result);
			
			setText();

			break;
		case "/":
			result = Double.parseDouble(textFieldArr.get(0))/(double)Double.parseDouble(textFieldArr.get(2))+"";
			textFieldArr.clear();
			textFieldArr.add(result);
			
			setText();
		
			break;
		default:
			break;
		}
	}
	public void setPerCentTextFieldArr() {

		textFieldArr.set(textFieldArr.size()-1, Double.parseDouble(textFieldArr.get(textFieldArr.size()-1))/100+"");
		
		setText();
		
	}
	public void clearTextFieldArr() {
		textFieldArr.clear();
		textFieldArr.add("");
		
		setText();
	}
	public void setBackSpaceTextFieldArr() {
		
		if(textFieldArr.get(textFieldArr.size()-1).equals("")) {
			textFieldArr.remove(1);
		}
		textFieldArr.set(textFieldArr.size()-1, textFieldArr.get(textFieldArr.size()-1).replaceFirst(".$",""));
		
		setText();
	}
	public void setPointTextFieldArr() {
		
		if(textFieldArr.get(textFieldArr.size()-1).contains(".") == false) {
			String string = ".";
			
			if(textFieldArr.get(textFieldArr.size()-1).equals("")) {
				string = "0.";
			}
			
			textFieldArr.set(textFieldArr.size()-1, textFieldArr.get(textFieldArr.size()-1)+string);
			
		}
		setText();
		
	}
	
}

