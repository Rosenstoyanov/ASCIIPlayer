package com.hackbulgaria.ASCII;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class ASCIIParser {
	BufferedImage bufferedImage;

	public ASCIIParser(Path path) throws IOException {
		bufferedImage = ImageIO.read(path.toFile());
	}

	public void parse() {
		int pixel = 0;
		float blocks = 144f;
		int blockLength = (int) (Math.ceil(bufferedImage.getWidth() / blocks));
		for (int t = 0; t < bufferedImage.getHeight(); t += blockLength) {
			for (int r = 0; r < bufferedImage.getWidth(); r += blockLength) {
				for (int y = t; y < blockLength + t; y++) {
					for (int x = r; x < blockLength + r; x++) {
						Color color = new Color(bufferedImage.getRGB(x, y));
						pixel += (color.getBlue() + color.getRed() + color
								.getGreen());

					}
				}
				pixel /= (blockLength * blockLength * 3);
				if (pixel > 240) {
					System.out.print(' ');
					pixel = 0;
					continue;
				}
				if (pixel > 200) {
					System.out.print('.');
					pixel = 0;
					continue;
				}
				if (pixel > 160) {
					System.out.print('*');
					pixel = 0;
					continue;
				}
				if (pixel > 120) {
					System.out.print('~');
					pixel = 0;
					continue;
				}
				if (pixel > 80) {
					System.out.print('+');
					pixel = 0;
					continue;
				}
				if (pixel > 40) {
					System.out.print('=');
					pixel = 0;
					continue;
				}
				if (pixel >= 0) {
					System.out.print('#');
					pixel = 0;
					continue;
				}
				// pixel = 0;
			}
			System.out.println(System.lineSeparator());

		}
	}

	public static void main(String[] args) throws IOException {

		// ASCIIParser img = new ASCIIParser(Paths.get(args[0]));
		// System.out.println(echo $COLUM);
		ASCIIParser img = new ASCIIParser(
				Paths.get("/home/rosen/Downloads/Car3.jpg"));
		img.parse();
	}
}
