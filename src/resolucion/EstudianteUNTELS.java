package resolucion;

public class EstudianteUNTELS extends Persona{
	private int codigoEstudiante, fechaIngreso;
	private String carrera;
	private Boolean carneUniversitario;
	
	public EstudianteUNTELS() {
		
	}

	public EstudianteUNTELS(int codigoEstudiante, int fechaIngreso, String carrera, Boolean carneUniversitario) {
		this.codigoEstudiante = codigoEstudiante;
		this.fechaIngreso = fechaIngreso;
		this.carrera = carrera;
		this.carneUniversitario = carneUniversitario;
	}

	public int getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(int codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public int getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(int fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public Boolean getCarneUniversitario() {
		return carneUniversitario;
	}

	public void setCarneUniversitario(Boolean carneUniversitario) {
		this.carneUniversitario = carneUniversitario;
	}

}
