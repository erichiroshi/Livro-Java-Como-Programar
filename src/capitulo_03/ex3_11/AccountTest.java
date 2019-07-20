package capitulo_03.ex3_11;
// Figura 3.2: AccountTest.java

// Cria e manipula um objeto Account.

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {

		// cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		// cria um objeto Account e o atribui a myAccount
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

		System.out.printf("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("adding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

		System.out.printf("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("adding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);

		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

		System.out.printf("%nEnter withdraw amount for account1: ");
		double withdrawAmount = input.nextDouble();
		System.out.printf("sacando %.2f to account1 balance%n%n", withdrawAmount);
		account1.withdraw(withdrawAmount);

		System.out.printf("Enter withdraw amount for account2: ");
		withdrawAmount = input.nextDouble();
		System.out.printf("sacando %.2f to account2 balance%n%n", withdrawAmount);
		account2.withdraw(withdrawAmount);

		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

		/*
		 * // exibe o valor inicial do nome (null)
		 * System.out.printf("Initial name is: %s%n", account1.getName());
		 * System.out.printf("Initial name is: %s%n%n", account2.getName());
		 * 
		 * // solicita e lê o nome System.out.println("Please enter the name:"); String
		 * theName = input.nextLine(); // lê uma linha de texto
		 * account1.setName(theName); // insere theName em myAccount
		 * System.out.println(); // gera saída de uma linha em branco
		 * 
		 * // exibe o nome armazenado no objeto muAccount
		 * System.out.printf("Name in object myAccount is:%n%s%n", account1.getName());
		 */
		input.close();
	}
} // fim da classe AccountTest