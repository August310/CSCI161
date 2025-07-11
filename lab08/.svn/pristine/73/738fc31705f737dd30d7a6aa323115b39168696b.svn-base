/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Chapter8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class Question2Test {
    
    private static Object[] resultsGood;
    private static Object[] resultsEmpty; 
    static Exception caught; 
    static boolean   caughtException = false;
    
     @BeforeClass
    public static void setUpClass() 
    {
        double[] input = {32.33, 17.5, -27.5, 83.1, 1234.567, 99.1234, 55.0, -450.5}; 
        double[] empty = new double[0]; 
        
        try 
        {
            resultsGood = Questions.Chapter8.Question2.Question2(input);
            resultsEmpty = Questions.Chapter8.Question2.Question2(empty); 
        } 
        catch (Exception e) 
        {
            caught = e; 
            caughtException = true; 
        }
        
        if (caughtException)
        {
            System.out.println("Error in code creating runtime exception.");
            System.out.println("Unable to run one or more tests.");
            caught.printStackTrace();
               
        }
    }

    @Test
    public void testQuestion2_NonEmptyInput_CorrectCount() 
    {
        assertEquals(8, (int)resultsGood[0]);
    }
    
    @Test
    public void testQuestion2_NonEmptyInput_CorrectTotal() 
    {
        assertEquals(1043.6204, (double)resultsGood[1], 0.0);
    }
    
    @Test
    public void testQuestion2_NonEmptyInput_CorrectMinimum() 
    {
        assertEquals(-450.5, (double)resultsGood[2], 0.0);
    }
    
    @Test
    public void testQuestion2_NonEmptyInput_CorrectMaximum() 
    {
        assertEquals(1234.567, (double)resultsGood[3], 0.0);
    }
    
    @Test
    public void testQuestion2_EmptyInput_CorrectCount() 
    {
        assertEquals(0, (int)resultsEmpty[0]);
    }
    
    @Test
    public void testQuestion2_EmptyInput_CorrectTotal() 
    {
        assertEquals(0.0, (double)resultsEmpty[1], 0.0);
    }
    
    @Test
    public void testQuestion2_EmptyInput_CorrectMinimum() 
    {
        assertEquals(Double.NaN, (double)resultsEmpty[2], 0.0);
    }
    
    @Test
    public void testQuestion2EmptyInput_CorrectMaximum() 
    {
        assertEquals(Double.NaN, (double)resultsEmpty[3], 0.0);
    }
    
}
