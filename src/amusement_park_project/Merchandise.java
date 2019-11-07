/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amusement_park_project;

import java.util.ArrayList;

/**
 *
 * @author sabina
 * Class for creating Merchandise type of objectS
 */

public class Merchandise {
    long id;
    String category;
    String description;
    double price;
    boolean inStock;

    //constructor

    public Merchandise(String id, String category, String description, double price, boolean inStock) {
        this.category = category;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    //Getters setter methods
    
    //gives id of the merchandise
    public String getId() {
        return Long.toString(id);
    }

    public void setId(long id) {
        this.id = id;
    }
    // gives type of merchandise
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    //gives some description about the merchandise
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //gives prices of ach merchandise
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //
    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean newStatus) {
        this.inStock = newStatus;
    }

    //tostring method

    @Override
    public String toString() {
        return "Merchandise{" + "ID=" + id + ", Category=" + category + ", description=" + description + ", price=" + price + ", inStock=" + inStock + '}';
    }

}