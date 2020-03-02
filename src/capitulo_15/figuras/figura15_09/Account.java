package capitulo_15.figuras.figura15_09;

import java.io.Serializable;

// Figura 15.9: Account,java
// Classe Account serializ�vel para armazenar registros como objetos.

public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	private int account;
	private String firstName;
	private String lastName;
	private double balance;

	// inicializa uma Account com valores padr�o
	public Account() {
		this(0, "", "", 0.0); // chama outro construtor
	}

	// inicializa uma Account com os valores fonecidos
	public Account(int account, String firstName, String lastName, double balance) {
		this.account = account;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	// configura o n�mero de conta
	public void setAccount(int account) {
		this.account = account;
	}

	// obt�m n�mero de conta
	public int getAccount() {
		return account;
	}

	// obt�m o nome
	public String getFirstName() {
		return firstName;
	}

	// configura o nome
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// obt�m o sobrenome
	public String getLastName() {
		return lastName;
	}

	// configura o sobrenome
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// obt�m saldo
	public double getBalance() {
		return balance;
	}

	// configura saldo
	public void setBalance(double balance) {
		this.balance = balance;
	}
} // fim da classe Account
