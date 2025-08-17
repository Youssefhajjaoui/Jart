import java.awt.Color;
import application.Displayable;
import application.Drawable;

public class Rectangle implements Drawable {
    private final Point p1, p2;
    private final Color color = Color.BLUE;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1; this.p2 = p2;
    }

    public void draw(Displayable displayable) {
        Point topLeft = new Point(Math.min(p1.getX(), p2.getX()), Math.min(p1.getY(), p2.getY()));
        Point bottomRight = new Point(Math.max(p1.getX(), p2.getX()), Math.max(p1.getY(), p2.getY()));
        Point topRight = new Point(bottomRight.getX(), topLeft.getY());
        Point bottomLeft = new Point(topLeft.getX(), bottomRight.getY());

        new Line(topLeft, topRight).draw(displayable);
        new Line(topRight, bottomRight).draw(displayable);
        new Line(bottomRight, bottomLeft).draw(displayable);
        new Line(bottomLeft, topLeft).draw(displayable);
    }

    public Color getColor() { return color; }
}
