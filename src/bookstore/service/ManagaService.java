/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.service;

import bookstore.connect.GetConnectDB;
import bookstore.model.Managa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author PHAM_HUNG
 */
public class ManagaService {
    
    public Vector<Managa> SelectAll(){
        try {
            Vector<Managa> listManaga = new Vector<>();
            String sql = "SELECT * FROM managa";
            PreparedStatement preStatement = GetConnectDB.getConnectMSAccess("database/bookstore.accdb").prepareStatement(sql);
            ResultSet result = preStatement.executeQuery();
            while(result.next()){
                Managa managa = new Managa();
                managa.setIdcustomer(result.getInt("idcustome"));
                managa.setTotalMoney(result.getInt("totalmoney"));
                String dateInString = result.getString("date");
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                try {
                    managa.setDateBuy(sdf.parse(dateInString));
                } catch (ParseException ex) {
                    Logger.getLogger(BookService.class.getName()).log(Level.SEVERE, null, ex);
                }
                listManaga.add(managa);
            }
            return listManaga;
        
        } catch (SQLException ex) {
            Logger.getLogger(ManagaService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public boolean Add(Managa managa){
        try {
            String sql = "INSERT INTO managa VALUES(?,?,?)";
            PreparedStatement preStatement = GetConnectDB.getConnectMSAccess("database/bookstore.accdb").prepareStatement(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            String dateInString = sdf.format(managa.getDateBuy());
            preStatement.setString(1, dateInString);
            preStatement.setInt(2, managa.getIdcustomer());
            preStatement.setInt(3, managa.getTotalMoney());
            return preStatement.executeUpdate() >0;
        } catch (SQLException ex) {
            Logger.getLogger(ManagaService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
}
