package capitulo_04.ex_4_35;

public class Verifica {

	public boolean verifica(int a, int b, int c) {

		boolean x, y, z;

		int d = b - c;
		if (d < 0)
			d = d * -1;

		int e = a - c;
		if (e < 0)
			e *= -1;

		int f = a - b;
		if (f < 0)
			f *= -1;

		if (d < a && a < (b + c))
			x = true;
		else
			x = false;

		if (e < b && b < (a + c))
			y = true;
		else
			y = false;

		if (f < c && c < (a + b))
			z = true;
		else
			z = false;

		if ((x && y && z))
			return true;
		else
			return false;
	}

}
