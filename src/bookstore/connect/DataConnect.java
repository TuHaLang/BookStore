/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.connect;

import bookstore.ui.AdminUI;
import bookstore.ui.InPutUI;
import bookstore.ui.OutPutUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PHAM_HUNG
 */
public class DataConnect {
    
    public static boolean Login(String user, String pass){
        boolean test = false;
        Connection conn = GetConnectDB.getConnectMSAccess("database/bookstore.accdb");
        int type;
        if(conn != null){
            String sql = "select * from account where username=? and password=?";
            try{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, user);
                statement.setString(2, pass);
                ResultSet result = statement.executeQuery();
                if(result.next()){
                    JOptionPane.showMessageDialog(null, "Login sucessfful !");
                    test=true;
                    type = result.getInt("type");
                    switch(type){
                        case 0:
                            AdminUI ui0 = new AdminUI();
                            ui0.main();
                            break;
                        case 1:
                            InPutUI ui1 = new InPutUI();
                            ui1.main();
                            break;
                        case 2:
                            OutPutUI ui2 = new OutPutUI();
                            ui2.main();
                            break;
                    }
                    
                }
                else JOptionPane.showMessageDialog(null, "Login failed ! Please check user and password !");
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return test;
    }
}
