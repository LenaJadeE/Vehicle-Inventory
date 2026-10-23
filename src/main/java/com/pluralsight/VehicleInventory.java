package com.pluralsight;

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




        }


    }



}
