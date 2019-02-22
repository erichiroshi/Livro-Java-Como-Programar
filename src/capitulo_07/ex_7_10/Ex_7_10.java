package capitulo_07.ex_7_10;

public class Ex_7_10 {

	static int recebe = 200;

	public static void main(String[] args) {
		
		
		
		

		int[] funcionario = { 500, 350, 450, 1000, 5000, 4500, 5500, 5100, 900, 1200, 90000, 70000, 7000, 6000, 4000,
				150, 50 };

		System.out.printf("Vendas %22s%n", "quantidade");

		int[] salario = new int[11];

		for (int f : funcionario)
			if (f < 10000)
				++salario[vendas(f) / 100];
			else
				++salario[10];

		for (int count = 2; count < salario.length; count++) {

			if (count == 10)
				System.out.printf("%5s: ", "R$ 1.000 de acima");
			else
				System.out.printf("%d-%d:%11s", count * 100, count * 100 + 99, "");

			for (int stars = 0; stars < salario[count]; stars++)
				System.out.print("*");

			System.out.println();
		}

	}

	public static int vendas(int vendas) {

		recebe = 200;
		recebe += 0.09 * vendas;
		return recebe;
	}

}
