package Questions.Chapter8;

import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

public class Question1Test {
          
    static Object[]  resultSet; 
    static Exception caught; 
    static boolean   caughtException = false;
    
    @BeforeClass
    public static void setUpClass() 
    {
        try 
        {
            resultSet = Questions.Chapter8.Question1.Question1(); 
        } 
        catch (Exception e) 
        {
            caught = e; 
            caughtException = true; 
        }
        
        if (caughtException)
        {
            System.out.println("Error in code creating runtime exception.");
            System.out.println("Unable to run one or more tests.");
            caught.printStackTrace();
               
        }
         
    }
    
    @Test
    public void testQuestion1_Part1_correctType() 
    {
        
        Object o = resultSet[0]; 
        
        String message = "This test fails if the array created in step 1 does not have int as a datatype.";
        
        assertTrue(message, o instanceof int[]);
    }
    
    @Test
    public void testQuestion1_Part2_correctType() 
    {

        Object o = resultSet[1]; 
        
        String message = "This test fails if the array created in step 1 does not have String as a datatype.";
        
        assertTrue(message, o instanceof String[]);
    }
    
    @Test
    public void testQuestion1_Part3_correctType() 
    {

        Object o = resultSet[2]; 
        
        String message = "This test fails if the array created in step 1 does not have boolean as a datatype.";
        
        assertTrue(message, o instanceof double[]);
    }
    
    @Test
    public void testQuestion1_Part4_correctType() 
    {

        Object o = resultSet[3]; 
        
        String message = "This test fails if the array created in step 1 does not have boolean as a datatype.";
        
        assertTrue(message, o instanceof boolean[]);
    }
    
    @Test
    public void testQuestion1_Part5_correctType() 
    {
        
        Object o = resultSet[4]; 
        
        String message = "This test fails if the array created in step 1 does not have double as a datatype.";
        
        assertTrue(message, o instanceof double[]);
    }
    
    @Test 
    public void testQuestion1_Part1_correctSize()
    {
        Object o = resultSet[0];
        
        if(!(o instanceof int[]))
        {
            fail("Incorrect type for Part 1.");
        }
        
        int[] result = (int[])o; 
        
        String message = "This test fails if the array does not have the correct size.";
        
        assertEquals(message, 5, result.length);
    }
    
    @Test 
    public void testQuestion1_Part2_correctSize()
    {
        Object o = resultSet[1];
        
        if(!(o instanceof String[]))
        {
            fail("Incorrect type for Part 2.");
        }
        
        String[] result = (String[])o; 
        
        String message = "This test fails if the array does not have the correct size.";
        
        assertEquals(message, 10, result.length);
    }
    
    @Test 
    public void testQuestion1_Part3_correctSize()
    {
        Object o = resultSet[2];
        
        if(!(o instanceof double[]))
        {
            fail("Incorrect type for Part 3.");
        }
        
        double[] result = (double[])o; 
        
        String message = "This test fails if the array does not have the correct size.";
        
        assertEquals(message, 4, result.length);
    }
    
    @Test 
    public void testQuestion1_Part4_correctSize()
    {
        Object o = resultSet[3];
        
        if(!(o instanceof boolean[]))
        {
            fail("Incorrect type for Part 4.");
        }
        
        boolean[] result = (boolean[])o; 
        
        String message = "This test fails if the array does not have the correct size.";
        
        assertEquals(message, 17, result.length);
    }
    
    @Test 
    public void testQuestion1_Part5_correctSize()
    {
        Object o = resultSet[4];
        
        if(!(o instanceof double[]))
        {
            fail("Incorrect type for Part 5.");
        }
        
        double[] result = (double[])o; 
        
        String message = "This test fails if the array does not have the correct size.";
        
        assertEquals(message, 6, result.length);
    }
    
    @Test 
    public void testQuestion1_Part2_correctValue_Jill()
    {
        Object o = resultSet[1];
        
        if(!(o instanceof String[]))
        {
            fail("Incorrect type for Part 2.");
        }
        
        String[] result = (String[])o; 
        
        if(result.length != 10)
        {
            fail("Incorrect size for Part 2.");
        }
        
        if(result[3] == null)
        {
            fail("Value of element for index 3 was null.");
        }
        
        String message = "This test fails if the element in the third index is not \"Jill\"";
        assertEquals(message, "Jill", result[3]);
    }
    
    @Test 
    public void testQuestion1_Part2_correctValue_Jack()
    {
        Object o = resultSet[1];
        
        if(!(o instanceof String[]))
        {
            fail("Incorrect type for Part 2.");
        }
        
        String[] result = (String[])o; 
        
        if(result.length != 10)
        {
            fail("Incorrect size for Part 2.");
        }
        
        if(result[8] == null)
        {
            fail("Value of the ninth element was null.");
        }
        
        String message = "This test fails if the element in the ninth is not \"Jack\"";
        assertEquals(message, "Jack", result[8]);
    }
    
