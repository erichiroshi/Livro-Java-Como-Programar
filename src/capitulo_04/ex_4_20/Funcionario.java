package capitulo_04.ex_4_20;

public class Funcionario {

	private double salario, receber;
	private int horas;

	public Funcionario() {

	}

	public double receber() {

		if (horas <= 40) {
			return setReceber(this.salario * this.horas);
		} else {
			return setReceber((this.salario * 40
					+ (this.salario * (this.horas - 40) + this.salario * (this.horas - 40) * 0.5)));
		}

	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getReceber() {
		return receber;
	}

	public double setReceber(double receber) {
		this.receber = receber;
		return receber;
	}

}
