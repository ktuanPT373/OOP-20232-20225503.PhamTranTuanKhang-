/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.disc;

import java.util.StringTokenizer;

/**
 *
 * @author khangpt
 */
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
	private int id;

    public String getTitle() {
        return title;
    }

	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirectory() {
		return director;
	}
	public void setDirectory(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
    public DigitalVideoDisc(String title){
        super();
        this.title = title;
    }
    public DigitalVideoDisc(String category, String title, float cost){
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc(String director, String category, String title, float cost){
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
	public int getId() {
        return id;
    }
	public DigitalVideoDisc(String title, String category, String director, int length, float cost,int id) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
	}
	//==========Add To String===========
	public String ToString() {
		return "DVD - " + getTitle() + " - " + getCategory() + " - " + this.director + " - " + this.length + " : "+getCost();
        }
        public boolean isMatch(String title){
            StringTokenizer str_token = new StringTokenizer(title);
            for (int i = 1; str_token.hasMoreTokens();i++) {
                if (getTitle().toUpperCase().contains(str_token.nextToken().toUpperCase())){
                    return true;
                }
            }
            return false;
        }
}

