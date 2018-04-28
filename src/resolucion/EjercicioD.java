package resolucion;

import java.util.Scanner;

public class EjercicioD {
	
	static int esCapicua(int dato) {
		int res = 0, invertir = 0;
		while(dato!=0) {
			res=dato%10; 
			invertir=invertir*10+res;
			dato=dato/10;			
		}
		
		return invertir;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0, invertido = 0;
		Scanner console = new Scanner(System.in);
		System.out.print("Ingrese el numero para verificar si es capicua: ");
		numero = console.nextInt();
		invertido = esCapicua(numero);
		if(numero == invertido) {
			System.out.println("Es un numero capicua. ");
		}else {
			System.out.println("No es capicua. ");
		}
			
	}
	
}
