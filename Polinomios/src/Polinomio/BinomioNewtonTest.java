package Polinomio;

import org.junit.Assert;
import org.junit.Test;

public class BinomioNewtonTest {
	
	@Test
	public void testBinomioNewtonVsPolinomioConHornerEstatico() {
		BinomioNewton binomio = new BinomioNewton(2, 1, 2);
		Polinomio p = new Polinomio(2, binomio.obtenerCoeficientesEstatica());
		double[] coeficientes = {1, 4, 4};
		Polinomio q = new Polinomio(2, coeficientes);
		Assert.assertEquals(p.evaluarHorner(2), q.evaluarHorner(2),1E-8);
	}
	
	@Test
	public void testBinomioNewtonVsPolinomioConHornerEstatico2() {
		BinomioNewton binomio = new BinomioNewton(4, 2, 2);
		Polinomio p = new Polinomio(2,binomio.obtenerCoeficientesEstatica());
		double[] coeficientes = {4, 16, 16};
		Polinomio q = new Polinomio(2, coeficientes);
		Assert.assertEquals(p.evaluarHorner(2), q.evaluarHorner(2),1E-8);
	}

	
	@Test
	public void testBinomioNewtonRecursivoConPolinomioDinamico() {
		BinomioNewton binomio = new BinomioNewton(2, 1, 2);
		Polinomio p = new Polinomio(2, binomio.obtenerCoeficientesDinamica());
		double[] coeficientes = {4, 4, 1};
		Polinomio q = new Polinomio(2, coeficientes);
		System.out.println(p + " " + q);
		Assert.assertEquals(p.evaluarHorner(2), q.evaluarHorner(2),1E-8);
	}
	
	@Test
	public void testBinomioNewtonRecursivoConPolinomioDinamico2() {
		BinomioNewton binomio = new BinomioNewton(4, 2, 2);
		Polinomio p = new Polinomio(2,binomio.obtenerCoeficientesDinamica());
		double[] coeficientes = {16, 16, 4};
		Polinomio q = new Polinomio(2, coeficientes);
		Assert.assertEquals(p.evaluarProgDinamica(2), q.evaluarProgDinamica(2),1E-8);
	}
	
	@Test
	public void testBinomioNewtonVsPolinomioConHornerRecursiva() {
		BinomioNewton binomio = new BinomioNewton(2, 1, 2);
		Polinomio p = new Polinomio(2, binomio.obtenerCoeficientesRecursiva());
		double[] coeficientes = {4, 4, 1};
		Polinomio q = new Polinomio(2, coeficientes);
		Assert.assertEquals(p.evaluarHorner(2), q.evaluarHorner(2),1E-8);
	}
	
	@Test
	public void testBinomioNewtonVsPolinomioConHornerRecursiva2() {
		BinomioNewton binomio = new BinomioNewton(4, 2, 2);
		Polinomio p = new Polinomio(2,binomio.obtenerCoeficientesRecursiva());
		double[] coeficientes = {16, 16, 4};
		Polinomio q = new Polinomio(2, coeficientes);
		Assert.assertEquals(p.evaluarHorner(2), q.evaluarHorner(2),1E-8);
	}
	
}
