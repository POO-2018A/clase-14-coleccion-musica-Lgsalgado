package musica;

public class Album {
    private String nombre;
    private int anio;
    private Genero genero;
    private Artista artista;
    private int nCanciones;

    public Album(String nombreAlbumn, int anio, String nombreGenero, int nCancionces) {
    }

    public Album(String nombre, int anio, Genero genero, int nCanciones) {
        this.nombre = nombre;
        this.anio = anio;
        this.genero = genero;
        this.nCanciones = nCanciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nombre='" + nombre + '\'' +
                ", anio=" + anio +
                ", genero=" + genero +
                ", artista=" + artista +
                ", nCanciones=" + nCanciones +
                '}';
    }
}
