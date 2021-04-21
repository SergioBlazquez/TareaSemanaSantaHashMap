package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import java.util.HashMap;
import java.util.Iterator;

public class Controller{

    HashMap<Label,Tarea> mapa=new HashMap();
    Tarea tarea1= new Tarea("Hacer Práctica 2 PSP",false);
    Tarea tarea2= new Tarea("Hacer Práctica 1 PSP",false);
    Tarea tarea3= new Tarea("Hacer Práctica 2 DI",false);
    Tarea tarea4= new Tarea("Hacer Práctica 1 DI",false);
    Tarea tarea5= new Tarea("Hacer Práctica 2 PMDP",false);
    Tarea tarea6= new Tarea("Hacer Práctica 1 PMDP",false);


    @FXML
    public void initialize(){


        mapa.put(label1,tarea1);
        mapa.put(label2,tarea2);
        mapa.put(label3,tarea3);
        mapa.put(label4,tarea4);
        mapa.put(label5,tarea5);
        mapa.put(label6,tarea6);

    }

    @FXML
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6;

    @FXML
    Label label1,label2,label3,label4,label5,label6;

    @FXML
    AnchorPane anchorPane1;

    @FXML
    Button botonAgregar1;

    @FXML
    TextField textField1;

    @FXML
    Image imagen1,imagen2,imagen3,imagen4,imagen5,imagen6;

    @FXML
    public void onClickRB1(){

        tarea1.setTexto("");
        //mapa.replace(label1,"");
        //actualizarLabels(label1);

        //Binder

        Binder.bind(tarea1,label1,imagen1);
        deshabilitarAgregarTarea();

    }

    @FXML
    public void onClickRB2(){

        tarea2.setTexto("");
        //mapa.replace(label2,"");
        //actualizarLabels(label2);

        //Binder

        Binder.bind(tarea2,label2,imagen2);

        deshabilitarAgregarTarea();
    }

    @FXML
    public void onClickRB3(){

        tarea3.setTexto("");
        //mapa.replace(label3,"");
        //actualizarLabels(label3);


        //Binder

        Binder.bind(tarea3,label3,imagen3);
        deshabilitarAgregarTarea();

    }

    @FXML
    public void onClickRB4(){

        tarea4.setTexto("");
        //mapa.replace(label4,"");
        //actualizarLabels(label4);


        //Binder

        Binder.bind(tarea4,label4,imagen4);
        deshabilitarAgregarTarea();


    }

    @FXML
    public void onClickRB5(){

        tarea5.setTexto("");
        //mapa.replace(label5,"");
        //actualizarLabels(label5);


        //Binder

        Binder.bind(tarea5,label5,imagen5);
        deshabilitarAgregarTarea();

    }

    @FXML
    public void onClickRB6(){

        tarea6.setTexto("");
        //mapa.replace(label6,"");
        //actualizarLabels(label6);


        //Binder

        Binder.bind(tarea6,label6,imagen6);
        deshabilitarAgregarTarea();


    }

    @FXML
    public void setOnClickB1(){

        Tarea value;
        boolean booleano=false;
        //Values y size para cambiar el for
        for (Label key: mapa.keySet()) {

            value =mapa.get(key);
            if(value.getTexto().equals("") && !booleano){
                key.setText(textField1.getText());
                value.setTexto(textField1.getText());
                //mapa.replace(key,textField1.getText());
                //actualizarLabels(key);
                Binder.bind(value,key,imagen1);//Cambiar el imagen1
                deshabilitarAgregarTarea();
                booleano= true;

            }

        }
        textField1.setText("");
        //anchorPane1.setVisible(false);//Cambiar esto a deshabilitarAgregarTarea
        //deshabilitarAgregarTarea();





    }

    public void deshabilitarAgregarTarea(){

        Tarea value;
        boolean booleano=false;
        for (Label key: mapa.keySet()) {

            value =mapa.get(key);
            if(value.getTexto().equals("")){
                anchorPane1.setVisible(true);
                booleano=true;
            }

        }
        if(!booleano)
            anchorPane1.setVisible(false);

    }

    /*public void actualizarLabels(Label label){


        label.setText(mapa.get(label));
        deshabilitarAgregarTarea();

    }*/

}