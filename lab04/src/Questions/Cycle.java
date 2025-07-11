/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

/**
 *
 * @author August Preuss
 */
public class Cycle {

    private String cycleName;
    private int numberOfWheels;

    private Cycle(String cycleName, int numberOfWheels) {
        this.cycleName = cycleName;
        this.numberOfWheels = numberOfWheels;
    }

    public String getCycleName() {
        return cycleName;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public static Cycle getBicycleInstance() {
        return new Cycle("bicycle", 2);
    }

    public static Cycle getTricycleInstance() {
        return new Cycle("tricycle", 3);
    }

}
