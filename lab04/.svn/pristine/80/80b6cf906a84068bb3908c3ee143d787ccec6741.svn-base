/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.text.NumberFormat;
import java.util.Random;

/**
 *
 * @author araderma
 */
public class Challenge1 
{
    /**
     * For this challenge we are interested in simulating a loaded die that is more likely
     *  to return certain values than others. Your job is to implement some code in the
     *  method body below that will allow you to accomplish this. 
     * 
     * You can run this file as the main method will call your method several thousand times
     *  and report on the statistics to determine if you were successful in your endeavor. 
     * 
     * Initial challenge: Write the following method such that is produces any significant
     *  bias (e.g., a 3 is more likely than other numbers) in the results at all. 
     *  
     * More challenge: Write your method such that it makes the results 1, 2, or 3 twice as 
     *  likely as getting a 4, 5, or 6. 
     * 
     * Even more challenge: Write your method so that it only requires a single statement.
     * 
     * I said give me a challenge: Don't use the String class or arrays as part of your solution.
     * 
     * All of that was still baby stuff: Make your method twice as likely to return a 2, 4, or 6
     *  than a 1, 3, or 5 while still following all of the rules above. 
     */
    public static int loadedDie()
    {
        return 0; 
    }
    
    public static void main(String[] args) 
    {
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        int totalRolls = 100000;
        int[] counts = new int[7]; 
        
        for(int i = 0; i < totalRolls; i++)
        {
            try
            {
                int roll = loadedDie();
                counts[roll]++; 
            }
            catch(Exception e)
            {
                System.err.println(e);
            }
        }
        
        System.out.println("#:\ttimes rolled\t% of rolls");
        for(int i = 1; i <= 6; i++)
        {
            System.out.println(i+":\t" + counts[i] + "\t\t" +percentFormatter.format((double)counts[i]/totalRolls));
        }
    }
}
