package capitulo_14.ex_14_05;

import java.security.SecureRandom;

//(Senten�as aleat�rias) Elabore um aplicativo que utiliza gera��o de n�meros aleat�rios para criar frases. Utilize quatro arrays de strings
//chamados article, noun, verb e preposition. Crie uma frase selecionando uma palavra aleatoriamente de cada array na seguinte
//ordem: article, noun, verb, preposition, article e noun. � medida que cada palavra � selecionada, concatene-a �s primeiras
//palavras na frase. As palavras devem ser separadas por espa�os. Quando a frase final for enviada para sa�da, ela deve iniciar com uma letra
//mai�scula e terminar com um ponto. O aplicativo deve gerar e exibir 20 frases.
//O array de artigos deve conter os artigos "the", "a", "one", "some" e "any"; o array de substantivos deve conter os substantivos
//"boy", "girl", "dog", "town" e "car"; o array de verbos deve conter os verbos "drove", "jumped", "ran", "walked" e
//"skipped"; o array de preposi��es deve conter as preposi��es "to", "from", "over", "under" e "on".

public class Ex_14_05 {

	private final static SecureRandom rand = new SecureRandom();

	public static void main(String[] args) {

		String[] article = { "the", "a", "one", "some", "any" };
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] preposition = { "to", "from", "over", "under", "on" };

		String frase;
		for (int i = 0; i < 20; i++) {

			frase = article[rand.nextInt(5)];
			frase = frase.substring(0, 1).toUpperCase().concat(frase.substring(1)) + " ";
			frase += noun[rand.nextInt(5)] + " ";
			frase += verb[rand.nextInt(5)] + " ";
			frase += preposition[rand.nextInt(5)] + " ";
			frase += article[rand.nextInt(5)] + " ";
			frase += noun[rand.nextInt(5)] + ".";

			System.out.println(i+1 + " - " + frase);
		}

	}
}
