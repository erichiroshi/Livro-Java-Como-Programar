package capitulo_06.ex_6_29;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex_6_29 {

	public enum Coin {
		HEADS, TAILS
	};

	final static int CARA = 0;
	final static int COROA = 1;
	static Coin vira = null;
	static int qnt = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("1 - TOSS COIN - lançar moeda\n0 -	      - para sair");
//		int esc = input.nextInt();

		flip();
		System.out.println(vira);
		flip();

		System.out.println(qnt);

		input.close();

	}

	public static int flip() {

		SecureRandom moeda = new SecureRandom();
		int lado = moeda.nextInt(2);

		Coin vira = null;

		switch (lado) {

		case CARA:
			vira = Coin.HEADS;
			qnt++;
			break;
		case COROA:
			vira = Coin.TAILS;
			qnt++;
			break;
		}

		if (vira == Coin.HEADS)
			return 0;
		if (vira == Coin.TAILS)
			return 1;
		return lado;

	}

}
