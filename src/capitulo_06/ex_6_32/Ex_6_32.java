package capitulo_06.ex_6_32;

import java.util.Scanner;

public class Ex_6_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("D�gite as coordenadas dos dois pontos separdos por espa�o ");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();

		System.out.printf("A dist�ncia entre os pontos �: %.2f", distance(a, b, c, d));

	}

	// (4,5) (3,7) d = (3-4)�+(7-5)�

	public static double distance(double a, double b, double c, double d) {

		double dist = Math.sqrt(Math.pow(c - a, 2) + Math.pow(d - b, 2));

		return dist;

	}

}
