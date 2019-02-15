package com.codecool.AntColony;

import java.util.Random;

public class Queen extends Ant {

    private static Queen instance = null;
    private boolean inMood;

    public static Queen getInstance() {
        if ( instance == null ){
            instance = new Queen();
        }
        return instance;
    }

    private Queen() {
        super(50, 50, "Queen");
        setMood();
    }

    public void setMood() {
        inMood = false;
        Random random = new Random();
        if (random.nextDouble() <= 0.5) inMood = true;
        System.out.println(name + "'s mood is now " + inMood);

    }

    public boolean getMood() {
        return inMood;
    }

    @Override
    protected void oneStep() {
        System.out.println("just sitting here waiting im the queen ha");
    }


}
