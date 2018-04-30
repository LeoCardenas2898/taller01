package resolucion;

public class Persona {
	private String nombres, apellidos, sexo, direccion, lugarNacimiento;
	private int dni, numMovil, fechaNacimiento;
	
	public Persona() {
		
	}

	public Persona(String nombres, String apellidos, String sexo, String direccion, String lugarNacimiento, int dni, int numMovil, int fechaNacimiento) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.direccion = direccion;
		this.lugarNacimiento = lugarNacimiento;
		this.dni = dni;
		this.numMovil = numMovil;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getNumMovil() {
		return numMovil;
	}

	public void setNumMovil(int numMovil) {
		this.numMovil = numMovil;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
