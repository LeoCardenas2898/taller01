package resolucion;

import java.util.Scanner;

public class EjercicioC {
	
	public static int mcm(int a, int b) {
		int resultado = 0;
		
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);	
		System.out.print("Ingrese el primer numero: ");
		int a = console.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		int b = console.nextInt();
		System.out.println("El MCM de "+a+" y "+b+" es "+mcm(a, b));
		
	}

}
