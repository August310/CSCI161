package Challenges;

/**
 *
 * @author (Your Name Here)
 */
public class Challenge2 {
    
    
    /*
     * Consider the problem where even though we may use an int data type to store a number
     *  we may not want to allow all possible numbers to be used. One such example is
     *  an NDSU student ID where the ID can have at most 7 digits. 
     * 
     * Below there is a student ID that contains 8 digits. Write some Java code that will
     *  allow you to convert the ID to conform with the rules so that it won't have more
     *  than 7 digits. If the ID has more than 7 digits, you should remove extra digits from
     *  the front of the ID, so in the example below, the 9 would be removed and the ID
     *  would become 8765432. If the ID is already 7 digits (or fewer) your code should
     *  not modify the value. 
     * 
     * 
     * Challenge: Complete the problem below without using any selection statements 
     *  or the ternary operator.
     * 
     * Extra Challenge: Solve the problem above but also account for negative numbers
     *  by ensuring that the resulting ID is a positive number. For example, -4321 would
     *  become positive 4321 and -12345678 would become 2345678. 
     * 
     * Even More Challenge: Do not call any methods as a part of your solution.
     * 
     * I SAID I WANTED A CHALLENGE: Make sure your solution uses only a single line of code. 
     */
    
    public static void main(String[] args)
    {
        // Initial ID that has one too many digits
        int studentID = 98765432; 
        
        // Your code goes here
        
        
        
        // Output results
        System.out.println(studentID);
    }
}
