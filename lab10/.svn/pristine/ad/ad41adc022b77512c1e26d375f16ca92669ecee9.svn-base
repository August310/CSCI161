package Questions.Files;

import ProvidedClasses.Student;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
public class Question6Test {
    
    public Question6Test() {
    }
    
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
    public void testParseStudentFile_NonExistentFile() {
        String fileName = "files/question6/doesnotexist.txt";
        ArrayList<Student> result = null; 
        try 
        {
            result = Question6.parseStudentFile(fileName);
        } 
        catch (Exception e) 
        {
            if(e instanceof FileNotFoundException)
                fail("FileNotFoundException should be caught, not thrown.");
            fail("Unexpected exception generated: " + e.toString());
        }
       
        assertEquals("Incorrect number of Students in returned list.", 0, result.size());
    }
    
    @Test
    public void testParseStudentFile_MalformattedFile() {
        String fileName = "files/question6/badlist1.txt";
        ArrayList<Student> result = null; 
        try 
        {
            result = Question6.parseStudentFile(fileName);
        } 
        catch (InputMismatchException e) 
        {
            return; 
        }
       
        fail("InputMismatchException was not thrown for malformed input file.");
    }
    
    @Test
    public void testParseStudentFile_AbruptEndOfFile() {
        String fileName = "files/question6/badlist1.txt";
        ArrayList<Student> result = null; 
        try 
        {
            result = Question6.parseStudentFile(fileName);
        } 
        catch (InputMismatchException e) 
        {
            return; 
        }
       
        fail("InputMismatchException was not thrown for malformed input file.");
    }
    
    @Test
    public void testParseStudentFile_CorrectResultsForGoodFile()
    {
        String fileName = "files/question6/list1.txt";
        ArrayList<Student> result = null; 
        try 
        {
            result = Question6.parseStudentFile(fileName);
        } 
        catch (Exception e) 
        {
            fail("Unexpected exception generated: " + e.toString());
        }
            
        assertEquals("Incorrect number of Students in returned list.", 3, result.size());
    }

    
}
