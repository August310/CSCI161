
import java.util.Scanner;

/**
 *
 * @author August Preuss
 * @version 2/21/2025
 * A class providing some recursive methods
 */
public class Recursion {
    
/**
 * checks for valid input and calls the stringToInt recursive method
 */    
public static void callStringToInt(){
    System.out.println("Turns a String number into a regular int number");
    
    Scanner keyScan = new Scanner(System.in);
    
    String answer = "";
    
    boolean tryAgain = true;
    int n = 0;
    
    while(tryAgain){
        
        boolean inValidInput = true;
        
        while(inValidInput){
            
            System.out.println("Enter a positive integer");
            
            answer = keyScan.nextLine();
            
            try{
                n = Integer.parseInt(answer);
                
                if(n < 0){
                    throw new IllegalArgumentException("Must use a number n >= 0");
                }
                
                inValidInput = false;
            } catch(NumberFormatException nfe){
                System.out.println("You must enter an integer value, please try again.");
            } catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage() + " try again.");
            }
            
        }
        
        System.out.printf("stringToInt( %d ) = %,d \n", n, stringToInt( answer ));
        
        System.out.println("Calculate another stringToInt? (Y/N)");
        answer = keyScan.nextLine();
        if(answer.equalsIgnoreCase("N")){
            tryAgain = false;
        }
    }
}

/**
 * Converts a String number into an int by going through each number and adding it to a final int value
 * @param stringNumber
 * @return number in int form instead of a String
 */
public static int stringToInt(String stringNumber){
    
    if(stringNumber.length() == 1){
        return stringNumber.charAt(0) - '0';
    }
    
    
   int placeValue = 1;
   for(int i = 1; i < stringNumber.length(); i++){
       placeValue *= 10;
   }
    
    return ((stringNumber.charAt(0) - '0') * placeValue) + stringToInt(stringNumber.substring(1));
    
}

/**
 * checks for valid input and calls the arraySum recursive method
 */
public static void callArraySum(){
    System.out.println("Gets the sum of all the numbers in a two dimensional array");
    
    Scanner keyScan = new Scanner(System.in);
    
    String answer = "";
    
    int[][] finalArray = null;
    
    int rows = 0;
            
    int columns = 0;
    
    boolean tryAgain = true;
    
    
    while(tryAgain){
        
        boolean inValidInput = true;
        
        while(inValidInput){
            
            try{
            System.out.println("Enter the number of rows: ");
            
            if(keyScan.hasNextInt()){
                rows = keyScan.nextInt();
            }
            
            if(rows < 1){
                throw new IllegalArgumentException("row needs to be at least size 1");
            }
            
            System.out.println("Enter the number of columns: ");
            
            if(keyScan.hasNextInt()){
                columns = keyScan.nextInt();
            }
            
            if(columns < 1){
                throw new IllegalArgumentException("column needs to be at least size 1");
            }
            
                int[][] arr = new int[rows][columns];
                
                System.out.println("Enter array element row by row");
                for(int i = 0; i < rows; i++){
                    for(int j = 0; j < columns; j++){                           
                        arr[i][j] = keyScan.nextInt();
                    }
                }
                
                keyScan.nextLine();
                
                finalArray = arr;
               
                inValidInput = false;
            
            } catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage() + " try again.");
            }
            
        }
        
        int sum = arraySum(finalArray, 0, 0);
        
        System.out.printf("arraySum = %,d \n", sum);
        
        System.out.println("Calculate another array sum? (Y/N)");
        answer = keyScan.nextLine();
        if(answer.equalsIgnoreCase("N")){
            tryAgain = false;
        }
    }
}

/**
 * Gathers the rows and columns needed in the array and recursively adds each element together
 * @param data a two dimensional array
 * @param row number of rows in array
 * @param col number of columns in array
 * @return the sum of all the elements
 */
public static int arraySum(int[][] data, int row, int col ){
    
   int numRows = data.length;
    
    if(row == numRows){
        return 0;
    }
    
    
    int numColumns = data[row].length;
    
    int currentValue = data[row][col];
    
    if(col + 1 < numColumns){
        return currentValue + arraySum(data, row, col + 1);
    }
    else{
        return currentValue + arraySum(data, row + 1, 0);
    }
}


/**
 * checks for valid input and calls the palindrome recursive method
 */
public static void callPalindrome(){
    System.out.println("Checks if a word is a palindrome or not.");
    
    Scanner keyScan = new Scanner(System.in);
    
    String answer = "";
    
    boolean tryAgain = true;
    
    
    
    while(tryAgain){
        
        boolean inValidInput = true;
        
        while(inValidInput){
            
            System.out.println("Enter a word");
            
            answer = keyScan.nextLine();
            
            try{
                
                if(answer.equals("")){
                    throw new IllegalArgumentException("You can't have an empty word");
                }
                
                if(!answer.matches("[A-Za-z]+")){
                    throw new IllegalArgumentException("You can only use the letters in the alphabet");     
                }
                
                
                inValidInput = false;
             
            } catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage() + " try again.");
            }
            
        }
        
        
        System.out.println(palindrome( answer ));
        
        
        System.out.println("Calculate another palindrome? (Y/N)");
        answer = keyScan.nextLine();
        if(answer.equalsIgnoreCase("N")){
            tryAgain = false;
        }
    }
}

/**
 * checks from front and back of string that letters are the same, continues until length is 1 or the letters aren't the same
 * @param word, String inputted by user
 * @return true if palindrome, false if otherwise
 */
public static boolean palindrome(String word){
    
    if(word.length() == 1){
        return true;
    }
    
    if(word.charAt(0) != word.charAt(word.length() - 1)){
    return false;
    }
    
    return palindrome(word.substring(1, word.length() - 1));
}    
    
    
}
