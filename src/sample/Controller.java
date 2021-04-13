package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    int contador=0;
    //ArrayList<String> lista = new ArrayList<String>();
    //lista.add("Hacer Práctica 2 PSP");

    @FXML
    RadioButton rb1;

    @FXML
    RadioButton rb2;

    @FXML
    RadioButton rb3;

    @FXML
    RadioButton rb4;

    @FXML
    RadioButton rb5;

    @FXML
    RadioButton rb6;

    @FXML
    Label label1;

    @FXML
    Label label2;

    @FXML
    Label label3;

    @FXML
    Label label4;

    @FXML
    Label label5;

    @FXML
    Label label6;

    @FXML
    AnchorPane ap1;

    @FXML
    Button b1;

    @FXML
    TextField tf1;


    public void onClickRB1(){

        label1.setText("");
        contador++;
        ap1.setVisible(true);


    }

    public void onClickRB2(){

        label2.setText("");
        contador++;
        ap1.setVisible(true);


    }

    public void onClickRB3(){

        label3.setText("");
        contador++;
        ap1.setVisible(true);


    }

    public void onClickRB4(){

        label4.setText("");
        contador++;
        ap1.setVisible(true);


    }

    public void onClickRB5(){

        label5.setText("");
        contador++;
        ap1.setVisible(true);


    }

    public void onClickRB6(){

        label6.setText("");
        contador++;
        ap1.setVisible(true);


    }

    public void deshabilitarAgregarTarea(int cont){
        if(cont==0)
            ap1.setVisible(false);
    }



    public void setOnClickB1(){

        if(label1.getText().equals("")) {
            label1.setText(tf1.getText());
            tf1.setPromptText("Agregar una tarea");
            tf1.setText("");
            contador--;
            deshabilitarAgregarTarea(contador);

        }else{

            if(label2.getText().equals("")) {
                label2.setText(tf1.getText());
                tf1.setPromptText("Agregar una tarea");
                tf1.setText("");
                contador--;
                deshabilitarAgregarTarea(contador);
            }else{

                if(label3.getText().equals("")) {
                    label3.setText(tf1.getText());
                    tf1.setPromptText("Agregar una tarea");
                    tf1.setText("");
                    contador--;
                    deshabilitarAgregarTarea(contador);
                }else{

                    if(label4.getText().equals("")) {
                        label4.setText(tf1.getText());
                        tf1.setPromptText("Agregar una tarea");
                        tf1.setText("");
                        contador--;
                        deshabilitarAgregarTarea(contador);
                    }else{

                        if(label5.getText().equals("")) {
                            label5.setText(tf1.getText());
                            tf1.setPromptText("Agregar una tarea");
                            tf1.setText("");
                            contador--;
                            deshabilitarAgregarTarea(contador);
                        }else{

                            if(label6.getText().equals("")){
                                label6.setText(tf1.getText());
                                tf1.setPromptText("Agregar una tarea");
                                tf1.setText("");
                                contador--;
                                deshabilitarAgregarTarea(contador);
                            }
                        }
                    }
                }
            }


        }

    }

}
