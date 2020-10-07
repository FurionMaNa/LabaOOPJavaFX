package sample;

import javafx.scene.layout.Pane;

import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SquareClass extends FiguraClass{

    public SquareClass(int x, int y, int size, Pane g) {
        super(x, y, size, g);
    }

    @Override
    public void Draw() {
        super.Draw();
        Rectangle rectangle=new Rectangle(x,y,size,size);
        Color color= Color.color(new Random().nextFloat(),new Random().nextFloat(),new Random().nextFloat());
        rectangle.setFill(color);
        g.getChildren().add(rectangle);
    }
}
