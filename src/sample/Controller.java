package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


public class Controller{

    HashMap<Label,Tarea> mapa=new HashMap();
    Tarea tarea1= new Tarea("Hacer Práctica 2 PSP",false,"16-04-2020","","");
    Tarea tarea2= new Tarea("Hacer Práctica 1 PSP",false,"25-04-2020","","");
    Tarea tarea3= new Tarea("Hacer Práctica 2 DI",false,"02-05-2020","","");
    Tarea tarea4= new Tarea("Hacer Práctica 1 DI",false,"10-05-2020","","");
    Tarea tarea5= new Tarea("Hacer Práctica 2 PMDP",false,"20-05-2020","","");
    Tarea tarea6= new Tarea("Hacer Práctica 1 PMDP",false,"21-05-2020","","");

    ArrayList<Tarea> listaTareas = new ArrayList<>();
    ArrayList<ImageView> listaImagenes = new ArrayList<>();
    ArrayList<Label> listaLabels = new ArrayList<>();




    @FXML
    public void initialize(){


        mapa.put(label1,tarea1);
        mapa.put(label2,tarea2);
        mapa.put(label3,tarea3);
        mapa.put(label4,tarea4);
        mapa.put(label5,tarea5);
        mapa.put(label6,tarea6);


        listaTareas.add(tarea1);
        listaTareas.add(tarea2);
        listaTareas.add(tarea3);
        listaTareas.add(tarea4);
        listaTareas.add(tarea5);
        listaTareas.add(tarea6);


        listaImagenes.add(imagen1);
        listaImagenes.add(imagen2);
        listaImagenes.add(imagen3);
        listaImagenes.add(imagen4);
        listaImagenes.add(imagen5);
        listaImagenes.add(imagen6);

        listaLabels.add(label1);
        listaLabels.add(label2);
        listaLabels.add(label3);
        listaLabels.add(label4);
        listaLabels.add(label5);
        listaLabels.add(label6);


    }

    @FXML
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6  ;

    @FXML
    Label label1,label2,label3,label4,label5,label6;

    @FXML
    AnchorPane anchorPane1, anchorPane2, anchorPane3, anchorPane4, anchorPane5, anchorPane6, anchorPaneAgregarTarea;

    @FXML
    Button botonAgregar1;

    @FXML
    TextField textField1;

    @FXML
    ImageView imagen1,imagen2,imagen3,imagen4,imagen5,imagen6;




    File file = new File("src/images/estrella.jpg");
    Image imagenNoFavorito = new Image(file.toURI().toString());

    File fileFavorito = new File("src/images/estrellaDorada.png");
    Image imagenFavorito = new Image(fileFavorito.toURI().toString());


    Ventana2 controllerVentana2=null;







    @FXML
    public void onClickRB1(){

        tarea1.setTexto("");
        establecerUltimaFechaModificacion(tarea1);

        //mapa.replace(label1,"");
        //actualizarLabels(label1);

        //Binder


        Binder.bind(tarea1,label1,imagen1);
        deshabilitarAgregarTarea();



    }

    @FXML
    public void onClickRB2(){

        tarea2.setTexto("");
        establecerUltimaFechaModificacion(tarea2);
        //mapa.replace(label2,"");
        //actualizarLabels(label2);


        //Binder

        Binder.bind(tarea2,label2,imagen2);

        deshabilitarAgregarTarea();
    }

    @FXML
    public void onClickRB3(){

        tarea3.setTexto("");
        establecerUltimaFechaModificacion(tarea3);
        //mapa.replace(label3,"");
        //actualizarLabels(label3);


        //Binder

        Binder.bind(tarea3,label3,imagen3);
        deshabilitarAgregarTarea();

    }

    @FXML
    public void onClickRB4(){

        tarea4.setTexto("");
        establecerUltimaFechaModificacion(tarea4);
        //mapa.replace(label4,"");
        //actualizarLabels(label4);


        //Binder

        Binder.bind(tarea4,label4,imagen4);
        deshabilitarAgregarTarea();


    }

    @FXML
    public void onClickRB5(){

        tarea5.setTexto("");
        establecerUltimaFechaModificacion(tarea5);
        //mapa.replace(label5,"");
        //actualizarLabels(label5);


        //Binder

        Binder.bind(tarea5,label5,imagen5);
        deshabilitarAgregarTarea();

    }

    @FXML
    public void onClickRB6(){

        tarea6.setTexto("");
        establecerUltimaFechaModificacion(tarea6);
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

        /*for (Label key: mapa.keySet()) {

            value = mapa.get(key);
            if (value.getTexto().equals("") && !booleano) {

                key.setText(textField1.getText());
                value.setTexto(textField1.getText());
                long milisegundos = System.currentTimeMillis();
                Date fecha = new Date(milisegundos);
                value.setFechaCreacion(String.valueOf(fecha));
                value.setUltimaModificacion("");
                //mapa.replace(key,textField1.getText());
                //actualizarLabels(key);
                Binder.bind(value, key, imagen1);//Cambiar el imagen1
                deshabilitarAgregarTarea();
                booleano = true;


            }

        }*/
        //textField1.setText("");

        String texto="";
        Label label;
        for(int i=0;i< listaTareas.size();i++) {
            if (listaTareas.get(i).getTexto().equals("")){

                listaTareas.get(i).setTexto(textField1.getText());
                long milisegundos = System.currentTimeMillis();
                Date fecha = new Date(milisegundos);

                listaTareas.get(i).setFechaCreacion(String.valueOf(fecha));
                listaTareas.get(i).setUltimaModificacion("");


                Binder.bind(listaTareas.get(i), listaLabels.get(i),listaImagenes.get(i));
                deshabilitarAgregarTarea();
            }
        }



        //anchorPane1.setVisible(false);//Cambiar esto a deshabilitarAgregarTarea
        //deshabilitarAgregarTarea();





    }

