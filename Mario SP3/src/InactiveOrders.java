/*
@AUTHOR_TMP
 */

// Når de aktive ordre er hentet skal de arkiveres og rykkes hen til inaktive ordre og ligges ind som liste.
// på denne måde er det muligt for Mario og lave statistik på disse ordre.

import java.io.*;
import java.util.ArrayList;

public class InactiveOrders {






    public static void inactiveOrdersWriteFile() {

        //write to file
        try{
            FileOutputStream writeData = new FileOutputStream("InactiveOrders.csv");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(??);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
/*
        try{
            FileInputStream readData = new FileInputStream("InactiveOrders.csv");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList ??p = (ArrayList<??>) readStream.readObject();
            readStream.close();

            System.out.println(??p.toString());
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
 */
    }



    }



}
