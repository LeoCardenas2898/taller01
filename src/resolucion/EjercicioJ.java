package resolucion;

import java.util.Random;
import java.util.Scanner;

public class EjercicioJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.print("Ingrese el tamaño del vector: ");
		int n = console.nextInt();
		int [] Vector = new int[n];
		for(int i=0; i<n; i++) {
			Vector[i]=(int)(Math.random()*10);
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(Vector[i]);
		}
	}

}
