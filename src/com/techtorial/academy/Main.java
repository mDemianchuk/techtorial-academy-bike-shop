package com.techtorial.academy;

import com.techtorial.academy.models.MountainBike;
import com.techtorial.academy.models.RoadBike;
import com.techtorial.academy.services.BikeShopService;

public class Main {

    public static void main(String[] args) {
        BikeShopService shopService = new BikeShopService();

        // add bikes
        shopService.addBike(new MountainBike(20));
        shopService.addBike(new RoadBike(5));
        shopService.addBike(new MountainBike(6));
        shopService.addBike(new RoadBike(10));
        shopService.addBike(new MountainBike(5));

        shopService.showInventory();
        shopService.rentBike(1);
        shopService.rentBike(6, "Mountain");
    }
}
