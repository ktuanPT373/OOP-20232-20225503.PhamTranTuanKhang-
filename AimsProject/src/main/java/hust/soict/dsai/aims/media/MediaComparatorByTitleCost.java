/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.media;

/**
 *
 * @author khangpt
 */
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    public int compare(Media media1, Media media2) {
        try {
            int titleDiff = media1.getTitle().compareTo(media2.getTitle());
            if (titleDiff != 0) {
                return titleDiff;
            }

            float costDiff = media1.getCost() - media2.getCost();
            if (costDiff > 0) {
                return 1;
            } else if (costDiff < 0) {
                return -1;
            }
            return 0;
        } catch (NullPointerException e) {
            return -1;
        }
    }
}
