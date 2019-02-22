package capitulo_02.ex2_16;

import java.util.Scanner;

public class ex_2_16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num1, num2;

		System.out.print("Enter first integer: ");
		num1 = input.nextInt();

		System.out.print("Enter second integer: ");
		num2 = input.nextInt();

		if (num1 > num2) {
			System.out.printf("%d é maior que %d", num1, num2);
		}
		else if (num1 < num2) {
			System.out.printf("%d é maior que %d", num2, num1);
		} else
			System.out.printf("Os números são iguais");

	}

}