    @Test 
    public void testQuestion1_Part3_correctValue_Element1()
    {
        Object o = resultSet[2];
        
        if(!(o instanceof double[]))
        {
            fail("Incorrect type for Part 3.");
        }
        
        double[] result = (double[])o; 
        
        if(result.length != 4)
        {
            fail("Incorrect size for Part 3.");
        }
        
        String message = "This test fails if the first element is not \"7.34\".";
        
        assertEquals(message, 7.34, result[0], 0.0);
    }
    
    @Test 
    public void testQuestion1_Part3_correctValue_Element2()
    {
        Object o = resultSet[2];
        
        if(!(o instanceof double[]))
        {
            fail("Incorrect type for Part 3.");
        }
        
        double[] result = (double[])o; 
        
        if(result.length != 4)
        {
            fail("Incorrect size for Part 3.");
        }
        
        String message = "This test fails if the second element is not \"4.72\".";
        
        assertEquals(message, 4.72, result[1], 0.0);
    }
    
    @Test 
    public void testQuestion1_Part3_correctValue_Element3()
    {
        Object o = resultSet[2];
        
        if(!(o instanceof double[]))
        {
            fail("Incorrect type for Part 3.");
        }
        
        double[] result = (double[])o; 
        
        if(result.length != 4)
        {
            fail("Incorrect size for Part 3.");
        }
        
        String message = "This test fails if the first element is not \"9.32\".";
        
        assertEquals(message, 9.32, result[2], 0.0);
    }
    
    @Test 
    public void testQuestion1_Part3_correctValue_Element4()
    {
        Object o = resultSet[2];
        
        if(!(o instanceof double[]))
        {
            fail("Incorrect type for Part 3.");
        }
        
        double[] result = (double[])o; 
        
        if(result.length != 4)
        {
            fail("Incorrect size for Part 3.");
        }
        
        String message = "This test fails if the first element is not \"8.25\".";
        
        assertEquals(message, 8.25, result[3], 0.0);
    }
    
    @Test
    public void testQuestion1_Part4_EveryThirdElement_IsTrue()
    {
        Object o = resultSet[3];
        
        if(!(o instanceof boolean[]))
        {
            fail("Incorrect type for Part 4.");
        }
        
        boolean[] result = (boolean[])o; 
        
        if (result.length != 17)
        {
            fail("Incorrect length for Part 4.");
        }
        
        boolean[] correct = {false, false, true, false, false, true, false, false, true, false, false, true, false, false, true, false, false};
        
        int index = -1; 
        
        for(int i = 2; i < 17; i += 3)
        {
            if(result[i] != correct[i])
            {
                index = i; 
                break; 
            }
        }
        
        String message = "This test fails if any third element is not true. Element " + (index + 1) + " was false.";
        
        if (index > 0)
        {
            fail(message);
        }
    }
    
    @Test
    public void testQuestion1_Part4_EveryNonThirdElement_IsFalse()
    {
        Object o = resultSet[3];
        
        if(!(o instanceof boolean[]))
        {
            fail("Incorrect type for Part 4.");
        }
        
        boolean[] result = (boolean[])o; 
        
        if (result.length != 17)
        {
            fail("Incorrect length for Part 4.");
        }
        
        boolean[] correct = {false, false, true, false, false, true, false, false, true, false, false, true, false, false, true, false, false};
        
        int index = -1; 
        
        for(int i = 0; i < 17; i += 1)
        {
            if((i + 1) % 3 == 0)
            {
                continue; 
            }
            
            if(result[i] != correct[i])
            {
                index = i; 
                break; 
            }
        }
        
        String message = "This test fails if any non-third element is not false. Element " + (index + 1) + " was true.";
        
        if (index > 0)
        {
            fail(message);
        }
    }
    
    @Test
    public void testQuestion1_Part5_correctValue_Element5()
    {
        Object o = resultSet[4];
        
        if(!(o instanceof double[]))
        {
            fail("Incorrect type for Part 5.");
        }
        
        double[] result = (double[])o; 
        
        if(result.length != 6)
        {
            fail("Incorrect size for Part 5.");
        }
        
        String message = "This test fails if the fifth element is not \"1.05\".";
        
        assertEquals(message, 1.05, result[4], 0.0);
    }
    
    @Test
    public void testQuestion1_Part5_correctValue_Element6()
    {
        Object o = resultSet[4];
        
        if(!(o instanceof double[]))
        {
            fail("Incorrect type for Part 5.");
        }
        
        double[] result = (double[])o; 
        
        if(result.length != 6)
        {
            fail("Incorrect size for Part 5.");
        }
        
        String message = "This test fails if the sixth element is not \"27.32\".";
        
        assertEquals(message, 27.32, result[5], 0.0);
    }
}
