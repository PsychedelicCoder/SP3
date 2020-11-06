/*
@Annika
 */

// Her skal vi kunne se de aktive ordre, de skulle vises som en liste og sorteres efter afhentning.
// Når ordren er afhentet skal den sendes hen til de inaktive ordre.
// tænker også at den skal kunde hente kundens kunde nummer og kunne vise den valgte pizza og pris fra menuen.

import java.sql.Timestamp;
import java.util.Date;
import java.io.*;
import java.util.ArrayList;

public class ActiveOrders implements Serializable{

    //opret ordre
    //evt sæt dem i en liste
    // - og så de kan rykkes evt

    String pizza;
    //price skal laves til en metode
    int price;
    Timestamp timeForOrder;
    //pickup time skal laves til metode
    Timestamp pickupTime;

    public ActiveOrders(String pizza, int price){
        this.pizza = pizza;
        this.price = price;
        calculateTimeForOrder();

        System.out.println("Pizza:" + pizza + "Total amount:" + price + "Order placed at:" + calculateTimeForOrder());
    }

    //tidsmetode
    //man udregne hvad tid og dato, ordren er lagt
    private Timestamp calculateTimeForOrder(){
        Date date = new Date();
        timeForOrder = new Timestamp(date.getTime());
        return timeForOrder;
    }
    //pick up time metode
    //skal udregnes for pizzaernes præp tid.
    private Timestamp pickupTime(){
        Date date = new Date();
        pickupTime = new Timestamp(date.getTime());
        return pickupTime;
    }

    //Pris metode
    //kan udregne prisen for alle pizzaerne i ordrene
}
