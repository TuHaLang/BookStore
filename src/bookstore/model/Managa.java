/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.model;

import java.util.Date;

/**
 *
 * @author PHAM_HUNG
 */
public class Managa {
    int idcustomer;
    Date dateBuy;
    int totalMoney;

    public Managa() {
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
