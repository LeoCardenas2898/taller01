package resolucion;

import java.util.Scanner;
import java.util.Vector;

public class EjercicioI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.print("Ingrese el tamaño del vector: ");
		int n = console.nextInt();
		int [] Vector = new int[n];
		System.out.println("El tamaño del vector es "+n+" y sus componentes aleatorios son: ");
		for(int i=0; i<n; i++) {
			Vector[i]=(int)(Math.random()*10);
			System.out.println("• "+Vector[i]);
		}
		
	}

}
