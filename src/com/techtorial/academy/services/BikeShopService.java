package com.techtorial.academy.services;

import com.techtorial.academy.models.Bike;

import java.util.ArrayList;
import java.util.List;

public class BikeShopService {
    private List<Bike> inventory;

    public BikeShopService() {
        this.inventory = new ArrayList<>();
    }

    public boolean addBike(Bike bike) {
        return this.inventory.add(bike);
    }

    public void showInventory() {
        System.out.println("The inventory:");
        for (Bike bike : this.inventory) {
            System.out.println("\t" + bike);
        }
    }

    public int getInventorySize() {
        return this.inventory.size();
    }

    public Bike findBike(int maxPrice) {
        for (Bike bike : this.inventory) {
            if (bike.getPrice() <= maxPrice) {
                return bike;
            }
        }
        return null;
    }

    public Bike findBike(String kind) {
        for (Bike bike : this.inventory) {
            if (bike.getKind().equalsIgnoreCase(kind)) {
                return bike;
            }
        }
        return null;
    }

    public Bike findBike(int maxPrice, String kind) {
        for (Bike bike : this.inventory) {
            if (bike.getPrice() <= maxPrice && bike.getKind().equalsIgnoreCase(kind)) {
                return bike;
            }
        }
        return null;
    }

    public void rentBike(int maxPrice) {
        Bike bikeToRent = this.findBike(maxPrice);
        if (bikeToRent != null) {
            this.inventory.remove(bikeToRent);
            System.out.println("Rented " + bikeToRent);
        } else {
            System.out.println("No bikes under $" + maxPrice + " left");
        }
    }

    public void rentBike(String kind) {
        Bike bikeToRent = this.findBike(kind);
        if (bikeToRent != null) {
            this.inventory.remove(bikeToRent);
            System.out.println("Rented " + bikeToRent);
        } else {
            System.out.println("No " + kind + " bikes left");
        }
    }

    public void rentBike(int maxPrice, String kind) {
        Bike bikeToRent = this.findBike(maxPrice, kind);
        if (bikeToRent != null) {
            this.inventory.remove(bikeToRent);
            System.out.println("Rented " + bikeToRent);
        } else {
            System.out.println("No " + kind + " bikes under $" + maxPrice + " left");
        }
    }
}
