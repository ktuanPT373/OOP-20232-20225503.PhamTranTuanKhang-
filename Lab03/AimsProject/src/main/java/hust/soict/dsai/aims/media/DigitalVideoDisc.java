/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.media;

/**
 *
 * @author khangpt
 */


public class DigitalVideoDisc extends Disc {

	public DigitalVideoDisc(String title) {
		super(title);
	}
	
	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}
	
	public void play() {
		if (getLength() > 0) {
			System.out.println("Playing DVD: " + getTitle());
			System.out.println("DVD length: " + getLength());
		}
	}
	
	public String getInfo() {
		play();
		return "Playing DVD: " + getTitle() + "\n" + "Length: " + getLength();
	}

	public String getType() {
		return "DVD";
	}
}