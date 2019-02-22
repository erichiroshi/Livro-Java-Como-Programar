package capitulo_09.cap_09;

// Figura 9.6: BasePlusCommissionEmployee.java
// A classe BasePlusCommissionEmployee representa um empregado que recebe
// um sal�rio-base alpem da comiss�o.

public class BasePlusCommissionEmployee {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales; // vendas brutas semanais
	private double commissionRate; // porcentagem da comiss�o
	private double baseSalary; // sal�rio-base por semana

	// construtor de seis arguemtnos
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		// a chamada impl�cita para o construtor padr�o de Object ocorre aqui

		// se grossSales � inv�lido, lan�a uma exce��o
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");

		// se commissionRate � inv�lido, lan�a uma exce��o
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

		// se baseSalary � inv�lido, lan�a uma exce��o
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");

		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
	} // fim do construtor

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

	// configura a quantidade de vendas brutas
	public void setGrossSales(double grossSales) {

		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");

		this.grossSales = grossSales;
	}

	// retorna a quantidade de vendas brutas
	public double getGrossSales() {

		return grossSales;
	}

	// configura a taxa de comiss�o
	public void setCommissionRate(double commissionRate) {

		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

		this.commissionRate = commissionRate;
	}

	// retorna a taxa de comiss�o
	public double getCommissionRate() {

		return commissionRate;
	}

	// configura o sal�rio-base
	public void setBaseSalary(double baseSalary) {

		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");

		this.baseSalary = baseSalary;
	}

	// retorna o sal�rio-base
	public double getBaseSalary() {

		return baseSalary;
	}

	// calcula os lucros
	public double earnings() {

		return baseSalary + (commissionRate * grossSales);
	}

	// retorna a representa��o de String de BasePlusCommissionEmployee
	@Override
	public String toString() {

		return String.format("%s: %s %s%n%s:%s%n%s %.2f%n%s: %.2f%n%s: %.2f", "base-salaried commission employee",
				firstName, lastName, "social security number", socialSecurityNumber, "gross sales", grossSales,
				"commission rate", commissionRate, "base salary", baseSalary);
	}
} // fim da classe Base PlusCommissionEmployee
