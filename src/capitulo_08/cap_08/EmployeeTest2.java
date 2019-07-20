package capitulo_08.cap_08;

// Figura 8.13: EmployeeTest.java
// Demonstração do membro static.
public class EmployeeTest2 {

	public static void main(String[] args) {

		// mostra que a contagem é 0 antes de criar Employees
		System.out.printf("Employees before instantiation: %d%n", Employee2.getCount());

		// cria dois Employee; a contagem deve ser 2
		Employee2 e1 = new Employee2("Susan", "Baker");
		Employee2 e2 = new Employee2("Bob", "Blue");

		// mostra que a contagem é 2 depois de criar dois Employees
		System.out.printf("%nEmployees after instantiantion:%n");
		System.out.printf("via e1.getCount(): %d%n", Employee2.getCount());
		System.out.printf("via e2.getCount(): %d%n", Employee2.getCount());
		System.out.printf("via Employee2.getCount(): %d%n", Employee2.getCount());

		// obtém nomes de Employees
		System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",
				e1.getFirstName(), e1.getLastName(),
				e2.getFirstName(), e2.getLastName());

	}
} // fim da classe EmployeeTest2