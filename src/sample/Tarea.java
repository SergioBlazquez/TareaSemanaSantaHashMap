package sample;

public class Tarea {
    public String texto;
    public boolean booleano;


    public Tarea(String texto, boolean booleano) {
        this.texto = texto;
        this.booleano = booleano;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
