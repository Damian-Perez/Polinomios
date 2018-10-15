package Polinomio;

public class Polinomio {
	public int grado ;
	public double [ ] coeficientes;
	
	public Polinomio(int grado, double[] coeficientes) {
		this.grado = grado;
		this.coeficientes = coeficientes;
	}

	
	//Complejidad: O(n²)
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
	
	
	//Complejidad: O(n²)
	double evaluarRecursivas(double x) {
		double res = 0;
		for (int i = 0; i < this.coeficientes.length; i++) {
			res += this.coeficientes[i] * potenciaR(x,this.grado-i);
		}
		return res;
	}
	
	//Complejidad: O(n log n)
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
	
	//Complejidad: O(n log n)
	double evaluarRecursivasParImpar(double x ) {
		double res = 0;
		for (int i = 0; i < this.coeficientes.length; i++) {
			res += this.coeficientes[i] * potenciaRParImpar(x, this.grado-i);
		}
		return res;
	}
	
	//Complejidad: O(n)
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
	
	
	/*Complejidad: O(n)
	  
	Nota: Es seguro asumir que el metodo Math.pow tiene una complejidad computacional O(1)
	Fuentes: https://stackoverflow.com/questions/32418731/java-math-powa-b-time-complexity
	*/
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
	
	//Complejidad: O(n)
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

	//Complejidad: O(n)
	double evaluarMejorada(double x) {
		double resultado = 0;
		for (int i = 0; i < this.coeficientes.length; i++) {
			resultado = resultado * x + this.coeficientes[i];
		}
		return resultado;
	}

	
	//Complejidad: O(n)
	public double evaluarHorner(double x) {
		Double resultado = this.coeficientes[0];
		for (int i = 1; i < this.coeficientes.length; i++) {
			resultado = (resultado * x) + this.coeficientes[i];
		}
		return resultado;
	}
	
	
	
	public double potencia(double x, int n) {
		double resultado = 1;
		
		for (int i = 1; i <= n; i++) {
			resultado *= x;
		}
		return resultado;
	}
	
	public double potenciaR(double x, int n) {
		if(n != 0)
			return x * potenciaR(x, n-1);
		return 1;
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
	
}