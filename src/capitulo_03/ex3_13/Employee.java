package capitulo_03.ex3_13;

public class Employee {

	private String nome;
	private String sobrenome;
	private double salario;
	private int aumento;

	public int getAumento() {
		return aumento;
	}

	public Employee(String nome, String sobrenome, double salario) {

		this.nome = nome;
		this.sobrenome = sobrenome;

		if (salario > 0)
			this.salario = salario;
	}

	public double getSalarioAnual() {
		return this.salario * 12;
	}

	public void setAumento(int aumento) {

		this.salario = this.salario * aumento / 100 + this.salario;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
