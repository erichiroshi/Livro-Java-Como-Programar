package capitulo_14.ex_14_09;

import java.util.Scanner;

//14.9 (Exibindo uma frase com as palavras invertidas) Elabore um aplicativo que insere uma linha de texto, tokeniza a linha com o método
//String split e gera os tokens na ordem inversa. Utilize caracteres de espaço em branco como delimitadores.
public class ex_14_09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String frase = scanner.nextLine();

		String[] tokens = frase.split(" ");

		for (int i = tokens.length - 1; i >= 0; i--) {
			System.out.print(tokens[i] + " ");
		}

		scanner.close();
	}

}
