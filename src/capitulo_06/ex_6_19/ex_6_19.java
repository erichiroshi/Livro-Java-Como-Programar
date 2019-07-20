package capitulo_06.ex_6_19;

import java.util.Scanner;

public class ex_6_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Dígite o tamanho do quadrado e o char utilizado");

		int side = input.nextInt();
		char fill = input.next().charAt(0);

		squareOfAsterisks(side, fill);
		input.close();
	}

	public static void squareOfAsterisks(int side, char fillCharacter) {

		for (int i = 1; i <= side; i++) {
			for (int j = 1; j <= side; j++) {
				System.out.printf("%s", fillCharacter);
			}
			System.out.println();
		}

	}

}
