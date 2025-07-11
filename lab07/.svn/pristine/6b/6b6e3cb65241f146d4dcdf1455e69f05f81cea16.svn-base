/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import TestClasses.MockInputStream;
import java.io.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class MenuHelperTest
{
    protected final static InputStream in = System.in; 
    protected final static PrintStream out = System.out; 
    
    protected static ByteArrayOutputStream setupMockStreams(String[] input, boolean echo)
    {
        // Setup a new stream to capture the output instead of sending it to System.out
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream outputPS = new PrintStream(output);
        System.setOut(outputPS);
        
        // Setup a MockInputStream to simulate input from System.in
        MockInputStream mis = (echo) ? new MockInputStream(input, outputPS) : new MockInputStream(input);
        System.setIn(mis);
        
        return output;
    }
    
    protected static void outputException(String message, Exception e, ByteArrayOutputStream output) throws IOException
    {
        // Write any program output and simulated input to the console
        if(output != null)
        {
            output.writeTo(out);
            e.printStackTrace(out);
        }
        fail(message); 
    }

    @After
    public void afterTest()
    {
        System.setIn(in);
        System.setOut(out);
    }
    
    @Test
    public void testMain() throws IOException
    {
        System.out.println(" - - - Running test of main method - - - ");
        
        String[] mockInput = new String[] {"1\n", "a\n", "2\n", "3\n", "4\n", "2\n", "1\n", "3\n", "2\n"}; 

        ByteArrayOutputStream output = setupMockStreams(mockInput, true);
        
        try
        {
            MenuHelper.main(null);
    }
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe.", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
    
        output.writeTo(out);
}
    
    @Test
    public void testDisplayMenu_DoesNotMakeTooManyReads() throws IOException
    {
        String[] mockInput = new String[] {"3\n"}; 

        ByteArrayOutputStream output = setupMockStreams(mockInput, true);
        
        try
        {
            MenuHelper.displayMenu("Test", 1, 5);
        } 
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe.", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
    }
    
    @Test
    public void testDisplayMenu_IsTypeSafe() throws IOException
    {
        String[] mockInput = new String[] {"a\n", "3\n"}; 

        ByteArrayOutputStream output = setupMockStreams(mockInput, true);
        
        try
        {
            MenuHelper.displayMenu("Test", 1, 5);
        } 
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe.", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
    }
    
    @Test
    public void testDisplayMenu_ReturnsCorrectResult() throws IOException
    {
        String[] mockInput = new String[] {"2\n"}; 

        ByteArrayOutputStream output = setupMockStreams(mockInput, true);
        
        try
        {
            int actual = MenuHelper.displayMenu("Test", 1, 4);
            assertEquals("displayMenu method returned an incorrect result.", 2, actual);
        } 
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe.", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
    }
    
    @Test
    public void testDisplayMenu_BelowMinBoundaryTest() throws IOException
    {
        String[] mockInput = new String[] {"0\n", "1\n", "2\n", "3\n"}; 

        ByteArrayOutputStream output = setupMockStreams(mockInput, true);
        
        try
        {
            int actual = MenuHelper.displayMenu("Test", 1, 5);
            assertNotSame("displayMenu accepts improper entry below parameter min.", 0, actual);
        } 
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe.", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
    }
    
    @Test
    public void testDisplayMenu_OnMinBoundaryTest() throws IOException
    {
        String[] mockInput = new String[] {"1\n", "2\n", "3\n", "4\n"}; 

        ByteArrayOutputStream output = setupMockStreams(mockInput, true);
        
        try
        {
            int actual = MenuHelper.displayMenu("Test", 1, 4);
            assertEquals("displayMenu method does not accept parameter min as valid input.", 1, actual);
        } 
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe.", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
    }
    
    @Test
    public void testDisplayMenu_AboveMaxBoundaryTest() throws IOException
    {
        String[] mockInput = new String[] {"5\n", "4\n", "3\n", "2\n"}; 

        ByteArrayOutputStream output = setupMockStreams(mockInput, true);
        
        try
        {
            int actual = MenuHelper.displayMenu("Test", 1, 4);
            assertNotSame("displayMenu method does not handle maximum value boundary properly.", 5, actual);
        } 
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe.", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
    }
    
    @Test
    public void testDisplayMenu_OnMaxBoundaryTest() throws IOException
    {
        String[] mockInput = new String[] {"5\n", "4\n", "3\n", "2\n"}; 

        ByteArrayOutputStream output = setupMockStreams(mockInput, true);
        
        try
        {
            int actual = MenuHelper.displayMenu("Test", 1, 4);
            assertEquals("displayMenu method does not handle maximum value boundary properly.", 4, actual);
        } 
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe.", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
    }
    
}
