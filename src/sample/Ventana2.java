package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.Date;

public class Ventana2 {
    @FXML
    TextArea textArea1,textArea2;
    @FXML
    Label labelTextoModificado, labelUltimaModificacion, labelFechaCreacion;

    String textoSinModificar="";
    String textoDetalles="";
    String modificacionOriginal="";
    long milisegundos=0;

    Tarea tareaAux;
    @FXML
    public void initialize(){
        textoSinModificar=textArea1.getText();
        System.out.println(textoSinModificar);
        textoDetalles=textArea2.getText();
        modificacionOriginal=labelUltimaModificacion.getText();


    }

    @FXML
    public void cambiarTexto(){

        //Cambiar to.do lo del sample por el nuevo String de Tarea --> detalles

        System.out.println(textoDetalles+" - "+textArea2.getText());

        if(/*!textoSinModificar.equals(textArea1.getText()) || */!textoDetalles.equals(textArea2.getText())) {
            textoDetalles=textArea2.getText();
            labelTextoModificado.setVisible(true);
            milisegundos=System.currentTimeMillis();
            Date fecha = new Date(milisegundos);
            labelUltimaModificacion.setText(String.valueOf(fecha));

        }

        //Crear una funcion para que cuando se quite el cursor guardar la cadena actual
    }

    @FXML
    public void cambiarTexto2() {

        System.out.println(tareaAux.getTexto()+" - "+textArea1.getText());

        //System.out.println(textoSinModificar+" - "+textArea1.getText());
        if (!tareaAux.getTexto().equals(textArea1.getText())) {
            labelTextoModificado.setVisible(true);
            milisegundos = System.currentTimeMillis();
            Date fecha = new Date(milisegundos);
            labelUltimaModificacion.setText(String.valueOf(fecha));

        }
    }


    // Borrar o Cambiar
    @FXML
    public void noCambiaElTexto(){
        if(textoSinModificar.equals(labelTextoModificado.getText()))
            labelUltimaModificacion.setText(modificacionOriginal);
        labelTextoModificado.setVisible(false);
    }


    @FXML
    public void controlarQueTodoEsteBien(){
        cambiarTexto2();

    }

    @FXML
    public void controlarQueTodoEsteBienDetalles(){
        cambiarTexto();

    }



    //Metodos llamados desde el Controller

    public void pasarTarea(Tarea tarea){

        tareaAux=tarea;

       textArea1.setText(tarea.getTexto());
       labelFechaCreacion.setText(tarea.getFechaCreacion());
    }


    public void ponerTextArea(String cadena){

        textArea1.setText(cadena);
    }

    public void ponerFechaDeCreacion(String cadena){

        labelFechaCreacion.setText(cadena);
    }

}



