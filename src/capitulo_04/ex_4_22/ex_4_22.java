package capitulo_04.ex_4_22;

public class ex_4_22 {

	public static void main(String[] args) {

		int i = 1;

		System.out.println("N	10*N	100*N	1000*N");

		while (i <= 5) {

			System.out.printf("%d	%d	%d	%d%n", i, i * 10, i * 100, i * 1000);

			i++;
		}

	}

}
