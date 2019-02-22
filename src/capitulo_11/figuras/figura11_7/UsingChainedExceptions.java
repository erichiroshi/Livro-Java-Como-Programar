package capitulo_11.figuras.figura11_7;

// Figura 11.7: UsingChainedExceptions.java
// Exce��es encadeadas.

public class UsingChainedExceptions {

	public static void main(String[] args) {

		try {
			method1();
		} catch (Exception exception) // exce��es lan�adas de method1
		{
			exception.printStackTrace();
		}

	}

	// chama method2; lan�a exce��es de volta para main
	public static void method1() throws Exception {
		try {
			method2();
		} // fim do try
		catch (Exception exception) // exce��o lan�ada de method2
		{
			throw new Exception("Exceptio thrown in method1", exception);
		}
	}

	// chama method3; lan�a exce��o de volta para method1
	public static void method2() throws Exception {
		try {
			method3();
		} catch (Exception exception) // exce��o lan�ada de method3
		{
			throw new Exception("Exception thrown in method2", exception);
		}
	}

	// lan�a Exception de volta para method2
	public static void method3() throws Exception {
		throw new Exception("Exception thrown in method3");
	}

} // fim da classe UsingChainedExceptions
