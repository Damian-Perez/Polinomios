package Polinomio;

public class UtilitariosMath {
	
	//Complejidad: O(n)
	static double factorial(double n) {
		double r=1;
		for(double i=n;i>1;i--)
			r*=i;
		return r;
	}
	
	//Complejidad: O(n)
	static double combinatorio(double m, double n) {
		return factorial(m)/(factorial(n)*factorial(m-n));
	}
	
	//Complejidad: O(2^n)
	static double combinatorioRecursivo(double n, double k) {
		if(k==0||k==n)
			return 1;
		if(k>n)
			return 0;
		return combinatorioRecursivo(n-1, k-1) + combinatorioRecursivo(n-1, k);	
	}
	
	//Calculo el triangulo de Tartaglia mediante programacion dinamica
	//Complejidad: O(n²)
	static double [] trianguloTartaglia(int n) 	{
		double [][]m=new double[n+1][n+1];
		for(int i=0;i<=n;i++)
			for(int j=0;j<=i;j++)
				m[i][j]=j==0||j==i?1:m[i-1][j]+m[i-1][j-1];
		return m[n];
	}
	
	
}
