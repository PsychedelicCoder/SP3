/*
@Jenbo
 */

// Der skal være et text document, hvor man skal kunne tilføje flere Pizza'er,
// der er allerede givet de første 14 Pizza'er, vi skal så tilføje resten til vi rammer 30.
// Denne klasse skal kunne læse dette text document.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

<<<<<<< HEAD
    List<Pizza> pizzas;

    public Menu() {
        pizzas = new ArrayList<>();
        readFile();
    }


    // Der skal være et text document, hvor man skal kunne tilføje flere Pizza'er,
=======
    List<Pizza> pizzas = new ArrayList<>();

// Der skal være et text document, hvor man skal kunne tilføje flere Pizza'er,
>>>>>>> 61a1bff6aac0f8768ad0942c95281000fa3040ca
// der er allerede givet de første 14 Pizza'er, vi skal så tilføje resten til vi rammer 30.
// Denne klasse skal kunne læse dette text document.


    public List<Pizza> getPizzas() {
        return pizzas;
    }

<<<<<<< HEAD
    public Pizza getPizzaById(int pizzaId) {

        Pizza pizzaRetValg = null;
        for (Pizza pizza : pizzas) {

            if (pizza.getPizzaId() == pizzaId) {
                return pizza;
            }
        }
        return pizzaRetValg;
=======
    public Pizza getPizzaById(int pizzaId){

        Pizza pizzaRetValg = null;
        for (Pizza pizza:pizzas) {

            if(pizza.getPizzaId()==pizzaId){
                return pizza;
            }
        }
     return pizzaRetValg;
>>>>>>> 61a1bff6aac0f8768ad0942c95281000fa3040ca
    }


    public void readFile() {
        try {
            File myMenu = new File("resources\\PizzaMenu.csv");
            Scanner myReader = new Scanner(myMenu);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                String[] dataArray = data.split(",");
                //int pizzaId, String name, String ingredients, int price
<<<<<<< HEAD
                Pizza pizza = new Pizza(Integer.valueOf(dataArray[0]), dataArray[0], dataArray[0], Integer.valueOf(dataArray[0]));
=======
                Pizza pizza = new Pizza(Integer.valueOf(dataArray[0]),dataArray[0],dataArray[0],Integer.valueOf(dataArray[0]));
>>>>>>> 61a1bff6aac0f8768ad0942c95281000fa3040ca
                pizzas.add(pizza);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
