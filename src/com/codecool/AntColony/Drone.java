package com.codecool.AntColony;

import java.util.Random;

public class Drone extends Ant {
    private static int counter = 0;
    private int matingTime;
    private boolean isMating;

    public Drone() {
        super(getRandomCoordinate(), getRandomCoordinate(), "Drone" + ++counter);
        matingTime = 0;
        isMating = false;
    }

    private void teleportToRandomPlace() {
        this.xPos = getRandomCoordinate();
        this.yPos = getRandomCoordinate();
        System.out.println(name + ": oh no i was banished here: " + xPos + " , " + yPos);
    }

    private void tryToMate() {
        Queen queen = Queen.getInstance();
        if (queen.getMood()) {
            matingTime = 10;
            isMating = true;
            System.out.println(name + ": HALLELUJAH");
        }
        else if (!queen.getMood()) {
            System.out.println(name + ": D'OH");
            teleportToRandomPlace();
        }

    }

    @Override
    protected void oneStep() {
        if (!isMating) {

            Queen queen = Queen.getInstance();

            if (this.xPos > queen.xPos) xPos--;
            else if (this.xPos < queen.xPos) xPos++;
            else if (this.yPos > queen.yPos) yPos--;
            else if (this.yPos < queen.yPos) yPos++;

            System.out.println(name + ": moved TO: " + xPos + " , " + yPos);

            if (Math.abs(queen.yPos - this.yPos) < 4 && Math.abs(queen.xPos - this.xPos) < 4) {
                if (matingTime == 0) tryToMate();
            }
        }
        else {
            matingTime--;
            if (matingTime <= 0) {
                teleportToRandomPlace();
                isMating = false;
            }
        }


    }
}
