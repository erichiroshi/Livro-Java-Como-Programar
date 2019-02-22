package capitulo_07.ex_7_28;

import java.util.Random;

public class Lebre {

	private final int DORM = 0;
	private final int SALTGRAND = 9;
	private final int ESCGRAND = -12;
	private final int SALTPEQ = 1;
	private final int ESCPEQ = -2;

	Random random = new Random();

	public int mov() {
		int r = random.nextInt(10) + 1;

		if (r >= 1 && r <= 2)
			return DORM;
		else if (r >= 3 && r <= 4)
			return SALTGRAND;
		else if (r == 5)
			return ESCGRAND;
		else if (r >= 6 && r <= 8)
			return SALTPEQ;
		else
			return ESCPEQ;

	}

}
