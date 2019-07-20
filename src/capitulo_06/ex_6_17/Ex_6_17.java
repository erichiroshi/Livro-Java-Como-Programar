package capitulo_06.ex_6_17;

import java.util.Scanner;

public class Ex_6_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = 1;
		do {

			System.out.print("Dígite um número inteiro ou 0 para sair: ");
			num = input.nextInt();

			if (num != 0)
				System.out.printf("O número %d é %s%n%n", num, isEven(num) ? "par" : "impar");

		} while (num != 0);

		input.close();
	}

	public static boolean isEven(int num) {

		if (num % 2 == 0)
			return true;
		else
			return false;
	}
}