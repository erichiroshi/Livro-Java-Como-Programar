package capitulo_14.ex_14_10;

import java.util.Scanner;

//14.10 (Exibindo Strings em letras maiúsculas e minúsculas) Elabore um aplicativo que insere uma linha de texto e gera duas vezes a
//saída do texto — uma vez em letras maiúsculas e uma vez em letras minúsculas.

public class ex_14_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase = sc.nextLine();

		System.out.println(frase.toUpperCase());
		System.out.println(frase.toLowerCase());

		sc.close();
	}
}
