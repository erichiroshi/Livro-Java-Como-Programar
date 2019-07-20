package capitulo_06.ex_6_08;

import java.util.Scanner;

public class Ex_6_8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int h, m;

		System.out.println("Informe quantas horas e minutos o carro ficou estacionado");
		h = input.nextInt();
		m = input.nextInt();

		System.out.printf("Pagará R$%.2f de estacionamento.", calculateCharges(h, m));
		input.close();
	}

	public static double calculateCharges(int h, int m) {

		double valor = 2.00;

		if (h >= 3 && h < 24) {
			valor += 0.5 * (h - 3);

			if (m > 0)
				valor += 0.5;
		}

		if (h == 24 || valor > 10.0)
			valor = 10.0;

		return valor;
	}
}