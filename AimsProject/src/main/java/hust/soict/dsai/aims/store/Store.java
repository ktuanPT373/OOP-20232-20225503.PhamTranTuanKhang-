package hust.soict.dsai.aims.store;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khangpt
 */
import java.util.ArrayList;

import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();
        public void addMedia(Media media) {
            if (itemsInStore.contains(media)) {
                System.out.println("Media has already added to the cart!");
            } else{
                itemsInStore.add(media);
            }
        }
        public ArrayList<Media> getItemsInStore() {
            return itemsInStore;
	}

        public void removeMedia(Media media) {
            itemsInStore.remove(media);
        }
        public Media searchByTitle(String title) {
		
		for (Media medium: itemsInStore) {
			if (medium.getTitle().equals(title)) {
                            System.out.println("Successfully found medium with id " + title + " in store");
                            return medium;
			}
		}
		
		System.out.println("No matching medium with id " + title + " is found in store");
                return null;
	}
        public Media searchById(int id) {
                    for (Media medium: itemsInStore) {
                            if (medium.getId() == id) {
                                    System.out.println("Successfully found medium with id " + id + " in store");
                                    return medium;
                            }
                    }

                    System.out.println("No matching medium with id " + id + " is found in store");
                    return null;
              
	}
	public void displayMedia() {
            for (Media medium: itemsInStore) {
                    System.out.println(medium);
            }
	}     
    public void playMedia(String title) throws PlayerException {
        for (Media m : this.itemsInStore) {
            if (m.getTitle().equals(title)) {
                if (Playable.class.isAssignableFrom(m.getClass())) {
                    ((Playable) m).play();
                }
            }
        }
    }

	
}
