package capitulo_08.ex_8_04;

public class Rectangle {

	private double length = 1;
	private double width = 1;

	// calcula o perímetro
	public double calcPerimetro() {

		return (2 * this.length + 2 * this.width);
	}

	// calcula a área
	public double calcArea() {

		return this.length * this.width;
	}

	public double getLength() {

		return length;
	}

	public void setLength(double length) {

		if (length > 0.0 && length < 20.0) {
			this.length = length;
		} else
			System.out.println("Length fora do intervalo\n");
	}

	public double getWidth() {

		return width;
	}

	public void setWidth(double width) {
		if (width > 0.0 && width < 20.0) {
			this.width = width;
		} else
			System.out.println("Width fora do intervalo\n");
	}
} // fim classe Rectangle
