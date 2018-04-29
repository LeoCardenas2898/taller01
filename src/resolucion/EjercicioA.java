package resolucion;

import java.util.Scanner;

public class EjercicioA {
	
	public static void  metodo1(Double a) {
		Double b = a/180;
		System.out.println(a+" equivale a "+String.format("%.2f", b)+"pi");
	}
	
	public static void  metodo2(Double numero2) {
		Double b = numero2*180;
		System.out.println(numero2+"pi"+" equivale a "+b+"°");
	}

	public static void main(String[] args) {
		double numero,numero1;
		int key;
		Scanner console = new Scanner(System.in);
		System.out.println("Ingrese una opcion:");
		System.out.println("1: De Grados decimales a Radianes");
		System.out.println("2: De Radianes a Grados decimales");
		key=console.nextInt();
		switch (key) {
		case 1:
			System.out.print("Ingrese el numero en grados: ");
			numero=console.nextDouble();
			metodo1(numero);
			break;

		case 2:
			System.out.print("Ingrese el numero en radianes: ");
			numero1=console.nextDouble();
			metodo2(numero1);
			break;
			
		default:
			System.out.println("No ingreso un dato valido.");
			break;
		}
	}
}
