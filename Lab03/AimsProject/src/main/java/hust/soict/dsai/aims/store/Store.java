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
import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemInStore = new ArrayList<>();
        public void addMedia(Media media) {
            if (itemInStore.contains(media)) {
                System.out.println("Media has already added to the cart!");
            } else{
                itemInStore.add(media);
            }
        }

        public void removeMedia(Media media) {
            itemInStore.remove(media);
        }
}
