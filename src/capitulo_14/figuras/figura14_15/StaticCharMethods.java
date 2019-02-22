package capitulo_14.figuras.figura14_15;

import java.util.Scanner;

// Figura 14.15: StaticCharMethods.java
// M�todos est�ticos Character para testar caracteres e converter entre mai�sculas e min�sculas.

public class StaticCharMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // cria scanner
		System.out.println("Enter a character and press Enter");
		String input = scanner.next();
		char c = input.charAt(0); // obt�m caractere de entrada

		// exibe informa��es de caractere
		System.out.printf("is defined: %b%n", Character.isDefined(c));
		System.out.printf("is digit: %b%n", Character.isDigit(c));
		System.out.printf("is first character in a Java identifier: %b%n", Character.isJavaIdentifierStart(c));
		System.out.printf("is part of a Java identifier: %b%n", Character.isJavaIdentifierPart(c));
		System.out.printf("is letter: %b%n", Character.isLetter(c));
		System.out.printf("is letter or digit: %b%n", Character.isLetterOrDigit(c));
		System.out.printf("is lower case: %b%n", Character.isLowerCase(c));
		System.out.printf("is upper case: %b%n", Character.isUpperCase(c));
		System.out.printf("to uppler case: %s%n", Character.toUpperCase(c));
		System.out.printf("to lower case: %s%n", Character.toLowerCase(c));

		scanner.close();
	}
} // fim da classe StaticCharMethods
