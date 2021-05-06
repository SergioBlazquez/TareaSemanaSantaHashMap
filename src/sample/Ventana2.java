package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Ventana2 {
    @FXML
    TextArea textArea1,textArea2;
    @FXML
    Label labelTextoModificado, labelUltimaModificacion;

    String textoSinModificar="";
    String modificacionOriginal="";
    @FXML
    public void initialize(){
        textoSinModificar=textArea1.getText();
        modificacionOriginal=labelUltimaModificacion.getText();

    }

    @FXML
    public void cambiarTexto(){
        if(!textoSinModificar.equals(textArea1.getText())) {
            labelTextoModificado.setVisible(true);
            labelUltimaModificacion.setText("Cambiar por la fecha");
        }else{
            labelTextoModificado.setVisible(false);}
    }

    @FXML
    public void noCambiaElTexto(){
        if(textoSinModificar.equals(labelTextoModificado.getText()))
            labelUltimaModificacion.setText(modificacionOriginal);
    }


    public void ponerTextArea(String cadena){

        textArea1.setText(cadena);
    }

}



