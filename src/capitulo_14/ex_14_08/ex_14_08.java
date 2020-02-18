package capitulo_14.ex_14_08;

import java.util.Scanner;

//14.8 (Tokenizando n�meros de telefone) Elabore um aplicativo que insere um n�mero de telefone como uma string na forma (555)
//555-5555. O aplicativo deve utilizar o m�todo String split para extrair o c�digo de �rea como um token, os tr�s primeiros d�gitos do
//n�mero de telefone como um segundo token e os �ltimos quatro d�gitos do n�mero de telefone como um terceiro token. Os sete d�gitos do
//n�mero de telefone devem ser concatenados em uma string. O c�digo de �rea e o n�mero de telefone devem ser impressos. Lembre-se de
//que voc� que ter� de alterar caracteres delimitadores durante o processo de tokeniza��o.

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
