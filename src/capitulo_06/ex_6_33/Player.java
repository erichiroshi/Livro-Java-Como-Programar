package capitulo_06.ex_6_33;

import java.security.SecureRandom;

public class Player {

	SecureRandom random = new SecureRandom();

	int bankBalance = 1000;

	public boolean verfica(int wager) {

		if (wager <= bankBalance)
			return true;
		else {
			System.out.println("N�o tem tudo isso em conta\n");
		}
		return false;

	}

	public void ganhou(int wager) {
		this.bankBalance += wager;
		System.out.println(convVencedora());

		

	}

	public void perdeu(int wager) {

		this.bankBalance -= wager;
		System.out.println(convPerdedora());


	}

	private String convVencedora() {

		int ran = random.nextInt(2);

		switch (ran) {
		case 1:
			return "\nVoc� est� montado na grana. Agora � hora\nde trocar essas fichas e embolsar o dinheiro!";
		default:
			return "\nEst� com sorte!";
		}

	}

	private String convPerdedora() {
		
		if (this.bankBalance != 0) {
			int ran = random.nextInt(2);

			switch (ran) {
			case 1:
				return "\nOh, parece que voc� vai quebrar, hein?";
			default:
				return "\nAh, vamos l�, d� uma chance para sua sorte!";
			}
		} else
			return "\nDesculpe, mas voc� faliu!";
	}

}
