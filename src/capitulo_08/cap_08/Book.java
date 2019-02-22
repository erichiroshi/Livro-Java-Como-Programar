package capitulo_08.cap_08;

// Figura 8.10: Book.java
// Declarando um tipo enum com um construtor e campos de inst�ncia expl�citos
// e m�todos de acesso para esses campos
public enum Book {

	// declara constantes do tipo enum
	JHTP("Java How to Program", "2015"),
	CHTP("C How to Program", "2013"),
	IW3HTP("Interne & World Wide Web How to Program", "2012"),
	CPPHTP("C++ Hot to Program", "2014"),
	VBHTP("Visual Basic How to Program", "2014"),
	CSHARPHTP("Visual C# How to Program", "2014");

	// campos de inst�ncia
	private final String title; // t�tulo de livro
	private final String copyrightYear; // ano dos direitos autorais

	// construtor enum
	Book(String title, String copyrightYear) {

		this.title = title;
		this.copyrightYear = copyrightYear;
	}

	// acessor para t�tulo de campo
	public String getTitle() {

		return title;
	}

	// acessor para o campo copyrightYear
	public String getCopyrightYear() {

		return copyrightYear;
	}
} // fim do enum Book