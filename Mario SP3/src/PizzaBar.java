/*
@Annika
 */

// Det er her de begge skal kunne se de aktive ordre, det er også her man skal kunne tilføje nye ordre.
// Og man skal også kunne fjerne de færdige odre over i inaktive ordre.
// Der skal gøres brug af en eller anden form for scanner i det den skal afvente et input fra Alfons når der,
// skal tilføjes en ny ordre eller slettes en færdig en.

import java.util.Scanner;

public class PizzaBar {

    Scanner sc = new Scanner(System.in);
    int choice = 0;
    int exitValue = 7;

    public void runProgram(){

        while (choice !=exitValue){

            choice = sc.nextInt();
            switch (choice){
                case 1: seeMenu(); break;
                case 2: seeCostumersOrder(); break;
                case 3: newCostumerAndOrder(); break;
                case 4: seeActiveOrder();break;
                case 5: seeInactiveOrder();break;
                case 6: moveOrder();
                case 7: exit();break;
                default: choice = exitValue;
            }

        }
    }
    private void seeMenu(){

    }

    private void seeCostumersOrder(){

    }

    private void newCostumerAndOrder(){
        Customer customer = new Customer(1,1,"");
        customer.customerNumberGen();
        customer.customerInput();




    }
    private void seeActiveOrder(){

    }

    private void seeInactiveOrder(){

    }

    private void moveOrder(){

    }

    private void exit(){

    }
}
