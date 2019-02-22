package capitulo_04.ex_4_18;

public class Cliente {

	private int conta, saldo, despesas, credito, limite;

	public Cliente() {
		super();
	}

	public void novoSaldo() {

		setSaldo(getSaldo() + getDespesas() - getCredito());
		System.out.printf("Novo saldo: %d%n", this.saldo);

	}

	public boolean limite() {

		if (this.saldo <= this.limite)
			return true;
		else
			return false;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getDespesas() {
		return despesas;
	}

	public void setDespesas(int despesas) {
		this.despesas = despesas;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

}
