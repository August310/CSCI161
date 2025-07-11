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
import org.junit.rules.ExpectedException;

/**
 *
 * @author araderma
 */
public class Question1Test {

    @BeforeClass
    public static void setUpClass() {
    }
    
    @Test(expected = MyException.class)
    public void testQuestion1_ThrowsMyException() throws Exception
    {
        Question1.Question1();
    }
    
    @Test
    public void testQuestion1_ExceptionMessageIsCorrect()
    {
        try 
        {
            Question1.Question1();
            fail("No exception was thrown.");
        }
        catch (Exception e)
        {
            String message = e.getMessage();
            assertEquals("Look ma, I can throw exceptions now.", message);
        }
    }
    
}
