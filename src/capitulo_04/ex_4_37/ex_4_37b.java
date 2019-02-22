package capitulo_04.ex_4_37;

import java.util.Scanner;

public class ex_4_37b {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Fatorial fat = new Fatorial();

		int num;

		double euler = 1.0;

		System.out.println("Digite um número inteiro:");
		num = input.nextInt();

		System.out.printf("%,d", fat.fatorial(num));

		while (num >= 1) {
			euler = euler + (1 / fat.fatorial(num));
			num--;
		}

		System.out.println();

		System.out.printf("%.15f%n", euler);

		System.out.println(Math.E);

	}

}
