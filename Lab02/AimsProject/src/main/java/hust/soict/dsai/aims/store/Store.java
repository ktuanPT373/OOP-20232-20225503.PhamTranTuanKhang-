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
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private ArrayList<DigitalVideoDisc> itemInStore = new ArrayList<>();
    public void addDVD(DigitalVideoDisc disc){
        itemInStore.add(disc);
    }
    public void removeDVD(DigitalVideoDisc disc){
        itemInStore.remove(disc);
    }
}
