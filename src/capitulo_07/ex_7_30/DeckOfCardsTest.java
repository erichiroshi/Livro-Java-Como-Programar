package capitulo_07.ex_7_30;

public class DeckOfCardsTest {

	public static void main(String[] args) {

		DeckOfCards myDeckOfCards = new DeckOfCards();
		 myDeckOfCards.shuffle();

		 int n=5;
		 
		 
		for (int i = 1; i <= n; i++) {

			System.out.printf("%-19s%n", myDeckOfCards.dealCard());
	//		if (i % 4 == 0)
	//			System.out.println();

		}

		System.out.println();
		System.out.println();
		myDeckOfCards.verifica(n);
		
	}

}
