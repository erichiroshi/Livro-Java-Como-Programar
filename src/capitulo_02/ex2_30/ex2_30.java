package capitulo_02.ex2_30;

import java.util.Scanner;

public class ex2_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num, a, b, c, d, e;

		System.out.print("Digite um número de 5 dígitos: ");
		num = input.nextInt();

		a = num / 10000;
		b = (num - a * 10000) / 1000;
		c = (num - a * 10000 - b * 1000) / 100;
		d = (num - a * 10000 - b * 1000 - c * 100) / 10;
		e = (num - a * 10000 - b * 1000 - c * 100 - d * 10);

		System.out.printf("%d   %d   %d   %d   %d   ", a, b, c, d, e);

	}

}
