package lecture_7;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sampole3 {

	public static void main(String[] args) throws IOException {
		BufferedImage img = ImageIO.read(new File("/home/sasha/3244317.jpg"));
		int w = img.getWidth();
		int h = img.getHeight();
		for(int y = 0; y < h; y++) 
			for(int x = 0; x < w; x++) {
				int rgb = img.getRGB(x, y);

		
				
			}	
	}

}
