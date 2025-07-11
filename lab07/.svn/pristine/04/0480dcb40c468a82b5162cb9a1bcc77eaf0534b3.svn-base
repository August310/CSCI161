/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import TestClasses.TestInputHelper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class Question1Test extends TestInputHelper {
    
    private static int[] goodResults; 
    private static int[] badResults;
    private static int[] noResults; 
    
    public static ByteArrayOutputStream testGoodInput(boolean... b) throws IOException
    {
        
        String[] input = new String[]{"5\n", "10\n", "15\n", "20\n", "25\n", "-1\n"}; 
        
        ByteArrayOutputStream output = setupMockStreams(input, b.length == 0 ? false : b[0]); 
        
        try
        {
            goodResults = Question1.question1(); 
        }
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (OutOfMemoryError e)
        {
            outputError("Infinite loop detected!", e, output);
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
        
        return output;
    }
    
    public static ByteArrayOutputStream testBadInput(boolean... b) throws IOException
    {
        String[] input = new String[]{"1\n", "2\n", "a\n", "3\n", "4\n", "5\n", "6\n", "-11\n"}; 
        
        ByteArrayOutputStream output = setupMockStreams(input, b.length == 0 ? false : b[0]); 
        
        try
        {
            badResults = Question1.question1(); 
        }
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (OutOfMemoryError e)
        {
            outputError("Infinite loop detected!", e, output);
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
        
        return output; 
    }
    
    public static ByteArrayOutputStream testNoInput(boolean... b) throws IOException
    {
        String[] input = new String[]{"-1\n"}; 
        
        ByteArrayOutputStream output = setupMockStreams(input, b.length == 0 ? false : b[0]); 
        
        try
        {
            noResults = Question1.question1(); 
        }
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (OutOfMemoryError e)
        {
            outputError("Infinite loop detected!", e, output);
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
        
        return output; 
    }
    
    @Test
    public void testGoodInput_Count_isCorrect() throws IOException
    {
        testGoodInput();
        assertEquals("This test fails when count is incorrect.", 5, goodResults[0]);
    }
    
    @Test
    public void testGoodInput_Total_isCorrect() throws IOException
    {
        testGoodInput();
        assertEquals("This test fails when total is incorrect.", 75, goodResults[1]);
    }
    
    @Test
    public void testGoodInput_Minimum_isCorrect() throws IOException
    {
        testGoodInput();
        assertEquals("This test fails when minimum is incorrect.", 5, goodResults[2]);
    }
    
    @Test
    public void testGoodInput_Maximum_isCorrect() throws IOException
    {
        testGoodInput();
        assertEquals("This test fails when maximum is incorrect.", 25, goodResults[3]);
    }
    
    @Test
    public void testBadInput_Count_isCorrect() throws IOException
    {
        testBadInput();
        assertEquals("This test fails when count is incorrect.", 6, badResults[0]);
    }
    
    @Test
    public void testBadInput_Total_isCorrect() throws IOException
    {
        testBadInput();
        assertEquals("This test fails when total is incorrect.", 21, badResults[1]);
    }
    
    @Test
    public void testBadInput_Minimum_isCorrect() throws IOException
    {
        testBadInput();
        assertEquals("This test fails when minimum is incorrect.", 1, badResults[2]);
    }
    
    @Test
    public void testBadInput_Maximum_isCorrect() throws IOException
    {
        testBadInput();
        assertEquals("This test fails when maximum is incorrect.", 6, badResults[3]);
    }
    
    @Test
    public void testNoInput_Count_isCorrect() throws IOException
    {
        testNoInput();
        assertEquals("This test fails when count is incorrect", 0, noResults[0]);
    }
    
    @Test
    public void testNoInput_Total_isCorrect() throws IOException
    {
        testNoInput();
        assertEquals("This test fails when total is incorrect", 0, noResults[1]);
    }
    
    @Test
    public void testNoInput_Minimum_isCorrect() throws IOException
    {
        testNoInput();
        assertEquals("This test fails when minimum is incorrect", -1, noResults[2]);
    }
    
    @Test
    public void testNoInput_Maximum_isCorrect() throws IOException
    {
        testNoInput();
        assertEquals("This test fails when maximum is incorrect", -1, noResults[3]);
    }
    
    @BeforeClass
    public static void beforeClass() throws IOException
    {
        System.out.println(">>> Test of Question1 with good input:");
        testGoodInput(true).writeTo(out);

        out.println("\n>>> Test of Question1 with bad input:");
        testBadInput(true).writeTo(out);
        
        out.println("\n>>> Test of Question1 with no input:");
        testNoInput(true).writeTo(out); 
    }
    
    @Test
    public void testForPromptForUserInput() throws IOException
    {
        ByteArrayOutputStream output = testGoodInput(); 
        
        String[] contents = output.toString().split("\n");
        
        if(contents.length < 1)
        {
            fail("Could not find prompt message."); 
        }
        
        out.println("Prompt message: " + contents[0]);
        
        assertTrue("This method fails if the user does not receive a prompt to enter input", contents[0].toLowerCase().contains("enter") && contents[0].toLowerCase().contains("negative") );
    }
    
    @Test
    public void testForOutputOfResults() throws IOException
    {
        ByteArrayOutputStream output = testGoodInput(); 
        
        String contents = output.toString(); 
        
        assertTrue("This method fails if the results are not output properly for the count", contents.contains("count: 5"));
        assertTrue("This method fails if the results are not output properly for the total", contents.contains("total: 75"));
        assertTrue("This method fails if the results are not output properly for the minimum", contents.contains("minimum: 5"));
        assertTrue("This method fails if the results are not output properly for the maximum", contents.contains("maximum: 25"));
    }
    
    @Test
    public void testForPromptOnIncorrectInput() throws IOException
    {
        ByteArrayOutputStream output = testBadInput(); 
        
        String contents = output.toString();
        
        assertTrue("This method fails if the user is not re-prompted when entering a bad value", contents.toLowerCase().contains("not an integer"));
    }
    
}
