package capitulo_07.ex_7_19;

import java.util.Scanner;

public class Ex_7_19 {

	public static void main(String[] args) {

		Reserva r1 = new Reserva();
		Scanner input = new Scanner(System.in);
		int esc;

		while (!r1.cheio()) {
			
			System.out.println("Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica");
			esc = input.nextInt();

			if (esc == 2)
				r1.classeEconomica();

			if (esc == 1)
				r1.primeiraClasse();

		}
	}
}