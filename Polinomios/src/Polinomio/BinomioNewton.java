package Polinomio;

public class BinomioNewton {

	int a, b, n;
	
	public BinomioNewton(int a, int b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}
	
	public int terminoK(int k) {
		return (int) (UtilitariosMath.combinatorio(n, k) * Math.pow(a, k) * Math.pow(b, n - k));
	}
	
	//Complejidad: O(n²)
	public double[] obtenerCoeficientesEstatica() {
		double[] coeficientes = new double[n + 1];
		for (int i = 0; i < coeficientes.length; i++) {
			coeficientes[i] = terminoK(i);
		}
		return coeficientes;
	}
	
	//Complejidad: O(n*2^n)
	public double[] obtenerCoeficientesRecursiva() {
		double v[] = new double[n+1];
		double k;
		for(int i = 0; i < v.length; i++)
			v[i] = UtilitariosMath.combinatorioRecursivo(n, k = n-i) * Math.pow(a, k) * Math.pow(b, n-k);
		System.out.println(v);
		return v;
	}
	
	//Complejidad: O(n²)
	public double [] obtenerCoeficientesDinamica()
	{
		double[] v = UtilitariosMath.trianguloTartaglia(n);
		for(int i = 0; i < v.length; i++)
			v[i] *= (Math.pow(a, n--) * Math.pow(b, i));
		return v;
	}
	
	
}
