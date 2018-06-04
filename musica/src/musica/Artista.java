package musica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.text.ParseException;

public class Artista {
    private String nombre;
    private Date fechaNacimiento;
    private String paisOrigen;
    private Album[] album;

    public Artista() {
    }

    public Artista(String nombre, Date fechaNacimiento, String paisOrigen ) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;
    }

    public Artista(String nombre, Date fechaNacimiento, String paisOrigen, Album[] album) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {

        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Album[] getAlbum() {
        return album;
    }

    public void setAlbum(Album[] album) {
        this.album = album;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return Objects.equals(nombre, artista.nombre) &&
                Objects.equals(fechaNacimiento, artista.fechaNacimiento) &&
                Objects.equals(paisOrigen, artista.paisOrigen);
    }


}