// Figura 16.7: Sort2.java
// Utilizando um objeto Comparator com o m�todo sort.

package capitulo_16.figuras.figura16_07_Sort2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {

	public static void main(String[] args) {

		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

		// Cria e exibe uma lista contendo os elementos do array naipes
		List<String> list = Arrays.asList(suits); // cria List
		System.out.printf("Unsorted array elements: %s%n", list);

		// classifica em ordem decrescente utilizando um comparador
		Collections.sort(list, Collections.reverseOrder());
		System.out.printf("Sorted list elements: %s%n", list);

	}
} // fim da classe Sort2
