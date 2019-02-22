package capitulo_03.ex3_12;

public class Invoice {

	private String num;
	private String desc;
	private int qnt;
	private double preco;

	public Invoice(String num, String desc, int qnt, double preco) {

		this.num = num;
		this.desc = desc;
		this.qnt = qnt;
		this.preco = preco;
	}

	public double getInvoiceAmount() {
		double valor = this.qnt * this.preco;

		if (valor <= 0)
			return 0;
		{
			return valor;
		}

	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public double getValor() {
		return preco;
	}

	public void setValor(double valor) {
		this.preco = valor;
	}

	@Override
	public String toString() {
		return "Invoice [num=" + num + ", desc=" + desc + ", qnt=" + qnt + ", preco=" + preco + "]";
	}

}
