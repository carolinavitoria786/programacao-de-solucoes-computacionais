package pratica01;

import javax.swing.JOptionPane;

public class pratica01_ex04 {
	public static final double aumento = 0.25;

	public static void main(String[] args) {
		String conversao;
		
		double salario, salariofinal;
		
		conversao = JOptionPane.showInputDialog("Informe o seu valor salarial atual: ");
		salario = Double.parseDouble(conversao);
		
		salariofinal = salario + (salario * aumento);
		
		JOptionPane.showMessageDialog(null, "Seu salário com o aumento é: " + salariofinal);
		
	}

}
