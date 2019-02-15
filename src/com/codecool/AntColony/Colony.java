package com.codecool.AntColony;

import java.util.ArrayList;

public class Colony {

    private Queen queen;
    private ArrayList<Ant> ants;

    public Colony() {
        ants = new ArrayList<>();
    }

    public void spawnAnts(int numberOfAnts) {
        queen = Queen.getInstance();

        for (int i = 0; i < numberOfAnts; i++) {
            Worker worker = new Worker();
            Soldier soldier = new Soldier();
            ants.add(worker);
            ants.add(soldier);
        }
        for (int i = 0; i < numberOfAnts / 2; i++) {
            Drone drone = new Drone();
            ants.add(drone);
        }
    }

    public void simulateOneDay() {
        for (int i = 0; i < 24; i++) {
            queen.setMood();
            for (Ant ant: ants) {
                ant.oneStep();
            }
        }
    }

}
