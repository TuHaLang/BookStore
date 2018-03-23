/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.model;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author PHAM_HUNG
 */
public class Managa {

    int idcustomer;
    Date dateBuy;
    int totalMoney;
    String listid;

    public String getListid() {
        return listid;
    }

    public void setListid(String listid) {
        this.listid = listid;
    }

    public Managa() {
    }

    public Vector<Integer> getListId(String listid) {
        Vector<Integer> listID = new Vector<>();
        listid = listid.trim();
        String list[] = listid.split(";");
        for (int i = 0; i < list.length; i++) {
            //if(list[i].matches("//d+") && ! list[i].equals(null)){
            listID.add(Integer.parseInt(list[i]));
            
            //}
        }
        return listID;
    }

    public Managa(int idcustomer, Date dateBuy, int totalMoney) {
        this.idcustomer = idcustomer;
        this.dateBuy = dateBuy;
        this.totalMoney = totalMoney;
    }

    public int getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(int idcustomer) {
        this.idcustomer = idcustomer;
    }

    public Date getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(Date dateBuy) {
        this.dateBuy = dateBuy;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

}
