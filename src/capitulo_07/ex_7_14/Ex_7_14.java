package capitulo_07.ex_7_14;

public class Ex_7_14 {

	public static void main(String[] args) {

		System.out.printf("O produto é: %d%n", product(1));
		System.out.printf("O produto é: %d%n", product(1, 2));
		System.out.printf("O produto é: %d%n", product(1, 2, 3));
		System.out.printf("O produto é: %d%n", product(1, 2, 3, 4));
		System.out.printf("O produto é: %d%n", product(1, 2, 3, 4, 5));

	}

	public static int product(int... value) {

		int prod = 1;

		for (int v : value)
			prod *= v;

		return prod;
	}

}
