/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.sales.model;

import java.util.ArrayList;

/**
 *
 * @author Compu Academy
 */
public class Bill {
    private int number;
    private String date; 
    private String client;
    private ArrayList<BillItem>billItems;
    
    public Bill() {
    }

    public Bill(int number, String date, String client) {
        this.number = number;
        this.date = date;
        this.client = client;
    }
 
    public double getBillTotal() {
        double total = 0.0;
        for (BillItem item : getBillItems()) {
            total += item.getItemTotal();
        }
        return total;
    }

    public String getClient() {
        return client;
    }

    public ArrayList<BillItem> getBillItems() {
        if(billItems == null){
            billItems = new ArrayList<>();
        }
        return billItems;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getCsv(){
        return number +"," + date + "," + client + ",";
    }

    @Override
    public String toString() {
        return "Bill{" + "number=" + number + ", date=" + date + ", client=" + client + '}';
    }
    
    
}
