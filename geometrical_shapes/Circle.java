import java.awt.Color;
import java.util.Random;
import application.Displayable;
import application.Drawable;

public class Circle implements Drawable {
    private final Point center;
    private final int radius;
    private final Color color = Color.GREEN;

    public Circle(Point center, int radius) {
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
    public Color getColor() {
        return color;
    }
}
