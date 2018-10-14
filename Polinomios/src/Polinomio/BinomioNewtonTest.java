package Polinomio;

import org.junit.Assert;
import org.junit.Test;

public class BinomioNewtonTest {
	
	@Test
	public void testBinomioNewtonVsPolinomioConHorner() {
		BinomioNewton binomio = new BinomioNewton(2, 1, 2);
		Polinomio p = binomio.obtenerCoeficientes();
		double[] coeficientes = {1, 4, 4};
		Polinomio q = new Polinomio(2, coeficientes);
		Assert.assertEquals(p.evaluarHorner(2), q.evaluarHorner(2),1E-8);
	}
	
	@Test
	public void testBinomioNewtonVsPolinomioConHorner2() {
		BinomioNewton binomio = new BinomioNewton(4, 2, 2);
		Polinomio p = binomio.obtenerCoeficientes();
		double[] coeficientes = {4, 16, 16};
		Polinomio q = new Polinomio(2, coeficientes);
		Assert.assertEquals(p.evaluarHorner(2), q.evaluarHorner(2),1E-8);
	}
	
	@Test
	public void testBinomioNewtonVsPolinomioConevaluarProgDinamica() {
		BinomioNewton binomio = new BinomioNewton(2, 1, 2);
		Polinomio p = binomio.obtenerCoeficientes();
		double[] coeficientes = {1, 4, 4};
		Polinomio q = new Polinomio(2, coeficientes);
		Assert.assertEquals(p.evaluarHorner(2), q.evaluarHorner(2),1E-8);
	}
	
	@Test
	public void testBinomioNewtonVsPolinomioConevaluarProgDinamica2() {
		BinomioNewton binomio = new BinomioNewton(4, 2, 2);
		Polinomio p = binomio.obtenerCoeficientes();
		double[] coeficientes = {4, 16, 16};
		Polinomio q = new Polinomio(2, coeficientes);
		Assert.assertEquals(p.evaluarProgDinamica(2), q.evaluarProgDinamica(2),1E-8);
	}

}
