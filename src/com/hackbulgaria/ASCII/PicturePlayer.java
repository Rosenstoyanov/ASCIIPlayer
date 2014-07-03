package com.hackbulgaria.ASCII;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PicturePlayer extends FilePlayer {
	protected BufferedImage bufferedImage;

	public PicturePlayer(File file) throws IOException {
		super(file);
		this.bufferedImage = ImageIO.read(super.file);
	}

	@Override
	public void play() {
		PlayerUtils.write(bufferedImage);
	}

}
