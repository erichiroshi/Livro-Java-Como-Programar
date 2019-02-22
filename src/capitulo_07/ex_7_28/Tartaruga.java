package capitulo_07.ex_7_28;

import java.util.Random;

public class Tartaruga {

	private final int CAMRAP = 3;
	private final int ESC = -6;
	private final int CAMLENT = 1;

	Random random = new Random();

	public int mov() {
		int r = random.nextInt(10) + 1;

		if (r >= 1 && r <= 5)
			return CAMRAP;
		else if (r >= 6 && r <= 7)
			return ESC;
		else
			return CAMLENT;

	}

}
