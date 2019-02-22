package capitulo_05.teste;

public class teste {

	public static void main(String[] args) {
		int x=0,a=0,b=0,g=0,y=0,i=0,j=0;
		boolean A,B,C;

//		a) !( x < 5  ) && !( y >= 7 )
		A=( x < 5  ); B=( y >= 7 );
		A=!A; B=!B;
		C=(A && B);
		System.out.print(C + " == ");
		A=( x < 5  ); B=( y >= 7 );
		C=(A || B);
		C=!C;
		System.out.println(C);

//		b) !( a == b  ) || !( g != 5 )
		A=( a == b ); B=( g != 5 );
		A=!A; B=!B;
		C=(A || B);
		System.out.print(C + " == ");
		A=( a == b ); B=( g != 5 );
		C=(A && B);
		C=!C;
		System.out.println(C);


//		c) !( ( x <= 8  ) && ( y > 4 ) )
		A=( x <= 8  ); B=( y > 4 );
		C=(A && B);
		C=!C;
		System.out.print(C + " == ");
		A=( x <= 8  ); B=( y > 4 );
		A=!A; B=!B;
		C=(A || B);
		System.out.println(C);

//		d) !( ( i > 4  ) || ( j <= 6 ) )
		A=( i > 4  ); B=( j <= 6 );
		C=(A || B);
		C=!C;
		System.out.print(C + " == ");
		A=( i > 4  ); B=( j <= 6 );
		A=!A;B=!B;
		C=(A && B);
		System.out.println(C);
	}
}
