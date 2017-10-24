package musica;

public class TestListaDoble {
	
	private NodoDoble head;
	
	public TestListaDoble(){
		this.setHead(null);
	}

	public NodoDoble getHead() {
		return head;
	}

	public void setHead(NodoDoble head) {
		this.head = head;
	}
	
	public boolean isVacio(){
		if(this.getHead()==null){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean agregar(Alumno alumno){
		NodoDoble nuevoAlumno = new NodoDoble();
		nuevoAlumno.setDato(alumno);
		nuevoAlumno.setAnterior(null);
		nuevoAlumno.setSiguiente(null);
		if(this.isVacio()){
			this.setHead(nuevoAlumno);
			return true;
		}
		else{
			NodoDoble temporal = new NodoDoble();
			nuevoAlumno.setDato(alumno);
			temporal=this.getHead();
			int n = nuevoAlumno.getDato().getMatricula().compareTo(this.getHead().getDato().getMatricula());
			if(n<0){
				this.setHead(nuevoAlumno);
				nuevoAlumno.setSiguiente(temporal);
				nuevoAlumno.setAnterior(null);
				return true;
			}
			else{
				while(temporal.getSiguiente()!=null){
					if(nuevoAlumno.getDato().getMatricula().compareTo(temporal.getDato().getMatricula())<0){
					}
					temporal=temporal.getSiguiente();
				}
				temporal.setSiguiente(nuevoAlumno);
				nuevoAlumno.setAnterior(temporal);
				nuevoAlumno.setSiguiente(null);
				return true;
			}
		}
	}
	
	public StringBuilder recorrerDerecha(){
		StringBuilder cadena = new StringBuilder();
		NodoDoble temporal = new NodoDoble();
		temporal=this.getHead();
		cadena.append("HEAD<-->");
		while(temporal!=null){
			cadena.append(temporal.getDato());
			cadena.append("<-->");
			temporal=temporal.getSiguiente();
		}
		cadena.append("NULL");
		return cadena;
	}

	public StringBuilder recorrerIzquierda(){
		StringBuilder cadena = new StringBuilder();
		NodoDoble temporal = new NodoDoble();
		temporal=this.getHead();
		cadena.append("NULL<-->");
		while(temporal!=null){
			System.out.println(temporal.getDato());
			temporal=temporal.getSiguiente();
		}
		
		while(temporal!=null){
			System.out.println(temporal.getDato());
			cadena.append(temporal.getDato());
			cadena.append("<-->");
			temporal=temporal.getAnterior();
			if(temporal==this.getHead()){
				cadena.append(temporal.getDato());
				cadena.append("<-->");
			}
		}
		cadena.append("HEAD");
		return cadena;
	}
}