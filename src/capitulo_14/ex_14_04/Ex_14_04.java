package capitulo_14.ex_14_04;

// Comparando partes de Strings

import java.util.Scanner;

public class Ex_14_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("D�gite uma String");
		String str1 = scanner.nextLine();

		System.out.println("D�gite outra String");
		String str2 = scanner.nextLine();

		System.out.println("D�gite quantos caracteres ser�o comparados");
		int n = scanner.nextInt();

		System.out.println("D�gite o �ndice inicial da compara��o");
		int i = scanner.nextInt();

		if (str1.regionMatches(true, i, str2, i, n))
			System.out.println("As strings s�o iguais");
		else
			System.out.println("N�o s�o iguais");

		scanner.close();

	}
}
