package capitulo_14.ex_14_07;

//(Latim de porco) Elabore um aplicativo que codifica frases da l�ngua inglesa em latim de porco. O Pig Latin � uma forma de linguagem
//codificada. H� muitos m�todos diferentes para formar frases em Pig Latin. Para simplificar, utilize o seguinte algoritmo:
//Para formar uma frase em latim de porco a partir de uma frase em ingl�s, tokenize a frase em palavras com o m�todo String split.
//Para traduzir cada palavra inglesa em uma palavra do latim de porco, coloque a primeira letra da palavra inglesa no final da palavra e adicione
//as letras �ay�. Assim, a palavra �jump� torna-se �umpjay�, a palavra �the� torna-se �hetay�, e a palavra �computer� torna-se �omputercay�.
//Os espa�os entre as palavras permanecem iguais. Suponha o seguinte: a frase inglesa consiste em palavras separadas por espa�os, n�o
//h� nenhuma marca��o de pontua��o e todas as palavras t�m duas ou mais letras. O m�todo printLatinWord deve exibir cada palavra.
//Cada token � passado para o m�todo printLatinWord a fim de imprimir a palavra latina porco. Permita que o usu�rio insira a frase.
//Continue exibindo todas as frases convertidas em uma �rea de texto.

import java.util.Scanner;

public class ex_14_07 {

	public final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Escreva uma frase:");
		String frase = scanner.nextLine();

		String[] tokens = frase.split(" ");

		for (int i = 0; i < tokens.length; i++) {
			char primeiraLetra = tokens[i].charAt(0);
			tokens[i] = tokens[i].substring(1, tokens[i].length()) + primeiraLetra + "ay";
		}

		printLatinWord(tokens);
	}

	public static void printLatinWord(String[] tokens) {
		for (String string : tokens)
			System.out.print(string + " ");
	}

}
