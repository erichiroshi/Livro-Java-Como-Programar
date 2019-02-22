package capitulo_05.ex_5_12;

public class ex_5_12 {

	public static void main(String[] args) {

		int produto = 1;

		for (int i = 1; i <= 15; i += 2) {

			produto *= i;

		}

		System.out.printf("%,d", produto);

	}

}