    @FXML
    public void onClickImg1(MouseEvent e){

        Tarea tareaAux;
        tareaAux=mapa.get(label1);
        imagenFavorito(tareaAux,imagen1);

        e.consume();


    }

    @FXML
    public void onClickImg2(MouseEvent e){

        Tarea tareaAux;
        tareaAux=mapa.get(label2);
        imagenFavorito(tareaAux,imagen2);

        e.consume();

    }

    @FXML
    public void onClickImg3(MouseEvent e){

        Tarea tareaAux;
        tareaAux=mapa.get(label3);
        imagenFavorito(tareaAux,imagen3);

        e.consume();

    }

    @FXML
    public void onClickImg4(MouseEvent e){

        Tarea tareaAux;
        tareaAux=mapa.get(label4);
        imagenFavorito(tareaAux,imagen4);

        e.consume();

    }

    @FXML
    public void onClickImg5(MouseEvent e){

        Tarea tareaAux;
        tareaAux=mapa.get(label5);
        imagenFavorito(tareaAux,imagen5);

        e.consume();

    }

    @FXML
    public void onClickImg6(MouseEvent e){

        Tarea tareaAux;
        tareaAux=mapa.get(label6);

        imagenFavorito(tareaAux,imagen6);

        e.consume();

    }

    @FXML
    public void onClickAnchorPane1(){

        abrirInformacion(tarea1);


    }

    @FXML
    public void onClickAnchorPane2(){

        abrirInformacion(tarea2);


    }

    @FXML
    public void onClickAnchorPane3(){

        abrirInformacion(tarea3);


    }

    @FXML
    public void onClickAnchorPane4(){

        abrirInformacion(tarea4);


    }

    @FXML
    public void onClickAnchorPane5(){

        abrirInformacion(tarea5);


    }


    @FXML
    public void onClickAnchorPane6(){

        abrirInformacion(tarea6);


    }



    public void deshabilitarAgregarTarea(){

        boolean booleano=false;
        /*Tarea value;

        for (Label key: mapa.keySet()) {

            value =mapa.get(key);
            if(value.getTexto().equals("")){
                anchorPaneAgregarTarea.setVisible(true);
                booleano=true;
            }

        }
        if(!booleano)
            anchorPaneAgregarTarea.setVisible(false);*/

        for(int i=0;i< listaTareas.size();i++) {

            if(listaTareas.get(i).getTexto().equals("")){
                anchorPaneAgregarTarea.setVisible(true);
                booleano=true;
            }
            if(!booleano)
                anchorPaneAgregarTarea.setVisible(false);


        }

    }

    public void establecerUltimaFechaModificacion(Tarea tarea){

        long milisegundos = System.currentTimeMillis();
        Date fecha = new Date(milisegundos);
        tarea.setUltimaModificacion(String.valueOf(fecha));

    }

    private void imagenFavorito(Tarea tarea, ImageView imagen){

        if(!tarea.getFavorito()){
            imagen.setImage(imagenFavorito);

            imagen.fitWidthProperty();
            imagen.fitHeightProperty();
            imagen.setPreserveRatio(true);
            tarea.setFavorito(true);
        }else{
            imagen.setImage(imagenNoFavorito);

            imagen.fitWidthProperty();
            imagen.fitHeightProperty();
            imagen.setPreserveRatio(true);
            tarea.setFavorito(false);
        }


    }

    private void abrirInformacion(Tarea tarea) {

        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root,500,500);
            stage.setScene(scene);
            stage.show();

            Ventana2 controller = loader.getController();
            controller.pasarTarea(tarea);

            controllerVentana2 = loader.getController();
            controllerVentana2.enviarController1(this);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void refrescarAlInstante(Tarea tarea, ImageView imagen){

        if(!tarea.getFavorito()){

            imagen.setImage(imagenFavorito);

            imagen.fitWidthProperty();
            imagen.fitHeightProperty();
            imagen.setPreserveRatio(true);
            tarea.setFavorito(true);
        }else{
            imagen.setImage(imagenNoFavorito);

            imagen.fitWidthProperty();
            imagen.fitHeightProperty();
            imagen.setPreserveRatio(true);
            tarea.setFavorito(false);
        }





    }

    /*public void ordenarPorUltimaModificacion(){
        ArrayList<Tarea> listaTareasOrdenadas=new ArrayList<>();
        for (int i=0;i<listaTareas.size();i++){
        }
    }*/


}