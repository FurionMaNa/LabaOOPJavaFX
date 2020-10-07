package sample;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;

import java.util.Random;

public class CircleClass extends FiguraClass {

    public CircleClass(int x, int y, int size, Pane g) {
        super(x, y, size, g);
    }

    @Override
    public void Draw() {
        super.Draw();
        Ellipse ellipse=new Ellipse(x+size/2,y+size/2,size/2,size/2);
        Color color= Color.color(new Random().nextFloat(),new Random().nextFloat(),new Random().nextFloat());
        ellipse.setFill(color);
        g.getChildren().add(ellipse);
    }
}
