package resolucion;

import java.util.Scanner;

public class EjercicioB {
	
	public static int complemento(int numero) {
		int cant = 0;
		while(numero!=0){ 
			numero = numero/10;
			cant++;
			}
		return cant;
	}

	public static void main(String[] args) {
		
		int a, numero, resultado = 0;
		Scanner console = new Scanner(System.in);
		System.out.print("Ingrese el numero que desees obtener su complemento: ");
		numero  = console.nextInt();
		resultado = (int) Math.pow(10, complemento(numero)) - numero;
		System.out.println("Su complemento es: "+ resultado);
		
	}

}
