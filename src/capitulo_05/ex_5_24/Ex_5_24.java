package capitulo_05.ex_5_24;

public class Ex_5_24 {

	public static void main(String[] args) {

		int k = 1;

		for (int i = 1; i <= 10; i++) {

			for (int j = 4; j >= k; j--) {

				System.out.print(' ');
			}

			k++;

			for (int j = 1; j <= i; j++) {

				System.out.print('*');

			}
			i++;
			System.out.println();

		}

		k = 1;

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(' ');

			}

			for (int j = 7; j >= k; j--) {

				System.out.print('*');

			}

			System.out.println();

			k += 2;

		}
	}
}
