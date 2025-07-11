package Questions;


import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Scanner;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class Question4Test 
{
    static Field[] variableList;
    static String[] variableTypes;
    static String[] variableValues;
    static String[] variableNames; 
    
    static HashMap<String, String> variableTypeMap = new HashMap<>();
    static HashMap<String, String> variableValueMap = new HashMap<>();
    
    @BeforeClass
    public static void setUpClass() throws Exception
    {
        Question4 testObject = new Question4();
        
        variableList = Question4.class.getDeclaredFields(); 
        variableTypes = new String[variableList.length];
        variableNames = new String[variableList.length];
        variableValues = new String[variableList.length]; 
        
        int i = 0; 
        for(Field f : variableList)
        {
            f.setAccessible(true);
            variableTypes[i] = f.getType().getCanonicalName().substring(f.getType().getCanonicalName().lastIndexOf(".") + 1);
            variableNames[i] = f.getName(); 
            variableValues[i] = f.get(testObject).toString(); 
            
            variableValueMap.put(variableNames[i], variableValues[i]);
            variableTypeMap.put(variableNames[i], variableTypes[i]);
            
            i++; 
        }
        
        displayOutput();
    }
    
    public static void displayOutput()
    {
        System.out.println("The following variables were found:");
        for(int i = 0; i < variableList.length; i++)
        {
            if (!variableTypes[i].equals("String"))
            {
                continue; 
            }
            
            System.out.println(variableNames[i] + ": " + variableValues[i]);
        }
    }
    
    public static boolean correctNumberOfVariables()
    {
        return variableList.length == 9; 
    }
    
    public static void hasVariable(String name)
    {
        if(!variableValueMap.containsKey(name))
        {
            fail("Could not find a variable with the identifier \""+ name + "\" which is required for this test."); 
        }
    }
    
    public static void hasType(String name, String expected)
    {
        hasVariable(name);
        assertEquals("The variable \"" + name + "\n has an unexpected type.", expected, variableTypeMap.get(name));
    }
    
    public static void hasValue(String name, String expected, int part)
    {
        hasVariable(name);
        assertEquals("The variable or constant for part " + part + " has an incorrect value.", expected, variableValueMap.get(name));
    }
    
    public static void hardCodeCheck(String checkFor, int part)
    {
        try
        {
            Scanner file = new Scanner(new File("src/Questions/Question4.java"));
            
            boolean flag = false; 
            
            while(file.hasNext())
            {
                String line = file.nextLine(); 
                if(line.contains(checkFor))
                {
                    flag = true;
                    break;
                }
            }
            
            if(flag)
            {
                fail("It appears as though you have hard-coded part " + part + ". You will need to use string concatenation.");
            }
        }
        catch(Exception e)
        {
            fail("Something has gone horribly wrong: " + e.getMessage());
        }
    }
    

    @Test
    public void Question4_Part1_CorrectValue() 
    {
        String expected = "The value of variable \"a\" when using the prefix increment operator is 11";
        String checkFor = "The value of variable \\\"a\\\" when using the prefix increment operator is 11";
        
        if(correctNumberOfVariables())
        {
            assertEquals(expected, variableValues[4]);
        }
        else
        {
            hasValue("message1", expected, 1);
        }
        
        hardCodeCheck(checkFor, 1);
    }
    
    @Test
    public void Question4_Part2_CorrectValue() 
    {
        String expected = "The value of variable \"b\" when using the postfix increment operator is 15";
        String checkFor = "The value of variable \\\"b\\\" when using the postfix increment operator is 15";
        if(correctNumberOfVariables())
        {
            assertEquals(expected, variableValues[5]);
        }
        else
        {
            hasValue("message2", expected, 2);
        }
        
        hardCodeCheck(checkFor, 2);
    }
    
    @Test
    public void Question4_Part3_CorrectValue() 
    {
        String expected = "The value of variable \"c\" when using the prefix decrement operator is 19";
        String checkFor = "The value of variable \\\"c\\\" when using the prefix decrement operator is 19";
        
        if(correctNumberOfVariables())
        {
            assertEquals(expected, variableValues[6]);
        }
        else
        {
            hasValue("message3", expected, 3);
        }
        
        hardCodeCheck(checkFor, 3);
    }
    
    @Test
    public void Question4_Part4_CorrectValue() 
    {
        String expected = "The value of variable \"d\" when using the postfix decrement operator is 25";
        String checkFor = "The value of variable \\\"d\\\" when using the postfix decrement operator is 25";
        
        if(correctNumberOfVariables())
        {
            assertEquals(expected, variableValues[7]);
        }
        else
        {
            hasValue("message4", expected, 4);
        }
        
        hardCodeCheck(checkFor, 4);
    }
    
    @Test
    public void Question4_Part5_CorrectValue() 
    {
        String expected = "The final values of the variables are:\n" +
                          "a: 11\n" +
                          "b: 16\n" +
                          "c: 19\n" +
                          "d: 24";
        
        if(correctNumberOfVariables())
        {
            assertEquals(expected, variableValues[8]);
        }
        else
        {
            hasValue("message5", expected, 5);
        }
        
        hardCodeCheck("a: 11", 5);
        hardCodeCheck("b: 16", 5);
        hardCodeCheck("c: 19", 5);
        hardCodeCheck("d: 24", 5);
    }
    
    
    
}
