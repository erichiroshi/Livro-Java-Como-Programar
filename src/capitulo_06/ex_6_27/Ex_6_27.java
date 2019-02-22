package capitulo_06.ex_6_27;

import java.util.Scanner;

public class Ex_6_27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Dígite dois valores para descubrir seu MDC");
		int a = input.nextInt();
		int b = input.nextInt();

		System.out.println("O MDC é: "+ mdc(a, b));

	}

	public static int mdc(int a, int b) {

		if (b == 0)
			return a;
		else
			return mdc(b, a % b);
	}

}
