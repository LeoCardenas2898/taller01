package resolucion;

import java.util.Scanner;

public class EjercicioG {
	
	static String esPalindroma(String palabra) {
		String invertido="";
		for (int i = palabra.length()-1 ; i >=0; i--) {
			invertido += palabra.charAt(i);
		}
		return invertido;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		Scanner console = new Scanner(System.in);
		System.out.print("Ingrese la cadena para verificar si es palindroma o no: ");
		cadena = console.next();
		if(cadena.equals(esPalindroma(cadena))) {
			System.out.println("Es palindroma. Enhorabuena!");
		}else {
			System.out.println("No es palindroma.");
		}
		
	}

}
