/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class BaseballPlayerTest {

    private static BaseballPlayer testPlayer; 
    private static BaseballPlayer testPlayer2; 
    
    @BeforeClass
    public static void setUpClass() 
    {
        testPlayer = new BaseballPlayer("Babe Ruth", 3, 1517, 506, 136, 714, 8399, 2105, 0); 
    }
    
   

    @Test
    public void test_getBattingAverage() 
    {
        double expected = .3420645; 
        double actual = testPlayer.getBattingAverage(); 
        
        String message = "This test fails if the batting average is not calculated correctly."; 
        
        assertEquals(message, expected, actual, 0.00001);
    }
    
    @Test
    public void test_getSluggingPercentage()
    {
        double expected = .6897249; 
        double actual = testPlayer.getSluggingPercentage(); 
        
        String message = "This test fails if the slugging percentage is not calculated correctly."; 
        
        assertEquals(message, expected, actual, 0.00001); 
    }
    
    @Test
    public void test_getOnBasePercentage()
    {
        double expected = .47391469; 
        double actual = testPlayer.getOnBasePercentage(); 
        
        String message = "This test fails if the on base percentage is not calculated correctly."; 
        
        assertEquals(message, expected, actual, 0.00001); 
    }
    
    @Test
    public void test_getFormattedBattingAverage() 
    {
        String expected = ".342"; 
        String actual = testPlayer.getFormattedBattingAverage(); 
        
        String message = "This test fails if the formatted batting average is not calculated correctly."; 
        
        assertEquals(message, expected, actual);
    }
    
    @Test
    public void test_getFormattedSluggingPercentage()
    {
        String expected = ".690"; 
        String actual = testPlayer.getFormattedSluggingPercentage(); 
        
        String message = "This test fails if the formatted slugging percentage is not calculated correctly."; 
        
        assertEquals(message, expected, actual); 
    }
    
    @Test
    public void test_getFormattedOnBasePercentage()
    {
        String expected = ".474"; 
        String actual = testPlayer.getFormattedOnBasePercentage(); 
        
        String message = "This test fails if the formatted on base percentage is not calculated correctly."; 
        
        assertEquals(message, expected, actual); 
    }
    

    
}
