package lecture_7;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sample4 {

	static int fact(double xn, double yn, double xc, double yc, int k) {
		double x1 = xn * xn - yn * yn + xc;
		double y1 = 2 * xn * yn + yc;
		double l = (x1 - xn) * (x1 - xn) + (y1 - yn) * (y1 - yn);
		if (l > 100.0)
			return (int)(l / (k + 1));
		if (k > 100)
			return -1;
		return fact(x1, y1, xc, yc, k + 1);
	}
	
	static int fact(double x, double y) {
		return fact(0, 0, x, y, 0);
	}
	
	
	public static void main(String[] args) throws IOException {
		int w = 2048, h = 1024;
		int w2 = w >> 1, h2 = h >> 1; 
		BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		double xx, yy;
		for(int y = 0; y < h; y++)
			for(int x = 0; x < w; x++) {
				xx = 3.0 * (x - w2) / w;
				yy = 1.5 * (y - h2) / h;
				int res = fact(xx, yy); 
				if (fact(xx, yy) == -1.0) 
					img.setRGB(x, y, 0x00ff00);
				else {
					res = res & 0xFF
					img.setRGB(x, y, 0x0000ff);
					
				}
		ImageIO.write(img, "png", new File("m.png"));
		

	}

}
