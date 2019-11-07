/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amusement_park_project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sabina
 * 
 */
public class AmusementPark {
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    ArrayList<Merchandise> merchandise = new ArrayList<Merchandise>();
    String name;

    //constructor

    public AmusementPark(String name) {
        this.name = name;
    }

    //Getter setter methods
   //gives number of ticket available for specified date
    public int getTickets(Date date) {
        int count = 0;
        for (int i = 0; i < tickets.size(); i++){
           if (date.compareTo(tickets.get(i).date) == 0){
               count++;
           }
       }
       return count;  
    }
    //gives ticket which matches specified ticket number
    public Ticket getTicket(long id){
       for(Ticket item:tickets) {
           if(item.getNumber()==id){
               return item;
           }
       }
        return   null;
    }

    public void addTicket(Ticket tickets) {
        this.tickets.add(tickets);
    }

    public void addMerchandise(Merchandise merchandise) {
        this.merchandise.add(merchandise);
    }
     // gives name of the bookstore
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // gives list of ticket for which dates are still available
    public ArrayList<Date> getTicketDates(){
        ArrayList<Date> temp = new ArrayList<Date>();
       for (int i = 0; i < tickets.size(); i++){
           temp.add(tickets.get(i).date);
       }
       return temp;
        
    }
   //removes ticket object from the list of ticket items of amusement park
   public void buyTicket (long id)throws Exception{ 
        boolean found=false;
        int index=-1;
        for(int i=0;i<tickets.size();i++){
            if(tickets.get(i).getNumber()==id) {
                found=true;
                index=i;
                System.out.println("Successfully bought the ticket");
                System.out.println(tickets.toString());
            }
        }
        if(!found) {
            throw new Exception("Selected ticket not found");
        } else{
            tickets.remove(index);
        }
    } 
   //returns arraylist of merchandise all the inventory 
    public ArrayList<Merchandise> getMerchandise(){
        ArrayList<Merchandise> merchandiseList=merchandise;
        return   merchandiseList;
    }
    //gives the list of merchandise whose category matches the given category
    public ArrayList<Merchandise> getMerchandise(String category){
         ArrayList<Merchandise> merchandiseList=new ArrayList<Merchandise>();
        for(Merchandise item: merchandise){
            if(item.getCategory().equals(category)){
                merchandiseList.add(item);
            }
    }
        return   merchandiseList;
    }
    //gives merchandise whose id matches the specified id
    public Merchandise getMerchandise (long id){        
         for(Merchandise item: merchandise){
            if(item.getId()==Long.toString(id)){
                return item;
        }
    }
        return null;
    }
    //removes the merchandise object from the list merchandise
    public void buyMerchandise (String id) throws Exception{ 
        boolean found=false;
        int index=-1;
        for(int i=0;i<merchandise.size();i++) {
            if(merchandise.get(i).getId()== id){
                found=true;
                System.out.println("Successfully bought the merchandise");
                System.out.println(merchandise.toString());
                
                index=i;
            }
      
        }
   
        if(!found) {
            throw new Exception("Selected merchandise not found");
        } else{
            merchandise.remove(index);
        }

    }



    //tostring method

    @Override
    public String toString() {
    return "AmusementPark{" + "tickets=" + tickets + ", merchandise=" + merchandise + ", name=" + name + '}';
    }

}