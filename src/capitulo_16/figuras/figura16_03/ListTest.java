package capitulo_16.figuras.figura16_03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {

		// adiciona elementos colors � list1
		String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" };
		List<String> list1 = new LinkedList<>();

		for (String color : colors)
			list1.add(color);

		// adiciona elementos colors2 � list2
		String[] colors2 = { "gold", "white", "brown", "blue", "gray", "silver" };
		List<String> list2 = new LinkedList<>();

		for (String color : colors2)
			list2.add(color);

		list1.addAll(list2); // concatena as listas
		list2 = null; // libera recuros
		printList(list1); // imprime elementos list1

		convertToUppercaseString(list1); // converte em string de letras mai�sculas
		printList(list1); // imprime elementos list1

		System.out.printf("%nDeleting elementos 4 to 6...");
		removeItems(list1, 4, 7); // remove itens 4 a 6 da lista
		printList(list1); // imprime elentos list1
		printReversedList(list1); // imprime lista na ordem inversa

	}

	// imprime lista invertida
	private static void printReversedList(List<String> list) {

		ListIterator<String> iterator = list.listIterator(list.size());

		System.out.printf("%n Reversed List:%n");

		// imprime lista na ordem inversa
		while (iterator.hasPrevious())
			System.out.printf("%s ", iterator.previous());

	}

	// obt�m sublista e utiliza m�todo clear apra excluir itens da sublista
	private static void removeItems(List<String> list, int start, int end) {

		list.subList(start, end).clear(); // remove os itens

	}

	// localiza objetos String e converte em letras mai�sculas
	private static void convertToUppercaseString(List<String> list) {

		ListIterator<String> iterator = list.listIterator();

		while (iterator.hasNext()) {

			String color = iterator.next(); // obt�m o item
			iterator.set(color.toUpperCase()); // converte em letras mai�sculas
		}

	}

	// gera sa�da do conte�do de List
	private static void printList(List<String> list) {

		System.out.printf("%nlist:%n");

		for (String color : list)
			System.out.printf("%s ", color);

		System.out.println();

	}

}// fim da classe ListTest
