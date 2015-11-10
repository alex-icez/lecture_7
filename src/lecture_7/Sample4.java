package lecture_7;

import java.awt.image.BufferedImage;

public class Sample4 {

	boolean fact(double xn, double yn, double xc, double yc, int k) {
		double x1 = xn * xn - yn * yn + xc;
		double y1 = 2 * xn * yn + yc;
		double l = (x1 - xn) * (x1 - xn) + (y1 - yn) * (y1 - yn);
		if (l > 100.0)
			return false;
		if (k > 100)
			return true;
		return fact(x1, y1, xc, yc, k + 1);
	}
	
	boolean fact(double x, double y) {
		return fact(0, 0, x, y, 0);
	}
	
	
	public static void main(String[] args) {
		int w = 2048, h = 1024;
		int w2 = w >> 1, h2 = h >> 1; 
		BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		
		
		
		

	}

}
