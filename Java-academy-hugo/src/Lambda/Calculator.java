package Lambda;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Enteros suma = (n1,n2) -> n1 + n2;
		Enteros resta = (n1,n2)-> n1 - n2;
		Bolean esPar = (n1) -> (n1 % 2) == 0 ? true : false; 
		Factorial esPrimo = (n1) -> {
			for( int i = 2; i < n1 ; i ++) {
				if(n1 % i == 0) {
					return false;
				}				
			}
			return true;
		};
		
		System.out.println(Calculatoradd(suma, 4, 6));
		System.out.println(resta.operacion(40, 10));
		System.out.println(esPar.isOdd(7));
		System.out.println(esPrimo.factorial(3));
	}
	
	
	public static int Calculatoradd(Enteros lf, int n1, int n2) {
		return lf.operacion(n1, n2);
	}

}

interface Enteros {
	int operacion(int n1, int n2);
}

interface Bolean {
	boolean isOdd(int n2);
}

interface Factorial {
	boolean factorial(int n2);
}

