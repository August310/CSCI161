/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

/**
 *
 * @author araderma
 */
public class Challenge1 
{
    /**
     * In class we learned about the parseInt and parseDouble methods of the 
     *  wrapper classes for those primitive types that could take a String and 
     *  convert it to the correct type. 
     * 
     * For this challenge we are concerned with simply being able to take a 
     *  String which contains a single numeric digit and convert it to the 
     *  corresponding primitive int digit.
     * 
     * Complete the method below so that it behaves as described above. It is 
     *  not necessary to for your method to handle input that contains more than 
     *  one digit that does not contain any numbers. 
     * 
     * Extra challenge: Do not add more than a single statement to the existing code.
     * 
     * More challenge: Do not call any methods on the object reference str as
     *  a part of your solution in addition to the constraints above. 
     * 
     * Even more challenge: Implement the parseNumber method below which is capable
     *  of converting a String containing multiple digits to its int value. It is 
     *  not necessary to handle negative numbers or numbers too large to be stored
     *  as an int. 
     * 
     * Way more challenge: Handle negative numbers in addition to the above.
     * 
     * The instructor hasn't even determined if this is possible levels of challenge:  
     *  Do all of the above while only adding at most one additional statement 
     *  to the parseNumber method beyond what exists already. 
     */
    
    public static int parseDigit(String str)
    {
        int result = 0;
        
        
        
        return result; 
    }
    
    public static int parseNumber(String str)
    {
        int result = 0;
        
       
        
        return result; 
    }
    
    public static void main(String[] args) {
        
        System.out.println(parseDigit("7"));
        System.out.println(parseDigit("2"));
        System.out.println(parseDigit("0"));
        
        System.out.println(parseNumber("332"));
        System.out.println(parseNumber("593813"));
    }
    
    
}
