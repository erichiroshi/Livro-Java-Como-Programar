package capitulo_14.ex_14_04;

//14.4 (Comparando partes de Strings) Elabore um aplicativo que utiliza o método String regionMatches para comparar duas entradas
//de strings pelo usuário. O aplicativo deve inserir o número de caracteres que será comparado e o índice inicial da comparação. O
//aplicativo deve declarar se as strings são iguais. Ignore a distinção entre maiúsculas e minúsculas dos caracteres ao realizar a comparação.

import java.util.Scanner;

public class Ex_14_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dígite uma String");
		String s1 = scanner.nextLine();

		System.out.println("Dígite outra String");
		String s2 = scanner.nextLine();

		System.out.println("Dígite quantos caracteres serão comparados");
		int numCaracteresCompara = scanner.nextInt();

		System.out.println("Dígite o índice inicial da comparação");
		int indiceInicial = scanner.nextInt();

		System.out.println(s1.regionMatches(true, indiceInicial, s2, indiceInicial, numCaracteresCompara) ? "São iguais"
				: "Não são iguais");

		scanner.close();

	}
}
