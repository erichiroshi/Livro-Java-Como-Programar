package capitulo_14.ex_14_08;

import java.util.Scanner;

//14.8 (Tokenizando números de telefone) Elabore um aplicativo que insere um número de telefone como uma string na forma (555)
//555-5555. O aplicativo deve utilizar o método String split para extrair o código de área como um token, os três primeiros dígitos do
//número de telefone como um segundo token e os últimos quatro dígitos do número de telefone como um terceiro token. Os sete dígitos do
//número de telefone devem ser concatenados em uma string. O código de área e o número de telefone devem ser impressos. Lembre-se de
//que você que terá de alterar caracteres delimitadores durante o processo de tokenização.

public class ex_14_08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String phone = scanner.next();

		String[] tokens = phone.split("\\D");

		for (String string : tokens) {
			if (!string.equals(""))
				System.out.println(string);
		}

		scanner.close();
	}
}
