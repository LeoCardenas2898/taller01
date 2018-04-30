package resolucion;

public class ManejarClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pasaporte hola = new Pasaporte();
		//hola.setApellidos("Cárdenas");
		System.out.println(hola.getApellidos());
		
		EstudianteUNTELS estudianteUNTELS = new EstudianteUNTELS();
		estudianteUNTELS.setNombres("Leonardo");
		System.out.println(estudianteUNTELS.getNombres());

	}

}
