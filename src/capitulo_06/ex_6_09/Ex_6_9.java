package capitulo_06.ex_6_09;

import java.util.Scanner;

public class Ex_6_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double num;

		System.out.println("Dígite um numero real");
		num = input.nextDouble();

		double y = Math.floor(num + 0.5);

		System.out.printf("Número digitado: %f%nNúmero arredondado: %f", num, y);

	}

}
