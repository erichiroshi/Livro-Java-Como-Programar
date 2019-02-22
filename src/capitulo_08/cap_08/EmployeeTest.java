package capitulo_08.cap_08;

// Figura 8.9: Employee.java
// Demonstração de composição.
public class EmployeeTest {

	public static void main(String[] args) {

		Date birth = new Date(7, 24, 1949);
		Date hire = new Date(3, 12, 1988);
		Employee employee = new Employee("Bob", "Blue", birth, hire);

		System.out.println(employee);
	}
} // fim da classe EmployeeTest