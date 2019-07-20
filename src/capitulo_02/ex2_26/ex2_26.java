package capitulo_02.ex2_26;

import java.util.Scanner;

public class ex2_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1, num2;

		System.out.print("Enter first integer: ");
		num1 = input.nextInt();

		System.out.print("Enter second integer: ");
		num2 = input.nextInt();

		if (num1 % num2 == 0) {
			System.out.printf("%d é multiplo de %d", num1, num2);
		} else {
			System.out.println("Não é multiplo");
		}
		input.close();
	}

}
