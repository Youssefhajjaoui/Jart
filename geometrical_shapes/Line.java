package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Line implements Drawable {
    private final Point p1, p2;
    private Color color;

    public Line(Point p1, Point p2) {
        Random rand = new Random();
        this.color = color.white;
        this.p1 = p1;
        this.p2 = p2;
    }

    public static Line random(int maxWidth, int maxHeight) {
        Point p1 = Point.random(maxWidth, maxHeight);
        Point p2 = Point.random(maxWidth, maxHeight);
        return new Line(p1, p2);
    }

    public void draw(Displayable displayable) {
        int x0 = p1.getX(), y0 = p1.getY();
        int x1 = p2.getX(), y1 = p2.getY();

        int dx = Math.abs(x1 - x0);
        int dy = Math.abs(y1 - y0);
        int sx = x0 < x1 ? 1 : -1;
        int sy = y0 < y1 ? 1 : -1;
        int err = dx - dy;

        while (true) {
            displayable.display(x0, y0, color);
            if (x0 == x1 && y0 == y1)
                break;
            int e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                x0 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y0 += sy;
            }
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
