/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions.Chapter8;

/**
 *
 * @author August Preuss
 */
public class ArrayUtilities {

    private ArrayUtilities() {

    }
    //makes sure the arrays are equal
    public static boolean arraysAreEqual(int[] array1, int[] array2) {

        if (array1 == null && array2 == null) {
            return true;
        }
        if (array1 == null || array2 == null) {
            return false;
        } else if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    //resizes the array to any size you want
    private static int[] resizeArray(int[] array, int factor) {
        int[] temp = new int[array.length * factor];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;

        return array;
    }
    //this doubles the array size
    public static int[] resizeArray(int[] array) {
        return ArrayUtilities.resizeArray(array, 2);

    }
    //this copys the array using the previously declared resizeArray static method with a factor of 1
    public static int[] copyArray(int[] array) {
        return ArrayUtilities.resizeArray(array, 1);

    }
}
