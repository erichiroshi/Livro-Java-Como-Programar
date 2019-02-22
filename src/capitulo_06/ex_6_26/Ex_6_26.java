package capitulo_06.ex_6_26;

import java.util.Scanner;

public class Ex_6_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Dígite um número inteiro:");

		inverte(input.nextInt());

	}

	// 123 321
	public static void inverte(int num) {

		int tam = Integer.toString(num).length();

		for (int i = 1; i <= tam; i++) {

			System.out.print(num % 10);

			num = num / 10;

		}
	}
}
