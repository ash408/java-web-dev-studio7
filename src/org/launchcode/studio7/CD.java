package org.launchcode.studio7;

public class CD extends BaseDisk implements OpticalDisk {

	public CD (int speed, int size) {
		super(speed, size);
	}

	@Override
	public void spin () {
		System.out.println("This CD spins at a rate of " + speed + " rpm.");
	}

	@Override
	public void clear () {
		System.out.println("Clearing CD...");
		this.file = "";
	}

	@Override
	public void writeFile (String file) {
		System.out.println("Adding file " + file + " to CD...");
		this.file += (file + "\n");	
	}

	@Override
	public String readData () {
		System.out.println("Reading data from CD...");
		return this.file;
	}
}
