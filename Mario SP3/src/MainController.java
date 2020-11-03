import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    Menu menu = new MenuImpDK();
    Scanner sc = new Scanner(System.in);
    DogService ds = new DogServiceImp();
    List<Dog> dogs = new ArrayList<>();


    public void runProgram (){

        dogs = ds.getAllDogs();

        int choice = 0;
        int exitValue = 9;

       while (choice != exitValue) {
           Menu.printMainMenu();
           Menu.printMainMenu();
       }
       switch (choice){
           choice = sc.nextInt();
           case 1:showAllPizza();
           case 2:orderPizza();
           case 3:changeLanguage();
           case 9:exit();
           default:choice=exitValue;

       }
        // evt. exitMode som rydder op.
        // Sørger for data-integritet.
        System.out.println("Slut.");
    }

  private void exit() {

  }

  private void changeLanguage() {
      switch (Menu.getLanguage()){
        case "ENG": Menu = new MenuImpDK();break;
        case "DK": Menu = new MenuImpENG();break;
          default: Menu = new MenuImpENG();break;
      }
    System.out.println("What is your preferred language.");
    System.out.println("Press 1 for danish.");
    System.out.println("Press 2 for english.");
    }

  private void orderPizza() {

  }

  private void showAllPizza() {

  }

}
