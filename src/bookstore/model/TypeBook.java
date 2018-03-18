/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.model;

import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author PHAM_HUNG
 */
public class TypeBook {
    private int id;
    private String name;
    private Vector<Book> listBook;

    public TypeBook() {
        listBook = new Vector<Book>();
    }

    public TypeBook(int id, String name) {
        this.id = id;
        this.name = name;
        listBook = new Vector<Book>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Book> getListBook() {
        return listBook;
    }

    public void setListBook(Vector<Book> listBook) {
        this.listBook = listBook;
    }
    
    
    
    public void addBook(Book book){
        book.setIdType(this.id);
        listBook.add(book);
    }

    @Override
    public String toString() {
        return this.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
