package capitulo_02.ex2_28;

import java.util.Scanner;

public class ex2_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		float r;

		System.out.println("Informe o raio do circulo");
		r = input.nextFloat();

		System.out.printf("diametro = %.2f%ncircunfer�ncia = %.2f%n�rea = %.2f%n", 2 * r, 2 * r * Math.PI, Math.PI * r * r);
		input.close();
	}

}
