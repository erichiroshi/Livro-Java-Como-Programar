package capitulo_05.ex_5_23;

public class Ex_5_23 {

	public static void main(String[] args) {

		/*
		 * a) !(x < 5) && !(y >= 7) b) !(a == b) || !(g != 5) c) !((x <= 8) && (y > 4))
		 * d) !((i > 4) || (j <= 6))
		 */

		int x = 1, y = 1, a = 1, b = 1, g = 1, i = 1, j = 1;

		System.out.println((!(x < 5) && !(y >= 7)) + " == " + (!(x < 5 || y >= 7)));

		System.out.println();

		System.out.println((!(a == b) || !(g != 5)) + " == " + (!(a == b && g != 5)));

		System.out.println();

		System.out.println(!((x <= 8) && (y > 4)) + " == " + (!(x <= 8) || !(y > 4)));

		System.out.println();

		System.out.println(!((i > 4) || (j <= 6)) + " == " + (!(i > 4) && !(j <= 6)));

	}

}
