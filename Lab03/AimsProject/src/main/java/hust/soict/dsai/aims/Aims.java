/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.media.MediaComparatorByTitleCost;

import java.util.Collections;

/**
 *
 * @author khangpt
 */
import java.util.List;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;
import java.util.Scanner;
     
public class Aims {
        public static void showMenu(){
              System.out.println("AIMS:");
              System.out.println("--------------------");
              System.out.println("1. View store");
              System.out.println("2. Update store");
              System.out.println("3. See current cart");
              System.out.println("4. Play a media");
              System.out.println("5. Place order");
              System.out.println("0. Back");
              System.out.println("--------------------");
              System.out.println("Please choose a number:0-1-2-3-4-5");
          }
        public static void storeMenu(){
            System.out.println("\nOptions: ");
            System.out.println("------------------------------");
            System.out.println("1. See a medium's details");
            System.out.println("2. Add a medium to cart");
            System.out.println("3. See current cart");
            System.out.println("4. Play a disc");
            System.out.println("0. Back");
            System.out.println("------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");             
          }
 	public static void cartMenu() {
            System.out.println("\nOptions: ");
            System.out.println("------------------------------");
            System.out.println("1. Filter media in cart");
            System.out.println("2. Sort media in cart");
            System.out.println("3. Remove a medium from cart");
            System.out.println("4. Place order");
            System.out.println("5. Play a disc");
            System.out.println("0. Back");
            System.out.println("------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
	}
	private static void filterMediaMenu() {
            System.out.println("Do you want to filter media by id or by title ?");
            System.out.println("------------------------------");
            System.out.println("1. Filter by id");
            System.out.println("2. Filter by title");
            System.out.println("0. Back");
            System.out.println("------------------------------");
            System.out.println("Please choose a number: 0-1-2");
	}
	private static void sortMediaMenu() {
            System.out.println("Do you want to sort the cart by id or by title ?");
            System.out.println("------------------------------");
            System.out.println("1. Sort by title");
            System.out.println("2. Sort by cost");
            System.out.println("0. Back");
            System.out.println("------------------------------");
            System.out.println("Please choose a number: 0-1-2");
	}
        private static void updateStoreMenu() {
            System.out.println("\nOptions: ");
            System.out.println("------------------------------");
            System.out.println("0. Back");
            System.out.println("1. Add a media to the store");
            System.out.println("2. Remove a media from the store");
            System.out.println("------------------------------");
            System.out.println("Please choose a number: 0-1-2");
	}
        public static void sortCartMenu() {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Sort medias by title");
            System.out.println("2. Sort medias by cost");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");         
        }      
	public static void main(String[] args) {		
            //Create a new cart
            Cart userCart = new Cart();

            //Create new dvd objects and add them to the cart
            Media dvd1 = new DigitalVideoDisc("The Lion King",
                            "Amimation", "Roger Allers", 87, 19.95f);
            //cart.addDigitalVideoDisc(dvd1);

            Media dvd2 = new DigitalVideoDisc("Star Wars",
                            "Science Fiction", "George Lucas", 87, 24.95f);
            //cart.addDigitalVideoDisc(dvd2);

            Media dvd3 = new DigitalVideoDisc("Aladin", 
                            "Amimation", 18.99f);
            //cart.addDigitalVideoDisc(dvd3);

            Media dvd4 = new DigitalVideoDisc("End Game");

            Book book1 = new Book("Harry Poster", "Wizard", 10f);
            book1.addAuthor("Conan Doyle");
            book1.addAuthor("JK Rolling");

            //print total cost of the items in the cart
            //System.out.println("Total Cost is: " + cart.totalCost());

            //Remove dvds from cart
            //cart.removeDigitalVideoDisc(dvd1);
            //cart.removeDigitalVideoDisc(dvd4);

            //add a list of dvds to the cart
            //DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3, dvd4};
            //cart.addDigitalVideoDisc(dvdList);

            //Create a store
            Scanner user = new Scanner(System.in);

            Store store = new Store();
            store.addMedia(dvd1);
            store.addMedia(dvd2); 
            store.addMedia(dvd3); 
            store.addMedia(dvd4);
            store.addMedia(book1);
            Cart cart = new Cart();
   
            program:
            while (true) {
                showMenu();
                int menuOption = Integer.parseInt(user.nextLine());

                //exit
                while (menuOption == 0) {
                    break program;
                }

                store:
                while (menuOption == 1) {
                    store.displayMedia();
                    storeMenu();
                    int storeOption = Integer.parseInt(user.nextLine());

                    while (storeOption == 0) {
                        break store;
                    }

                    while (storeOption == 1) {
                        System.out.print("Enter title: ");
                        String title = user.nextLine();
                        Media dvd = store.searchByTitle(title);
                        if (dvd == null) {
                            System.out.println("Invalid title.");
                        } else {
                            System.out.println("Media's detail: " + dvd);
                        }
                        while (dvd != null) {
                            System.out.print("Add that media to your cart? (Y/N): ");
                            String addOption = user.nextLine();
                            if (addOption.equals("Y")) {
                                cart.addMedia(dvd);
                                break;
                            } else if (addOption.equals("N")) {
                                break;
                            } else {
                                System.out.println("Invalid input.");
                            }
                        }
                        break;
                    }

                    while (storeOption == 2) {
                        System.out.print("Enter title: ");
                        String title = user.nextLine();
                        Media dvd = store.searchByTitle(title);
                        if (dvd == null) {
                            System.out.println("Invalid title.");
                        } else {
                            cart.addMedia(dvd);
                        }
                        break;
                    }

                    cart:
                    while (storeOption == 3) {
                        cart.getItemsOrdered();
                        cartMenu();
                        int cartOption = Integer.parseInt(user.nextLine());

                        while (cartOption == 0) {
                            break cart;
                        }

                        filter:
                        while (cartOption == 1) {
                            filterMediaMenu();
                            int filterOption = Integer.parseInt(user.nextLine());

                            if (filterOption == 0) {
                                break filter;
                            } else if (filterOption == 1) {
                                System.out.print("Enter ID: ");
                                int id = user.nextInt();
                                cart.searchById(id);
                            } else if (filterOption == 2) {
                                System.out.print("Enter title: ");
                                user.nextLine(); 
                                String title = user.nextLine();
                                cart.searchByTitle(title);
                            }
                        }

                        sort:
                        while (cartOption == 2) {
                            sortCartMenu();
                            int sortOption = Integer.parseInt(user.nextLine());

                            if (sortOption == 0) {
                                break sort;
                            } else if (sortOption == 1) {
                                Collections.sort(cart.getItemsOrdered(), new MediaComparatorByTitleCost());
                                cart.getItemsOrdered();
                            } else if (sortOption == 2) {
                                Collections.sort(cart.getItemsOrdered(), new MediaComparatorByCostTitle());
                                cart.getItemsOrdered();
                            }
                        }

                        while (cartOption == 3) {
                            System.out.print("Enter title: ");
                            String title = user.nextLine();
                            ArrayList<Media> cartTmp = cart.getItemsOrdered();
                            for (Media m : cartTmp) {
                                if (m.getTitle().equals(title)) {
                                    cart.removeMedia(m);
                                }
                            }
                            System.out.println("The number of medias in the cart: " + cart.getItemsOrdered().size());
                            break;
                        }

                        while (cartOption == 4) {
                            System.out.println("An order is created.");
                            cart.getItemsOrdered().clear();
                            break;
                        }

                        while (cartOption == 5) {
                            System.out.print("Enter title: ");
                            String title = user.nextLine();
                            store.playMedia(title);
                            }
;                           break;
                        
                    }

                    while (storeOption == 4) {
                        System.out.print("Enter title: ");
                        String title = user.nextLine();
                        store.playMedia(title);
                        break;
                    }
                }

                update:
                while (menuOption == 2) {
                    updateStoreMenu();
                    int updateOption = Integer.parseInt(user.nextLine());

                    while (updateOption == 0) {
                        break update;
                    }

                    while (updateOption == 1) {
                        System.out.println("Enter the DVD's detail: ");
                        System.out.println("--------------------------------");
                        System.out.print("Title: ");
                        String title = user.nextLine();
                        System.out.print("Category: ");
                        String category = user.nextLine();
                        System.out.print("Cost: ");
                        float cost = Float.parseFloat(user.nextLine());
                        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, cost);
                        store.addMedia(dvd);
                        break;
                    }

                    while (updateOption == 2) {
                        System.out.print("Enter title: ");
                        String title = user.nextLine();
                        Media dvd = store.searchByTitle(title);
                        store.removeMedia(dvd);
                        break;
                    }

                }

                cart:
                while (menuOption == 3) {
                    cart.getItemsOrdered();
                    cartMenu();
                    int cartOption = Integer.parseInt(user.nextLine());

                    while (cartOption == 0) {
                        break cart;
                    }

                    filter:
                    while (cartOption == 1) {
                        filterMediaMenu();
                        int filterOption = Integer.parseInt(user.nextLine());

                        if (filterOption == 0) {
                            break filter;
                        } else if (filterOption == 1) {
                            System.out.println("Enter ID: ");
                            int id = Integer.parseInt(user.nextLine());
                            cart.searchById(id);
                        } else if (filterOption == 2) {
                            System.out.print("Enter title: ");
                            user.nextLine(); //consume blank
                            String title = user.nextLine();
                            cart.searchByTitle(title);
                        }
                    }

                    sort:
                    while (cartOption == 2) {
                        sortCartMenu();
                        int sortOption = Integer.parseInt(user.nextLine());

                        if (sortOption == 0) {
                            break sort;
                        } else if (sortOption == 1) {
                            Collections.sort(cart.getItemsOrdered(), new MediaComparatorByTitleCost());
                            cart.getItemsOrdered();
                        } else if (sortOption == 2) {
                            Collections.sort(cart.getItemsOrdered(), new MediaComparatorByCostTitle());
                            cart.getItemsOrdered();
                        }
                    }

                    while (cartOption == 3) {
                        System.out.print("Enter title: ");
                        String title = user.nextLine();
                        ArrayList<Media> cartTmp = cart.getItemsOrdered();
                        for (Media m : cartTmp) {
                            if (m.getTitle().equals(title)) {
                                cart.removeMedia(m);
                            }
                        }
                        System.out.println("The number of medias in the cart: " + cart.getItemsOrdered().size());
                        break;
                    }
                    while (cartOption == 4) {
                        System.out.println("An order is created.");
                        cart.getItemsOrdered().clear();
                        break;
                    }

                    while (cartOption == 5) {
                        System.out.println("Enter title: ");
                        String title = user.nextLine();
                        cart.playMedia(title);
                        break;
                    }

                }
                user.close();
            }
        }
}
