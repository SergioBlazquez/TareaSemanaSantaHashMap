package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ventana2 {
    @FXML
    TextArea textArea1,textArea2;
    @FXML
    Label labelTextoModificado, labelUltimaModificacion, labelFechaCreacion;

    //String textoSinModificar="";
    //String modificacionOriginal="";
    long milisegundos=0;

    Tarea tareaAux;
    Tarea tarea;
    @FXML
    public void initialize(){
        /*

        System.out.println(textoSinModificar);
        modificacionOriginal=labelUltimaModificacion.getText();*/


    }

    @FXML
    public void onTextoDetallesChange(){



        //System.out.println(tareaAux.getDetalles()+" - "+textArea2.getText());

        if(!tarea.getDetalles().equals(textArea2.getText())) {

            //tareaAux.setDetalles(textArea2.getText());
            tareaAux.detalles=textArea2.getText();

            milisegundos=System.currentTimeMillis();
            Date fecha = new Date(milisegundos);

            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");


            labelUltimaModificacion.setText(dateFormatter.format(fecha));

        }else{
            if(tareaAux.getDetalles().equals(tarea.getDetalles()))
                labelUltimaModificacion.setText("-");
        }


    }

    @FXML
    public void onTextoNombreChange() {

        //System.out.println(tareaAux.getTexto()+" - "+textArea1.getText());

        if (!tareaAux.getTexto().equals(textArea1.getText())) {

            tareaAux.setTexto(textArea1.getText());
            labelTextoModificado.setVisible(true);
            milisegundos = System.currentTimeMillis();
            Date fecha = new Date(milisegundos);

            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");


            labelUltimaModificacion.setText(dateFormatter.format(fecha));

        }
    }




    public void pasarTarea(Tarea tarea){
        tareaAux= new Tarea(tarea.texto, tarea.favorito, tarea.fechaCreacion, tarea.ultimaModificacion, tarea.detalles);

        this.tarea=tarea;

        textArea1.setText(tarea.getTexto());
        textArea2.setText(tarea.getDetalles());
        labelFechaCreacion.setText(tarea.getFechaCreacion());
    }


}



