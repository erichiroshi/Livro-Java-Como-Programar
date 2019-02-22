package capitulo_02.ex2_17;

import java.util.Scanner;

public class ex2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num1, num2, num3, soma, media, produto, menor = 0, maior = 0;

		System.out.print("Enter first integer: ");
		num1 = input.nextInt();

		System.out.print("Enter second integer: ");
		num2 = input.nextInt();

		System.out.print("Enter third integer: ");
		num3 = input.nextInt();

		soma = num1 + num2 + num3;
		media = soma / 3;
		produto = num1 * num2 * num3;

		if (num1 <= num2 && num1 <= num3)
			menor = num1;

		if (num2 <= num1 && num2 <= num3)
			menor = num2;

		if (num3 <= num1 && num3 <= num2)
			menor = num3;

		if (num1 >= num2 && num1 >= num3)
			maior = num1;

		if (num2 >= num1 && num2 >= num3)
			maior = num2;

		if (num3 >= num1 && num3 >= num2)
			maior = num3;

		System.out.printf("soma = %d%nmedia = %d%nproduto = %d%nmenor = %d%nmaior = %d%n", soma, media, produto,
				menor, maior);

	}

}
