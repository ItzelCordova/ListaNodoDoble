package musica1;

public class NodoDoble {
	private Musica dato;
	private NodoDoble anterior;
	private NodoDoble siguiente;
	
	public NodoDoble(Musica dat, NodoDoble ant, NodoDoble sig) {
		siguiente=sig;
		anterior=ant;
		dato=dat;
		
	}

	public Musica getDato() {
		return dato;
	}

	public void setDato(Musica dato) {
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
