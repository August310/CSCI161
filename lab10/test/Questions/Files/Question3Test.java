package Questions.Files;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class Question3Test {

    @Test
    public void testQuestion3_ArgumentIsNull() 
    {
        System.out.println("\nTesting Question3 with null argument:");
        String fileName = null;
        String expResult = "This is a test. \n" +
                            "I repeat, this is only a test.\n" +
                            "Actually that's a lie. This is a file. \n" +
                            "I repeat, this is only a file. \n";
        String result = Question3.Question3(fileName);
        
        System.out.println(result);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testQuestion3_NonExistantFile()
    {
        System.out.println("\nTesting Question3 with a non-existant file:");
        String fileName = "Blah.txt";
        
        String expected = "Error: Could not find file!";
        
        String result = Question3.Question3(fileName);
        System.out.println(result);  
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testQuestion3_ValidFile1()
    {
        System.out.println("\nTesting Question3 files/question3/file1.txt:");
        String fileName = "files/question3/file1.txt";
        
        String expected = "Look ma, I can read (at least from files). \n";
        
        String result = Question3.Question3(fileName);
        System.out.println(result);  
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testQuestion3_ValidFile2()
    {
        System.out.println("\nTesting Question3 files/question3/SecretsOfTheUniverse.txt:");
        String fileName = "files/question3/SecretsOfTheUniverse.txt";
        
        String expected = "1) Don't spit into the wind.\n" +
                            "2) Don't play leapfrog with a unicorn.\n" +
                            "3) Don't forget to bring a towel. \n" +
                            "4) Always be coding. \n"; 
        
        String result = Question3.Question3(fileName);
        System.out.println(result);  
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testQuestion3_NoExceptionsThrown()
    {
        try 
        {
            Question3.Question3("whargarbl");
        }
        catch (Exception e)
        {
            fail("Caught exception: " + e.toString());
        }
    }

    
}
