package resolucion;

import java.util.Scanner;
import java.util.Vector;

public class EjercicioI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.print("Ingrese el tama�o del vector: ");
		int n = console.nextInt();
		Vector<Integer> vector = new Vector<Integer>(n);
		vector.addElement(2);
		vector.addElement(2);
		vector.addElement(2);
		System.out.println(vector.size());
	}

}
