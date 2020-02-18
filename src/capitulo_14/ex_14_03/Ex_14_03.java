package capitulo_14.ex_14_03;

import java.util.Scanner;

public class Ex_14_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String s1 = scanner.next();
		String s2 = scanner.next();

		if (s1.compareTo(s2) > 0) {
			System.out.printf("%s é maior que %s", s1, s2);
		} else if (s1.compareTo(s2) < 0) {
			System.out.printf("%s é menor que %s", s1, s2);
		} else {
			System.out.printf("%s é igual que %s", s1, s2);
		}

		scanner.close();
	}
}
