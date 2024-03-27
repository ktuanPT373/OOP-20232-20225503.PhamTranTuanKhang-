/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khangpt
 */
public class Aims {
    public static void main(String[] args){
        
        // Create a new class
        // Create a new class
        Cart anOrder = new Cart();

        // Create new dvd object and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);  

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);  
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
        
        // Test for existing disc
        DigitalVideoDisc existDVD = dvd2;
        anOrder.removeDigitalVideoDisc(existDVD);

        // Test for non-exist disc
        DigitalVideoDisc nonEDVD = new DigitalVideoDisc("Start War", "Science Fic", "George", 8, 24.9f);
        anOrder.removeDigitalVideoDisc(nonEDVD);
    }
}
