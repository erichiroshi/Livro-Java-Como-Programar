package capitulo_06.ex_6_24;

public class Ex_6_24 {

	public static void main(String[] args) {

		for (int i = 1; i <= 1234567891; i++)
			isPerfect(i);

	}

	// 6 = 1 + 2 + 3
	// 28 = 1 + 2 + 4 + 7 +14

	public static void isPerfect(int num) {

		int soma = 0;
		
		for (int i = 1; i <= num/2; i++) {

			if (num % i == 0) {
				soma += i;

			}

		}

		if (num == soma) {
			System.out.print(num + " ");
			System.out.println("\nÉ um número perfeito");

			System.out.print("1");
			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					System.out.print(" + " + i);

				}

			}

			System.out.printf(" = %d%n%n", num);
		}

	}
}
