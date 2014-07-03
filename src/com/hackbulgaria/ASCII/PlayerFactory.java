package com.hackbulgaria.ASCII;

import java.io.File;
import java.io.IOException;

public class PlayerFactory {
	public static Player newPlayer(File file) throws IOException {
		int dotLastIndex = file.getName().lastIndexOf('.');
		String extentions = file.getName().substring(dotLastIndex + 1);
		if (extentions.equals("gif")) {

		}
		if (extentions.equals("3gp")) {

		}
		return new PicturePlayer(file);
	}
}
