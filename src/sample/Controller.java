package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;



import java.util.HashMap;



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
    AnchorPane ap1;

    @FXML
    Button b1;

    @FXML
    TextField tf1;

    @FXML
    public void onClickRB1(){

        mapa.replace(label1,"");
        actualizarLabels(label1);

        //ap1.setVisible(true);
        //deshabilitarAgregarTarea();
    }

    @FXML
    public void onClickRB2(){

        mapa.replace(label2,"");
        actualizarLabels(label2);
        //ap1.setVisible(true);
        //deshabilitarAgregarTarea();

    }

    @FXML
    public void onClickRB3(){

        mapa.replace(label3,"");
        actualizarLabels(label3);
        //ap1.setVisible(true);
        //deshabilitarAgregarTarea();

    }

    @FXML
    public void onClickRB4(){


        mapa.replace(label4,"");
        actualizarLabels(label4);
        //ap1.setVisible(true);
       // deshabilitarAgregarTarea();


    }

    @FXML
    public void onClickRB5(){

        mapa.replace(label5,"");
        actualizarLabels(label5);
        //ap1.setVisible(true);
       // deshabilitarAgregarTarea();

    }

    @FXML
    public void onClickRB6(){

        mapa.replace(label6,"");
        actualizarLabels(label6);
        //ap1.setVisible(true);
       // deshabilitarAgregarTarea();


    }

    public void deshabilitarAgregarTarea(){

        String value;
        boolean booleano=false;
        for (Label key: mapa.keySet()) {

            value =mapa.get(key);
            if(value.equals("")){
                ap1.setVisible(true);
                booleano=true;
            }

        }
        if(!booleano)
            ap1.setVisible(false);

    }



    @FXML
    public void setOnClickB1(){

        String value;
        boolean booleano=false;
        for (Label key: mapa.keySet()) {
            value =mapa.get(key);
            if(value.equals("") && !booleano){
                key.setText(tf1.getText());
                mapa.replace(key,tf1.getText());
                actualizarLabels(key);
                booleano= true;

            }

        }
        tf1.setText("");
        //ap1.setVisible(false);//Cambiar esto a deshabilitarAgregarTarea
        //deshabilitarAgregarTarea();


        }

    public void actualizarLabels(Label label){


        label.setText(mapa.get(label));
        deshabilitarAgregarTarea();

    }

}