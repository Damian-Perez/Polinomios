package Polinomio;

public class UtilitariosMath {
	
	public static int factorial(int n) {
		int factorial = 1;
		for (int i = 2; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static int combinatoria(int m, int n) {
		return factorial(m) / (factorial(m - n) * factorial(n));
	}
	
}
