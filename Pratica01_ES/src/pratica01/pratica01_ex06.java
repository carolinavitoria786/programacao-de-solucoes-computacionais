package pratica01;

import javax.swing.JOptionPane;

public class pratica01_ex06 {

	public static void main(String[] args) {
		String conversao;
		
		double celsius, fahrenheit;
		
		conversao = JOptionPane.showInputDialog("Informe a temperatura em °C:" );
		celsius = Double.parseDouble(conversao);
		
		fahrenheit = (celsius * 1.8) + 32;
		
		JOptionPane.showMessageDialog(null, "O valor em F é: " + fahrenheit);

	}

}
