package sample;

import javafx.scene.layout.Pane;

import java.awt.*;

public abstract class FiguraClass {

    protected int x;
    protected int y;
    protected int size;
    protected final Pane g;

    public FiguraClass(int x, int y, int size, Pane g) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.g=g;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void Draw(){}
}
