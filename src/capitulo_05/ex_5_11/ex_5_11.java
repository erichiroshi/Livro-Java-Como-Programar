package capitulo_05.ex_5_11;

import java.util.Scanner;

public class ex_5_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int qnt, num, menor = Integer.MAX_VALUE;

		System.out.print("Dígite quantos números serão inseridos: ");
		qnt = input.nextInt();

		for (int i = 1; i <= qnt; i++) {
			System.out.print("Dígite um número: ");
			num = input.nextInt();

			if (num < menor)
				menor = num;

		}

		if (qnt != 0)
			System.out.printf("%nO menor número digitado foi: %d", menor);
		else
			System.out.println("\nNenhum número inserido");

	}

}
