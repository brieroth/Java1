import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        //set price of charge
        Garage g1 = new Garage(12);
        Garage g2 = new Garage(10);

        //add objects to array to generate bill
        g1.addVehicle(new Car("volks", "yellow", 15, 555, 4, 32));
        g1.addVehicle(new Car("vxh", "blue", 11, 1234, 3, 12));
        g1.addVehicle(new Car("bmw", "black", 13, 1774, 5, 6));
        g2.addVehicle(new Motorcycle("Harley", "Grey", 19, 2, 2, 2));
        g2.addVehicle(new Motorcycle("QZx", "red", 13, 2, 2, 1));
        g2.addVehicle(new Motorcycle("Thunderbolt", "black", 12, 2, 1, 2));
        //g1.remVehicle(c1);

        ArrayList<String> prices = g1.calculateBill();
        ArrayList<String> mprices = g2.calculateBill();

        for (String b : prices) {
            System.out.println(b);
        }
        for (String c : mprices) {
            System.out.println(c);
        }

    }



    }

