/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions.Chapter9;

import java.lang.reflect.Field;
import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class Question1Test {
    
    static String[] names; 
    static int[]    dimensions;
    static String[] type;
    static int      number; 
    
    @BeforeClass
    public static void setUpClass() 
    {
        Question1 q1 = new Question1();
             
        Field[] fields = q1.getClass().getDeclaredFields();

        number = fields.length; 
        
        names      = new String[number];
        dimensions = new int[number];
        type       = new String[number];
        
        for (int i = 0; i < number; i++)
        {
            names[i] = (fields[i].getName().split("/"))[0]; 
            dimensions[i] = fields[i].getType().toString().replace("class ", "").lastIndexOf("[") + 1; 
            
            String fieldType = fields[i].getType().toString().replace("class ", "").replace("[", "");
        
            String types = "BSILFDCZ"; 
            String[] primitives = {"byte", "short", "int", "long", "float", "double", "char", "boolean"}; 
            
            if(fieldType.length() == 1)
            {
                type[i] = primitives[types.indexOf(fieldType)];
            }
            else
            {
                type[i] = fieldType.substring(fieldType.lastIndexOf(".") + 1).replace(";", ""); 
            }
        }
        System.out.println("Question1 Results:");
        System.out.println("Type: \t\tDimensions: \tName: ");
        for(int i = 0; i < number; i++)
        {
            
            System.out.println(type[i] + "\t\t" + dimensions[i] + "\t\t" + names[i]);
        }
        
    }
    
    public static void areInstanceVariables()
    {
        if (number == 0)
        {
            fail("Parts 1 - 7 are not being declared as instance variables.");
        }
    }
    
    @Test
    public void testQuestion1_Part1_correctType() 
    {
        int part = 1; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong type.";
        String expected = "int";
        
        assertEquals(message, expected, type[part - 1]);
    }
    
    @Test
    public void testQuestion1_Part2_correctType() 
    {
        int part = 2; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong type.";
        String expected = "double";
        
        assertEquals(message, expected, type[part - 1]);
    }
    
    @Test
    public void testQuestion1_Part3_correctType() 
    {
        int part = 3; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong type.";
        String expected = "String";
        
        assertEquals(message, expected, type[part - 1]);
    }
    
    @Test
    public void testQuestion1_Part4_correctType() 
    {
        int part = 4; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong type.";
        String expected = "char";
        
        assert type[part -1].equals(expected) || type[part - 1].equals("Character");

    }
    
    @Test
    public void testQuestion1_Part5_correctType() 
    {
        int part = 5; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong type.";
        String expected = "Person";
        
        assertEquals(message, expected, type[part - 1]);
    }
    
    @Test
    public void testQuestion1_Part6_correctType() 
    {
        int part = 6; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong type.";
        String expected = "Boolean";
        
        assertEquals(message, expected, type[part - 1]);
    }
    
    @Test
    public void testQuestion1_Part7_correctType() 
    {
        int part = 7; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong type.";
        String expected = "int";
        
        assertEquals(message, expected, type[part - 1]);
    }
    
    @Test
    public void testQuestion1_Part1_correctDimensions() 
    {
        int part = 1; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong number of dimensions.";
        int expected = 2;
        
        assertEquals(message, expected, dimensions[part - 1]);
    }
    
    @Test
    public void testQuestion1_Part2_correctDimensions() 
    {
        int part = 2; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong number of dimensions.";
        int expected = 2;
        
        assertEquals(message, expected, dimensions[part - 1]);
    }
    
    @Test
    public void testQuestion1_Part3_correctDimensions() 
    {
        int part = 3; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong number of dimensions.";
        int expected = 3;
        
        assertEquals(message, expected, dimensions[part - 1]);
    }
    
    @Test
    public void testQuestion1_Part4_correctDimensions() 
    {
        int part = 4; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong number of dimensions.";
        int expected = 2;
        
        assertEquals(message, expected, dimensions[part - 1]);
    }
    
    @Test
    public void testQuestion1_Part5_correctDimensions() 
    {
        int part = 5; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong number of dimensions.";
        int expected = 3;
        
        assertEquals(message, expected, dimensions[part - 1]);
    }
    
    @Test
    public void testQuestion1_Part6_correctDimensions() 
    {
        int part = 6; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong number of dimensions.";
        int expected = 2;
        
        assertEquals(message, expected, dimensions[part - 1]);
    }
    
    @Test
    public void testQuestion1_Part7_correctDimensions() 
    {
        int part = 7; 
        areInstanceVariables();
       
        if(names.length < part)
        {
            fail("Part " + part + " has not been completed.");
        }
        
        String message = "This test fails if Part " + part + " has the wrong number of dimensions.";
        int expected = 9;
        
        assertEquals(message, expected, dimensions[part - 1]);
    }

    @Test
    public void testQuestion1_AreInstanceVariables()
    {
        String message = "This test fails if Parts 1 - 7 are not instance variables.";
        assertEquals(message, names.length, 7);
    }
}
