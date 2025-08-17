package geometrical_shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Circle extends Shape {
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

    public void draw(Displayable displayable) {
        if (displayable instanceof Image) {
            Graphics2D g = ((Image) displayable).bufferedImage.createGraphics();
            g.setColor(color);
            g.drawOval(center.getX(), center.getY(), radius * 2,
                    radius * 2);
            ;
            g.dispose();
        }
    }
}
