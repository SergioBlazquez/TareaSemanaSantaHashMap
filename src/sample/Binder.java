package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Binder {

    public static void bind(Tarea tarea, Label label, ImageView image) {

        label.setText(tarea.getTexto());

    }



}