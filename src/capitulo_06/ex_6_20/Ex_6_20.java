package capitulo_06.ex_6_20;

import java.util.Scanner;

public class Ex_6_20 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Dígite o raio do círculo: ");
		// double raio = input.nextDouble();

		System.out.printf("O raio do círculo é: %.2f", circleArea(input.nextDouble()));

	}

	public static double circleArea(double raio) {

		return Math.PI * Math.pow(raio, 2);

	}

}
