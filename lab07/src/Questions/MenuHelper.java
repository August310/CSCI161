/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.util.Scanner;

/**
 *
 * @author August Preuss
 */
public class MenuHelper {

    public static void main(String[] args) {
        int mainMenu = displayMenu("Please choose a main course: \n1. Ribeye \n2. Hotdog \n3. Hamburger \nPlease enter a selection 1 - 3:", 1, 3);
        int sideMenu = displayMenu("Please choose a side: \n1. Mac n Chesse \n2. Sauerkraut \n3. Brocolli \n4. Soup \nPlease enter a selection 1 - 4:", 1, 4);
        int beverageMenu = displayMenu("Please choose a beverage: \n1. Milk \n2. Water \n3. Coffee \n4. Sprite \nPlease enter a selection 1 - 4:", 1, 4);

        System.out.println("You selected options " + mainMenu + ", " + sideMenu + ", " + beverageMenu + " for your choices.");
    }

    public static int displayMenu(String message, int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);

        while (!scan.hasNextInt()) {
            System.out.println("Please enter a number between " + min + " and " + max);
            scan.nextLine();
        }
        int num = scan.nextInt();

        if (max >= num && min <= num) {
            return num;
        } else {
            System.out.println("Please enter a number between " + min + " and " + max);
            return scan.nextInt();
        }

    }
}
