package capitulo_06.ex_6_30;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex_6_30 {

	static int tentativas = 0;

	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();
		Scanner input = new Scanner(System.in);

		int esc;

		do {
			final int ale = 1 + random.nextInt(1000);
			System.out.println("Adivinhe um número de 1 - 1000");

			do {
				esc = input.nextInt();
				System.out.println(achaNumero(ale, esc));

			} while (ale != esc);

			System.out.println("Número de tentativas = " + tentativas);
			System.out.println("\nDeseja jogar outra vez?\n1 - SIM   2-NÃO");
			esc = input.nextInt();
			System.out.println();

			if (esc == 1)
				tentativas = 0;

		} while (esc == 1);

	}

	public static String achaNumero(int ale, int num) {

		tentativas++;

		if (ale > num)
			return "muito baixo, tente outra vez";
		if (ale < num)
			return "muito alto, tente outra vez";
		if (ale == num)
			return "!!!ACERTOU MISERAVIS!!!";

		return null;

	}

}
