package com.hackbulgaria.ASCII;

import java.io.File;

public abstract class FilePlayer implements Player {
	protected File file;

	public FilePlayer(File file) {
		this.file = file;
	}
}
