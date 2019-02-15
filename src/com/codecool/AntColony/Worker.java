package com.codecool.AntColony;

import java.util.Random;

public class Worker extends Ant {
    private static int counter = 0;

    public Worker() {
        super(getRandomCoordinate(), getRandomCoordinate(), "Worker" + ++counter);
    }

    @Override
    protected void oneStep() {
        Random random = new Random();
        int randomInt = random.nextInt(4);
        switch (randomInt) {
            case 0: if (xPos < 100) xPos++; break;
            case 1: if (xPos > 0) xPos--; break;
            case 2: if (yPos < 100) yPos++; break;
            case 3: if (yPos > 0) yPos--; break;
            default:
                System.out.println("100% that you shouldn't see this");
        }
        System.out.println(name + ": moved to " + xPos + " , " + yPos);
    }
}
