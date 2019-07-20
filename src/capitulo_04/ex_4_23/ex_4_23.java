package capitulo_04.ex_4_23;

import java.util.Scanner;

public class ex_4_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int counter = 1;
		int number;
		int primeiro = 0;
		int segundo = 0;

		while (counter <= 10) {
			System.out.println("Insira um número: ");
			number = input.nextInt();

			if (number > primeiro) {
				segundo = primeiro;
				primeiro = number;

			}
			if (number < primeiro && number > segundo)
				segundo = number;

			counter++;

		}

		System.out.printf("O maior número foi: %d", primeiro);
		System.out.printf("%nO segundo maior número foi: %d", segundo);
		input.close();
	}

}
