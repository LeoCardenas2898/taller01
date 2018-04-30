package resolucion;

class ComenzarJuego {
	private String NuevoJuego;
		
	public ComenzarJuego() {
		NuevoJuego="Nivel 1";	
	}
	
	public String ReanudarJuego(Boolean cargaDatos) {
			if(cargaDatos==true) {
				return "Datos Cargados.";
			}else {
				return "No se encuentra datos. Seleccione en comenzar juego.";
			}
	}

	public String getNuevoJuego() {
		return NuevoJuego;
	}

	public void setNuevoJuego(String nuevoJuego) {
		NuevoJuego = nuevoJuego;
	}

}

class Personaje extends ComenzarJuego{
	private String personaje;
	
	Personaje(){
		personaje = "No tienes un personaje seleccionado.";
	}
	
	public Personaje(String personaje) {
		this.personaje = personaje;
	}
	
	public String getPersonaje() {
		return personaje;
	}

	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}
}

public class MarioBros {
	
	public static void main(String[] args) {
		Personaje personaje = new Personaje("Luigui");
		System.out.println("Estoy eligiendo a "+personaje.getPersonaje());
		System.out.print(personaje.ReanudarJuego(true));
		
	}

}