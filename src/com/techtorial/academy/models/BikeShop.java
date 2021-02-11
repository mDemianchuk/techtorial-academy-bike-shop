package com.techtorial.academy.models;

import java.util.ArrayList;
import java.util.List;

public class BikeShop {
    private List<Bike> inventory;

    public BikeShop() {
        this.initializeInventory();
    }

    private void initializeInventory() {
        this.inventory = new ArrayList<>();
        this.inventory.add(new MountainBike(20));
        this.inventory.add(new RoadBike(12));
        this.inventory.add(new MountainBike(6));
        this.inventory.add(new RoadBike(10));
        this.inventory.add(new MountainBike(5));
    }

    public int getInventorySize() {
        return this.inventory.size();
    }

    public void showInventory() {
        for(Bike bike : this.inventory) {
            System.out.println(bike);
        }
    }

    public void rentBike(int maxPrice) {
        for(Bike bike : this.inventory) {
            if(bike.getPrice() <= maxPrice) {
                this.inventory.remove(bike);
                System.out.println("Rented " + bike);
            }
        }
        System.out.println("No bikes under $" + maxPrice + " left");
    }

    public void rentBike(String kind) {
        for(Bike bike : this.inventory) {
            if(bike.getKind().equalsIgnoreCase(kind)) {
                this.inventory.remove(bike);
                System.out.println("Rented " + bike);
            }
        }
        System.out.println("No " + kind + " bikes left");
    }

    public void rentBike(int maxPrice, String kind) {
        for(Bike bike : this.inventory) {
            if(bike.getPrice() <= maxPrice && bike.getKind().equalsIgnoreCase(kind)) {
                this.inventory.remove(bike);
                System.out.println("Rented " + bike);
            }
        }
        System.out.println("No " + kind + " bikes under $" + maxPrice + " left");
    }
}
