package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class Binder {

    public static void bind(String texto, Label label/*, Image image*/, Boolean booleano) {

        label.setText(texto);

    }



}