package capitulo_14.ex_14_14;

import java.util.Scanner;

//14.14 (Tokenizando e comparando Strings) Elabore um aplicativo que lê uma linha de texto, tokeniza essa linha utilizando caracteres de
//espaço em branco como delimitadores e gera a saída apenas daquelas palavras que terminem com as letras “ED”.

public class ex_14_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma frase:");
		String frase = sc.nextLine();

		String[] tokens = frase.split(" ");

		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].endsWith("ed") || tokens[i].endsWith("ED"))
				System.out.println(tokens[i]);
		}

		sc.close();

	}

}
