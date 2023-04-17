package org.launchcode.studio7;

public class Main {

	public static void main(String[] args){

		CD myCD = new CD(225, 700);
		DVD myDVD = new DVD(800, 1700);

		myCD.spin();
		myDVD.spin();

		myCD.clear();
		myDVD.clear();

		myCD.writeFile("audio.mp3");
		myDVD.writeFile("video.mp4");

		String dataOnCD = myCD.readData();
		String dataOnDVD = myDVD.readData();

		System.out.println("Data on CD: \n");
		System.out.println(dataOnCD);

		System.out.println("Data on DVD: \n");
		System.out.println(dataOnDVD);

		System.out.println("CD can hold " + myCD.getSize() + "MB maximum.");
		System.out.println("DVD can hold " + myDVD.getSize() + "MB maximum.");
	}
}
