package capitulo_08.cap_08;
// Figura 8.2: Time1Test.java

// objeto Time1 utilizado em um aplicativo.

public class Time1Test {

	public static void main(String[] args) {

		// cria e inicializa um objeto Time1
		Time1 time = new Time1(); // invoca o contrutor Time1;

		// gera saída de representações de string da data/hora
		displayTime("After time object is created", time);
		System.out.println();

		// altera a data/hora e gera saída da data/hora atualizada
		time.setTime(13, 27, 6);
		displayTime("After calling setTime", time);
		System.out.println();

		// tenta definir data/hora com valores inválidos
		try {
			time.setTime(99, 99, 99); // todos os valores fora do intervalo
		} catch (IllegalArgumentException e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}

		// exibe a data/hora após uma tentativa de definir valores inválidos
		displayTime("After calling setTime with invalid values", time);
	}

	private static void displayTime(String header, Time1 t) {
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
				header, t.toUniversalString(), t.toString());
	}

} // fim da classe Time1Test
