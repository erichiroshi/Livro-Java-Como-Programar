package teste;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dígite 5 números inteiros");

		Set<Integer> lista = new TreeSet<>();

		for (int i = 0; i < 5; i++) {
			lista.add(sc.nextInt());

		}

		Integer[] array = lista.toArray(new Integer[0]);
		
		for(Integer a : array)
		System.out.print(a + " ");
		System.out.println();
		System.out.println();

		System.out.println(lista);
		System.out.println("Menor: " + Collections.min(lista));
		System.out.println("Maior: " + Collections.max(lista));

		List<Integer> list = Arrays.asList(array);

		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println();
		for(Integer a : array)
		System.out.print(a + " ");
		sc.close();
		
		
	}

}
