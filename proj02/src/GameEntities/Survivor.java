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
public class Survivor {

    private String name;
    private int thirst;
    private int hunger;
    private int energy;
    private int health;
    private int value;

    Random rand = new Random();

    Survivor(String name) {
        name = "Dan";
        hunger = rand.nextInt(10 - 1 + 1) + 1;
        thirst = rand.nextInt(10 - 1 + 1) + 1;
        energy = rand.nextInt(10 - 1 + 1) + 1;
        health = rand.nextInt(10 - 1 + 1) + 1;
    }

    Survivor(String name, int thirst, int hunger, int energy) {
        this.name = "Jerry";
        this.thirst = 5;
        this.hunger = 5;
        this.energy = 5;
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

    public int getHealth() {
        return health;
    }

    //Making thirst stay in the range of 0 - 100
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

    public void adjustHealth(int value) {
        health += value;

        if (health > 10) {
            health = 10;
        } else if (health < 0) {
            health = 0;
        }

    }

}
