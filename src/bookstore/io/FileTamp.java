/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.io;

import bookstore.model.Book;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class FileTamp {

    public static void saveFile(ArrayList<Book> listBookTamp, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listBookTamp);
            oos.close();
            fos.close();
            //return true;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
        //return false;
    }

    public static ArrayList<Book> readFile(String path) {
        ArrayList<Book> listBookTamp = new ArrayList<Book>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            if (data == null) {
                return null;
            }
            listBookTamp = (ArrayList<Book>) data;
            ois.close();
            fis.close();
            return listBookTamp;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
