package capitulo_06.ex_6_16;

import java.util.Scanner;

public class Ex_6_16 {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("d�gite dois n�meros inteiros:");
		a= input.nextInt();
		b= input.nextInt();
		
		if(isMultiple(a, b))
			System.out.printf("%d � m�ltiplo de %d", b,a);
		else
			System.out.printf("%d n�o � m�ltiplo de %d", b,a);
		
		
		
		
		
		
		
		
	}

	
	public static boolean isMultiple(int a, int b) {
		
		if(a%b==0)
			return true;
		else
			return false;
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
