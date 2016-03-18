package com.conor;

import java.util.LinkedList;

public class InsectManager {

    public static void main(String[] args) {
	// write your code here

        Butterfly butterfly1 = new Butterfly("Monarch", 2, "Orange", "Milkweed");

        Butterfly butterfly2 = new Butterfly("Tiger Fly", 2, "Pink and Blue", "Roses");

        Bee bee1 = new Bee("Hornet", 2, "Yellow and Black", false, "Hates everything flower");

        Bee bee2 = new Bee("Honey Bee", 2, "Yellow and Black", true, "Merrigold");

        //Create Linked List to store the Insect objects
        LinkedList<Insect> insects = new LinkedList<Insect>();
        //Add objects to LL
        insects.add(bee1);
        insects.add(bee2);
        insects.add(butterfly1);
        insects.add(butterfly2);
        //Initialize insects
        for(Insect i : insects) {
            i.printSpeciesData();
        }
    }
}
