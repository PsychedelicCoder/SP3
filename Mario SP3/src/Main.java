/*
@AUTHOR_TMP
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PizzaBar pb = new PizzaBar();
        pb.runProgram();
        Menu.readFile();


        //inactiveOrders stuff :D
        InactiveOrders.inactiveOrdersWriteFile();


        //Customer stuff :P
        Customer customer = new Customer(1, 1, "");
        customer.customerNumberGen();
        customer.customerInput();

        //TODO: Finde ud af en måde hvorpå den aktive ordre class kan gribe de/den nyoprettede Customer Class object.

        /*

        1) Tilføj en ny bestilling. (Bagefter skal programmet returnere her tilbage igen og afvente nyt svar.)
        2) Fjern en Aktiv bestilling. (samme som når man tilføjer en ordre.)
        3) Se alle aktive bestillinger "Sorteret efter afhentning". (Her skal den bare liste alle aktive bestillinger, men med en valgmulighed til at returnere her tilbage igen)
        4) Se alle inaktive bestillinger. (der skal den bare printe txt filen med inaktive bestillinger, og med en valgmulighed til at returnere tilbage.)
        5) Se menu kort
        6) Exit / afslut.

        */


        ActiveOrders p1 = new ActiveOrders("whatever", 190);
        ArrayList<ActiveOrders> activeOrders = new ArrayList<>();
        activeOrders.add(p1);


    }

    public static void addActiveOrder() {

    }

    public static void removeActiveOrder() {

    }

    public static void listActiveOrders() {

    }

    public static void listInactiveOrders() {

    }

    public static void exit() {

    }


}
