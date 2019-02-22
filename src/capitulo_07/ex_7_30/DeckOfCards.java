package capitulo_07.ex_7_30;

import java.security.SecureRandom;

public class DeckOfCards {

	private Card deck[];
	private int currentCard;
	private final int NUMBER_OF_CARDS = 52;
	private final SecureRandom randomNumbers = new SecureRandom();

	public DeckOfCards() {

		// "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
		// "Ten", "Jack",
		// "Queen", "King"

		String faces[] = { "AS", "2", "3", "4", "5", "6", "7", "8", "9", "10", "VALETE", "RAINHA", "REI" };
		String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		for (int count = 0; count < deck.length; count++)
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
	}

	public void shuffle() {
		currentCard = 0;
		for (int first = 0; first < deck.length; first++) {
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;

		}
	}

	public Card dealCard() {
		if (currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}

	public boolean cartaAnterior(int i) {

		for (int a = 0; a < i; a++) {

			if (deck[i].getFace() == deck[a].getFace())
				return true;
		}

		return false;
	}

	private int naipe = 0;
	private int igual = 0;
	private int par = 0;
	private int trinca = 0;
	private int quadra = 0;
	private int flush = 0;

	public int verifica(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (deck[i].getSuit() == deck[j].getSuit())
					naipe++;

				if (!cartaAnterior(i)) {
					if (deck[i].getFace() == deck[j].getFace())
						igual++;
				}
			}
			if (igual == 1) {
				par++;
				System.out.printf("par de %s%n", deck[i].getFace());
			} else if (igual == 2) {
				trinca++;
				System.out.printf("trinca de %s%n", deck[i].getFace());
			} else if (igual == 3) {
				quadra++;
				System.out.printf("quadra de %s%n", deck[i].getFace());
			}
			igual = 0;

			if (naipe == 4) {
				System.out.printf("Você tem um flush de %s%n", deck[i].getSuit());
				flush++;
			}
			naipe=0;
		}
		System.out.printf("%nPar: %d%n", par);
		System.out.printf("Trinca: %d%n", trinca);
		System.out.printf("Quadra: %d%n", quadra);
		System.out.printf("Flush: %d%n", flush);
		return igual;

	}
}
