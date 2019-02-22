package capitulo_11.figuras.figura11_2;

import java.util.Scanner;

// Figura 11.2: DivideByZeroNoExceptionHandling.java
// Divis�o de inteiro sem tratamento de exce��o.

public class DivideByZeroNoExceptionHandling {

	// demonstra o lan�amento de uma exce��o quando ocorre um divis�o por zero
	public static int quotient(int numerator, int denominator) {

		return numerator / denominator;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter an integer numerator: ");
		int numerator = scanner.nextInt();

		System.out.print("Please enter an integer denominator: ");
		int denominator = scanner.nextInt();

		int result = quotient(numerator, denominator);
		System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);

		scanner.close();

	}

}
