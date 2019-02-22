package capitulo_04.ex_4_32;

public class ex_4_32 {

	public static void main(String[] args) {

		int i = 1, j = 1;

		while (j <= 8) {
			while (i <= 8) {
				System.out.print("* ");
				i++;
			}
			System.out.println();

			if (j % 2 == 1) {
				System.out.print(" ");
			}

			i = 1;
			j++;

		}

	}

}
