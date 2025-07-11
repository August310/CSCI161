package Questions;

import java.util.Scanner;

/**
 *
 * @author (August Preuss)
 */
public class Question3 {

    public static Object[] question3() {
        /* For this exercise, you will be writing a simple program that calculates
		 *  basic statistics for a list of user entered numbers
		 * This program contains a main method that can be used to manually test your code
		 *  by right-clicking Question3.java and selecting "Run File"
         */

 /* 1) Declare and instantiate a Scanner object to read in user input.
         */
        Scanner scan = new Scanner(System.in);


        /* 2) Declare three variables minimum, maximum, and average that will keep
		 *    track of the minimum, maximum, and average values for the user entered input.
         */
        int minimum = 0;
        int maximum = 0;
        double average;

        /* 3) Write a for loop that will read in exactly 10 integer values entered by the user.
		 *    Make sure that your program is type safe and will not crash if a user enters bad data.
		 *
		 *    Store the largest value entered by the user inside of the variable maximum.
		 *    Store the smallest value entered by the user inside of the variable minimum.
		 *    Store the average of all values entered by the user inside of the variable average.
		 *
		 *    Note: You can create additional variables as necessary to accomplish the requirements above.
         */
        int count = 0;
        int total = 0;

        while (!scan.hasNextInt()) {
            scan.nextLine();
        }

        int number = scan.nextInt();

        for (int i = 0; i < 10; i++) {

            total += number;
            count++;

            if (maximum == 0 || number > maximum) {
                maximum = number;
            }
            if (minimum == 0 || number < minimum) {
                minimum = number;
            }
            while (!scan.hasNextInt()) {
                scan.nextLine();
            }

            number = scan.nextInt();
        }

        average = ((double) (total) / (count));
        // Necessary for Unit Test
        return new Object[]{minimum, maximum, average};
    }

    public static void main(String[] args) {
        Object[] o = question3();

        System.out.println("Minimum: " + (int) o[0]);
        System.out.println("Maximum: " + (int) o[1]);

        double average;
        try {
            average = (double) o[2];
        } catch (Exception e) {
            average = (double) ((int) o[2]);
        }

        System.out.println("Average: " + average);
    }

}
