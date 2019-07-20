package capitulo_04.ex_4_19;

import java.util.Scanner;

public class ex_4_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double vendas = 0;
		int item;

		do {
			System.out.println("Item	Value");
			System.out.println("1	239,99");
			System.out.println("2	129,75");
			System.out.println("3	99,95");
			System.out.println("4	350,89");

			System.out.print("digite o item vendido ou 0 para sair:  ");
			item = input.nextInt();

			System.out.println();

			if (item == 1)
				vendas += 239.99;
			if (item == 2)
				vendas += 129.75;
			if (item == 3)
				vendas += 99.95;
			if (item == 4)
				vendas += 350.89;
		} while (item != 0);

		System.out.printf("Vendedor recebeu R$%.2f", (200 + vendas * 9 / 100));
		input.close();
	}

}
