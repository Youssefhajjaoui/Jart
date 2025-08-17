package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    private final Point center;
    private final int radius;
    private final Color color;

    public Circle(Point center, int radius) {
        Random rand = new Random();
        this.color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        this.center = center;
        this.radius = radius;
    }

    public static Circle random(int maxWidth, int maxHeight) {
        Random rand = new Random();
        int x = rand.nextInt(maxWidth);
        int y = rand.nextInt(maxHeight);
        int radius = rand.nextInt(Math.min(maxWidth, maxHeight) / 4) + 10; // Random radius, min 10
        return new Circle(new Point(x, y), radius);
    }

    @Override
    public void draw(Displayable displayable) {
        int x = radius;
        int y = 0;
        int err = 0;

        while (x >= y) {
            displayable.display(center.getX() + x, center.getY() + y, getColor());
            displayable.display(center.getX() + y, center.getY() + x, getColor());
            displayable.display(center.getX() - y, center.getY() + x, getColor());
            displayable.display(center.getX() - x, center.getY() + y, getColor());
            displayable.display(center.getX() - x, center.getY() - y, getColor());
            displayable.display(center.getX() - y, center.getY() - x, getColor());
            displayable.display(center.getX() + y, center.getY() - x, getColor());
            displayable.display(center.getX() + x, center.getY() - y, getColor());

            if (err <= 0) {
                y += 1;
                err += 2 * y + 1;
            }
            if (err > 0) {
                x -= 1;
                err -= 2 * x + 1;
            }
        }
    }

    @Override
    public Color getColor() {
        return color;
    }
}
