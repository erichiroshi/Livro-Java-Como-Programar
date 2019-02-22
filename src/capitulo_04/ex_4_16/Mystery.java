package capitulo_04.ex_4_16;

public class Mystery {

	public static void main(String[] args) {

		int x = 1;
		int total = 0;

		while (x <= 10) {
			int y = x * x;
			System.out.println(y);
			total += y;
			++x;
		}

		System.out.printf("Total is %d%n", total);

	}

}
