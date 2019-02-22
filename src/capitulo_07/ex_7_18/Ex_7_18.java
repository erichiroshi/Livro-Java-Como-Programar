package capitulo_07.ex_7_18;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Ex_7_18 {

	private static final SecureRandom randomNumbers = new SecureRandom();

	private enum Status {
		CONTINUE, WON, LOST
	}

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_ELEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {

		int[] freqWin = new int[50];
		int[] freqLose = new int[50];
		int win = 0;
		int lose = 0;
		final int QNT = 1000000;

		for (int i = 0; i < QNT; i++) {

			int count = 0;

			int myPoint = 0;
			Status gameStatus;

			int sumOfDice = rollDice();

			switch (sumOfDice) {
			case SEVEN:
			case YO_ELEVEN:
				gameStatus = Status.WON;
				freqWin[0]++;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				freqLose[0]++;
				break;
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				// System.out.printf("Point is %d%n", myPoint);
				break;
			}

			while (gameStatus == Status.CONTINUE) {
				sumOfDice = rollDice();
				count++;
				if (sumOfDice == myPoint) {
					try {
						freqWin[count]++;
					} catch (ArrayIndexOutOfBoundsException e) {
					}

					gameStatus = Status.WON;
				} else if (sumOfDice == SEVEN) {
					try {
						freqLose[count]++;
					} catch (ArrayIndexOutOfBoundsException e) {
					}
					gameStatus = Status.LOST;
				}
			}

			/*
			 * if (gameStatus == Status.WON)
			 * 		System.out.println("Player wins");
			 * else
			 * 		System.out.println("Player loses");
			 */

		}
		System.out.printf("    Vitórias%nRodada	Frequencia\n");
		for (int i = 0; i < freqWin.length; i++) {
			if (freqWin[i] != 0) {
				System.out.printf("%d	%,d%n", i + 1, freqWin[i]);
				win += freqWin[i];
			}
		}
		System.out.printf("Total de vitórias: %,d%n", win);

		System.out.printf("    Derrotas%nRodada	Frequencia\n");
		for (int i = 0; i < freqLose.length; i++) {
			if (freqLose[i] != 0) {
				System.out.printf("%d	%,d%n", i + 1, freqLose[i]);
				lose += freqLose[i];
			}
		}
		System.out.printf("Total derrotas: %,d%n", lose);
		System.out.printf("Total de jogos: %,d%n", (win + lose));

		System.out.printf("Porcentagem de vitórias: %.2f%%", (double) win / QNT * 100);

	}

	public static int rollDice() {

		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);

		int sum = die1 + die2;

		// System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		return sum;

	}

}
