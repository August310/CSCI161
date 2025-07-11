
import java.util.Scanner;

/**
 *
 * @author August Preuss
 * @version 2/13/2025
 * A main method to test the recursive methods 
 * 
 */
public class Client {

    
    public static void main(String[] args) {
        
        Scanner keyScan = new Scanner(System.in);
        
        boolean quit = false;
        
        while(!quit){
        System.out.println("========== Menu ==========");
        System.out.println(" A) Option A ");
        System.out.println(" B) Option B ");
        System.out.println(" C) Option C ");
        System.out.println(" Q) Quit ");
        
        System.out.println("Enter choice: ");
        String choice = keyScan.nextLine();
        
        switch(choice){
            case "A":
            case "a":
                Recursion.callStringToInt();
                break;
            case "B":
            case "b":
                Recursion.callArraySum();
                break;
            case "C":
            case "c":
                Recursion.callPalindrome();
                break;
            case "Q":
            case "q":
                quit = true;
                break;
                
            default: 
                System.out.println("Invalid Choice, Try Again\n");
            }
        }
    }
}


