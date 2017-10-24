package musica;

public class NodoDoble {

	private Alumno dato;
	private NodoDoble anterior;
	private NodoDoble siguiente;
	
	public Alumno getDato() {
		return dato;
	}
	
	public void setDato(Alumno dato) {
		this.dato = dato;
	}
	
	public NodoDoble getAnterior() {
		return anterior;
	}
	
	public void setAnterior(NodoDoble anterior) {
		this.anterior = anterior;
	}
	
	public NodoDoble getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(NodoDoble siguiente) {
		this.siguiente = siguiente;
	}	
}