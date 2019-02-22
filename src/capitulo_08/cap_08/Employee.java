package capitulo_08.cap_08;

// Figura 8.8: Employee.java
// Classe Employee com referênci a outros objetos.
public class Employee {

	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;

	// construtor para inicializar nome, data de nascimento e data de contratação
	public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.hireDate = hireDate;

	}

	// converte Employee em formato de String
	public String toString() {

		return String.format("%s, %s Hired: %s Birthdat: %s", lastName, firstName, hireDate, birthDate);
	}

} // fim da classe Employee