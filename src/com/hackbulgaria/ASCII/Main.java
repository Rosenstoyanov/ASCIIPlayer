package com.hackbulgaria.ASCII;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = Paths.get("/home/rosen/Downloads/Car3.jpg").toFile();
		// PlayerFactory.newPlayer(file);
		Player player = PlayerFactory.newPlayer(file);
		player.play();
		// PicturePlayer picPlayer = new PicturePlayer();
		// picPlayer.play();
	}

}
