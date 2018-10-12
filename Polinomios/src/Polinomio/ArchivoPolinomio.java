package Polinomio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArchivoPolinomio {
	private String ruta;

	//Contructor
	public ArchivoPolinomio (String ruta) {
		this.ruta = ruta;
	}
	
	//Lectura de Archivo
		public double [] devolverPolinomio () throws FileNotFoundException {
			Scanner sc = new Scanner(new File(this.ruta));
			int grado = sc.nextInt();
			double vec [] = new double[grado + 1];
			for (int i=0; i < grado+1; i++){
				vec [i]=sc.nextDouble();
			}
			sc.close();
			
			return vec;
		}
}