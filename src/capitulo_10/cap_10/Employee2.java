package capitulo_10.cap_10;

// Figura 10.13: Employee.java
// Superclasse abstrata Employee que implementa Payable.

public abstract class Employee2 implements Payable {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

	// construtor
	public Employee2(String firstName, String lastName, String socialSecurityNumber) {

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

	// retorna o n�mero de seguro social
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	// retorna a representa��o de String do objeto Employee
	@Override
	public String toString() {

		return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(),
				getSocialSecurityNumber());
	}

	// Observa��o: n�o implementamos o m�todo getPaymentAmout de Payable aqui, assim
	// essa classe deve ser declarada abstrata para evitar um erro de compila��o.
} // fim da classe abstrata Employee
