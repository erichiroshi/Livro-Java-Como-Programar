package capitulo_14.figuras.figura14_21;

import java.util.Scanner;

import capitulo_14.figuras.figura14_20.ValidateInput;

// Figura 14.21: Validate.java
// Insere e valida os dados do usúario usando a classe Validate

public class Validate {

	public static void main(String[] args) {

		// obtém entrada de usuário
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first name:");
		String firstName = scanner.nextLine();
		System.out.println("Please enter last name:");
		String lastName = scanner.nextLine();
		System.out.println("Please enter address:");
		String address = scanner.nextLine();
		System.out.println("Please enter city:");
		String city = scanner.nextLine();
		System.out.println("Please enter state:");
		String state = scanner.nextLine();
		System.out.println("Please enter zip:");
		String zip = scanner.nextLine();
		System.out.println("Please enter phone:");
		String phone = scanner.nextLine();

		// valida a entrada de usuário e exibe mensagem de erro
		System.out.println("\nValidate Result:");

		if (!ValidateInput.validateFirstName(firstName))
			System.out.println("Invalid first name");
		else if (!ValidateInput.validateLastName(lastName))
			System.out.println("Invalid last name");
		else if (!ValidateInput.validateAddress(address))
			System.out.println("Invalid address");
		else if (!ValidateInput.validateCity(city))
			System.out.println("Invalid city");
		else if (!ValidateInput.validateState(state))
			System.out.println("Invalid state");
		else if (!ValidateInput.validateZip(zip))
			System.out.println("Invalid zip code");
		else if (!ValidateInput.validatePhone(phone))
			System.out.println("Invalid phone number");
		else
			System.out.println("Valid input. Thank you.");

		scanner.close();

	}
}
