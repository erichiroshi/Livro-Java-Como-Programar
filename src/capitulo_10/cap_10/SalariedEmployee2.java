package capitulo_10.cap_10;

// Figura 10.14: SalariedEmployee.java
// A classe SalariedEmployee que implementa o m�todo getPaymentAmount
// da interface Payable.
public class SalariedEmployee2 extends Employee2 {

	private double weeklySalary;

	// construtor
	public SalariedEmployee2(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {

		super(firstName, lastName, socialSecurityNumber);

		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");

		this.weeklySalary = weeklySalary;
	}

	// configura o sal�rio
	public void setWeeklySalary(double weeklysalary) {

		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");

		this.weeklySalary = weeklysalary;
	}

	// retorna o sal�rio
	public double getWeeklySalary() {

		return weeklySalary;
	}

	// calcula vencimentos; implementa o m�todo Payable da interface
	// que era abstrata na superclasse Employee
	@Override
	public double getPaymentAmount() {

		return getWeeklySalary();
	}

	// retorna a representa��o String do objeto SalariedEmployee
	@Override
	public String toString() {

		return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
	}
} // fim da classe SalariedEmployee

