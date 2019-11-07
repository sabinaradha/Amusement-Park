/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amusement_park_project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author sabina
 * 
 */
public class AmusementParkTester {
    public static void main(String args[]) throws Exception{
        //Object of AmusementPark is created named Walden Amusement Park
        AmusementPark park = new AmusementPark( "Walden Amusement Park");
        //creating tickets
        Ticket ticket1 = new Ticket(123,"Book store","John",new Date(12/1/2018),76.00,true);
        Ticket ticket2 = new Ticket(456,"Book store","Peter",new Date(12/2/2018),37.00,true);
        Ticket ticket3 = new Ticket(789,"Book store","Riaz",new Date(12/3/2018),65.00,true);

        //adding tickets to the park
        park.addTicket(ticket1);
        park.addTicket(ticket2);
        park.addTicket(ticket3);

        //creating Merchandise
        Merchandise merchandise1 = new Merchandise("123","Book Store","Booking store",43.00,true);
        Merchandise merchandise2 = new Merchandise("456","Book Store","Booking store",87.00,true);
        Merchandise merchandise3 = new Merchandise("789","Book Store","Booking store",98.00,true);

        //adding merchandise to the park
        park.addMerchandise(merchandise1);
        park.addMerchandise(merchandise2);
        park.addMerchandise(merchandise3);

        Scanner sc = new Scanner(System.in);
        //showing menu from selecting the option and perform task as desired
        while(true){
            System.out.println("1. Buy ticket    2.Buy merchandise    3.Exit");
            int choice = sc.nextInt();
            //reading choice
            if(choice == 1){
                System.out.println("Enter id: ");
           
                long id = sc.nextLong();
                park.buyTicket(id);
            } else if(choice == 2){
                System.out.println("Enter id: ");
                int i = sc.nextInt();
                String id = Integer.toString(i);
                park.buyMerchandise(id);
            } else{
                System.out.println("Thank you");
                break;
            }
            
        }
       
    }
}