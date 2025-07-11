/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions.Exceptions;

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
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testQuestion2_CatchesArithmeticException() 
    {
        try 
        {
            String[] result;
        
            result = Question2.Question2(0);

            assertEquals("Incorrect first name.", "Billy", result[0]);
            assertEquals("Incorrect last name.", "Jones", result[1]);
        }
        catch (ArithmeticException e)
        {
            fail("Question2 failed to catch ArithmeticException");
        }
    }
    
    @Test
    public void testQuestion2_CatchesArrayIndexOutOfBoundsException() 
    {
        try 
        {
            String[] result;

            result = Question2.Question2(1);

            assertEquals("Incorrect first name.", "Stacy", result[0]);
            assertEquals("Incorrect last name.", "Smith", result[1]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            fail("Question2 failed to catch ArrayIndexOutOfBoundsException");
        }

    }
    
    @Test
    public void testQuestion2_CatchesNullPointerException() 
    {
        try
        {
            String[] result;
        
            result = Question2.Question2(5);

            assertEquals("Incorrect first name.", "Kathy", result[0]);
            assertTrue("Incorrect last name.", result[1] == null);
        }
        catch (NullPointerException e)
        {
             fail("Question2 failed to catch NullPointerException");
        }
    }
    
}
