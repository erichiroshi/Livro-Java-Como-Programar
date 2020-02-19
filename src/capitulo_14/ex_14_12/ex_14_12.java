package capitulo_14.ex_14_12;

import java.util.Scanner;

//14.12 (Pesquisando Strings) Elabore um aplicativo baseado no aplicativo da Questão 14.11 que insere uma linha de texto e utiliza o método
//String indexOf para determinar o número total de ocorrências de cada letra do alfabeto no texto. As letras minúsculas e maiúsculas
//devem ser contadas juntas. Armazene os totais para cada letra em um array e imprima os valores em formato tabular depois que os totais
//foram determinados.

public class ex_14_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma frase:");
		String frase = sc.nextLine();

		char[] vogais = new char[frase.length()];

		for (int j = 0; j < frase.length(); j++) {

			boolean igual = false;
			int total = 0;

			if (frase.charAt(j) == ' ')
				continue;
			char c = frase.charAt(j);

			vogais[j] = c;

			if (j == 0)
				total = contaCaractere(frase, c);

			for (int n = 0; n < j; n++) {
				if (c != vogais[n]) {
					total = contaCaractere(frase, c);
				} else {
					igual = true;
				}
			}
			if (!igual)
				System.out.println(c + " - " + total);
		}

		sc.close();

	}

	public static int contaCaractere(String frase, char c) {
		int total = 0;

		for (int i = 0; i <= frase.length(); i++) {
			int index = frase.indexOf(c, i);
			if (index >= 0) {
				total++;
				i = index;
			}
		}
		return total;
	}
}
