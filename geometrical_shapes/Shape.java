package geometrical_shapes;

import java.awt.Color;

public class Shape implements Drawable {
    public Color color = Color.WHITE;

    public void draw(Displayable displayable) {
        displayable.display(0, 0, color);
    }

    public Color getColor() {
        return color;
    }
}
