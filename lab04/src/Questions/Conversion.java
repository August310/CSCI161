/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

/**
 *
 * @author August Preuss
 */
public class Conversion {

    private int tempCelsius;
    private int tempFahrenheit;
    private int meters;
    private int inches;
    private double tempCelsiusDeci;
    private double tempFahrenheitDeci;
    private double metersDeci;
    private double inchesDeci;

    private Conversion() {

    }

    public static int celsiusToFahrenheit(int tempCelsius) {
        return (int) (tempCelsius * 1.8) + 32;
    }

    public static int fahrenheitToCelsius(int tempFahrenheit) {
        return (int) ((tempFahrenheit - 32) / 1.8);
    }

    public static int metersToInches(int meters) {
        return (int) (meters * 39.3700787);
    }

    public static int inchesToMeters(int inches) {
        return (inches * (int) .0254);
    }

    public static double celsiusToFahrenheit(double tempCelsiusDeci) {
        return (tempCelsiusDeci * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double tempFahrenheitDeci) {
        return (tempFahrenheitDeci - 32) / 1.8;
    }

    public static double metersToInches(double metersDeci) {
        return metersDeci * 39.3700787;
    }

    public static double inchesToMeters(double inchesDeci) {
        return inchesDeci * .0254;
    }

}
