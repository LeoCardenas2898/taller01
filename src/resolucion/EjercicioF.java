package resolucion;

import java.util.Scanner;

public class EjercicioF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad, ceros;
		int i=0;
		Scanner console = new Scanner(System.in);
		System.out.print("¿De cuantas filas desea la matriz triangular? ");
		cantidad = console.nextInt();
		if(cantidad==1) {
			System.out.println("1");
		}else {
			System.out.println("1");
			while(i<cantidad-1) {
				for(ceros=1; ceros<=i+1;ceros++) {
					System.out.print("0");
					if(i==ceros-1) {
						System.out.println("1");
					}
				}
				i++;
			}		
		}		
	}
}
