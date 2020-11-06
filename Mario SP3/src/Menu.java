/*
@Jenbo
 */

// Der skal være et text document, hvor man skal kunne tilføje flere Pizza'er,
// der er allerede givet de første 14 Pizza'er, vi skal så tilføje resten til vi rammer 30.
// Denne klasse skal kunne læse dette text document.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {

// Der skal være et text document, hvor man skal kunne tilføje flere Pizza'er,
// der er allerede givet de første 14 Pizza'er, vi skal så tilføje resten til vi rammer 30.
// Denne klasse skal kunne læse dette text document.

    public void readFile() {
        try {
            File myMenu = new File("...\\Ressources\\Menu.csv");
            Scanner myReader = new Scanner(myMenu);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
