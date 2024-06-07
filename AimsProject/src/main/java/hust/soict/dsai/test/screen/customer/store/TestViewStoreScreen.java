package hust.soict.dsai.test.screen.customer.store;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.customer.controller.ViewStoreController;
import hust.soict.dsai.aims.store.Store;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class TestViewStoreScreen extends Application {
	private static Store store;
	private static Cart cart;
	@Override
	public void start(Stage primaryStage) throws Exception {
		final String STORE_FXML_FILE_PATH = "/hust/soict/dsai/aims/screen/customer/view/Store.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
		ViewStoreController viewStoreController = new ViewStoreController(store,cart);
		fxmlLoader.setController(viewStoreController);
		Parent root = fxmlLoader.load();
		
		primaryStage.setTitle("Store");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
    }

	public static void main(String[] args) throws LimitExceededException {
        store = new Store();
        cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Finding Nemo", "Animation", "Andrew Stanton", 100, 14.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 19.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Toy Story", "Animation", "John Lasseter", 81, 12.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Matrix", "Science Fiction", "Lana Wachowski", 136, 18.95f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Matrix Reloaded", "Science Fiction", "Lana Wachowski", 138, 19.95f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Matrix Revolutions", "Science Fiction", "Lana Wachowski", 129, 20.95f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Jurassic Park", "Science Fiction", "Steven Spielberg", 127, 17.95f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 22.95f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Interstellar", "Science Fiction", "Christopher Nolan", 169, 24.99f);
        
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);
        store.addMedia(dvd6);
        store.addMedia(dvd7);
        store.addMedia(dvd8);
        store.addMedia(dvd9);
        cart.addMedia(dvd1);
        cart.addMedia(dvd3);
        launch(args);
    }
}