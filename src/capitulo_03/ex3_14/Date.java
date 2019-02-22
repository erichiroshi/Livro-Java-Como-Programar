package capitulo_03.ex3_14;

public class Date {

	private int mes, dia, ano;

	public Date(int dia, int mes, int ano) {
		super();
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	public String displayDate() {
		String date;

		date = this.getDia() + "/" + this.getMes() + "/" + this.getAno();

		return date;

	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
