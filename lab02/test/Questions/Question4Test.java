package Questions;

import ProvidedClasses.Student;
import TestHelperClasses.MockInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author araderma
 */
public class Question4Test {
    
    static Student result; 
    
    static String name; 
    static int ID;
    static int exam1;
    static int exam2;
    static int exam3;
    
    @BeforeClass
    public static void SetupClass() 
    {
        InputStream sin = System.in; 
        
        Random rand = new Random();
        
        String[] first = {"Robert", "Kristoph", "Kaleb", "Ann", "Louise", "Sally", "Xavier", "James", "Bernice", "Gertrude"}; 
        String[] last = {"Jones", "Lee", "Higgens", "Lopez", "Hutzenbuhler", "Paulson", "Doe", "Engleberger", "Little", "O'Malley"}; 
        
        name = first[rand.nextInt(first.length)] + " " + last[rand.nextInt(last.length)];
        ID = (rand.nextInt(90000) + 10000);
        exam1 = rand.nextInt(101);
        exam2 = rand.nextInt(101);
        exam3 = rand.nextInt(101);
        
        String nameString = name + "\n";
        String idString = ID + "\n";
        String exam1String = exam1 + " ";
        String exam2String = exam2 + " ";
        String exam3String = exam3 + "\n";
        String extra1 = rand.nextInt(101) + "\n";
        String extra2 = rand.nextInt(101) + "\n";
        String extra3 = rand.nextInt(101) + "\n";
        String extra4 = rand.nextInt(101) + "\n";
        String extra5 = rand.nextInt(101) + "\n";
        
        String[] input = {nameString, idString, exam1String, exam2String, exam3String, extra1, extra2, extra3, extra4, extra5}; 
        
        
        MockInputStream mockInput = new MockInputStream(input, System.out);       
        System.setIn(mockInput);

        try
        {
            result = Question4.method();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error likely due to improper step 3.");
        }
        catch(NoSuchElementException e)
        {
            System.out.println("Error likely due to too many read calls.");
        }
        
        
        System.setIn(sin);
    }
    
    /**
     * Test of question3 method, of class Question3.
     */
    @Test
    public void testQuestion4Output() 
    {
              
        System.out.println("Question 4 Values: ");
        
        System.out.println(result);
    }
    
    @Test
    public void testQuestion4_newStudent_IsCorrect()
    {
        assertEquals(new Student(name, ID), result);
    }
    
    @Test
    public void testQuestion4_name_IsCorrect()
    {
        assertEquals(name, result.getName());
    }
    
    @Test
    public void testQuestion4_ID_IsCorrect()
    {
        assertEquals(ID, result.getID());
    }
    
    @Test
    public void testQuestion4_score1_IsCorrect()
    {
        assertEquals(exam1, result.getFirstExamScore());
    }
    
    @Test
    public void testQuestion4_score2_IsCorrect()
    {
        assertEquals(exam2, result.getSecondExamScore());
    }
    
    @Test
    public void testQuestion4_score3_IsCorrect()
    {
        assertEquals(exam3, result.getThirdExamScore());
    }
    
}
