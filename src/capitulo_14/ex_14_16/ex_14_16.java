package capitulo_14.ex_14_16;

import java.util.Scanner;

//14.16 (Definindo seus próprios métodos String) Elabore suas próprias versões dos métodos de pesquisa String indexOf e lastIndexOf.

public class ex_14_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma frase:");
		String frase = sc.nextLine();

		System.out.println("Digite o caractere de busca:");
		char c = sc.next().charAt(0);

		System.out.printf("first index = %d", buscaChar(frase, c));
		System.out.println();
		System.out.printf("last index = %d", buscaLastChar(frase, c));

		sc.close();
	}

	public static Integer buscaChar(String frase, char c) {
		for (int i = 0; i < frase.length(); i++)
			if (c == frase.charAt(i))
				return i;
		return null;
	}

	public static Integer buscaLastChar(String frase, char c) {
		for (int i = frase.length() - 1; i >= 0; i--)
			if (c == frase.charAt(i))
				return i;
		return null;
	}

}
