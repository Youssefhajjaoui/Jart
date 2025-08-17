package geometrical_shapes;

import java.awt.Color;

public class Triangle implements Drawable {
    private final Point a, b, c;
    private Color color;

    public Triangle(Point a, Point b, Point c) {
        this.color = Color.WHITE;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void draw(Displayable displayable) {

        Line ab = new Line(a, b);
        Line bc = new Line(b, c);
        Line ca = new Line(c, a);

        ab.setColor(color);
        bc.setColor(color);
        ca.setColor(color);

        ab.draw(displayable);
        bc.draw(displayable);
        ca.draw(displayable);
    }

    public Color getColor() {
        return color;
    }
}
