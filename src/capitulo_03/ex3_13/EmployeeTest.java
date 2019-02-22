package capitulo_03.ex3_13;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee eric = new Employee("Eric", "Hiroshi", 10000);
		Employee pedro = new Employee("Pedro", "Gustavo", 500);

		System.out.println("Salario Anual\n");
		System.out.printf("Eric: R$ %,.2f%n", eric.getSalarioAnual());
		System.out.printf("Pedro: R$ %,.2f%n", pedro.getSalarioAnual());

		
		eric.setAumento(10);
		pedro.setAumento(10);
		
		System.out.println("Salario Anual\n");
		System.out.printf("Eric: R$ %,.2f%n", eric.getSalarioAnual());
		System.out.printf("Pedro: R$ %,.2f%n", pedro.getSalarioAnual());

		
		
		
		
		
		
	}

}
