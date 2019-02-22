package capitulo_04.ex_4_21;

import java.util.Scanner;

public class ex_4_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int counter = 1;
		int number;
		int largest = 0;

		while (counter <= 10) {
			System.out.println("Insira um número: ");
			number = input.nextInt();

			if (number > largest)
				largest = number;
			counter++;
		}

		System.out.printf("O maior número foi: %d", largest);

	}

}
