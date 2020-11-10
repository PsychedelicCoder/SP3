/*
@Annika
@Oliver Jenbo
 */

// Her skal vi kunne se de aktive ordre, de skulle vises som en liste og sorteres efter afhentning.
// Når ordren er afhentet skal den sendes hen til de inaktive ordre.
// tænker også at den skal kunde hente kundens kunde nummer og kunne vise den valgte pizza og pris fra menuen.

import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Date;
import java.io.*;
import java.util.List;

public class Order implements Serializable {

    Bestillinger bestillinger = new Bestillinger();


<<<<<<< HEAD
=======

>>>>>>> 61a1bff6aac0f8768ad0942c95281000fa3040ca
    //opret ordre
    //evt sæt dem i en liste
    // - og så de kan rykkes evt

    List<Pizza> pizzas;

    String pizza;
    //price skal laves til en metode
    int price;
    Timestamp timeForOrder;
    //pickup time skal laves til metode
    Timestamp pickupTime;
    Customer customer;
<<<<<<< HEAD

=======
>>>>>>> 61a1bff6aac0f8768ad0942c95281000fa3040ca



    public Order(Customer customer) {
        pizzas = new ArrayList<>();
        this.customer = customer;
    }

<<<<<<< HEAD
    public void addPizzaToOrder(Pizza pizza) {
        this.pizzas.add(pizza);
    }
=======
    public void addPizzaToOrder(Pizza pizza){
        this.pizzas.add(pizza);
    }

    public Order(Customer customer){
        pizzas = new ArrayList<>();
        this.customer = customer;
    }

>>>>>>> 61a1bff6aac0f8768ad0942c95281000fa3040ca

    //tidsmetode
    //man udregne hvad tid og dato, ordren er lagt
    private Timestamp calculateTimeForOrder() {
        Date date = new Date();
        timeForOrder = new Timestamp(date.getTime());
        return timeForOrder;
    }

    //pick up time metode
    //skal udregnes for pizzaernes præp tid.
    private Timestamp pickupTime() {
        Date date = new Date();
        pickupTime = new Timestamp(date.getTime());
        return pickupTime;
    }

<<<<<<< HEAD
=======
    public int totalPrice() {
        price = 0;
        for (int i = 0; i <bestillinger.getOrders().size(); i++) {
            price += price = totalPrice();
>>>>>>> 61a1bff6aac0f8768ad0942c95281000fa3040ca



}
