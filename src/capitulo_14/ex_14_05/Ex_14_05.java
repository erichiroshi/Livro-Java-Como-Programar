package capitulo_14.ex_14_05;

import java.util.Random;

// Sentenças aleatórias

public class Ex_14_05 {

	public static void main(String[] args) {

		String[] article = { "the", "a", "one", "some", "any" };
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] preposition = { "to", "from", "over", "under", "on" };
		String frase = "";

		Random rand = new Random();

		for (int j = 0; j < 20; j++) {
			for (int i = 0; i < 6; i++) {

				int r = rand.nextInt(5);

				if (i == 0)
					frase = article[r].substring(0, 1).toUpperCase().concat(article[r].substring(1));

				if (i == 1)
					frase += " " + noun[r];

				if (i == 2)
					frase += " " + verb[r];

				if (i == 3)
					frase += " " + preposition[r];

				if (i == 4)
					frase += " " + article[r];

				if (i == 5)
					frase += " " + noun[r] + ".";

			}
			
			System.out.println(frase);

		}
		
	}
}
