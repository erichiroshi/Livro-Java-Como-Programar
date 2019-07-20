package capitulo_04.ex_4_29;

import java.util.Scanner;

public class ex_4_29 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int lado;
		int i = 1, j = 1, k = 1;

		System.out.print("Digite o lado do quadrado: ");
		lado = input.nextInt();
		System.out.println();

		while (i <= lado) {
			System.out.print("*");
			i++;
		}
		System.out.println();
		
		while (j <= lado - 2) {
			System.out.print("*");
			while (k <= lado - 2) {
				System.out.printf(" ");
				k++;
			}
			k = 1;
			System.out.print("*");
			System.out.println();
			j++;
		}
		
		i = 1;
		while (i <= lado) {
			System.out.print("*");
			i++;
		}
		input.close();
	}
}