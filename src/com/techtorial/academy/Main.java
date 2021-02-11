package com.techtorial.academy;

import com.techtorial.academy.models.BikeShop;

public class Main {

    public static void main(String[] args) {
        BikeShop shop = new BikeShop();
        shop.showInventory();
        System.out.println("The inventory size is: " + shop.getInventorySize());
        shop.rentBike(10);
        shop.rentBike(6, "Mountain");
        System.out.println("The inventory size is: " + shop.getInventorySize());
    }
}
