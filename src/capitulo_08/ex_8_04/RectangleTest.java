package capitulo_08.ex_8_04;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();

		r1.setLength(15);
		r1.setWidth(10);

		System.out.println("Length = " + r1.getLength());
		System.out.println("Width  = " + r1.getWidth());
		System.out.println();

		System.out.printf("%-9s = %.2f%n", "Área", r1.calcArea());
		System.out.printf("Perímetro = %.2f", r1.calcPerimetro());

	}
} // fim classe RectangleTest
