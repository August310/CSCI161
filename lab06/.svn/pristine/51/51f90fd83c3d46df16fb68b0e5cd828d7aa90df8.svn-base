package Challenges;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

public class Challenge2Test {
    


        
    @Test
    public void testChallenge2_Win_OutputCorrect()
    {
        double factor = 2.0; 
                
        PrintStream out = System.out; 
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        Challenge2.money = 30.0; 
        Challenge2.challenge2(factor, Boolean.TRUE);
        System.setOut(out);
        
        String result = output.toString().trim().replace("$", "").replace(".00", ".0"); 
        
        assertEquals("I've won and have 60.0 now.", result);
    }
    
    @Test
    public void testChallenge1_Lose_OutputCorrect()
    {
        double factor = 2.0; 
                
        PrintStream out = System.out; 
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        Challenge2.money = 40.0; 
        Challenge2.challenge2(factor, Boolean.FALSE);
        System.setOut(out);
                
        String result = output.toString().trim();
        
        assertEquals("I've lost and have nothing!", result);
    }
    
    @Test 
    public void testChallenge1_Win_MoneyCorrect()
    {
        double factor = 2.0; 
                
        PrintStream out = System.out; 
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        Challenge2.money = 50.0; 
        Challenge2.challenge2(factor, Boolean.TRUE);
        System.setOut(out);
        
        assertEquals(Challenge2.money, 100.0, 0.0);
    }
    
    @Test 
    public void testChallenge1_Lose_MoneyCorrect()
    {
        double factor = 2.0; 
                
        PrintStream out = System.out; 
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        Challenge2.money = 70.0; 
        Challenge2.challenge2(factor, Boolean.FALSE);
        System.setOut(out);
        
        assertEquals(0.0, Challenge2.money, 0.0);
    }
    
    @Test
    public void testChallenge1_Win_FormattedOutputCorrect()
    {
        double factor = 2.3125; 
                
        PrintStream out = System.out; 
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        Challenge2.money = 100.0; 
        Challenge2.challenge2(factor, Boolean.TRUE);
        System.setOut(out);
        
        String result = output.toString().trim(); 
        
        assertEquals("I've won and have $231.25 now.", result);
    }
    
    @Test
    public void testChallenge1_OutcomeNull_NoExceptions()
    {
        try 
        {
            double factor = 2.3125; 

            PrintStream out = System.out; 
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            System.setOut(new PrintStream(output));

            Challenge2.money = 100.0; 
            Challenge2.challenge2(factor, null);
            System.setOut(out);
        }
        catch (NullPointerException e)
        {
            fail("NullPointerException caught: " + e.toString());
        }
        catch (Exception e)
        {
            fail("Exception caught: " + e.toString());
        }
    }
}
