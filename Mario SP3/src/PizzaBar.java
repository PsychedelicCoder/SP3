/*
@Annika
 */

// Det er her de begge skal kunne se de aktive ordre, det er også her man skal kunne tilføje nye ordre.
// Og man skal også kunne fjerne de færdige odre over i inaktive ordre.
// Der skal gøres brug af en eller anden form for scanner i det den skal afvente et input fra Alfons når der,
// skal tilføjes en ny ordre eller slettes en færdig en.

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaBar {

    Bestillinger bestillinger = new Bestillinger();

    Menu menu = new Menu();
    Ui ui = new Ui();

    Scanner sc = new Scanner(System.in);
    int choice = 0;
    int exitValue = 6;

    ArrayList<Order> orderServices = new ArrayList<>();

    public void runProgram() {

        System.out.println(
                "Press 1 to see menu" + '\n' +
                        "Press 2 to see costumers and orders" + '\n' +
                        "Press 3 to see active orders" + '\n' +
                        "Press 4 to see previous orders" + '\n' +
                        "Press 5 to move order from active to previous" + '\n' +
                        "Press 6 to exit program");

        while (choice != exitValue) {

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    seeMenu();
                    break;
                case 2:
                    newCostumerAndOrder();
                    break;
                case 3:
                    seeActiveOrder();
                    break;
                case 4:
                    seeInactiveOrder();
                    break;
                case 5:
                    moveOrder();
                case 6:
                    exit();
                    break;
                default:
                    choice = exitValue;
            }

        }
    }

    private void seeMenu() {
        menu.readFile();

<<<<<<< HEAD
        for (Pizza pizza : menu.getPizzas()) {
=======
        for (Pizza pizza:menu.getPizzas()) {
>>>>>>> 61a1bff6aac0f8768ad0942c95281000fa3040ca
            System.out.println(pizza);
        }

    }


    private void newCostumerAndOrder() {
        Customer customer = new Customer(1, 1, "");
        ui.newCustommer(customer);
<<<<<<< HEAD
=======

        Order o1 = new Order("", 1);
        //ui.newOrder(o1);

>>>>>>> 61a1bff6aac0f8768ad0942c95281000fa3040ca

        Ui ui = new Ui();
        Order order = new Order(customer);

<<<<<<< HEAD
        ui.newOrder(order, menu);
        orderServices.add(order);
=======
        Order p1 = new Order(customer);
        orderServices.add(p1);

>>>>>>> 61a1bff6aac0f8768ad0942c95281000fa3040ca

    }

    private void seeActiveOrder() {

    }

    private void seeInactiveOrder() {
        bestillinger.readOrdersFromFile();

    }

    private void moveOrder() {
        bestillinger.writeOrdersToFile();

    }

    private int exit() {
        while (choice != exitValue) {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Do you want to exit? press 6, else press 1");
                    return 6;

                case 2:

                    return 1;

                default:
                    return 1;
            }
        }
        return 1;
    }

 /*   public int totalPrice() {
        price = 0;
        for (int i = 0; i < bestillinger.getOrders().size(); i++) {
            price += price;

        }
        return price;
        //Pris metode
        //kan udregne prisen for alle pizzaerne i ordrene

    }

  */
}
