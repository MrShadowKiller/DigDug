package ir.ac.kntu.items;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.Serializable;

public abstract class Item implements ItemEffect, Serializable {
    private final ImageView imageView;

    public Item(ImageView imageView) {
        this.imageView = imageView;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getRow() {
        return GridPane.getRowIndex(getImageView());
    }

    public int getCol() {
        return GridPane.getColumnIndex(getImageView());
    }
}
