package capitulo_05.ex_5_11;

import java.util.Scanner;

public class ex_5_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int qnt, num, menor = Integer.MAX_VALUE;

		System.out.print("D�gite quantos n�meros ser�o inseridos: ");
		qnt = input.nextInt();

		for (int i = 1; i <= qnt; i++) {
			System.out.print("D�gite um n�mero: ");
			num = input.nextInt();

			if (num < menor)
				menor = num;

		}

		if (qnt != 0)
			System.out.printf("%nO menor n�mero digitado foi: %d", menor);
		else
			System.out.println("\nNenhum n�mero inserido");

	}

}
