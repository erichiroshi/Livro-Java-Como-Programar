package capitulo_02.ex2_06;

import java.util.Scanner;

//Calcula 3 inteiros

public class ex2_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x, y, z, result;

		System.out.print("Enter first integer: ");
		x = input.nextInt();

		System.out.print("Enter second integer: ");
		y = input.nextInt();

		System.out.print("Enter third integer: ");
		z = input.nextInt();

		result = x * y * z;

		System.out.printf("Product is %d%n", result);
		input.close();
	}

}
