/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameEntities;

import java.util.Random;

/**
 *
 * @author August Preuss
 */
public class Horse {

    private String name;
    private int thirst;
    private int hunger;
    private int energy;
    private int value;

    Random rand = new Random();

    Horse(String name) {
        name = "Jessie";
        hunger = rand.nextInt(10 - 1 + 1) + 1;
        thirst = rand.nextInt(10 - 1 + 1) + 1;
        energy = rand.nextInt(10 - 1 + 1) + 1;

    }

    Horse(String name, int thirst, int hunger, int energy) {
        this.name = "Carl";
        this.thirst = 8;
        this.hunger = 8;
        this.energy = 8;
    }

    public int getThirst() {
        return thirst;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHunger() {
        return hunger;
    }

    //Making thirst stay in the range of 0 - 10
    public void adjustThirst(int value) {
        thirst += value;

        if (thirst > 10) {
            thirst = 10;
        } else if (thirst < 0) {
            thirst = 0;
        }
    }

    public void adjustEnergy(int value) {
        energy += value;

        if (energy > 10) {
            energy = 10;
        } else if (energy < 0) {
            energy = 0;
        }
    }

    public void adjustHunger(int value) {
        hunger += value;

        if (hunger > 10) {
            hunger = 10;
        } else if (hunger < 0) {
            hunger = 0;
        }
    }

}
