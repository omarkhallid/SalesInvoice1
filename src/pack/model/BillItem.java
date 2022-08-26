/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.model;

/**
 *
 * @author Compu Academy
 */
public class BillItem {
    private String item;
    private double price;
    private int count;
    private Bill bill;

    public BillItem() {
    }

    public BillItem(String item, double price, int count, Bill bill) {

        this.item = item;
        this.price = price;
        this.count = count;
        this.bill = bill;
    }
    
    public double getItemTotal() {
        
        return price * count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public String getCsv() {
        return bill.getNumber() + "," + item + "," + price + "," + count;
    }


    @Override
    public String toString() {
        return "BillItem{" + "number=" + bill.getNumber() + ", item=" + item + ", price=" + price + ", count=" + count + '}';
    }

    public Bill getBill() {
        return bill;
    }
    
    
}
