package capitulo_09.cap_09;

// Figura 9.8: BasePlusCommissionEmployee.java
// Membros private da superclasse n�o podem ser acessados em um subclasse.

public class BasePlusCommissionEmployee2 extends CommissionEmployee {

	private double baseSalary; // sal�rio-base por semana

	// construtor de seis argumentos
	public BasePlusCommissionEmployee2(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate, double baseSalary) {

		// chamada expl�cita para o construtor CommissionEmployee da superclasse
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

		// se baseSalary � inv�lido, lan�a uma exce��o;
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");

		this.baseSalary = baseSalary;
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

	@Override
	public double earnings() {

		// n�o permitido: commissionRate e grossSales privado em superclasse
		return baseSalary + (commissionRate * grossSales);
	}

	// retorna a representa��o de String de BasePlusCommissionEmployee
	@Override
	public String toString() {

		// n�o permitido: tenta acessar membros private da superclasse

		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s :%.2f", "base-salaried commission employee",
				firstName, lastName, "social security number", socialSecurityNumber, "gross sales", grossSales,
				"commission rate", commissionRate, "base salary", baseSalary);
	}
} // fim da classe BasePlusCommissionEmployee
