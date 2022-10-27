package com.theBestBikeShop;

public class Bicycle {
	private int gear;
	private int speed;
	private int light;
	public Bicycle(int g, int s, int l) {
		gear = g;
		speed = s;
		light = l;
	}

	public void setGear(int newValue) {
		gear=newValue;
	}

	public void applyBrake(int decrement) {
		speed-=decrement;
	}

	public void speedUp(int increment) {
		speed+=increment;
	}

	public void currentState() {
		System.out.println(gear+" "+speed+" "+light);
	}

	public void switchLightStatus() {
		if (light == 0) {
			light = 1;
		}
		else {
			light = 0;
		}
	}
}
