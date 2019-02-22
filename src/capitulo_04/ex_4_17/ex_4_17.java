package capitulo_04.ex_4_17;

import java.util.Scanner;

public class ex_4_17 {

	public static void main(String[] args) {

		int km, lts, flag, totalkm = 0, totallts = 0;

		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Informe a kilometragem: ");
			km = input.nextInt();

			System.out.print("Informe quantos litros foram gastos: ");
			lts = input.nextInt();

			totalkm += km;
			totallts += lts;

			System.out.printf("Consumo: %.2f km/l%n", (double) km / lts);
			System.out.printf("Até aqui foram %d km e consumidos %d litros. Consumo: %.2f km/l", totalkm, totallts,
					((double)totalkm/totallts));

			System.out.print("\nDigite 1 para informar mais viagens ou 0 para sair: ");
			flag = input.nextInt();

			System.out.println();
		} while (flag == 1);

		System.out.println("Obrigado por usar o programa!");
	}

}
