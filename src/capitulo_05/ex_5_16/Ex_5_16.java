package capitulo_05.ex_5_16;

import java.util.Scanner;

public class Ex_5_16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b, c, d, e;

		System.out.println("Dígite 5 números inteiros entre 1 e 30");

		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		e = input.nextInt();
		
		System.out.println();

		for (int i = 1; i <= a; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		for (int i = 1; i <= b; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		for (int i = 1; i <= c; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		for (int i = 1; i <= d; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		for (int i = 1; i <= e; i++) {
			System.out.print("*");
		}
		
		input.close();
	}

}
