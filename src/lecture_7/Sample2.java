package lecture_7;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sample2 {

	public static void main(String[] args) throws IOException {
		int w = 1024, h = 1024;
		BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		for(int y = 0; y < h; y++)
			for(int x = 0; x < w; x++) {
				int color = 0xFF00FFFF;
				img.setRGB(x, y, color);
			}
		
		ImageIO.write(img, "png", new File("pic1.png"));
	}

}
