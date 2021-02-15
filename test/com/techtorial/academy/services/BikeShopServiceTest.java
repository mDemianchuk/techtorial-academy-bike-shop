package com.techtorial.academy.services;

import com.techtorial.academy.models.Bike;
import com.techtorial.academy.models.MountainBike;
import com.techtorial.academy.models.RoadBike;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BikeShopServiceTest {

    private BikeShopService shopService;

    @BeforeEach
    void setUp() {
        this.shopService = new BikeShopService();
        this.shopService.addBike(new RoadBike(5));
        this.shopService.addBike(new MountainBike(10));
    }

    @Test
    void addBike() {
        // Arrange
        int expectedInventorySize = 3;
        Bike bike = new RoadBike(2);

        // Act
        this.shopService.addBike(bike);
        int inventorySize = this.shopService.getInventorySize();

        // Assert
        Assertions.assertEquals(expectedInventorySize, inventorySize);
    }
}