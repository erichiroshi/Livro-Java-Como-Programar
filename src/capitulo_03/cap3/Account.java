// Figura 3.1: Account.java
// Classe Account que cont�m uma vari�vel de inst�ncia name
// e m�todos para configurar e obter seu valor.

package capitulo_03.cap3;

public class Account {

	private String name; // vari�vel de inst�ncia
	private double balance;	// vari�vel de inst�ncia

	public Account(String name, double balance) {
		this.name = name;
		
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// m�todo para definir o nome no objeto
	public void setName(String name) {
		this.name = name; // armazena o nome
	}

	// m�todo para recuperar o nome do objeto
	public String getName() {
		return name; // retorn valor do nome para o chamador
	}

} // fim da classe Account
