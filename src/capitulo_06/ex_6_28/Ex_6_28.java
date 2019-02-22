package capitulo_06.ex_6_28;

import java.util.Scanner;

public class Ex_6_28 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Dígite sua média");
		
		System.out.println("Sua média é: "+(qualityPoints(input.nextInt())));
		
		
		
		
		
		
		
	}

	public static int qualityPoints(int nota) {

		if (nota <= 100 && nota >= 90)
			return 4;
		else if (nota < 90 && nota >= 80)
			return 3;
		else if (nota < 80 && nota >= 70)
			return 2;
		else if (nota < 70 && nota >= 60)
			return 1;
		else
			return 0;

	}

}
