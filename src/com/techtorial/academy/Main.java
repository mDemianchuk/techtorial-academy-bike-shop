package com.techtorial.academy;

import com.techtorial.academy.services.BikeShopService;

public class Main {

    public static void main(String[] args) {
        BikeShopService shop = new BikeShopService();
        shop.showInventory();
        System.out.println("The inventory size is: " + shop.getInventorySize());
        shop.rentBike(10);
        shop.rentBike(6, "Mountain");
        System.out.println("The inventory size is: " + shop.getInventorySize());
    }
}
