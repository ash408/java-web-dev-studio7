package org.launchcode.studio7;

public class DVD extends BaseDisk implements OpticalDisk{

	public DVD (int speed, int size) {
		super(speed, size);
	}

	@Override
	public void spin () {
		System.out.println("This DVD spins at a rate of " + speed + " rpm.");
	}

	@Override
	public void clear () {
		System.out.println("Clearing DVD...");
		this.file = "";
	}

	@Override
	public void writeFile (String file) {
		System.out.println("Adding file " + file + " to DVD...");
		this.file += (file + "\n");
	}

	@Override
	public String readData () {
		System.out.println("Reading data from DVD...");
		return this.file;
	}
}
