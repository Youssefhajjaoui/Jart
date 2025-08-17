package geometrical_shapes;

import java.awt.Color;

public class Triangle implements Drawable {
    private final Point a, b, c;
    private final Color color = Color.RED;

    public Triangle(Point a, Point b, Point c) {
        this.a = a; this.b = b; this.c = c;
    }

    public void draw(Displayable displayable) {
        new Line(a, b).draw(displayable);
        new Line(b, c).draw(displayable);
        new Line(c, a).draw(displayable);
    }

    public Color getColor() { return color; }
}
