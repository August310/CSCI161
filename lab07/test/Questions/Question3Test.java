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
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class Question3Test extends TestInputHelper{
    
    public void runTest(String[] input, int index, int value) throws IOException
    {
        ByteArrayOutputStream output = setupMockStreams(input, true); 
        
        try
        {
            Object[] result = Question3.question3();
        
            // If the result is incorrect, dump the captured output to System.out
            if((int)result[index] != value)
            {
                out.write(("\n - - - Output for: " + getTestName(3) + " - - -\n").getBytes());
                output.writeTo(out);
            }
    
            //Method tests both minimum and maximum
            String testType = (index == 0) ? "minimum" : "maximum";
            
            assertEquals("This test fails when " + testType + " is incorrect.", value, (int)result[index]);
        }
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe.", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (OutOfMemoryError e)
        {
            out.write("Infinite loop detected!".getBytes());
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }  
    }
    
    @Test
    public void testQuestion3_Maximum_IsCorrect() throws IOException 
    {
        String[] input = new String[] {"-10\n", "-20\n", "-30\n", "-40\n", "-50\n", "-60\n", "-70\n", "-80\n", "-90\n", "-100\n", "-100\n"}; 
        
        runTest(input, 1, -10);
    }
    
    @Test
    public void testQuestion3_Minimum_IsCorrect() throws IOException 
    {
        String[] input = new String[] {"10\n", "20\n", "30\n", "40\n", "50\n", "60\n", "70\n", "80\n", "90\n", "100\n", "100\n"}; 
        
        runTest(input, 0, 10);
    }
    
    
    @Test
    public void testQuestion3_TooManyIterations() throws IOException 
    {
        String[] input = new String[] {"10\n", "10\n", "10\n", "10\n", "10\n", "10\n", "10\n", "10\n", "10\n", "10\n", "11\n", "12\n", "13\n"}; 
        
        runTest(input, 1, 10);
    }
    
    @Test
    public void testQuestion3_TooFewIterations() throws IOException 
    {
        String[] input = new String[] {"-1\n", "-2\n", "-3\n", "-4\n", "-5\n", "-6\n", "-7\n", "-8\n", "-9\n", "-10\n", "-1\n", "-1\n", "-1\n"}; 
        
        runTest(input, 0, -10);
    }
    
    @Test
    public void testQuestion3_Average_IsCorrect() throws IOException 
    {
        String[] input = new String[] {"10\n", "20\n", "30\n", "40\n", "50\n", "60\n", "70\n", "80\n", "90\n", "0\n", "0\n"}; 
        
        ByteArrayOutputStream output = setupMockStreams(input, true);
        
        try
        {
        Object[] result = Question3.question3();
        
            // If the result is incorrect, dump the captured output to System.out
            if(Math.abs((double)result[2] - 45.0) > 0.0001)
            {
                out.write(("\n - - - Output for: " + getTestName() + " - - -\n").getBytes());
                output.writeTo(out);
            }
        
            assertEquals("This test fails when the average is not calculated correctly", 45.0, (double)result[2], 0.0001);
        } 
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe.", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (OutOfMemoryError e)
        {
            out.write("Infinite loop detected!".getBytes());
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
    }
    
    @Test
    public void testQuestion3_Average_StoresFractionalPart() throws IOException 
    {
        String[] input = new String[] {"10\n", "17\n", "11\n", "23\n", "43\n", "62\n", "79\n", "81\n", "91\n", "0\n", "0\n"}; 
        
        ByteArrayOutputStream output = setupMockStreams(input, true);
        
        try
        {
        Object[] result = Question3.question3();
        
        double actual; 
        try 
        {
            actual = (double)result[2];
            } 
            catch (Exception e) 
        {
            actual = (double)((int)result[2]);
        }
        
            // If the result is incorrect, dump the captured output to System.out
            if(Math.abs(actual - 41.7) > 0.0001)
            {
                out.write(("\n - - - Output for: " + getTestName() + " - - -\n").getBytes());
                output.writeTo(out);
        }
    
            assertEquals("This test fails when the average is not calculated correctly", 41.7, actual, 0.0001);
        } 
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe.", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (OutOfMemoryError e)
        {
            out.write("Infinite loop detected!".getBytes());
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
    }
    
    @Test
    public void testQuestion3_IsTypeSafe() throws IOException 
    {
        
        String[] input = new String[] {"bob\n", "dale\n", "-10\n", "-20\n", "-30\n", "-40\n", "-50\n", "-60\n", "-70\n", "-80\n", "-90\n", "-100\n", "-100\n"}; 
        
        ByteArrayOutputStream output = setupMockStreams(input, true);
        
        try
        {
            Question3.question3();
        } 
        catch (InputMismatchException e)
        {
            outputException("Input is not type-safe.", e, output);
        }
        catch (NoSuchElementException e)
        {
            outputException("Likely attempting to make too many reads.", e, output);
        }
        catch (OutOfMemoryError e)
        {
            out.write("Infinite loop detected!".getBytes());
        }
        catch (Exception e)
        {
            outputException("Something has gone horribly wrong.", e, output);
        }
        
    }
    
    
}
