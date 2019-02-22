package capitulo_05.ex_5_20;

public class Ex_5_20 {

	public static void main(String[] args) {

		double pi = 0;
		int j = 1;

		for (int i = 1; i <= 2000000; i++) {

			if (i % 2 == 0)
				pi -= (double) 4 / j;
			else
				pi += (double) 4 / j;

			j += 2;

	/*		if ((int) (pi * 100000) == 314159) {
				System.out.printf("%,d%n", i);
				break;
			}
			*/
		}

		System.out.println(pi);

	}

}
