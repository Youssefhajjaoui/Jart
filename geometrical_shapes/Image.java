package geometrical_shapes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image implements Displayable {
    public final BufferedImage bufferedImage;

    public Image(int var1, int var2) {
        this.bufferedImage = new BufferedImage(var1, var2, 1);

        for (int var3 = 0; var3 < var1; ++var3) {
            for (int var4 = 0; var4 < var2; ++var4) {
                this.bufferedImage.setRGB(var3, var4, Color.BLACK.getRGB());
            }
        }
    }

    public void display(int var1, int var2, Color var3) {
        if (var1 >= 0 && var2 >= 0 && var1 < this.bufferedImage.getWidth() && var2 < this.bufferedImage.getHeight()) {
            this.bufferedImage.setRGB(var1, var2, var3.getRGB());
        }

    }

    public void save(String var1) {
        try {
            ImageIO.write(this.bufferedImage, "png", new File(var1));
        } catch (IOException var3) {
            var3.printStackTrace();
        }

    }

    public int getWidth() {
        return this.bufferedImage.getWidth();
    }

    public int getHeight() {
        return this.bufferedImage.getHeight();
    }
}
