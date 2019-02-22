package capitulo_04.ex_4_37;

public class Fatorial {

	public int fatorial(int a) {

		int fat = 1;

		while (a > 1) {
			fat *= a;
			a--;
		}

		return fat;
	}

}