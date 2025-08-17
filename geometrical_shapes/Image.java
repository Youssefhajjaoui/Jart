package geometrical_shapes;



import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image implements Displayable {
    private final BufferedImage bufferedImage;

    public Image(int width, int height) {
        bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // Fill the background with white
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                bufferedImage.setRGB(x, y, Color.BLACK.getRGB());
            }
        }
    }

    @Override
    public void display(int x, int y, Color color) {
        if (x >= 0 && y >= 0 && x < bufferedImage.getWidth() && y < bufferedImage.getHeight()) {
            bufferedImage.setRGB(x, y, color.getRGB());
        }
    }

    @Override
    public void save(String filename) {
        try {
            ImageIO.write(bufferedImage, "png", new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getWidth() {
        return bufferedImage.getWidth();
    }

    public int getHeight() {
        return bufferedImage.getHeight();
    }
}
