/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.store;

/**
 *
 * @author khangpt
 */
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class StoreTest {
    public static void main(String[] args) {
        ArrayList<Media> itemsInStore = new ArrayList<>();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Sieu nhan gao", "hanh dong", "Mohamed Salah", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Thuy thu mat trang", "hanh dong", "CR7", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Hao quang ruc ro", "M10", 18.99f);
        itemsInStore.add(dvd1);
        Store store = new Store();
        store.addMedia(dvd2);
        store.removeMedia(dvd2);
        store.removeMedia(dvd3);
    }
}
