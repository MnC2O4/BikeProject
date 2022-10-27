package com.theBestBikeShop;

public class MountainBike extends Bicycle{
    private int gear;
    private int speed;
    private int light;
    private int front;
    private int rear;
    public MountainBike(int g, int s, int l, int f, int r) {
        super(g, s, l);
        gear = g;
        speed = s;
        light = l;
        front = f;
        rear = r;
    }

    public int isFullSuspension() {
        if (front == 1 && rear == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public void currentState() {
        System.out.println(gear+" "+speed+" "+light+" "+front+" "+rear);
    }
}
