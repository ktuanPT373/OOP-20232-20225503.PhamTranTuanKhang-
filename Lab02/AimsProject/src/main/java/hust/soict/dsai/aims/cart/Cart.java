/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

/**
 *
 * @author khangpt
 */
public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;    
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered < MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("This disc " + disc.getTitle() + "has been added to cart");
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("Warning : The cart is almost full");
            }
        }else {
            System.out.println("Error : The cart is full, cound not add the disc "+disc.getTitle() + " to the cart");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        boolean found = false;
        
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i].equals(disc)){
                found = true;
                for (int j = i; j < qtyOrdered; j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc "+ disc.getTitle() + " has been removed from the cart");
            }
        }
        if (!found){
            System.out.println("The disc " + disc.getTitle() + "is not found in the cart");
        }
    }
    
    public double totalCost(){
        double total = 0.0;
        for (int i = 0; i < qtyOrdered; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    public void print(){
        System.out.println("*********************CART**********************");
        for (int i = 0; i < qtyOrdered;i++){
            System.out.println((i+1)+" ");
            System.out.println(itemsOrdered[i].toString());
        }
        System.out.println("Total cost: "+ totalCost());
        System.out.println("***********************************************");
    }
    public void SearchByTitle(String title) {
        int count = 0;
        for (DigitalVideoDisc disc: itemsOrdered) {
            if (disc.isMatch(title)){
                System.out.println(disc.toString());
                count++;
            }
        }
        if (count==0) {
            System.out.println("No item found in the cart !");
        } else{
            System.out.println("---------------------------");
            System.out.println("Total found items: "+count);
        }
           
    }
    
}
