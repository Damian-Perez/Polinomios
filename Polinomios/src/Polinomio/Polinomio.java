package Polinomio;

public class Polinomio {
	public int grado ;
	public double [ ] coeficientes;
	
	public Polinomio(int grado, double[] coeficientes) {
		this.grado = grado;
		this.coeficientes = coeficientes;
	}

	double evaluarMSucesivas (double x ) {
		double acumTerminos = 0;
		double res = 0;
		
		for (int i = 0; i < this.coeficientes.length; i++) {
			acumTerminos = this.coeficientes[i] * potencia(x,this.grado);
			this.grado--;
			res += acumTerminos;
		}
		return res;
	}
	
	public double potencia(double x, int n) {
		double resultado = 1;
		
		for (int i = 1; i <= n; i++) {
			resultado *= x;
		}
		return resultado;
	}
	
	double evaluarRecursivas(double x) {
		double acumTerminos = 0;
		double res = 0;
		
		for (int i = 0; i < this.coeficientes.length; i++) {
			acumTerminos = this.coeficientes[i] * potenciaR(x,this.grado);
			this.grado--;
			res += acumTerminos;
		}
		return res;
	}
	
	public double potenciaR(double x, int n) {
		if(n != 0)
			return x * potenciaR(x, n-1);
		return 1;
	}
	
	double evaluarRecursivasParImpar(double x ) {
		double acumTerminos = 0;
		double res = 0;
		
		for (int i = 0; i < this.coeficientes.length; i++) {
			acumTerminos = this.coeficientes[i] * potenciaRParImpar(x,this.grado);
			this.grado--;
			res += acumTerminos;
		}
		return res;
	}
	
	
	public double evaluarRecursivaPar(double x) {
		double resultadoTermino;
		double resultado = 0;
		for (int i = 0; i < this.grado + 1; i++) {
			resultadoTermino = potenciaPar(x, this.grado - i);
			resultadoTermino *= this.coeficientes[i];
			resultado += resultadoTermino;
		}
		return resultado;
	}
	
	private double potenciaPar(double x, double n) {
		if (n > 0) {
			if (n % 2 == 0) {
				return (potenciaPar(x * x, n / 2));
			} else {
				return (x * potenciaPar(x, n - 1));
			}
		}
		return 1;
	}
	
	public double potenciaRParImpar(double x, int n) {	
		if(n != 0) {
			if (n%2 == 0)
				return (int) (potenciaRParImpar(x*x, n/2));
			else
				return (int) (x * potenciaRParImpar(x, n-1));
		}
		return 1;
	}
	
	double evaluarProgDinamica(double x) {
		double acumTerminos = 0;
		double res = 0;
		double[] potencias = new double[this.coeficientes.length];
		potencias[0] = 1;
		
		for(int i = 1; i < potencias.length; i++) {
			potencias[i] = x * potencias[i-1];
		}
		
		for (int i = 0; i < this.coeficientes.length; i++) {
			acumTerminos = this.coeficientes[i] * potencias[this.grado];
			this.grado--;
			res += acumTerminos;
		}
		return res;
	}
	
	double evaluarPow (double x ) {
		double acumTerminos = 0;
		double res = 0;
		
		for (int i = 0; i < this.coeficientes.length; i++) {
			acumTerminos = this.coeficientes[i] * Math.pow(x,this.grado);
			this.grado--;
			res += acumTerminos;
		}
		return res;
	}
	
	public double evaluarProgDinamica2(double x) {
		double resultadox = 1;
		double resultado = 0;
		resultado = this.coeficientes[this.grado];
		for (int i = this.grado - 1; i >= 0; i--) {
			resultadox *= x;
			resultado += resultadox * this.coeficientes[i];
		}
		return resultado;
	}

	double evaluarMejorada(double x) {
		double resultado = 0;
		for (int i = 0; i < this.coeficientes.length; i++) {
			resultado = resultado * x + this.coeficientes[i];
		}
		return resultado;
	}

	public double evaluarPow2(double x) {
		double resultadoTermino = 0;
		double resultado = 0;
		for (int i = 0; i < this.grado + 1; i++) {
			resultadoTermino = Math.pow(x, this.grado - i) * this.coeficientes[i];
			resultado += resultadoTermino;
		}
		return resultado;

	}

	public double evaluarHorner(double x) {
		Double resultado = this.coeficientes[0];
		for (int i = 1; i < this.coeficientes.length; i++) {
			resultado = (resultado * x) + this.coeficientes[i];
		}
		return resultado;
	}
	
}