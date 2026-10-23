package com.pluralsight;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, double price) {

        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;

    }

    public long getVehicleId() {return vehicleId;}
    public void setVehicleId(long vehicleId) {this.vehicleId = vehicleId;}

    public String getMakeModel() {return makeModel;}
    public void setMakeModel(String makeModel) {this.makeModel = makeModel;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public int getOdometerReading() {return odometerReading;}
    public void setOdometerReading(int odometerReading) {this.odometerReading = odometerReading;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
}


// EXERCISE 4
//  Step 1
//    Create a Java application called vehicle-inventory.
//    This application is intended to manage the inventory for a used car dealership.
//    Users will use a menu to look up vehicles or add vehicles to the list.
//    Create a class named Vehicle.
//    Add the following data members to it:
//      vehicleId   - a long (ex: 101121)
//      makeModel   - a string (ex: Ford Explorer)
//      color   - a string (ex: Red)
//      odometerReading  - an int (ex: 32775)
//      price   - a double (ex: 12250.00)  (no Lamborghinis here!)
//    Add a constructor and get/set methods for each property of the car.
//    Back in main(), create an array capable of holding up to 20 vehicles and a counter variable that tells you how many vehicles are in the array right now.
//      Preload the array with 6 vehicles:
//          vehicleId,makeModel,color,odometerReading,price
//          101121,Ford Explorer,Red,45000,13500
//          101122,Toyota Camry,Blue,60000,11000
//          101123,Chevrolet Malibu,Black,50000,9700
//          101124,Honda Civic,White,70000,7500
//          101125,Subaru Outback,Green,55000,14500
//          101126,Jeep Wrangler,Yellow,30000,16000
//    Create a loop and prompt the user for a command within the loop.
//    The menu the user sees should be:
//    What do you want to do?
//      1 - List all vehicles
//      2 - Search by make/model
//      3 - Search by price range
//      4 - Search by color
//      5 - Add a vehicle
//      6 - Quit
//    Enter your command:
//    You may not get all options in the command list done.
//    Begin with options 1, 2 and 5.
//    Once you've completed those options, add logic to allow the user to search for a vehicle by price or color.
//    Use methods wisely.  It seems like your loop could match a command to a number and then call a method to do the processing.
//    For example:
//      System.out.println("What do you want to do?");
//      System.out.println("  1 - List all vehicles");
//      System.out.println("  2 - Search by make/model");
//      System.out.println("  3 - Search by price range");
//      System.out.println("  4 - Search by color");
//      System.out.println("  5 - Add a vehicle");
//      System.out.println("  6 - Quit");
//      System.out.println("Enter your command: ");
//      int command = scanner.nextInt();
//      switch(command) {
//          case 1:
//              listAllVehicles();
//          break;
//          case 2:
//              findVehiclesByMakeModel();
//          break;
//  }