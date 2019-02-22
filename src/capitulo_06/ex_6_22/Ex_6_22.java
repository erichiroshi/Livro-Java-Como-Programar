package capitulo_06.ex_6_22;

import java.util.Scanner;

public class Ex_6_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe a temperatura");
		int temp = input.nextInt();
		System.out.println("Temperatura está em ? Celsius - 1  Fahrenheit - 2 ");
		int escolha = input.nextInt();

		if (escolha == 2) {
			System.out.printf("%d F para Fahrenheit = %d °C", temp, celsius(temp));
		} else
			System.out.printf("%d °C para Celsius = %d F", temp, fahrenheit(temp));

	}

	public static int celsius(int fahrenheit) {
		int celsius = (int) (5.0 / 9.0 * (fahrenheit - 32));

		return celsius;
	}

	public static int fahrenheit(int celsius) {
		int fahrenheit = (int) (9.0 / 5.0 * celsius + 32);

		return fahrenheit;
	}

}
