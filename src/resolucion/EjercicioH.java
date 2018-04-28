package resolucion;

import java.util.Scanner;

public class EjercicioH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad, ceros;
		int i=0;
		Scanner console = new Scanner(System.in);
		System.out.print("¿De cuantas filas desea el patron de * ?:  ");
		cantidad = console.nextInt();
		if(cantidad==1) {
			System.out.println("*");
		}else {
			System.out.println("*");
			while(i<cantidad-1) {
				for(ceros=1; ceros<=i+1;ceros++) {
					System.out.print("*");
					if(i==ceros-1) {
						System.out.println("*");
					}
				}
				i++;
			}		
		}		
	}
	
}
