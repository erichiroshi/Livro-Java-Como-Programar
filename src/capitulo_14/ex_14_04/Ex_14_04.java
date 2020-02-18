package capitulo_14.ex_14_04;

//14.4 (Comparando partes de Strings) Elabore um aplicativo que utiliza o m�todo String regionMatches para comparar duas entradas
//de strings pelo usu�rio. O aplicativo deve inserir o n�mero de caracteres que ser� comparado e o �ndice inicial da compara��o. O
//aplicativo deve declarar se as strings s�o iguais. Ignore a distin��o entre mai�sculas e min�sculas dos caracteres ao realizar a compara��o.

import java.util.Scanner;

public class Ex_14_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("D�gite uma String");
		String s1 = scanner.nextLine();

		System.out.println("D�gite outra String");
		String s2 = scanner.nextLine();

		System.out.println("D�gite quantos caracteres ser�o comparados");
		int numCaracteresCompara = scanner.nextInt();

		System.out.println("D�gite o �ndice inicial da compara��o");
		int indiceInicial = scanner.nextInt();

		System.out.println(s1.regionMatches(true, indiceInicial, s2, indiceInicial, numCaracteresCompara) ? "S�o iguais"
				: "N�o s�o iguais");

		scanner.close();

	}
}
