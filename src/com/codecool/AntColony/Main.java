package com.codecool.AntColony;

public class Main {

    public static void main(String[] args) {
	    Colony colony = new Colony();
	    colony.spawnAnts(4);
		for (int i = 0; i < 7; i++) {
			colony.simulateOneDay();
		}
    }
}
