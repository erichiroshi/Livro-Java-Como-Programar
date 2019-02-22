package capitulo_06.ex_6_33;

import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {

	private static final SecureRandom randomNumbers = new SecureRandom();

	private enum Status {
		CONTINUE, WON, LOST
	};

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_ELEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {
		System.out.println("Saldo em conta R$ 1000,00");

		Scanner input = new Scanner(System.in);

		Player p1 = new Player();
		int aposta = -1;

		while (aposta != 0 && p1.bankBalance != 0) {
			do {
				System.out.println("Digite o valor de sua aposta ou 0 para sair");
				aposta = input.nextInt();

			} while (!p1.verfica(aposta));

			if (aposta != 0) {

				int myPoint = 0;
				Status gameStatus;

				int sumOfDice = rollDice();

				switch (sumOfDice) {
				case SEVEN:
				case YO_ELEVEN:
					gameStatus = Status.WON;
					break;
				case SNAKE_EYES:
				case TREY:
				case BOX_CARS:
					gameStatus = Status.LOST;
					break;
				default:
					gameStatus = Status.CONTINUE;
					myPoint = sumOfDice;
					System.out.printf("Point is %d%n", myPoint);
					break;
				}

				while (gameStatus == Status.CONTINUE) {
					sumOfDice = rollDice();

					if (sumOfDice == myPoint) {
						gameStatus = Status.WON;
					} else if (sumOfDice == SEVEN) {
						gameStatus = Status.LOST;
					}
				}

				if (gameStatus == Status.WON) {
					System.out.println("Player wins");
					p1.ganhou(aposta);
				} else {
					System.out.println("Player loses");
					p1.perdeu(aposta);
				}
				System.out.println("Saldo em conta: " + p1.bankBalance + "\n");

			}

		}
	}

	public static int rollDice() {

		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);

		int sum = die1 + die2;

		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		return sum;

	}

}
