package lecture_7;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sample2 {

	public static void main(String[] args) throws IOException {
		int w = 1024, h = 1024;
		int w2 = w >> 1, h2 = h >> 1;
		BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		for (int y = 0; y < h; y++)
			for (int x = 0; x < w; x++) {
				int r, g, b;
				double l = 0.5 + 0.5 * Math.sin(0.05 * Math.sqrt((x - w2) * (x - w2)
						+ (y - h2) * (y - h2)));

				r = (x ^ y) & 0xFF;
				g = (x >> 1 ^ y) & 0xFF;
				b = (x ^ y >> 1) & 0xFF;
				if ((int)(l * b) == 256)
					System.out.println("ERROR!!" + l);
				int color = (int)(l * b);// | ((int)(l * g) << 8) | ((int)(l * r) << 16);
				img.setRGB(x, y, color);
			}

		ImageIO.write(img, "png", new File("pic2.png"));
	}

}
