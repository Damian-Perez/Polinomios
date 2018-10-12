package Polinomio;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

public class PolinomioTest {
	
	String ruta = "Archivos/PolinomioGrado50.in";
	double r = 10.755519999999999;;
	double x = 0.2;
	
	
	@Test
	public void pruebaEvaluarMSucesivas() throws FileNotFoundException{
		double [] pol;
		ArchivoPolinomio reader = new ArchivoPolinomio(ruta);
		pol = reader.devolverPolinomio();
		Polinomio p = new Polinomio(pol.length - 1, pol);
		Calendar tIni = new GregorianCalendar();
		Assert.assertEquals(r, p.evaluarMSucesivas(x), 1E-8);
		Calendar tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("pruebaEvaluarMSucesivas: " + diff);
		
	}
	
	
	@Test
	public void pruebaEvaluarRecursiva() throws FileNotFoundException{
		double [] pol;
		ArchivoPolinomio reader = new ArchivoPolinomio(ruta);
		pol = reader.devolverPolinomio();
		Polinomio p = new Polinomio(pol.length - 1, pol);
		Calendar tIni = new GregorianCalendar();
		Assert.assertEquals(r, p.evaluarRecursivas(x), 1E-8);
		Calendar tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("pruebaEvaluarRecursiva: " + diff);
	}
	
	@Test
	public void pruebaEvaluarRecursivaPar() throws FileNotFoundException{
		double [] pol;
		ArchivoPolinomio reader = new ArchivoPolinomio(ruta);
		pol = reader.devolverPolinomio();
		Polinomio p = new Polinomio(pol.length - 1, pol);
		Calendar tIni = new GregorianCalendar();
		Assert.assertEquals(r, p.evaluarRecursivaPar(x), 1E-8);
		Calendar tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("pruebaEvaluarRecursivaPar: " + diff);
	}
	
	@Test
	public void pruebaEvaluarProgDinamica() throws FileNotFoundException{
		double [] pol;
		ArchivoPolinomio reader = new ArchivoPolinomio(ruta);
		pol = reader.devolverPolinomio();
		Polinomio p = new Polinomio(pol.length - 1, pol);
		System.out.println(p.evaluarProgDinamica2(x));
		Calendar tIni = new GregorianCalendar();
		Assert.assertEquals(r, p.evaluarProgDinamica2(x), 1E-8);
		Calendar tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("pruebaEvaluarProgDinamica: " + diff);
	}
	
	@Test
	public void pruebaEvaluarMejorada() throws FileNotFoundException{
		double [] pol;
		ArchivoPolinomio reader = new ArchivoPolinomio(ruta);
		pol = reader.devolverPolinomio();
		Polinomio p = new Polinomio(pol.length - 1, pol);
		Calendar tIni = new GregorianCalendar();
		Assert.assertEquals(r, p.evaluarMejorada(x), 1E-8);
		Calendar tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("pruebaEvaluarMejorada: " + diff);
	}
	
	@Test
	public void pruebaEvaluarPow() throws FileNotFoundException{
		double [] pol;
		ArchivoPolinomio reader = new ArchivoPolinomio(ruta);
		pol = reader.devolverPolinomio();
		Polinomio p = new Polinomio(pol.length - 1, pol);
		Calendar tIni = new GregorianCalendar();
		Assert.assertEquals(r, p.evaluarPow(x), 1E-8);
		Calendar tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("pruebaEvaluarPow: " + diff);
	}
	
	@Test
	public void pruebaEvaluarHorner() throws FileNotFoundException{
		double [] pol;
		ArchivoPolinomio reader = new ArchivoPolinomio(ruta);
		pol = reader.devolverPolinomio();
		Polinomio p = new Polinomio(pol.length - 1, pol);
		Calendar tIni = new GregorianCalendar();
		Assert.assertEquals(r, p.evaluarHorner(x), 1E-8);
		Calendar tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("pruebaEvaluarHorner: " + diff);
	}
	
	
	

	
	
	
	
	/*PRUEBAS NUESTRAS*/
	
	@Test
	public void MSucesivas() {
		int grado = 3;
		double[] coeficientes = {1,2,3,4};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(58, (int) polinomio.evaluarMSucesivas(3));
	}
	
	@Test
	public void MSucesivas2() {
		int grado = 2;
		double[] coeficientes = {1,2,3};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(18, (int) polinomio.evaluarMSucesivas(3));
	}
	
	@Test
	public void MSucesivas3() {
		int grado = 1;
		double[] coeficientes = {2,1};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(7, (int) polinomio.evaluarMSucesivas(3));
	}
	
	@Test
	public void MSucesivas4() {
		int grado = 0;
		double[] coeficientes = {5};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(5, (int) polinomio.evaluarMSucesivas(3));
	}
	
	@Test
	public void Recursivas() {
		int grado = 3;
		double[] coeficientes = {1,2,3,4};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(58, (int) polinomio.evaluarRecursivas(3));
	}
	
	@Test
	public void Recursivas2() {
		int grado = 2;
		double[] coeficientes = {1,2,3};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(18, (int) polinomio.evaluarRecursivas(3));
	}
	
	@Test
	public void Recursivas3() {
		int grado = 1;
		double[] coeficientes = {2,1};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(7, (int) polinomio.evaluarRecursivas(3));
	}
	
