package capitulo_14.ex_14_03;

// Comparando Strings

import java.util.Scanner;

public class Ex_14_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite uma String");
		String str1 = scanner.nextLine();

		System.out.println("Digite outra String");
		String str2 = scanner.nextLine();

		if (str1.compareTo(str2) > 0)
			System.out.printf("%s � maior que %s", str1, str2);
		else if (str1.compareTo(str2) < 0)
			System.out.printf("%s � menor que %s", str1, str2);
		else
			System.out.println("As strings s�o iguais");

		scanner.close();

	}

}
