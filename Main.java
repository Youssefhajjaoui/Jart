import application.*;

import java.awt.Color;
import geometrical_shapes.*;

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);
        Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900), new Point(100, 900));
        triangle.draw(image);
        for (int i = 0; i < 20; i++) {
            Line line = Line.random(image.getWidth(), image.getHeight());
            line.draw(image);
        }

        for (int i = 0; i < 20; i++) {
            Point p = Point.random(image.getWidth(), image.getHeight());
            image.display(p.getX(), p.getY(), java.awt.Color.MAGENTA);
        }

        // for (int i = 0; i < 50; i++) {
        // Circle circle = Circle.random(image.getWidth(), image.getHeight());
        // circle.draw(image);
        // }
        image.save("image.png");
    }
}
