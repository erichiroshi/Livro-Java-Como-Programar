package capitulo_07.ex_7_27;

import java.util.Arrays;

public class Ex_7_27 {

	public static void main(String[] args) {

		int qnt = 999;
		
		boolean[] primo = new boolean[qnt];

		Arrays.fill(primo, true);

		for (int i = 2; i < qnt; i++) {

			if (primo[i] == true) {
				int num = i;

				for (int j = i + 1; j < qnt; j++)
					if (j % num == 0)
						primo[j] = false;

			}
		}
		int count = 0;

		for (int i = 2; i < qnt; i++) {

			if (primo[i] == true) {
				System.out.printf("%-5d", i);
				count++;

				if (count % 20 == 0)
					System.out.printf("%n%n");
			}
		}
	}

}
