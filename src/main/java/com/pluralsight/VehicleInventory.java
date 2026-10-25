package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    private static final int MAX_VEHICLES = 20;

    private static final Vehicle[] vehicles = new Vehicle[MAX_VEHICLES];
    private static int vehiclesCount = 0;
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        perloadVechicles();

        boolean running = true;
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

            int command = readInt();

            switch (command) {
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
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid command. Please enter 1-6. ");

            }

            running = false;
        }
    }

    private static void perloadVechicles() {
        vehicles[vehiclesCount++] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[vehiclesCount++] = new Vehicle(101122, "Toyota Camry", "Blue", 6000, 11000);
        vehicles[vehiclesCount++] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[vehiclesCount++] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[vehiclesCount++] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[vehiclesCount++] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

    }

    private static void listAllVehicles() {
        System.out.println();
        printHeader();
        for (int i = 0; i < vehiclesCount; i++) {
            printVehicle(vehicles[i]);
        }
    }

    private static void findVehiclesByMakeModel() {
        System.out.print("Enter make/model to search for: ");
        String search = scanner.nextLine().trim().toLowerCase();

        int matches = 0;
        for (int i = 0; i < vehiclesCount; i++) {
            if (vehicles[i].getMakeModel().toLowerCase().contains(search)) {
                if (matches == 0) {
                    System.out.println();
                    printHeader();
                }
                printVehicle(vehicles[i]);
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
                printVehicle(vehicles[i]);
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
                if (matches == 0) {
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

    private static void addVehicle() {
        if (vehiclesCount >= MAX_VEHICLES) {
            System.out.println("The inventory is full (" + MAX_VEHICLES + " vehicles).");
            return;
        }

        System.out.println("Vehicle ID: ");
        long id = readLong();
        System.out.println("Make/model: ");
        String makeModel = scanner.nextLine().trim();
        System.out.println("Color: ");
        String color = scanner.nextLine().trim();
        System.out.println("Odometer reading; ");
        int odometer = readInt();
        System.out.println("Price range: ");
        double price = readDouble();

        vehicles[vehiclesCount++] = new Vehicle(id, makeModel, color, odometer, price);
        vehiclesCount++;

        System.out.println("Vehicles added. Inventory now holds " + vehiclesCount + " vehicles.");

    }

    private static void printHeader() {
        System.out.printf("%-8s %-20s %-8s %10s %12s%n", "ID", "Make", "Color", "Odometer", "Price");

    }

    private static void printVehicle(Vehicle vehicle) {
        System.out.printf("%-8d %-20s %-8s %10d %12.2f%n", vehicle.getVehicleId(), vehicle.getMakeModel(), vehicle.getColor(), vehicle.getOdometerReading(), vehicle.getPrice());

    }

    private static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer: ");
            }
        }
    }

    private static long readLong() {
        while (true) {
            try {
                return Long.parseLong(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a whole number: ");
            }
        }
    }

    private static double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number : ");

            }
        }
    }
}