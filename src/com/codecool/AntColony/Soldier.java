package com.codecool.AntColony;

public class Soldier extends Ant {
    private static int counter = 0;
    private int patrolCycle;

    public Soldier() {
        super(getRandomCoordinate(), getRandomCoordinate(), "Solder" + ++counter);
        patrolCycle = 0;
    }

    @Override
    protected void oneStep() {
        switch (patrolCycle) {
            case 0: if (xPos < 100) xPos++; patrolCycle++; break;
            case 2: if (yPos < 100) yPos++; patrolCycle++; break;
            case 1: if (xPos > 0) xPos--; patrolCycle++; break;
            case 3: if (yPos > 0) yPos--; patrolCycle = 0; break;
            default:
                System.out.println("100% that you shouldn't see this");
        }
        System.out.println(name + ": moved to " + xPos + " , " + yPos);
    }
}
