package capitulo_02.ex2_25;

import java.util.Scanner;

public class ex2_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num1;

		System.out.print("Enter first integer: ");
		num1 = input.nextInt();

		if (num1 % 2 == 0) {
			System.out.printf("%d é um número par", num1);
		} else {
			System.out.printf("%d é um número impar", num1);
		}
		input.close();
	}

}
