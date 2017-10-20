package musica1;

public class Musica {

	private String id;
	private String album;
	private String artista;
	private String genero;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	@Override
	public String toString() {
		return "Datos "+" ID: "+id+" Album "+album+ "Artista: "+artista+" Genero: "+genero;
	}
	
	public int compareTo(Object o) {
		Musica temporal=(Musica) o;
		return this.id.compareTo(temporal.getId());
	}
}
