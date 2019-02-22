package capitulo_08.cap_08;

// Figura 8.12: Employee.java
// Vari�vel static utilizada para manter uma contagem do n�mero de 
// objetos Employee na mem�ria.
public class Employee2 {

	private static int count = 0; // n�mero de Employees criados
	private String firstName;
	private String lastName;

	// inicializa Employee, adiciona 1 a static count e
	// gera a sa�da de String indicando que o construtor foi chamado
	public Employee2(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

		++count; // incrementa contagem est�tica de empregados
		System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
	}

	// obt�m o primeiro nome
	public String getFirstName() {

		return firstName;
	}

	// obt�m o �ltimo nome
	public String getLastName() {

		return lastName;
	}

	// m�todo est�tico para obter valor de contagem de est�tica
	public static int getCount() {

		return count;
	}
} // fim da classe Employee
