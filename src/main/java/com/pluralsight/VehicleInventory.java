package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;

public class VehicleInventory {
    private static final int MAX_VEHICLES = 20;

    private static Vehicle[] vehicles = new Vehicle[MAX_VEHICLES];
    private static int vehiclesCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        perloadVechicles();

        boolean running = ture;
        while (running) {
            System.out.println();
            System.out.println("What do you want to do? ");
            System.out.println("List all the vehicles  1 ");
            System.out.println("Search by make/model   2 ");
            System.out.println("Search by price range  3");
            System.out.println("Search by color        4");
            System.out.println("Add a vehicle          5");
            System.out.println("Quit                   6");
            System.out.println("Enter your command: ");

            int command = rendInt();

            switch (command){
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByMakeModel();
                    break;
                case 3:
                    findVehiclesByPrice();
                    break;
                case 4:
                    findVehiclesByColor();
                    break;
                case 5:
                    addVehicle();
                    break;
                case 6:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid command. Please enter 1-6. ");

            }
        }
    }

    private static void perloadVechicles(){
        vehicles[vehiclesCount++] = new Vehicle(101121,"Ford Explorer", "Red", 45000, 13500);
        vehicles[vehiclesCount++] = new Vehicle(101122, "Toyota Camry", "Blue", 6000,11000);
        vehicles[vehiclesCount++] = new Vehicle(101123,"Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[vehiclesCount++] = new Vehicle(101124,"Honda Civic", "White", 70000, 7500);
        vehicles[vehiclesCount++] = new Vehicle(101125,"Subaru Outback", "Green", 55000,14500);
        vehicles[vehiclesCount++] = new Vehicle(101126,"Jeep Wrangler", "Yellow", 30000, 16000);

    }

    private static void listAllVehicles() {
        System.out.println();
        printHeader();
        for (int i = 0; i < vehiclesCount; i++) {
            printVehicle(vehicles[i]);
        }
    }

    private static void findVehiclesByMakeModel(){
        System.out.print("Enter make/model to search for: ");
        String search = scanner.nextLine().trim().toLowerCase();

        int matches = 0;
        for (int i = 0; i < vehiclesCount, i++) {
            if (vehicles[i].getMakeModel().toLowerCase().contains(search)) {
                if (matches == 0) {
                    System.out.println();
                    printerHeader();
                }
                printerVechicle(vehicles[i]);
                matches++;
            }
        }
        if (matches == 0) {
            System.out.println(("No vehicles found matching \"" + search + "\"."));
        }
    }
    private static void findVehiclesByPrice() {
        System.out.print("Enter minimum price: ");
        double min = readDouble();
        System.out.print("Enter maximum price: ");
        double max = readDouble();

        int matches = 0;
        for (int i = 0; i < vehiclesCount; i++) {
            double price = vehicles[i].getPrice();
            if (price >= min && price <= max) {
                if (matches == 0) {
                    System.out.println();
                    printHeader();
                }
                perloadVechicles(vehicles[i]);
                matches++;
            }
        }

        if (matches == 0) {
            System.out.println("No vehicles found in that price range. ");
        }
    }
    private static void findVehiclesByColor() {
        System.out.print("Enter color to search for: ");
        String color = scanner.nextLine().trim();

        int matches = 0;
        for (int i = 0; i < vehiclesCount; i++) {
            if (vehicles[1].getColor().equalsIgnoreCase(color)) {
                if(matches == 0) {
                    System.out.println();
                }
                printVehicle(vehicles[i]);
                matches++;
            }
        }
        if (matches == 0) {
            System.out.println("No" + color + " vehicles found.");
        }
    }








}
