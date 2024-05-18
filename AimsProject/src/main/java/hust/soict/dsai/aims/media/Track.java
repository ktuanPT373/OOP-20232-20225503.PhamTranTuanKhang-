/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.media;

/**
 *
 * @author khangpt
 */

public class Track implements Playable {
	
	private String title;
	private int length;

	public Track(String title) {
		this.title = title;
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	public void play() {
		if (getLength() > 0) {
			System.out.println("Playing Track: " + getTitle());
			System.out.println("Track length: " + getLength());
		}
	}
	
	public String getInfo() {
		play();
		return "Playing Track: " + getTitle() + "\n" + "Track length: " + getLength();
	}

	public String toString() {
		return "Type: " + getType() + "Title: " + title + "Length: " + length;
	}

	public String getType() {
		return "Track";
	}
        @Override
	public boolean equals(Object obj) {
		if (obj instanceof Track) {
			try {
				Track newtrack = (Track) obj;
				boolean condition1 = (this.length == newtrack.getLength());
				boolean condition2 = this.title.equals(newtrack.getTitle());
				return condition1 && condition2;
			} catch (NullPointerException e) {
				return false;
			} catch (ClassCastException e) {
				return false;
			}
		} else {
			return false;
		}
	}
}
