package Polinomio;

public class BinomioNewton {

	int a, b, n;
	
	public BinomioNewton(int a, int b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}
	
	public int coeficienteK(int k) {
		return (int) (UtilitariosMath.combinatoria(n, k) * Math.pow(a, k) * Math.pow(b, n - k));
	}

	public Polinomio obtenerCoeficientes() {
		
		double[] coeficientes = new double[n + 1];
		
		for (int i = 0; i < coeficientes.length; i++) {
			coeficientes[i] = coeficienteK(i);
		}
		
		return new Polinomio(coeficientes.length - 1, coeficientes);
	}
	
	
}
