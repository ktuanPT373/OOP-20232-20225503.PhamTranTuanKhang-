/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.screen.manager;

import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author khangpt
 */
public class StoreManagerScreen extends JFrame {
    private Store store;
    JPanel centerPanel;

    public StoreManagerScreen(Store store) {
        this.store = store;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        centerPanel = createCenter();
        cp.add(centerPanel, BorderLayout.CENTER);

        setTitle("Store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenuItem viewStoreMenu = new JMenuItem("View store");
        menu.add(viewStoreMenu);
        viewStoreMenu.addActionListener(new btnMenuListener());

        JMenu smUpdateStore = new JMenu("Update store");
        JMenuItem addBookMenu = new JMenuItem("Add Book");
        JMenuItem addCDMenu = new JMenuItem("Add CD");
        JMenuItem addDVDMenu = new JMenuItem("Add DVD");

        smUpdateStore.add(addBookMenu);
        smUpdateStore.add(addCDMenu);
        smUpdateStore.add(addDVDMenu);
        menu.add(smUpdateStore);

        addBookMenu.addActionListener(new btnMenuListener());
        addDVDMenu.addActionListener(new btnMenuListener());
        addCDMenu.addActionListener(new btnMenuListener());

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (int i=0; i<mediaInStore.size(); i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }

        return center;
    }

    private class btnMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("Add DVD")) {
                new AddDigitalVideoDiscToScreen(store);
            } else if (command.equals("Add Book")) {
                new AddBookToStoreScreen(store);
            } else if (command.equals("Add CD")) {
                new AddCompactDiscToStoreScreen(store);
            } else if (command.equals("View Store")) {
                new StoreManagerScreen(store);
            }
            dispose();
        }
    }

    public static void main(String[] args) {

        Store store = new Store();
        Media media1 = new DigitalVideoDisc("a1", "a", "b", 10, 20);
        Media media2 = new Book("a2", "a", 10);
        Media media3 = new CompactDisc("a3");
        Media media4 = new Book("a4",33);
        Media media5 = new DigitalVideoDisc("a5");
        Media media6 = new Book("a6",12);
        Media media7 = new CompactDisc("a7");
        Media media8 = new DigitalVideoDisc("a8");
        Media media9 = new DigitalVideoDisc("a9");

        store.addMedia(media1);
        store.addMedia(media2);
        store.addMedia(media3);
        store.addMedia(media4);
        store.addMedia(media5);
        store.addMedia(media6);
        store.addMedia(media7);
        store.addMedia(media8);
        store.addMedia(media9);
        
        new StoreManagerScreen(store);
    }
}
