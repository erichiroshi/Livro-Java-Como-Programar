package capitulo_04.ex_4_18;

import java.util.Scanner;

public class ex_4_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Cliente eric = new Cliente();

		System.out.print("Digite o número da conta: ");
		eric.setConta(input.nextInt());

		System.out.print("Saldo início do mês: ");
		eric.setSaldo(input.nextInt());

		System.out.print("Total de itens cobrados no mês: ");
		eric.setDespesas(input.nextInt());

		System.out.print("Total de créditos no mês: ");
		eric.setCredito(input.nextInt());

		System.out.print("Limite de crédito: ");
		eric.setLimite(input.nextInt());

		eric.novoSaldo();
		if (eric.limite() != true) {
			System.out.println("Limite de crédito excedido");
		}

	}

}
