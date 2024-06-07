/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import hust.soict.dsai.aims.exception.FullCartException;
import hust.soict.dsai.aims.exception.NonExistingMediaException;
/**
 *
 * @author khangpt
 */
public class Cart {
    
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ObserableList<Media> itemsOrdered = FXCollections.observableArrayList();
	private DoubleProperty totalCostProperty = new SimpleDoubleProperty();
        
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	public void addMedia(Media medium) throws FullCartException {
		if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full");
			throw new FullCartException("The cart is full");
		} else {
			itemsOrdered.add(medium);
			updateTotalCost();
			System.out.println("Successfully added " + medium.getTitle() + " to cart");
		}
	}

	public void addMedia(Media ... media) throws FullCartException {
		for (Media medium: media) {
			addMedia(medium);
		}
	}

	public void removeMedia(Media medium) throws NonExistingMediaException {
		if (itemsOrdered.contains(medium)) {
			itemsOrdered.remove(medium);
			updateTotalCost();
			System.out.println("Successfully removed " + medium.getTitle() + " from cart");
		} else {
			System.out.println("Remove failed! " +  medium.getTitle() + " isn't in cart");
			throw new NonExistingMediaException("Remove failed! " +  medium.getTitle() + " isn't in cart");
		}
	}
    public void removeMedia(String title) {
        if (checkTitleValidation(title)) {
            for (Media media: itemsOrdered) {
                if (media.getTitle().equalsIgnoreCase(title)) {
                    removeMedia(media);
                }
            }
        } else {
            System.out.println("Invalid title");
        }
    }
    public void removeMedia(int id) {
        if (checkIdValidation(id)) {
            for (Media media: itemsOrdered) {
                if (media.getId() == id) {
                    removeMedia(media);
                }
            }
        } else {
            System.out.println("Invalid title");
        }
    }
	public List<Media> searchByTitle(String title) {
		List<Media> matchingMedia = new ArrayList<Media>();
		
		for (Media medium: itemsOrdered) {
			if (medium.getTitle().equals(title)) {
				matchingMedia.add(medium);
			}
		}
		
		if (matchingMedia.size() != 0) {
			System.out.println("Successfully found DVD with title " + title + " in cart");
		} else {
			System.out.println("No matching DVD with title " + title + " is found in cart");
		}
		return matchingMedia;
        }
	public Media searchById(int id) {
		for (Media medium: itemsOrdered) {
			if (medium.getId() == id) {
				System.out.println("Succecssfully found medium with id " + id + " in cart");
				return medium;
			}
		}
		System.out.println("No matching medium with id " + id + " is found in cart");
		return null;
	}
    public boolean checkTitleValidation(String title) {
        int count = 0;
        for (Media media: itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                count += 1;
                break;
            }
        }
        return count != 0;
    }

    public boolean checkIdValidation(int id) {
        int count = 0;
        for (Media media: itemsOrdered) {
            if (media.getId() == id) {
                count += 1;
                break;
            }
        }
        return count != 0;
    }       


	
    public float totalCost() {
        float cost = 0f;
        
        for (Media medium: itemsOrdered) {
            cost += medium.getCost();
        }
        
        return Math.round(cost * 100.0f) / 100.0f;
    }
    
    public void updateTotalCost() {
		float totalCost = totalCost();
		totalCostProperty.set(totalCost);
	}
    public void playMedia(String title) {
        for (Media m : this.itemsOrdered) {
            if (m.getTitle().equals(title)) {
                if (Playable.class.isAssignableFrom(m.getClass())) {
                    ((Playable) m).play();
                }
            }
        }
    }
	
	public void print() {
		
		System.out.println("********************CART********************");
		System.out.println("Ordered Items:");
		
		for (int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println(i + 1 + ". DVD - " + itemsOrdered.get(i));
		}
		
		System.out.println("Total cost: " + this.totalCost() + " $");
		System.out.println("********************************************");
	}
       
}
