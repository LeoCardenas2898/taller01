package resolucion;

public class Pasaporte {
	private int numPasaporte, fechaNacimiento, dni, fechaEmision, fechaVencimiento;
	private String apellidos, nombres, nacionalidad, sexo, lugarNacimiento;
	
	public Pasaporte(){
		apellidos = "Sin apellido";
		nombres = "Sin nombre";
		nacionalidad = "Sin nacionalidad";
		sexo = "No especificado";
		lugarNacimiento = "No especificado";
	}
	
	public Pasaporte(int numPasaporte, int fechaNacimiento, int dni, int fechaEmision, int fechaVencimiento, String apellidos, String nombres, String nacionalidad, String sexo, String lugarNacimiento) {
		this.numPasaporte = numPasaporte;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.nacionalidad = nacionalidad;
		this.sexo = sexo;
		this.lugarNacimiento = lugarNacimiento;
	}

	public int getNumPasaporte() {
		return numPasaporte;
	}

	public void setNumPasaporte(int numPasaporte) {
		this.numPasaporte = numPasaporte;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(int fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public int getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(int fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}	
	
}
