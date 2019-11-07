/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amusement_park_project;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sabina
 * 
 * Class for creating Ticket type objects
 */
public class Ticket {
    //variabled declared
    long number;
    String category;
    String holder;
    Date date;
    double price;
    boolean purchaseStatus;
    //constructor for creating ticket with all the fields
    public Ticket(long number, String category, String holder, Date date, double price,boolean purchaseStatus) {
        this.number = number;
        this.category = category;
        this.holder = holder;
        this.date = date;
        this.price = price;
        this.purchaseStatus = purchaseStatus;
    }

    //returns ticket number
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    //returns the name of person who holds the ticket
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
     // gives the date ticket was purchased
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    // gives the price of the ticket
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void changePurchaseStatus(boolean newStatus) {
        this.purchaseStatus = newStatus;
    }
    //tostring mmethod

    @Override
    public String toString() {
        return "Ticket{" + "number=" + number + ", Category=" + category + ", holder=" + holder + ", date=" + date + ", price=" + price + '}';
    }

}