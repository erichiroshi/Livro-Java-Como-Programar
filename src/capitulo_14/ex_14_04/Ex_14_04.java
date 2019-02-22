package capitulo_14.ex_14_04;

// Comparando partes de Strings

import java.util.Scanner;

public class Ex_14_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dígite uma String");
		String str1 = scanner.nextLine();

		System.out.println("Dígite outra String");
		String str2 = scanner.nextLine();

		System.out.println("Dígite quantos caracteres serão comparados");
		int n = scanner.nextInt();

		System.out.println("Dígite o índice inicial da comparação");
		int i = scanner.nextInt();

		if (str1.regionMatches(true, i, str2, i, n))
			System.out.println("As strings são iguais");
		else
			System.out.println("Não são iguais");

		scanner.close();

	}
}
