package sample;

public class Tarea {
    public String texto;
    public boolean favorito;
    public String fechaCreacion;
    public String ultimaModificacion;
    public String detalles;



    public Tarea(String texto, boolean booleano, String fechaCreacion, String ultimaModificacion, String detalles) {
        this.texto = texto;
        this.favorito = booleano;
        this.fechaCreacion=fechaCreacion;
        this.ultimaModificacion=ultimaModificacion
        this.detalles=detalles;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


    public boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }


    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }
}
