package capitulo_05.ex_5_13;

public class ex_5_13 {

	public static void main(String[] args) {

		System.out.println("n	n!");

		for (int i = 1; i <= 20; i++) {

			long fat = 1;

			for (int n = 1; n <= i; n++) {

				fat *= n;
			}

			System.out.printf("%d	%,d\n", i, fat);

		}

	}

}
