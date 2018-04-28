package resolucion;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioE {
	
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
		int cantidad, i=0, numero = 0;
		ArrayList<Integer> Capicua = new ArrayList<Integer>();
		Scanner console = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de números capicua que desea: ");
		cantidad= console.nextInt();
		
		while(i<cantidad) {
			if(numero == esCapicua(numero)) {
				i++;
				Capicua.add(numero);
			}
			numero++;
		}
		
		System.out.print("Los primeros "+cantidad+ " numeros capicuas son :");
		System.out.println(Capicua);
		
		
	
		
		
	
		
	}

}
