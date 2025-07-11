/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.awt.Color;

/**
 *
 * @author august.preuss
 */
public class Dog {

    private final String dogName;
    private int dogTricks;
    private final Color dogFurColor;

    public Dog() {
        dogName = "Oswald";
        dogTricks = 0;
        dogFurColor = Color.BLACK;
    }

    public Dog(String dogName, int tricks, Color dogFurColor) {
        this.dogName = dogName;
        this.dogTricks = tricks;
        this.dogFurColor = dogFurColor;
    }

    public String getDogName() {

        return dogName;

    }

    public int getDogTricks() {

        return dogTricks;

    }

    public Color getDogFurColor() {

        return dogFurColor;

    }

    public void setDogTricks(int newTricks) {

        dogTricks = newTricks;

    }

    public String toString() {

        return "My dogs name is " + dogName + ". His fur is " + dogFurColor + ". He knows how to do " + dogTricks + " tricks.";

    }
}
