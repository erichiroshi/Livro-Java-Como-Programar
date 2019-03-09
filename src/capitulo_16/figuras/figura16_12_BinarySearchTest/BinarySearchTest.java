package capitulo_16.figuras.figura16_12_BinarySearchTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Figura 16.12: BinarySearchTest.java
// M�todo binarySearch de Collections.

public class BinarySearchTest {

	public static void main(String[] args) {

		// cria uma ArrayList <String> a partir de conte�do do array colors
		String[] colors = { "red", "white", "blue", "black", "yellow", "purple", "tan", "pink" };
		List<String> list = new ArrayList<>(Arrays.asList(colors));

		Collections.sort(list); // classifica a ArrayList
		System.out.printf("Sorted ArrayList: %s%n", list);

		// pesquisa v�rios valores na lista
		printSearchResults(list, "black"); // primeiro item
		printSearchResults(list, "red"); // item do meio
		printSearchResults(list, "pink"); // �ltimo item
		printSearchResults(list, "aqua"); // abaixo do mais baixo
		printSearchResults(list, "gray"); // n�o exite
		printSearchResults(list, "teal"); // n�o exite

	}

	// realiza pesquisa e exibe o resultado
	private static void printSearchResults(List<String> list, String key) {

		int result = 0;

		System.out.printf("%nSearching for: %s%n", key);
		result = Collections.binarySearch(list, key);

		if (result >= 0)
			System.out.printf("Found at index %d%n", result);
		else
			System.out.printf("Not Found (%d)%n", result);

	}

} // fim da classe BinarySearchTest
