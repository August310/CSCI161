package Questions.Files;

import java.io.File;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class Question4Test {
    
    @BeforeClass
    public static void setUpClass() 
    {
        File f = new File("files/question4/MySecretsOfTheUniverse.txt");
        
        if(f.exists())
        {
            f.delete();
        }
        
        Question4.Question4();
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
    public void testQuestion4_CreatedCorrectFile() 
    {
       File f = new File("files/question4/MySecretsOfTheUniverse.txt");
        
        if(!f.exists())
        {
            fail("Could not find file files/question4/MySecretsOfTheUniverse.txt");
        }
    }

    @Test
    public void testQuestion4_FileWasProperlySaved() 
    {
        File f = new File("files/question4/MySecretsOfTheUniverse.txt");
        
        if(!f.exists())
        {
            fail("Could not find file files/question4/MySecretsOfTheUniverse.txt");
        }
        else
        {
            try 
            {
                Scanner file = new Scanner(f); 
                
                int lines = 0; 
                
                while (file.hasNext())
                {
                    file.nextLine();
                    lines++; 
                }
                
                assertTrue("Data was not saved to file.", lines > 0);
                
                
            } catch (Exception e) 
            {
                fail("Exception: " + e.toString());
            }
        }
    }
    
    @Test
    public void testQuestion4_FileContainsAtLeast3Secrets() 
    {
        File f = new File("files/question4/MySecretsOfTheUniverse.txt");
        
        if(!f.exists())
        {
            fail("Could not find file files/question4/MySecretsOfTheUniverse.txt");
        }
        else
        {
            try 
            {
                Scanner file = new Scanner(f); 
                
                int lines = 0; 
                
                System.out.println("Secrets of the Universe:");
                
                while (file.hasNext())
                {
                    System.out.println(file.nextLine());
                    lines++; 
                }
                
                assertTrue("Insufficient number of secrets.", lines > 2);
                
                
            } catch (Exception e) 
            {
                fail("Exception: " + e.toString());
            }
        }
    }
    
}

