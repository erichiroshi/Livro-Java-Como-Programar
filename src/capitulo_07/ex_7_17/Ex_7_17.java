package capitulo_07.ex_7_17;

import java.util.Random;

public class Ex_7_17 {

	public static void main(String[] args) {

		int[] frequencia = new int[13];

		Random num = new Random();

		for (int i = 0; i < 36000000; i++) {

			int n1 = num.nextInt(6) + 1;
			int n2 = num.nextInt(6) + 1;
			int soma = n1 + n2;
			frequencia[soma]++;

		}

		for (int i = 2; i < frequencia.length; i++) {
			System.out.printf("Soma = %d	frequencia = %d%n", i, frequencia[i]);

		}

	}

}
