package com.techtorial.academy;

import com.techtorial.academy.services.BikeShopService;

public class Main {

    public static void main(String[] args) {
        BikeShopService shopService = new BikeShopService();
        shopService.showInventory();
        shopService.rentBike(1);
        shopService.rentBike(6, "Mountain");
    }
}
