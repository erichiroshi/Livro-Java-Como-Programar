package capitulo_05.ex_5_14;

public class ex_5_14 {

	public static void main(String[] args) {

		double amount;
		double principal = 1000.0;
		double rate;


		for (int i=5; i <= 10; i++) {
			
			rate = (double) i/100;
			
			System.out.printf("Rate = %d%%%n", i);
			System.out.printf("%s%20s %n", "Year", "Amount on deposit");
			
			for (int year = 1; year <= 10; ++year) {

				amount = principal * Math.pow(1.0 + rate, year);

				System.out.printf("%4d%,20.2f%n", year, amount);

			}
			System.out.println();
		}
	}

}
