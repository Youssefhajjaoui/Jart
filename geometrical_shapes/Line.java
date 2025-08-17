package geometrical_shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public class Line extends Shape {
    private final Point p1, p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = Color.WHITE;
    }

    public static Line random(int maxWidth, int maxHeight) {
        Point p1 = Point.random(maxWidth, maxHeight);
        Point p2 = Point.random(maxWidth, maxHeight);
        return new Line(p1, p2);
    }

    public void draw(Displayable displayable) {
        if (displayable instanceof Image) {
            Graphics2D g = ((Image) displayable).bufferedImage.createGraphics();
            g.setColor(color);
            g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
            g.dispose();
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
