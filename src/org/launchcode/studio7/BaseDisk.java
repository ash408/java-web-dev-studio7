package org.launchcode.studio7;

public abstract class BaseDisk {

	protected int speed;
	protected int size;
	protected String file;

	public BaseDisk(int speed, int size) {
		this.speed = speed;
		this.size = size;

		this.file = "";
	}

	public String getFile() {
		return this.file;
	}

	public int getSize() {
		return this.size;
	}
}
