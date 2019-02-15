package com.codecool.AntColony;

import java.util.Random;

public abstract class Ant {
    protected int xPos;
    protected int yPos;
    protected String name;

    public Ant(int xPos, int yPos, String name) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.name = name;
    }

    protected abstract void oneStep();

    protected static int getRandomCoordinate() {
        Random random = new Random();
        return random.nextInt(101);
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}
