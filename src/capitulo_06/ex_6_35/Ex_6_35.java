package capitulo_06.ex_6_35;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex_6_35 {

	static SecureRandom random = new SecureRandom();
	static Scanner input = new Scanner(System.in);

	static int qntCertas = 0;
	static int qntRespostas = 0;

	static int x;
	static int y;

	public static void main(String[] args) {

		System.out.println("Escolha o nível de 1 - 3");
		int nivel = input.nextInt();

		escNivel(nivel);

		int resp;

		do {
			int a = 1 + random.nextInt(x);
			int b = 1 + random.nextInt(y);
			resp = mult(a, b);

		} while (resp != 0);

	}

	public static int mult(int a, int b) {

		if (qntRespostas == 10) {

			System.out.printf("Você teve um aproveitamento de %d%%%n", (qntCertas * 10));

			if (qntCertas < 7)
				System.out.println("Peça ajuda extra ao seu professor\n");

			if (qntCertas >= 7)
				System.out.println("Parabéns, você está pronto para avançar para o próximo nível!");

			qntRespostas = 0;
			qntCertas = 0;
			return 0;
		}

		qntRespostas++;

		System.out.printf("Quanto é %d vezes %d?%n", a, b);
		int resp = input.nextInt();

		if (acertouMult(a, b, resp) == 1)
			return 1;

		return 0;

	}

	public static int acertouMult(int a, int b, int resp) {

		if (resp == a * b) {
			msgAcertou();
			qntCertas++;
			return 1;

		} else {
			msgErrou();
			return mult(a, b);

		}

	}

	public static void msgAcertou() {

		int rand = random.nextInt(4);

		switch (rand) {
		case 0:
			System.out.println("Muito bom!\n");
			break;
		case 1:
			System.out.println("Excelente!\n");
			break;
		case 2:
			System.out.println("Bom trabalho!\n");
			break;
		case 3:
			System.out.println("Mantenha um bom trabalho!\n");
			break;
		}
	}

	public static void msgErrou() {

		int rand = random.nextInt(4);

		switch (rand) {
		case 0:
			System.out.println("Não. Por favor, tente de novo\n");
			break;
		case 1:
			System.out.println("Errado. Tente mais uma vez\n");
			break;
		case 2:
			System.out.println("Não desista!\n");
			break;
		case 3:
			System.out.println("Não. Continue tentando.\n");
			break;
		}

	}

	public static void escNivel(int nivel) {

		if (nivel == 1) {
			x = 10;
			y = 10;
		}
		if (nivel == 2) {
			x = 20;
			y = 10;
		}
		if (nivel == 3) {
			x = 100;
			y = 100;
		}

	}

}
