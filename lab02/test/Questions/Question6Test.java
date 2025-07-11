package Questions;

import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author araderma
 */
public class Question6Test {
    private static final String QUESTION = "Question6";

    private static final int    EXPECTED_NUMBER_OF_FIELDS = 7; 
     
    
    static Field[] variableList;
    static String[] variableTypes;
    static String[] variableIdentifiers;
    static Object[] variableValues; 
    
    private static HashMap<String, String> fieldTypeMap = new HashMap<>(); 
    private static HashMap<String, Object> fieldValueMap = new HashMap<>();
    
    
    @BeforeClass
    public static void setUpClass() throws Exception
    {        
        Question6 testObject = new Question6(); 
        
        variableList = Question6.class.getDeclaredFields(); 
        variableTypes = new String[variableList.length];
        variableIdentifiers = new String[variableList.length]; 
        variableValues = new Object[variableList.length];
        
        int i = 0; 
        for(Field f : variableList)
        {
            f.setAccessible(true);
            variableTypes[i] = f.getType().getCanonicalName().substring(f.getType().getCanonicalName().lastIndexOf(".") + 1);
            variableIdentifiers[i] = f.getName();  
            variableValues[i] = f.get(testObject); 
            
            fieldTypeMap.put(variableIdentifiers[i], variableTypes[i]);
            fieldValueMap.put(variableIdentifiers[i], variableValues[i]);
            
            i++; 
        }
        
        outputVariables();
    }

    public static void outputVariables()
    {
        System.out.println(QUESTION + " values:");
        for(int i = 0; i < variableIdentifiers.length; i++)
        {
            System.out.println(variableIdentifiers[i] + ": " + variableValues[i]);
        }
    }
    
    public static void hardCodeCheck(String checkFor, int part) {
        try {
            boolean flag;
            try (Scanner file = new Scanner(new File("src/Questions/Question6.java"))) {
                flag = false;
                while (file.hasNext()) {
                    String line = file.nextLine();
                    line = line.replaceAll("\\s", "");
                    line = line.replaceAll("\\(", "");
                    line = line.replaceAll("\\)", "");

                    if(line.contains(checkFor))
                    {
                        flag = true;
                        break;
                    }
                }
            }
            
            if(flag)
            {
                fail("It appears as though you have hard-coded part " + part + ". You will need to use the appropriate Random method.");
            }
        }
        catch(Exception e)
        {
            fail("Something has gone horribly wrong: " + e.getMessage());
        }
    }

    
    private void hasVariable(String name, int number, int part)
    {
        if(variableIdentifiers.length == EXPECTED_NUMBER_OF_FIELDS)
        {
            if(!variableIdentifiers[number].equals(name))
            {
                assertEquals("Missing or unexpected variable identifier for part " + part + ".", name, variableIdentifiers[number]);
            }
            else
            {
                if(!fieldValueMap.containsKey(name))
                {
                    fail("Could not find a variable with the identifier " + name + " which is required for part " + part);
                }
            }  
        }
        else
        {
            if(!fieldValueMap.containsKey(name))
            {
                fail("Could not find a variable with the identifier " + name + " which is required for part " + part);
            }
        }
        
    }
    
    private void hasType(String name, String type, int number, int part)
    {
        hasVariable(name, number, part);
        assertEquals("Unexpected data type for the variable for part " + part + ".", type, fieldTypeMap.get(name));
    }

    @Test
    public void testQuestion6_Part1_CorrectType()
    {
        assertEquals("Unexpected data type for the variable for part 1.", "Random", variableTypes[0]);
    }
    
    @Test
    public void testQuestion6_Part2_CorrectType()
    {
        assertEquals("Unexpected data type for the variable for part 2.", "Random", variableTypes[1]);
    }
 
    @Test
    public void testQuestion6_Part3_GeneratesCorrectRange() throws Exception
    {
        hasType("num1", "int", 2, 3);
        Question6 test = new Question6();
        
        Field[] fieldSet = Question6.class.getDeclaredFields();
        int lowest; 
        int highest; 
        
        for(Field f :fieldSet)
        {
            f.setAccessible(true);
        }
        
        Field result = fieldSet[2]; 
        
        lowest = (int)result.get(test); 
        highest = (int)result.get(test); 
        
        for(int i = 0; i < 20000; i++)
        {
            test = new Question6();
            
            int value = (int)result.get(test); 
            
            if(value < lowest)
            {
                lowest = value; 
            }
            if(value > highest)
            {
                highest = value; 
            }
        }
        
        String range = lowest + " -- " + highest;
        
        String message = "This test fails if the range of numbers generated is incorrect."; 
        
        assertEquals(message, "0 -- 20", range);
    }
        
    @Test
    public void testQuestion6_Part4_GeneratesCorrectRange() throws Exception
    {
        hasType("num2", "int", 3, 4);
        Question6 test = new Question6();
        
        Field[] fieldSet = Question6.class.getDeclaredFields();
        int lowest; 
        int highest; 
        
        for(Field f :fieldSet)
        {
            f.setAccessible(true);
        }
        
        Field result = fieldSet[3]; 
        
        lowest = (int)result.get(test); 
        highest = (int)result.get(test); 
        
        for(int i = 0; i < 10000; i++)
        {
            test = new Question6();
            
            int value = (int)result.get(test); 
            
            if(value < lowest)
            {
                lowest = value; 
            }
            if(value > highest)
            {
                highest = value; 
            }
        }
        
        String range = lowest + " -- " + highest;
        
        String message = "This test fails if the range of numbers generated is incorrect."; 
        
        assertEquals(message, "17 -- 33", range);
    }
        
    @Test
    public void testQuestion6_Part5_GeneratesCorrectRange() throws Exception
    {
        hasType("num3", "int", 4, 5);
        Question6 test = new Question6();
        
        Field[] fieldSet = Question6.class.getDeclaredFields();
        int lowest; 
        int highest; 
        
        for(Field f :fieldSet)
        {
            f.setAccessible(true);
        }
        
        Field result = fieldSet[4]; 
        
        lowest = (int)result.get(test); 
        highest = (int)result.get(test); 
        
        for(int i = 0; i < 10000; i++)
        {
            test = new Question6();
            
            int value = (int)result.get(test); 
            
            if(value < lowest)
            {
                lowest = value; 
            }
            if(value > highest)
            {
                highest = value; 
            }
        }
        
        String range = lowest + " -- " + highest;
        
        String message = "This test fails if the range of numbers generated is incorrect."; 
        
        assertEquals(message, "-15 -- 15", range);
    }
    
    @Test
    public void testQuestion6_Part6_IsCorrect()
    {
        hasType("num4", "int", 5, 6);
        String message = "This test fails if num4 has an incorrect value."; 
        assertEquals(message, 97, (int)variableValues[5]);
        hardCodeCheck("num4=97", 6);
    }
        
    @Test
    public void testQuestion6_Part7_IsCorrect()
    {
        hasType("num5", "int", 6, 7);
        String message = "This test fails if num5 has an incorrect value."; 
        assertEquals(message, 64589, (int)variableValues[6]);
        hardCodeCheck("num5=64589", 7);
    }
    
}
