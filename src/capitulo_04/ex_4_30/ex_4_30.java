package capitulo_04.ex_4_30;

import java.util.Scanner;

public class ex_4_30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = 1, i = 1, a, b, c, d, e;

		while (i == 1) {
			System.out.println("Digite um n�mero com 5 d�gitos:");
			num = input.nextInt();
			i++;

			if (num / 10000 < 1 || num / 10000 > 10) {
				System.out.println("ERRO!!! d�gite novamente\n");
				i = 1;
			}
		}

		a = num / 10000;
		b = (num - a * 10000) / 1000;
		c = (num - a * 10000 - b * 1000) / 100;
		d = (num - a * 10000 - b * 1000 - c * 100) / 10;
		e = (num - a * 10000 - b * 1000 - c * 100 - d * 10);

		if (a == e && b == d)
			System.out.println("O n�mero � um pal�ndromo!");
		else
			System.out.println("O n�mero n�o � um pal�ndromo!");
		input.close();
	}

}
