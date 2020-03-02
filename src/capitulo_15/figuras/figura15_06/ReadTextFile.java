package capitulo_15.figuras.figura15_06;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Figura 15.6: ReadTextFile.java
// Esse programa l� um arquivo de texto e exibe cada resgistro.

public class ReadTextFile {

	private static Scanner input;

	public static void main(String[] args) {

		openFile();
		readRecords();
		closeFile();

	}

	// abre o arquivo clients.txt
	private static void openFile() {
		try {
			input = new Scanner(Paths.get("clients.txt"));
		} catch (IOException ioException) {
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
	}

	// l� o registro no arquivo
	private static void readRecords() {
		System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");

		try {
			while (input.hasNext()) // enquanto houver mais para ler
			{
				// exibe o conte�do de registro
				System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(), input.next(), input.next(),
						input.nextDouble());
			}
		} catch (NoSuchElementException elementExcpetion) {
			System.err.println("File improperly formed. Terminating.");
		} catch (IllegalStateException stateException) {
			System.err.println("Error reading from file. Terminating.");
		}
	} // fim do m�todo readRecords

	// fecha o arquivo e termina o aplicativo
	private static void closeFile() {
		if (input != null)
			input.close();
	}

}
