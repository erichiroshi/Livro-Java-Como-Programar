package capitulo_14.figuras.figura14_18;

import java.util.Scanner;

// Figura 14.18: TokenTest.java
// Objeto StringTokenizer usado para tokenizar strings.

public class TokenTest {

	// executa o aplicativo
	public static void main(String[] args) {

		// obtém a frase
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence and press Enter");
		String sentence = scanner.nextLine();

		// processa a frase do usuário
		String[] tokens = sentence.split(" ");
		System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.length);

		for (String token : tokens)
			System.out.println(token);

		scanner.close();
	}
} // fim da classe TokenTest