	@Test
	public void Recursivas4() {
		int grado = 0;
		double[] coeficientes = {5};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(5, (int) polinomio.evaluarRecursivas(3));
	}
	
	
	@Test
	public void RecursivasParImpar() {
		int grado = 3;
		double[] coeficientes = {1,2,3,4};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(58, (int) polinomio.evaluarRecursivasParImpar(3));
	}
	
	@Test
	public void RecursivasParImpar2() {
		int grado = 2;
		double[] coeficientes = {1,2,3};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(18, (int) polinomio.evaluarRecursivasParImpar(3));
	}
	
	@Test
	public void RecursivasParImpar3() {
		int grado = 1;
		double[] coeficientes = {2,1};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(7, (int) polinomio.evaluarRecursivasParImpar(3));
	}
	
	@Test
	public void RecursivasParImpar4() {
		int grado = 0;
		double[] coeficientes = {5};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(5, (int) polinomio.evaluarRecursivasParImpar(3));
	}
	
	@Test
	public void ProgDinamica() {
		int grado = 3;
		double[] coeficientes = {1,2,3,4};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(58, (int) polinomio.evaluarProgDinamica(3));
	}
	
	@Test
	public void ProgDinamica2() {
		int grado = 2;
		double[] coeficientes = {1,2,3};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(18, (int) polinomio.evaluarProgDinamica(3));
	}
	
	@Test
	public void ProgDinamica3() {
		int grado = 1;
		double[] coeficientes = {2,1};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(7, (int) polinomio.evaluarProgDinamica(3));
	}
	
	@Test
	public void ProgDinamica4() {
		int grado = 0;
		double[] coeficientes = {5};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(5, (int) polinomio.evaluarProgDinamica(3));
	}
	
	@Test
	public void Pow() {
		int grado = 3;
		double[] coeficientes = {1,2,3,4};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(58, (int) polinomio.evaluarPow(3));
	}
	
	@Test
	public void Pow2() {
		int grado = 2;
		double[] coeficientes = {1,2,3};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(18, (int) polinomio.evaluarPow(3));
	}
	
	@Test
	public void Pow3() {
		int grado = 1;
		double[] coeficientes = {2,1};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(7, (int) polinomio.evaluarPow(3));
	}
	
	@Test
	public void Pow4() {
		int grado = 0;
		double[] coeficientes = {5};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(5, (int) polinomio.evaluarPow(3));
	}
	
	@Test
	public void ProgDinamicaV2() {
		int grado = 3;
		double[] coeficientes = {1,2,3,4};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(58, (int) polinomio.evaluarProgDinamica2(3));
	}
	
	@Test
	public void ProgDinamicaV22() {
		int grado = 2;
		double[] coeficientes = {1,2,3};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(18, (int) polinomio.evaluarProgDinamica2(3));
	}
	
	@Test
	public void ProgDinamicaV23() {
		int grado = 1;
		double[] coeficientes = {2,1};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(7, (int) polinomio.evaluarProgDinamica2(3));
	}
	
	@Test
	public void ProgDinamicaV24() {
		int grado = 0;
		double[] coeficientes = {5};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(5, (int) polinomio.evaluarProgDinamica2(3));
	}
	
	@Test
	public void Mejorada() {
		int grado = 3;
		double[] coeficientes = {1,2,3,4};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(58, (int) polinomio.evaluarMejorada(3));
	}
	
	@Test
	public void Mejorada2() {
		int grado = 2;
		double[] coeficientes = {1,2,3};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(18, (int) polinomio.evaluarMejorada(3));
	}
	
	@Test
	public void Mejorada3() {
		int grado = 1;
		double[] coeficientes = {2,1};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(7, (int) polinomio.evaluarMejorada(3));
	}
	
	@Test
	public void Mejorada4() {
		int grado = 0;
		double[] coeficientes = {5};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(5, (int) polinomio.evaluarMejorada(3));
	}
	
	@Test
	public void PowV2() {
		int grado = 3;
		double[] coeficientes = {1,2,3,4};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(58, (int) polinomio.evaluarPow2(3));
	}
	
	@Test
	public void PowV22() {
		int grado = 2;
		double[] coeficientes = {1,2,3};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(18, (int) polinomio.evaluarPow2(3));
	}
	
	@Test
	public void PowV23() {
		int grado = 1;
		double[] coeficientes = {2,1};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(7, (int) polinomio.evaluarPow2(3));
	}
	
	@Test
	public void PowV24() {
		int grado = 0;
		double[] coeficientes = {5};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(5, (int) polinomio.evaluarPow2(3));
	}
	
	@Test
	public void Horner() {
		int grado = 3;
		double[] coeficientes = {1,2,3,4};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(58, (int) polinomio.evaluarHorner(3));
	}
	
	@Test
	public void Horner2() {
		int grado = 2;
		double[] coeficientes = {1,2,3};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(18, (int) polinomio.evaluarHorner(3));
	}
	
	@Test
	public void Horner3() {
		int grado = 1;
		double[] coeficientes = {2,1};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(7, (int) polinomio.evaluarHorner(3));
	}
	
	@Test
	public void Horner4() {
		int grado = 0;
		double[] coeficientes = {5};
		Polinomio polinomio = new Polinomio(grado,coeficientes);
		Assert.assertEquals(5, (int) polinomio.evaluarHorner(3));
	}
}