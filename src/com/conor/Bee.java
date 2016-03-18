package com.conor;

/**
 * Created by conor on 3/17/16.
 */
public class Bee extends Insect{
    private String color;
    private boolean makeHoney;
    private String favFlower;

    public Bee(String iName, int wings, String color, boolean makeHoney, String favFlower) {
        this.iName = iName;
        this.wings = wings;
        this.color = color;
        this.makeHoney = makeHoney;
        this.favFlower= favFlower;
    }

    public void printSpeciesData() {
        System.out.println("A " + iName + " is this color " + color + " bee has " + wings + " wings, \n " +
                " and has this many legs " + NUMBER_OF_LEGS + " and does it make honey? " + makeHoney +
                ", it really enjoys the plant " + favFlower + ".");
    }
}
