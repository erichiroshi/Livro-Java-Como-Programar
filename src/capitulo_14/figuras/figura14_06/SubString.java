package capitulo_14.figuras.figura14_06;

// Figura 14.6: SubString.java
// m�todos substring da classe String.

public class SubString {

	public static void main(String[] args) {

		String letters = "abcdefghijklmabcdefghijklm";

		// testa m�todos substring
		System.out.printf("Substring from index 20 to end is \"%s\"%n", letters.substring(20));
		System.out.printf("%s \"%s\"%n", "Substring from index 3 up to, but not including 6 is",
				letters.substring(3, 6));
	}
} // fim da classe Substring