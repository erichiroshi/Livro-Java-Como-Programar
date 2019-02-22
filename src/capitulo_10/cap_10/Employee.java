package capitulo_10.cap_10;

// Figura 10.4: Employee.java
// Superclasse abstrata Employee.

public abstract class Employee {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

	// construtor
	public Employee(String firstName, String lastName, String socialSecurityNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	// retorna o nome
	public String getFirstName() {

		return firstName;
	}

	// retorna o sobrenome
	public String getLastName() {

		return lastName;
	}

	// retorna o n�mero do seguro social
	public String getSocialSecurityNumber() {

		return socialSecurityNumber;
	}

	// retorna a representa��o de String do objeto Employee
	@Override
	public String toString() {

		return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(),
				getSocialSecurityNumber());
	}

	// O m�todo abstract deve ser sobrescrito pelas subclasses concretas
	public abstract double earnings();

} // fim da classe abstrata Employee
