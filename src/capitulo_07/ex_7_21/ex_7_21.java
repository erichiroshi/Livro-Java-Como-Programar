package capitulo_07.ex_7_21;

import java.util.Scanner;

public class ex_7_21 {

	private enum Posicao {
		CIMA, DIREITA, BAIXO, ESQUERDA
	};

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int[][] floor = new int[20][20];
		int esp;
		int esc = 0;
		boolean rabisca = false;
		int a = 0, b = 0;
		Posicao posAtual = Posicao.DIREITA;

		System.out.println("Comando\tSignificado");
		System.out.println("1\tCaneta para cima");
		System.out.println("2\tCaneta para baixo");
		System.out.println("3\tVira para a direita");
		System.out.println("4\tVira para a esquerda");
		System.out.println("5 10\tAvance 10 espaços ( substitua 10 por um número diferente de espaços )");
		System.out.println("6\tExiba o array 20 por 20");
		System.out.println("9\tFim dos dados (sentinela)");

		while (esc != 9) {

			System.out.printf("Comando: ");
			esc = input.nextInt();

			if (esc == 1)
				rabisca = false;
			if (esc == 2)
				rabisca = true;

			if (esc == 3) {

				if (posAtual == Posicao.DIREITA)
					posAtual = Posicao.BAIXO;
				else if (posAtual == Posicao.BAIXO)
					posAtual = Posicao.ESQUERDA;
				else if (posAtual == Posicao.ESQUERDA)
					posAtual = Posicao.CIMA;
				else if (posAtual == Posicao.CIMA)
					posAtual = Posicao.DIREITA;
			}

			if (esc == 4) {

				if (posAtual == Posicao.DIREITA)
					posAtual = Posicao.CIMA;
				else if (posAtual == Posicao.BAIXO)
					posAtual = Posicao.DIREITA;
				else if (posAtual == Posicao.ESQUERDA)
					posAtual = Posicao.BAIXO;
				else if (posAtual == Posicao.CIMA)
					posAtual = Posicao.ESQUERDA;
			}

			if (esc == 5) {
				System.out.print("espaço: ");
				esp = input.nextInt();

				if (posAtual == Posicao.DIREITA) {
					if (b + esp <= 19) {
						for (int y = 0; y < esp; y++) {
							if (rabisca)
								floor[a][b] = 1;
							b++;
						}
					}
				}

				if (posAtual == Posicao.BAIXO) {
					if (a + esp <= 19) {
						for (int y = 0; y < esp; y++) {
							if (rabisca)
								floor[a][b] = 1;
							a++;
						}
					}
				}

				if (posAtual == Posicao.ESQUERDA) {
					if (b - esp >= 0) {
						for (int y = 0; y < esp; y++) {
							if (rabisca)
								floor[a][b] = 1;
							b--;
						}
					}
				}

				if (posAtual == Posicao.CIMA) {
					if (a - esp >= 0) {
						for (int y = 0; y < esp; y++) {
							if (rabisca)
								floor[a][b] = 1;
							a--;
						}
					}
				}
			}

			if (esc == 6) {

				System.out.print(" ");
				for (int i = 0; i < 20; i++)
					System.out.print('=');

				System.out.println();

				for (int x = 0; x < 20; x++) {
					for (int y = 0; y < 20; y++) {

						if (y == 0)
							System.out.print('|');
						if (a == x && b == y)
							System.out.print('0');
						else if (floor[x][y] == 1 && (a != x || b != y))
							System.out.print('x');
						else
							System.out.print(' ');
						if (y == 19)
							System.out.print('|');
					}
					System.out.println();

				}

				System.out.print(" ");
				for (int i = 0; i < 20; i++)
					System.out.print('=');

				System.out.println();
			}
		}

	}
}
