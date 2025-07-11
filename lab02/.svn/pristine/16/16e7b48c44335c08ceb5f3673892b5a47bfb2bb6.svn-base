package Questions;

import java.io.File;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author araderma
 */
public class Question5Test {
    
    static String result; 
    
    @BeforeClass
    public static void setupClass()
    {
        result = Question5.method();      
        System.out.println("Question 5 Values: ");
        System.out.println(result);
    }
    
    public void hardcodeCheck() 
    {
        File file = new File("src/Questions/Question5.java");
        try
        {
            Scanner scan = new Scanner(file);
            while(scan.hasNext())
            {
                // Very crude detection method. Will only catch the sufficiently lazy. 
                String line = scan.nextLine(); 
                line = line.replaceAll("\"", "");
                line = line.replaceAll("\\+", "");
                line = line.replaceAll(" ", "");
                
                
                if(line.contains("Name:JohnDoeID:0012345AverageScore:70.67"))
                {
                    fail("You should not hard code the result. It is necessary to use the DecimalFormat class to format values properly");
                }
            }
            
        }
        catch(Exception e)
        {
            throw new IllegalStateException(e);
        }
    }
    
    
    @Test
    public void testQuestion5_outputExactMatch()
    {
        hardcodeCheck();
        String message = "This test fails if the output is not the exact expected match.";
        assertEquals(message, "Name: John Doe ID: 0012345 Average Score: 70.67", result);
    }
    
    @Test
    public void testQuestion5_gradeFormatter_IsCorrect()
    {
        hardcodeCheck();
        String message = "This test fails if the output does not format the average grade properly."; 
        if (result.contains("70.00"))
        {
           String average = "70.00"; 
           assertEquals("The average grade is not being calcualted properly", "70.67", average);
        }
        assertTrue(message, result.contains("70.67"));
    }
    
    @Test
    public void testQuestion5_IDFormatter_IsCorrect()
    {
        hardcodeCheck();
        String message = "This test fails if the output does not format the student's ID properly.";
        assertTrue(message, result.contains("ID: 0012345"));
    }
    
    @Test
    public void testQuestion5_Name_IsCorrect()
    {
        hardcodeCheck();
        String message = "This test fails if the output does not format the student's name properly.";
        assertTrue(message, result.contains("Name: John Doe"));
    }
    
}
