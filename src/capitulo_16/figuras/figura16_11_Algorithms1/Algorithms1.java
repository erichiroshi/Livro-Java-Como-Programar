// Figura 16.11: Algorithms1.java
// M�todos Collections reverse, fill, copy, max, min.

package capitulo_16.figuras.figura16_11_Algorithms1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {

	public static void main(String[] args) {

		// crie e exibe uma List<Caracter>
		Character[] letters = { 'P', 'C', 'M' };
		List<Character> list = Arrays.asList(letters); // obt�m List
		System.out.println("list contains: ");
		output(list);

		
		// inverte e exibe uma List<Character>
		Collections.reverse(list); // inverte a ordem dos elementos
		System.out.printf("%nAfter calling reverse, list contains:%n");
		output(list);

		// cria CopyList de um array de 3 caracteres
		Character[] lettersCopy = new Character[3];
		List<Character> copyList = Arrays.asList(lettersCopy);

		// copia o conte�do da lista para CopyList
		Collections.copy(copyList, list);
		System.out.printf("%nAfter copying, copyList contains:%n");
		output(copyList);

		// preenche a lista com Rs
		Collections.fill(list, 'R');
		System.out.printf("%nAfter calling fill, list contains:%n");
		output(list);

		
		System.out.println();
		for(Character c : letters)
		System.out.println(c);
	}

	// envia informa��es de List para sa�da
	private static void output(List<Character> listRef) {

		System.out.print("The list is: ");

		for (Character element : listRef)
			System.out.printf("%s ", element);

		System.out.printf("%nMax: %s", Collections.max(listRef));
		System.out.printf("  Min: %s", Collections.min(listRef));

	}

}
