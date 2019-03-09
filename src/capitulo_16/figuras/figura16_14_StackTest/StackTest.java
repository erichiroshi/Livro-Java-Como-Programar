package capitulo_16.figuras.figura16_14_StackTest;

import java.util.EmptyStackException;
import java.util.Stack;

// Figura 16.14: StackTest.java
// classe Stack do pacote java.util.

public class StackTest {

	public static void main(String[] args) {

		Stack<Number> stack = new Stack<>(); // cria uma Stack

		printStack(stack);
		
		// utiliza método push
		stack.push(12L); // insere o valor long 12L
		System.out.println("Pushed 12L");
		printStack(stack);

		stack.push(34567); // insere o valor int 34567
		System.out.println("Pushed 34567");
		printStack(stack);

		stack.push(1.0F); // insere o valor float 1.0F
		System.out.println("Pushed 1.0F");
		printStack(stack);

		stack.push(1234.5678); // insere o valor double 1234.5678
		System.out.println("Pushed 1234.5678");
		printStack(stack);

		// remove itens da pilha
		try {
			Number removedObject = null;
			
			// remove elementos da pilha
			while (true) {
				
				removedObject = stack.pop(); // utiliza o método pop
				System.out.printf("Popped %s%n", removedObject);
				printStack(stack);
			}
		} catch (EmptyStackException e) {
			
			e.printStackTrace();
		}

	}

	// exibe o conteúdo de Stack
	private static void printStack(Stack<Number> stack) {

		if (stack.isEmpty())
			System.out.printf("stack is empty%n%n"); // a pilha está vazia
		else // a pilha não está vazia
			System.out.printf("stack contains: %s (top)%n", stack);
	}

} // fim da classe StackTest
