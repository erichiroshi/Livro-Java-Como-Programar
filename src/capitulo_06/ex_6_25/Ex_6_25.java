package capitulo_06.ex_6_25;

public class Ex_6_25 {

	public static void main(String[] args) {

		int cont = 0;

		for (int i = 0; i <= 100000; i++) {

			if (isPrimo(i)) {
				System.out.println(i + " é primo");
				cont++;
			}
		}
		System.out.println("Total de números primo = " + cont);

	}

	// 7 - 1 e 7
	// 8 - 1 2 4 8
	public static boolean isPrimo(int num) {

		int soma = 0;
		int cont = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0)
				soma++;
		}

		if (soma == 2) {

			return true;
		} else
			return false;
	}

}
