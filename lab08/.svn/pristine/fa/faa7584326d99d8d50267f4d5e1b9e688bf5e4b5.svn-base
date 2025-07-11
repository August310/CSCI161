/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Chapter8;

/**
 *
 * @author August Preuss
 */
public class Question2 {

    /*  For this part of the assignment you will be doing simple array processing on an array of
    *   type double with the identifier input that is being passed as a parameter to this method.
     */
    public static Object[] Question2(double[] input) {

        /*  You should calculate and return the following values as elements of
         *   an array of type Object in the following order:
         *
         *  1) An int value representing the count (number of elements in the input array)
         *  2) A double value representing the sum (total of elements in the input array)
         *  3) A double value representing the value of the smallest element in the input array
         *      *Note: If there are no elements, return the special value Double.NaN
         *  4) A double value representing the value of the largest element in the input array
         *      *Note: If there are no elements, return the special value Double.NaN
         */
        int count = 0;
        double sum = 0;
        double min = 0.0;
        double max = 0.0;

        if (input.length == 0) {
            min = Double.NaN;
            max = Double.NaN;
        }

        for (int i = 0; i < input.length; i++) {
            count++;
            sum += input[i];

            if (input[i] < min) {
                min = input[i];

            }

            if (input[i] > max) {
                max = input[i];
            }
        }


        /* Create an Object[] that contains the count, sum, min, and max in that order and return that array
         */
        Object[] combinationArray = {count, sum, min, max};
        return combinationArray;
    }

}
