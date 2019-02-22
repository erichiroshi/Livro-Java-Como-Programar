package capitulo_06.ex_6_18;

import java.util.Scanner;

public class Ex_6_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Dígite o tamanho do quadrado de asteriscos");
		int side = input.nextInt();

		squareOfAsterisks(side);

	}

	public static void squareOfAsterisks(int side) {

		for (int i = 1; i <= side; i++) {
			for (int j = 1; j <= side; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
