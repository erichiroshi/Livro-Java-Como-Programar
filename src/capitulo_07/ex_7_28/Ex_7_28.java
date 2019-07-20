package capitulo_07.ex_7_28;

import java.util.Scanner;

public class Ex_7_28 {

	public static void main(String[] args) {

		Lebre l = new Lebre();
		Tartaruga t = new Tartaruga();

		Scanner input = new Scanner(System.in);

		int posT = 1, posL = 1;

		System.out.println("BANG !!!!!");
		System.out.println("E LÁ VÃO ELES !!!!!");

		do {

			posL += l.mov();
			posT += t.mov();

			if (posL < 1)
				posL = 1;

			if (posT < 1)
				posT = 1;

			if (posT == posL && posT != 1)
				System.out.println("AI!!!");

			for (int i = 1; i <= 70; i++) {

				if (i == posT)
					System.out.print('T');
				else if (i == posL)
					System.out.print('L');
				else
					System.out.print("-");
			}
			System.out.println();
		} while (posT < 70 && posL < 70);

		if (posL >= 70 && posT < 70)
			System.out.println("A LEBRE GANHOU!!!");
		else if (posT >= 70 && posL < 70)
			System.out.println("A TARTARUGA VENCEU!!!");
		else if (posL >= 70 && posT >= 70)
			System.out.println("OCORREU UM EMPATE!!!");
		
		input.close();
	}
	

}
