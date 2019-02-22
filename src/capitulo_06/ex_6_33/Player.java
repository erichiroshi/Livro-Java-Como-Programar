package capitulo_06.ex_6_33;

import java.security.SecureRandom;

public class Player {

	SecureRandom random = new SecureRandom();

	int bankBalance = 1000;

	public boolean verfica(int wager) {

		if (wager <= bankBalance)
			return true;
		else {
			System.out.println("Não tem tudo isso em conta\n");
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
			return "\nVocê está montado na grana. Agora é hora\nde trocar essas fichas e embolsar o dinheiro!";
		default:
			return "\nEstá com sorte!";
		}

	}

	private String convPerdedora() {
		
		if (this.bankBalance != 0) {
			int ran = random.nextInt(2);

			switch (ran) {
			case 1:
				return "\nOh, parece que você vai quebrar, hein?";
			default:
				return "\nAh, vamos lá, dê uma chance para sua sorte!";
			}
		} else
			return "\nDesculpe, mas você faliu!";
	}

}
