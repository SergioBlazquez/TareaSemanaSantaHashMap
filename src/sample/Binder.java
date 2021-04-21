package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class Binder {

    public static void bind(Tarea tarea, Label label, Image image) {

        label.setText(tarea.getTexto());

    }



}