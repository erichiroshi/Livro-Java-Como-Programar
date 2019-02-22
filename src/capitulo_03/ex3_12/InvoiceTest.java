package capitulo_03.ex3_12;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice eric = new Invoice("1234", "lanche", 3, 25);

		System.out.println(eric.getInvoiceAmount());

		System.out.println(eric.toString());

	}

}
