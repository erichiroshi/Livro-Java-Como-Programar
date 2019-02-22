package capitulo_06.ex_6_15;

public class Ex_6_15 {

	public static void main(String[] args) {

		System.out.println("Triângulo  Lado 1   Lado 2   Hipotenusa");
		System.out.printf("1	   3.0	    4.0	     %.2f%n", hypotenuse(3.0, 4.0));
		System.out.printf("2	   5.0      12.0     %.2f%n", hypotenuse(5.0, 12.0));
		System.out.printf("3	   8.0      15.0     %.2f%n", hypotenuse(8.0, 15.0));

	}

	public static double hypotenuse(double side1, double side2) {

		double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

		return hypotenuse;

	}

}