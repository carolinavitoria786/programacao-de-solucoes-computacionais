package pratica01;

import java.util.Scanner;

public class pratica01_ex6 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double celsius, fahrenheit;
		
		System.out.println("Informe a temperatura em °C:" );
		celsius = input.nextDouble();
		
		fahrenheit = (celsius * 1.8) + 32;
		
		System.out.println("A temperatura em F é:" + 
		fahrenheit);
		
		input.close();
	}

}
