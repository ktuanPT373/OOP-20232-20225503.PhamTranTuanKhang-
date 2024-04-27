package hust.soict.dsai.aims.media;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khangpt
 */
import java.util.*;
public class Book extends Media{
    private ArrayList<String> authors = new ArrayList<String>();
    private int length;
    
    private String content;
    public Book(String title, int length) {
        super(title);
        this.length = length;
    }
    public Book(String title, String category, float cost, int length) {
        super(title, category, cost);
        this.length = length;
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    public Book(String title, String category, float cost, ArrayList<String> authors, int length, String content) {
        super(title, category, cost);
        this.authors = authors;
        this.length = length;

        this.content = content;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }
    public int getLength() {
        return this.length;
    }

    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
                System.out.println("This author has already been in the list");
        } else {
                authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
                authors.remove(authorName);
        } else {
                System.out.println("This author is not in the list");
        }
    }

    public String toString() {
        return this.getTitle() + "-" + this.getCategory() + "-" + this.authors
                        + "-" + this.length + ": " + this.getCost() + " $" + "\n" + content;
    }

}
