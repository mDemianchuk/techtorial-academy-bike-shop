package com.techtorial.academy.services;

import com.techtorial.academy.models.Bike;
import com.techtorial.academy.models.MountainBike;
import com.techtorial.academy.models.RoadBike;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BikeShopServiceTest {

    private BikeShopService bikeShopService;

    @BeforeEach
    void setUp() {
        this.bikeShopService = new BikeShopService();
        this.bikeShopService.addBike(new RoadBike(4));
        this.bikeShopService.addBike(new MountainBike(10));
    }

    @Test
    void addBike() {
        // Arrange
        Bike bike = new RoadBike(2);

        // Act
        boolean isAdded = this.bikeShopService.addBike(bike);

        // Assert
        Assertions.assertTrue(isAdded);
    }

    @Test
    void findBikeByMaxPriceWhenInventoryIsEmptyThenReturnsNull() {
        // Arrange
        this.bikeShopService = new BikeShopService();
        int maxPrice = 1;

        // Act
        Bike bike = this.bikeShopService.findBike(maxPrice);

        // Assert
        Assertions.assertNull(bike);
    }

    @Test
    void findBikeByMaxPriceWhenInventoryHasNoBikesUnderMaxPriceThenReturnsNull() {
        // Arrange
        int maxPrice = -1;

        // Act
        Bike bike = this.bikeShopService.findBike(maxPrice);

        // Assert
        Assertions.assertNull(bike);
    }

    @Test
    void findBikeByMaxPriceWhenInventoryHasBikesUnderMaxPriceThenReturnsBike() {
        // Arrange
        int maxPrice = Integer.MAX_VALUE;

        // Act
        Bike bike = this.bikeShopService.findBike(maxPrice);

        // Assert
        Assertions.assertNotNull(bike);
    }

    @Test
    void findBikeByKindWhenInventoryHasBikesOfThatKindThenReturnsBike() {
        // Arrange
        String kind = "road";

        // Act
        Bike bike = this.bikeShopService.findBike(kind);

        // Assert
        Assertions.assertEquals("road", bike.getKind());
    }

    @Test
    void findBikeByKindWhenInventoryIsEmptyThenReturnsNull() {
        // Arrange
        this.bikeShopService = new BikeShopService();
        String kind = "road";

        // Act
        Bike bike = this.bikeShopService.findBike(kind);

        // Assert
        Assertions.assertNull(bike);
    }
}