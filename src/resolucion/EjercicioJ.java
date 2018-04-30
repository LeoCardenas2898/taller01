package resolucion;

import java.util.Random;
import java.util.Scanner;

public class EjercicioJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double suma=0, promedio, sumatoria = 0;
		Scanner console = new Scanner(System.in);
		System.out.print("Ingrese el tamaño del vector: ");
		int n = console.nextInt();
		
		int [] Vector = new int[n];
		double [] diferencia = new double[n];
		for (int j=0; j<n;j++) {
			Vector[j]=(int)(Math.random()*10);
			suma+=Vector[j];
			System.out.println("-Componente ["+(j+1)+"]: "+Vector[j]);
		}
		
		promedio = suma/(double)n;
		
		for (int i=0; i<n; i++) {
			diferencia[i] =(double)Math.pow(Vector[i]-promedio, 2);
			sumatoria+=diferencia[i];			
		}
		double desviacion=(double) Math.sqrt(sumatoria/(n-1));
		double varianza=sumatoria/(double) (n-1);
		System.out.println("El promedio del vector es: "+String.format("%.2f", promedio));
		System.out.println("La desviación estandar es: "+String.format("%.2f", desviacion));
		System.out.println("La varianza es: "+String.format("%.2f", varianza));
	
	}

}
