/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

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
    
    static Object[] results; 
    
    @BeforeClass
    public static void setUpClass() {
        
        results = Question2.question2(17, 32, -28, -27.13, 5.0, 4.0, 95.93782);
    }
    
    @Test
    public void testQuestion2Output() 
    {
        System.out.println("\n Question 2 Output:");
        
        System.out.println("minInt: " + (int)results[0]);
        System.out.println("maxDouble: " + (double)results[1]);
        System.out.println("rounded: " + (int)results[2]);
        System.out.println("absolute: " + (double)results[3]);
        System.out.println("cosine: " + (double)results[4]);
        System.out.println("answer: " + (double)results[5]);
        
    }
    
    @Test 
    public void Question2_Par1_IsCorrect()
    {
        assertEquals(-28, (int)results[0]);
    }
    
    @Test 
    public void Question2_Part2_IsCorrect()
    {
        assertEquals(95.93782, (double)results[1], 0.0);
    }
    
    @Test 
    public void testQuestion2_Part3_IsCorrect()
    {
        assertEquals(96, (int)results[2]);
    }
    
    @Test 
    public void testQuestion2_Part4_IsCorrect()
    {
        assertEquals(67.80782, (double)results[3], 0.0);
    }
    
    @Test 
    public void testQuestion2_Part5_IsCorrect()
    {
        assertEquals(-0.6536436208636119, (double)results[4], 0.0000001);
    }
    
    @Test 
    public void testQuestion2_Part6_IsCorrect()
    {
        assertEquals(25.0, (double)results[5], 0.0);
    }
    
}
