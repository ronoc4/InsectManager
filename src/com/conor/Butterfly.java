package com.conor;

/**
 * Created by conor on 3/17/16.
 */
public class Butterfly extends Insect{
    private String wingColor;
    private String favFlower;

    public Butterfly(String iName, int wings, String wingColor, String favFlower) {
        this.iName = iName;
        this.wings = wings;
        this.wingColor = wingColor;
        this.favFlower = favFlower;
    }

    public void printSpeciesData() {
        System.out.println("A " + iName + " butterfly has " + wings + " wings, \n " +
                " and has this many legs " + NUMBER_OF_LEGS + " and is " + wingColor +
                ", it really enjoys the plant " + favFlower + ".");

    }
}
