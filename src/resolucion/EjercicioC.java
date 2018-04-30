package resolucion;

import java.util.Scanner;

public class EjercicioC {
	
	public static int mcd(int numero1, int numero2) {
		if(numero2==0) {
			return numero1;
		}else if(numero2>numero1) {
			return mcd(numero2, numero1);
		}else {
			return mcd(numero2,numero1%numero2);
		}
	}
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);	
		System.out.print("Ingrese el primer numero: ");
		int a = console.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		int b = console.nextInt();
		System.out.println((a*b)/mcd(a, b));
	}
}
