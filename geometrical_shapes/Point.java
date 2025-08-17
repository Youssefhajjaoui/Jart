package geometrical_shapes;

import java.util.Random;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point random(int var0, int var1) {
        Random var2 = new Random();
        int var3 = var2.nextInt(var0);
        int var4 = var2.nextInt(var1);
        return new Point(var3, var4);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
