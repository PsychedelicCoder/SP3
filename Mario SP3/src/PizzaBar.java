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

        for (Pizza pizza:menu.getPizzas()) {
            System.out.println(pizza);
        }

    }


    private void newCostumerAndOrder() {
        Customer customer = new Customer(1, 1, "");
        ui.newCustommer(customer);

        Order o1 = new Order("", 1);
        //ui.newOrder(o1);



        Order p1 = new Order(customer);
        orderServices.add(p1);


    }

    private void seeActiveOrder() {

    }

    private void seeInactiveOrder() {
        bestillinger.readOrdersFromFile();

    }

    private void moveOrder() {
        bestillinger.writeOrdersToFile();

    }

    private void exit() {

    }
}
