package capitulo_11.figuras.figura11_3;

import java.util.InputMismatchException;
import java.util.Scanner;

// Figura 11.3: DivideByZeroWithExceptionHandling.java
// Tratando ArithmeticException e InputMismatchExceptions.
public class DivideByZeroWithExceptionHandling {

	// demonstra o lan�amento de uma exce��o quando ocorre um divis�o por zero
	public static int quotient(int numerator, int denominator) throws ArithmeticException {

		return numerator / denominator; // poss�vel divis�o por zero
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Boolean continueLoop = true; // determina se mais entradas s�o necess�rias

		do {

			try { // l� dois n�meros e calcula o quociente

				System.out.print("Please enter an integer numerator: ");
				int numerator = scanner.nextInt();

				System.out.print("Please enter an integer denominator: ");
				int denominator = scanner.nextInt();

				int result = quotient(numerator, denominator);
				System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);

				continueLoop = false; // entrada bem-sucedida: fim do loop

			} catch (InputMismatchException inputMismatchException) {
				System.err.printf("%nException: %s%n", inputMismatchException);
				scanner.nextLine(); // descarta entrada para o usu�rio tentar de novo
				System.out.printf("You must enter integers. Please try again.%n%n");

			} catch (ArithmeticException arithmeticException) {
				System.err.printf("%nException: %s%n", arithmeticException);
				System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
			}
		} while (continueLoop);

		scanner.close();

	}
} // fim da classe DivideByZeroWithExceptionHandling
