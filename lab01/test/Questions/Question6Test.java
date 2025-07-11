package Questions;

import java.lang.reflect.Field;
import java.util.HashMap;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class Question6Test {
    
    static Field[] variableList;
    static String[] variableTypes;
    static String[] variableIdentifiers;
    static int[] variableModifiers; 
    static Object[] variableValues; 
    
    static HashMap<String, String> variableTypeMap = new HashMap();
    static HashMap<String, String> variableValueMap = new HashMap();
    
    @BeforeClass
    public static void setUpClass() throws Exception
    {
        variableList = Question6.class.getDeclaredFields(); 
        variableTypes = new String[variableList.length];
        variableIdentifiers = new String[variableList.length]; 
        variableModifiers = new int[variableList.length];
        variableValues = new Object[variableList.length];
        
        try 
        {
            
            Question6 testObject = new Question6(); 

            int i = 0; 
            for(Field f : variableList)
            {
                f.setAccessible(true);
                variableTypes[i] = f.getType().getCanonicalName().substring(f.getType().getCanonicalName().lastIndexOf(".") + 1);
                variableIdentifiers[i] = f.getName(); 
                variableModifiers[i] = f.getModifiers();
                variableValues[i] = f.get(testObject); 
                
                variableTypeMap.put(variableIdentifiers[i], variableTypes[i]);
                variableValueMap.put(variableIdentifiers[i], variableValues[i].toString());
                
                i++; 
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        displayOutput();
    }
    
    public static void displayOutput()
    {
        System.out.println("The following variables were declared and initialized:");
        
        for(int i = 3; i < variableList.length; i++)
        {
            System.out.println(variableIdentifiers[i] + ": " + variableValues[i].toString());
        }
        
        try 
        {
            Question6 testObject = new Question6();
            testObject.resultOfIntegerDivisionByZero();
        } 
        catch (Exception e) 
        {
            System.out.println("result5: " + e.toString());
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

    @Test
    public void Question6_Part1_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 1) is incorrect", "double", variableTypes[3]);
        }
        else
        {
            hasType("result1", "double");
        }
    }
    
    @Test
    public void Question6_Part1_CorrectValue() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the value for the variable declared for part 1) is incorrect", Double.POSITIVE_INFINITY, (double)variableValues[3], 0.0);
        }
        else
        {
            hasVariable("result1");
            assertEquals("This test fails if the value for the variable declared for part 1) is incorrect", Double.POSITIVE_INFINITY, Double.parseDouble(variableValueMap.get("result1")), 0.0);
        }
    }
    
    @Test
    public void Question6_Part2_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 2) is incorrect", "double", variableTypes[4]);
        }
        else
        {
            hasType("result2", "double");
        }
    }
    
    @Test
    public void Question6_Part2_CorrectValue() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the value for the variable declared for part 2) is incorrect", Double.NaN, (double)variableValues[4], 0.0);
        }
        else
        {
            hasVariable("result2");
            assertEquals("This test fails if the value for the variable declared for part 2) is incorrect", Double.NaN, Double.parseDouble(variableValueMap.get("result2")), 0.0);
        }
    }
    
    @Test
    public void Question6_Part3_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 3) is incorrect", "int", variableTypes[5]);
        }
        else
        {
            hasType("result3", "int");
        }
    }
    
    @Test
    public void Question6_Part3_CorrectValue() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the value for the variable declared for part 3) is incorrect", Integer.MAX_VALUE, (int)variableValues[5]);
        }
        else
        {
            hasType("result3", "int");
            hasVariable("result1");
            assertEquals("This test fails if the value for the variable declared for part 3) is incorrect", Integer.MAX_VALUE, Integer.parseInt(variableValueMap.get("result3")));  
        }
    }
    
    @Test
    public void Question6_Part4_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable declared for part 4) is incorrect", "int", variableTypes[6]);
        }
        else
        {
            hasType("result4", "int");
        }
    }
    
    @Test
    public void Question6_Part4_CorrectValue() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the value for the variable declared for part 4) is incorrect", 0, (int)variableValues[6]);
        }
        else
        {
            hasType("result4", "int");
            hasVariable("result2");
            assertEquals("This test fails if the value for the variable declared for part 4) is incorrect", 0, Integer.parseInt(variableValueMap.get("result4")));            
        }
    }
    
    @Test
    public void Question6_Part5_CorrectValue()
    {
        String actual = "No exception was generated.";
        
        try 
        {
            Question6 testObject = new Question6();
            
            testObject.resultOfIntegerDivisionByZero();
        }
        catch (ArithmeticException e)
        {
            actual = e.toString();
        }
        
        assertEquals("java.lang.ArithmeticException: / by zero", actual);
    }

}
