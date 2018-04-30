package resolucion;

public class TrabajadorUNTELS extends Persona{
	private String areaTrabajo, horarioEntrada, horarioSalida;
	private int fechaIngreso, horasExtras;
	private Boolean seguro;
	
	public TrabajadorUNTELS() {
		
	}

	public TrabajadorUNTELS(String areaTrabajo, String horarioEntrada, String horarioSalida, int fechaIngreso, int horasExtras, Boolean seguro) {
		this.areaTrabajo = areaTrabajo;
		this.horarioEntrada = horarioEntrada;
		this.horarioSalida = horarioSalida;
		this.fechaIngreso = fechaIngreso;
		this.horasExtras = horasExtras;
		this.seguro = seguro;
	}

	public String getAreaTrabajo() {
		return areaTrabajo;
	}

	public void setAreaTrabajo(String areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}

	public String getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(String horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public String getHorarioSalida() {
		return horarioSalida;
	}

	public void setHorarioSalida(String horarioSalida) {
		this.horarioSalida = horarioSalida;
	}

	public int getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(int fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public Boolean getSeguro() {
		return seguro;
	}

	public void setSeguro(Boolean seguro) {
		this.seguro = seguro;
	}

}
