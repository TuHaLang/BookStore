/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.service;

import bookstore.connect.GetConnectDB;
import bookstore.model.Book;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author root
 */
public class BookService{

    public Vector<Book> SelectAll() {
        String sql = "SELECT * FROM book";
        Vector<Book> listBook = null;
        try{
            listBook = new Vector<Book>();
            Connection conn = GetConnectDB.getConnectMSAccess("database/bookstore.accdb");
            Statement statement=conn.createStatement();
            ResultSet result=statement.executeQuery(sql);
            while(result.next()==true){
                Book book = new Book();
                book.setId(result.getInt("id"));
                book.setName(result.getString("name"));
                book.setPrice(result.getInt("price"));
                book.setAuthor(result.getString("author"));
                book.setIdType(result.getInt("idtype"));
                book.setPublicationDate(result.getDate("publicationdate"));
                book.setAmount(result.getInt("amount"));
                listBook.add((Book)book);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return listBook;
    }

    
    public void Delete() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void Update() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void Add() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
