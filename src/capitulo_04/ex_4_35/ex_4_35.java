package capitulo_04.ex_4_35;

import java.util.Scanner;


public class ex_4_35 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b, c;

		Verifica tri = new Verifica();

		System.out.println("Digite os tr�s lados:");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		System.out.println(tri.verifica(a, b, c) ? "Pode ser um tri�ngulo" : "N�o pode ser um tri�ngulo");

	}

}
