package capitulo_14.figuras.figura14_23;

import java.util.Arrays;

// Figura 14.23: RegexSubstitution.java
// Métodos String replaceFirst, replaceAll e split.

public class RegexSubstitution {

	public static void main(String[] args) {

		String firstString = "This sentence ends in 5 stars *****";
		String secondString = "1, 2, 3, 4, 5,    6, 7, 8";

		System.out.printf("Original String 1: %s%n", firstString);

		// substitui '*' por '^'
		firstString = firstString.replaceAll("\\*", "^");

		System.out.printf("^ substituted for *: %s%n", firstString);

		// substitui asteriscos por circuflexos
		firstString = firstString.replaceAll("stars", "carets");

		System.out.printf("\"carets\" substituted for \"stars\": %s%n", firstString);

		// substitui palavras por 'palavra'
		System.out.printf("Every word replaced by \"word\": %s%n%n", firstString.replaceAll("\\w+", "word"));

		System.out.printf("Original String 2: %s%n", secondString);

		// substitui os primeiros três dígitos pelo 'dígito'
		for (int i = 0; i < 3; i++)
			secondString = secondString.replaceFirst("\\d", "digit");

		System.out.printf("First 3 digits replaced by \"digit\" : %s%n", secondString);

		System.out.print("String split at commas: ");
		String[] results = secondString.split(",\\s*"); // divide em vírgulas
		System.out.println(Arrays.toString(results));

		System.out.println();
		for (String result : results)
			System.out.println(result);

		System.out.println(Arrays.toString(results));
		System.out.println(firstString);

	}
} // fimd da classe RegexSubstitution
