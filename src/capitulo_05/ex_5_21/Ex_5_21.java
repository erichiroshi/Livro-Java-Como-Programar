package capitulo_05.ex_5_21;

public class Ex_5_21 {

	public static void main(String[] args) {

		for (int side1 = 1; side1 <= 500; side1++) {

			for (int side2 = 1; side2 <= 500; side2++) {

				for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {

					if (Math.sqrt(hypotenuse * hypotenuse) == Math.sqrt(side1 * side1 + side2 * side2))
						System.out.println(side1 + " " + side2 + " " + hypotenuse);

				}
			}
		}

	}

}
