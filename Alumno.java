package musica;

public class Alumno implements Comparable<Object>{
	private String nombre;
	private String matricula;
	private Double promedio;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Double getPromedio() {
		return promedio;
	}
	
	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}

	@Override
	public int compareTo(Object objeto) {
		Alumno temporal = (Alumno) objeto;
		return this.matricula.compareTo(temporal.getMatricula());
	}

	@Override
	public String toString() {
		return "Alumno [Nombre=" + nombre + ", Matricula=" + matricula + ", Promedio=" + promedio + "]";
	}
	
	
}