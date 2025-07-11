/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.io.ByteArrayInputStream;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class Question4Test {
    

    static Object[] results; 
    @BeforeClass
    public static void setUpClass() 
    {
        ByteArrayInputStream mockInput = new ByteArrayInputStream("Infinity\n1.0".getBytes());
        System.setIn(mockInput);
        
        results = Question4.question4("8964", "1351.7543");
        
        System.setIn(System.in);
    }


    @Test
    public void testQuestion4Output() 
    {
        System.out.println("\nQuestion 4 Output:");
        
        System.out.println("parsedInt: " + (int)results[0]);
        System.out.println("parsedDouble: " + (double)results[1]);
        System.out.println("isInfinite: " + (boolean)results[2]);
        System.out.println("isNaN: " + (boolean)results[3]);
        System.out.println("result: " + (int)results[4]);
    }
    
    @Test
    public void testQuestion4_Part2_IsCorrect()
    {
        assertEquals(8964, (int)results[0]);
    }
    
    @Test
    public void testQuestion4_Part3_IsCorrect()
    {
        assertEquals(1351.7543, (double)results[1], 0.0);
    }
    
    @Test
    public void testQuestion4_Part6_IsCorrect()
    {
        assertEquals(true, (boolean)results[2]);
    }
    
    @Test
    public void testQuestion4_Part7_IsCorrect()
    {
        assertEquals(false, (boolean)results[3]);
    }
    
    @Test
    public void testQuestion4_Part8_IsCorrect()
    {
        assertEquals(2147483646, (int)results[4]);
    }
    
}
