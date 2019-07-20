package capitulo_04.ex_4_31;

import java.util.Scanner;

public class ex_4_31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Integer bin, soma = 0, divisor = 1, mult = 1;

		System.out.print("Digite o número binário: ");
		bin = input.nextInt();

		for (int i = bin.toString().length(); i > 0; i--) {
			System.out.println("((" + bin + "/" + divisor + ")%10)*" + mult);
			System.out.println("((" + bin / divisor + ")%10)*" + mult);
			System.out.println("(" + (bin / divisor) % 10 + ")*" + mult);
			System.out.println(((bin / divisor) % 10) * mult);
			soma += ((bin / divisor) % 10) * mult;
			divisor *= 10;
			mult *= 2;
			System.out.println("-;-;-;-;-;-;-;-;");
		}
		System.out.println("soma = " + soma);

		input.close();

	}

}
