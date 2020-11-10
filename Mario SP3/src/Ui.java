import java.util.Scanner;

public class Ui {

    Scanner cusInput = new Scanner(System.in);

    public void newOrder(Order order, Menu menu) {

        System.out.println("Vælg Pizza ()");

        int pizzaId = 0;
        int pExit = 99;

        while (pizzaId != pExit) {

            pizzaId = cusInput.nextInt();
            if(pizzaId != pExit) {
                Pizza pizza = menu.getPizzaById(pizzaId);
                order.addPizzaToOrder(pizza);

            }
        }


    }

    public void newCustommer(Customer customer) {

        System.out.println("Enter the customers phone number.");
        int phone = cusInput.nextInt();

        customer.setPhoneNumber(phone);

        // String input
        cusInput.nextLine();
        System.out.println("Enter the customers name.");
        String name = cusInput.nextLine();

        customer.setName(name);
    }

}
