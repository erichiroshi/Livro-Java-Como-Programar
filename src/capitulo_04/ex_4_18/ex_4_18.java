package capitulo_04.ex_4_18;

import java.util.Scanner;

public class ex_4_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Cliente eric = new Cliente();

		System.out.print("Digite o n�mero da conta: ");
		eric.setConta(input.nextInt());

		System.out.print("Saldo in�cio do m�s: ");
		eric.setSaldo(input.nextInt());

		System.out.print("Total de itens cobrados no m�s: ");
		eric.setDespesas(input.nextInt());

		System.out.print("Total de cr�ditos no m�s: ");
		eric.setCredito(input.nextInt());

		System.out.print("Limite de cr�dito: ");
		eric.setLimite(input.nextInt());

		eric.novoSaldo();
		if (eric.limite() != true) {
			System.out.println("Limite de cr�dito excedido");
		}

	}

}
