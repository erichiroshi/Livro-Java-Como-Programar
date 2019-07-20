package capitulo_07.ex_7_12;

import java.util.Scanner;

public class Ex_7_12 {

	public static void main(String[] args) {

		int[] array = new int[5];

		Scanner input = new Scanner(System.in);
		int num;

		for (int i = 0; i < array.length; i++) {

			System.out.println("Digite um número");
			num = input.nextInt();

			if (verificaIgual(num, array))
				i--;
			else
				array[i] = num;

			for (int j = 0; j <= i; j++)
				System.out.printf("%d ", array[j]);
			System.out.println();
		}
		input.close();
	}

	public static boolean verificaIgual(int num, int[] array) {

		for (int valor : array)
			if (num == valor)
				return true;

		return false;
	}

}
