package tt.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab2Driver {
    public static void main(String[] args) {

        FuelStation FS = new FuelStation("Regular", 500, 1.5);

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        try {
            Scanner scanner = new Scanner(new File("vehicles.txt"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                double tankCapacity = Double.parseDouble(parts[0]);
                String fuelType = parts[1];

                vehicles.add(new Vehicle(tankCapacity, fuelType));
            }

            scanner.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: File 'vehicles.txt' not found!\nAborting...3...2...1...");
            return;
        }
        for(Vehicle v : vehicles) {
            FS.dispense(v);
            System.out.println("\n" + FS.toString());
            System.out.println(v.toString());
        }

        System.out.println("\n" + FS.toString());
    }


}
