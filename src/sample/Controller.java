package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6  ;

    @FXML
    Label label1,label2,label3,label4,label5,label6;

    @FXML
    AnchorPane anchorPane1;

    @FXML
    Button botonAgregar1;

    @FXML
    TextField textField1;

    @FXML
    ImageView imagen1,imagen2,imagen3,imagen4,imagen5,imagen6;


    File file = new File("src/images/estrella.jpg");
    Image imagen = new Image(file.toURI().toString());

    File fileFavorito = new File("src/images/estrellaDorada.png");
    Image imagenFavorito = new Image(fileFavorito.toURI().toString());






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

        for (Label key: mapa.keySet()) {

            value = mapa.get(key);
            if (value.getTexto().equals("") && !booleano) {

                key.setText(textField1.getText());
                value.setTexto(textField1.getText());
                //mapa.replace(key,textField1.getText());
                //actualizarLabels(key);
                Binder.bind(value, key, imagen1);//Cambiar el imagen1
                deshabilitarAgregarTarea();
                booleano = true;


            }

        }
        textField1.setText("");
        //anchorPane1.setVisible(false);//Cambiar esto a deshabilitarAgregarTarea
        //deshabilitarAgregarTarea();





    }

    @FXML
    public void onClickImg1(){

        Tarea tareaAux;
        tareaAux=mapa.get(label1);
        if(!tareaAux.getBooleano()){
            imagen1.setImage(imagenFavorito);

            imagen1.fitWidthProperty();
            imagen1.fitHeightProperty();
            imagen1.setPreserveRatio(true);
            tareaAux.setBooleano(true);
        }else{
            imagen1.setImage(imagen);

            imagen1.fitWidthProperty();
            imagen1.fitHeightProperty();
            imagen1.setPreserveRatio(true);
            tareaAux.setBooleano(false);
        }



    }

    @FXML
    public void onClickImg2(){

        Tarea tareaAux;
        tareaAux=mapa.get(label2);
        if(!tareaAux.getBooleano()){
            imagen2.setImage(imagenFavorito);

            imagen2.fitWidthProperty();
            imagen2.fitHeightProperty();
            imagen2.setPreserveRatio(true);
            tareaAux.setBooleano(true);
        }else{
            imagen2.setImage(imagen);

            imagen2.fitWidthProperty();
            imagen2.fitHeightProperty();
            imagen2.setPreserveRatio(true);
            tareaAux.setBooleano(false);
        }

    }

    @FXML
    public void onClickImg3(){

        Tarea tareaAux;
        tareaAux=mapa.get(label3);
        if(!tareaAux.getBooleano()){
            imagen3.setImage(imagenFavorito);

            imagen3.fitWidthProperty();
            imagen3.fitHeightProperty();
            imagen3.setPreserveRatio(true);
            tareaAux.setBooleano(true);
        }else{
            imagen3.setImage(imagen);

            imagen3.fitWidthProperty();
            imagen3.fitHeightProperty();
            imagen3.setPreserveRatio(true);
            tareaAux.setBooleano(false);
        }

    }

    @FXML
    public void onClickImg4(){

        Tarea tareaAux;
        tareaAux=mapa.get(label4);
        if(!tareaAux.getBooleano()){
            imagen4.setImage(imagenFavorito);

            imagen4.fitWidthProperty();
            imagen4.fitHeightProperty();
            imagen4.setPreserveRatio(true);
            tareaAux.setBooleano(true);
        }else{
            imagen4.setImage(imagen);

            imagen4.fitWidthProperty();
            imagen4.fitHeightProperty();
            imagen4.setPreserveRatio(true);
            tareaAux.setBooleano(false);
        }

    }

    @FXML
    public void onClickImg5(){

        Tarea tareaAux;
        tareaAux=mapa.get(label5);
        if(!tareaAux.getBooleano()){
            imagen5.setImage(imagenFavorito);

            imagen5.fitWidthProperty();
            imagen5.fitHeightProperty();
            imagen5.setPreserveRatio(true);
            tareaAux.setBooleano(true);
        }else{
            imagen5.setImage(imagen);

            imagen5.fitWidthProperty();
            imagen5.fitHeightProperty();
            imagen5.setPreserveRatio(true);
            tareaAux.setBooleano(false);
        }

    }

    @FXML
    public void onClickImg6(){

        Tarea tareaAux;
        tareaAux=mapa.get(label6);
        if(!tareaAux.getBooleano()){
            imagen6.setImage(imagenFavorito);

            imagen6.fitWidthProperty();
            imagen6.fitHeightProperty();
            imagen6.setPreserveRatio(true);
            tareaAux.setBooleano(true);
        }else{
            imagen6.setImage(imagen);

            imagen6.fitWidthProperty();
            imagen6.fitHeightProperty();
            imagen6.setPreserveRatio(true);
            tareaAux.setBooleano(false);
        }

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