/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.media;

/**
 *
 * @author khangpt
 */

import java.time.LocalDate;
import java.util.Comparator;
import hust.soict.dsai.aims.media.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.media.MediaComparatorByTitleCost;
import java.util.Collection;

public abstract class Media {
        public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
                new MediaComparatorByTitleCost();
        public static final Comparator<Media> COMPARE_BY_COST_TITLE = 
                new MediaComparatorByCostTitle();
        
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	protected static int nbMedia = 0;
	protected LocalDate dateAdded;

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	public static int getNbMedia() {
		return nbMedia;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}
	
	public Media(String title) {
		this.title = title;
		dateAdded = LocalDate.now();
		nbMedia++;
		id = nbMedia;
	}
	
	public Media(String title, String category) {
		this(title);
		this.category = category;
	}

	public Media(String title, String category, float cost) {
		this(title, category);
		this.cost = cost;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public boolean isMatch(String title) {
		String[] tokens = this.title.toLowerCase().split(" ");
		for (String token: tokens) {
			if (title.toLowerCase().contains(token)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Media) {
			try {
				Media medium = (Media) obj;
				boolean condition1 = this.title.equals(medium.getTitle());
				return condition1;
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



