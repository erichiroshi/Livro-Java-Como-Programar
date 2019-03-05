// Figura 16.4: UsingToArray.java
// Visualizando arrays como Lists e convertendo Lists em arrays.

package capitulo_16.figuras.figura16_04_UsingToArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class UsingToArray {

	// cria uma LinkedList, adiciona elementos e converte em array
	public static void main(String[] args) {

		String[] colors = { "black", "blue", "yellow" };
		LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));

		links.addLast("red"); // adiciona como o último item
		links.add("pink"); // adiciona ao final
		links.add(3, "green"); // adiciona no terceiro índice
		links.addFirst("cyan"); // adiciona como primeiro item

		// obtém elementos LinkedList como um array
		colors = links.toArray(new String[links.size()]);

		System.out.println("colors: ");
		for (String color : colors)
			System.out.println(color);

	}

} // fim da classe UsingToArray
