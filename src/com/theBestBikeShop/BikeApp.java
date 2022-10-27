package com.theBestBikeShop;

public class BikeApp {
    public static void main(String[] args) {

        /*Bicycle a = new Bicycle(5, 10, 0);

        a.applyBrake(10);
        a.speedUp(20);

        a.switchLightStatus();
        a.currentState();*/

        MountainBike b = new MountainBike(5, 10, 0, 1, 0);

        //System.out.println(b.isFullSuspension());
        b.currentState();
    }
}
