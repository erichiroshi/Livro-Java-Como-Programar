package teste;

public class Program {

	public static void main(String[] args) {

		System.err.println("teste");
		System.out.println("teste");
		try {
			throw new Exception("lançou erro");
		} catch (Exception e) {
			System.err.println("teste " + e.getMessage());
		}
		
	}

}
