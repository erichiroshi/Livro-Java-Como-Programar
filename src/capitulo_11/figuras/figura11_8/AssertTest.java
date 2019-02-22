package capitulo_11.figuras.figura11_8;

// Figura 11.8: AssertTest.java
// Verificando com assert se um valor est� dentro do intervalo

import java.util.Scanner;

public class AssertTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter a number between 0 and 10: ");
		int number = input.nextInt();

		// afirma que o valor � >= 0 e <= 10
		assert (number >= 0 && number <= 10) : "bad number: " + number;

		System.out.printf("You entered %d%n", number);

		input.close();
	}
}
