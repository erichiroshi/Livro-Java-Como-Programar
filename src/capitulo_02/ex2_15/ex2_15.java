package capitulo_02.ex2_15;

import java.util.Scanner;

public class ex2_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num1, num2;

		System.out.print("Enter first integer: ");
		num1 = input.nextInt();

		System.out.print("Enter second integer: ");
		num2 = input.nextInt();

		System.out.printf("Soma = %d%nDiferença = %d%nProduto = %d%nDivisão = %d%n", num1 + num2, num1 - num2,
				num1 * num2, num1 / num2);
		input.close();
	}

}
