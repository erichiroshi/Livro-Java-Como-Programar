package capitulo_02.ex2_32;

import java.util.Scanner;

public class ex2_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a, b, c, d, e;
		int pos = 0, neg = 0, zero = 0;

		System.out.print("entre com cinco números: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		e = input.nextInt();

		if (a > 0) {
			pos++;
		} else if (a < 0) {
			neg++;
		} else
			zero++;

		if (b > 0) {
			pos++;
		} else if (b < 0) {
			neg++;
		} else
			zero++;

		if (c > 0) {
			pos++;
		} else if (c < 0) {
			neg++;
		} else
			zero++;

		if (d > 0) {
			pos++;
		} else if (d < 0) {
			neg++;
		} else
			zero++;

		if (e > 0) {
			pos++;
		} else if (e < 0) {
			neg++;
		} else
			zero++;

		System.out.println("Positivos = " + pos);
		System.out.println("Negativo = " + neg);
		System.out.println("Zeros = " + zero);
		input.close();
	}

}
