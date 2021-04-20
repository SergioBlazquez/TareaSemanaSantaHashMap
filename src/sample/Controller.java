package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Controller{

    HashMap<Label,String> mapa=new HashMap();

    @FXML
    public void initialize(){


        mapa.put(label1,"Hacer Práctica 2 PSP");
        mapa.put(label2,"Hacer Práctica 1 PSP");
        mapa.put(label3,"Hacer Práctica 2 DI");
        mapa.put(label4,"Hacer Práctica 1 DI");
        mapa.put(label5,"Hacer Práctica 2 PMDP");
        mapa.put(label6,"Hacer Práctica 1 PMDP");

    }

    @FXML
    RadioButton rb1, rb2, rb3, rb4, rb5, rb6;

    @FXML
    Label label1,label2,label3,label4,label5,label6;

    @FXML
    AnchorPane anchorPane1;

    @FXML
    Button botonAgregar1;

    @FXML
    TextField textField1;

    @FXML
    public void onClickRB1(){

        mapa.replace(label1,"");
        //actualizarLabels(label1);

        //Binder

        Binder.bind(mapa.get(label1),label1,false);
        deshabilitarAgregarTarea();

    }

    @FXML
    public void onClickRB2(){

        mapa.replace(label2,"");
        //actualizarLabels(label2);

        //Binder

        Binder.bind(mapa.get(label2),label2,false);

        deshabilitarAgregarTarea();
    }

    @FXML
    public void onClickRB3(){

        mapa.replace(label3,"");
        //actualizarLabels(label3);


        //Binder

        Binder.bind(mapa.get(label3),label3,false);
        deshabilitarAgregarTarea();

    }

    @FXML
    public void onClickRB4(){


        mapa.replace(label4,"");
        //actualizarLabels(label4);


        //Binder

        Binder.bind(mapa.get(label4),label4,false);
        deshabilitarAgregarTarea();


    }

    @FXML
    public void onClickRB5(){

        mapa.replace(label5,"");
        //actualizarLabels(label5);


        //Binder

        Binder.bind(mapa.get(label5),label5,false);
        deshabilitarAgregarTarea();

    }

    @FXML
    public void onClickRB6(){

        mapa.replace(label6,"");
        //actualizarLabels(label6);


        //Binder

        Binder.bind(mapa.get(label6),label6,false);
        deshabilitarAgregarTarea();


    }

    @FXML
    public void setOnClickB1(){

        String value;
        boolean booleano=false;
        //Values y size para cambiar el for
        for (Label key: mapa.keySet()) {
            value =mapa.get(key);
            if(value.equals("") && !booleano){
                key.setText(textField1.getText());
                mapa.replace(key,textField1.getText());
                //actualizarLabels(key);
                Binder.bind(textField1.getText(),key,false);
                deshabilitarAgregarTarea();
                booleano= true;

            }

        }
        textField1.setText("");
        //anchorPane1.setVisible(false);//Cambiar esto a deshabilitarAgregarTarea
        //deshabilitarAgregarTarea();

        Collection<String> coleccion = mapa.values();
        Iterator<String> it = coleccion.iterator();



    }

    public void deshabilitarAgregarTarea(){

        String value;
        boolean booleano=false;
        for (Label key: mapa.keySet()) {

            value =mapa.get(key);
            if(value.equals("")){
                anchorPane1.setVisible(true);
                booleano=true;
            }

        }
        if(!booleano)
            anchorPane1.setVisible(false);

    }

    public void actualizarLabels(Label label){


        label.setText(mapa.get(label));
        deshabilitarAgregarTarea();

    }

}