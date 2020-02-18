package capitulo_14.ex_14_11;

import java.util.Scanner;

//14.11 (Pesquisando Strings) Elabore um aplicativo que insere uma linha de texto e um caractere de pesquisa e utiliza o método String
//indexOf para determinar o número de ocorrências do caractere no texto.

public class ex_14_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma frase:");
		String frase = sc.nextLine();

		System.out.println("Digite o caractere de busca:");
		char c = sc.next().charAt(0);

		int n = 0;
		for (int i = 0; i <= frase.length(); i++) {

			int index = frase.indexOf(c, i);
			if (index >= 0) {
				n++;
				i = index;
			}
		}
		System.out.printf("Houve %d ocorrência(s) do caractere: %c", n, c);

		sc.close();
	}
}
