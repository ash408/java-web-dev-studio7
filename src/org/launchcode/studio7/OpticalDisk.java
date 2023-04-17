package org.launchcode.studio7;

public interface OpticalDisk {

	void spin();
	void clear();

	void writeFile(String file);
	String readData();
}
