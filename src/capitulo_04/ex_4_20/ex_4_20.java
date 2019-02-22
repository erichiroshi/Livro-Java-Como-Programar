package capitulo_04.ex_4_20;

import java.util.Scanner;

public class ex_4_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int i = 1;

		Funcionario a = new Funcionario();

		Funcionario[] b = new Funcionario[2];

		while (i <= 3) {
			System.out.printf("Insira o salario e as horas trabalhadas do funcionário %d%n", i);
			a.setSalario(input.nextDouble());
			a.setHoras(input.nextInt());
			i++;
			System.out.printf("Funcionário receberá: R$%.2f%n%n", a.receber());

		}

	}

}
