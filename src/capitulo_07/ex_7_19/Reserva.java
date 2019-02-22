package capitulo_07.ex_7_19;

import java.util.Scanner;

public class Reserva {

	Scanner input = new Scanner(System.in);

	private boolean[] assento = new boolean[10];
	private int ce = 5;
	private int pc = 0;
	private char esc;

	public void classeEconomica() {

		if (assento[9] == false) {

			assento[ce] = true;
			System.out.printf("Sua poltrona é a: %d e você está na Classe Econômica%n%n", ce + 1);
			ce++;

		} else {
			System.out.println("Classe está lotada, deseja ficar na primeira classe? s/n");
			esc = input.next().charAt(0);

			if (esc == 's')
				primeiraClasse();
			else
				System.out.println("Next Flight leaves in 3 hours\n");
		}
	}

	public void primeiraClasse() {

		if (assento[4] == false) {
			assento[pc] = true;

			System.out.printf("Sua poltrona é a: %d e você está na Primeira Classe%n%n", pc + 1);
			pc++;

		} else {
			System.out.println("A classe está lotada, deseja ficar na classe economica? s/n");
			esc = input.next().charAt(0);

			if (esc == 's')
				classeEconomica();
			else
				System.out.println("Next Flight leaves in 3 hours\n");
		}
	}

	public boolean cheio() {
		if (assento[4] == true && assento[9] == true) {
			System.out.println("As poltronas estão cheias");
			return true;
		} else
			return false;
	}

}
