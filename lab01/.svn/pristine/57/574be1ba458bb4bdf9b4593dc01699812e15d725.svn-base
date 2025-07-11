package Questions;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Scanner;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class Question2Test {
    
    static Field[] variableList;
    static String[] variableTypes;
    static String[] variableIdentifiers;
    static int[] variableModifiers; 
    static Object[] variableValues; 
    
    static HashMap<String, String> variableTypeMap;
    static HashMap<String, String> variableValueMap;
    static HashMap<String, String> variableModifierMap; 
    
    @BeforeClass
    public static void setUpClass() throws Exception
    {
        Question2 testObject = new Question2(); 
        
        variableList = Question2.class.getDeclaredFields(); 
        variableTypes = new String[variableList.length];
        variableIdentifiers = new String[variableList.length]; 
        variableModifiers = new int[variableList.length];
        variableValues = new Object[variableList.length];
        
        variableTypeMap = new HashMap<>();
        variableValueMap = new HashMap<>();
        variableModifierMap = new HashMap<>();
        
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
            variableModifierMap.put(variableIdentifiers[i], getVariableOrConstant(variableModifiers[i]));
            
            i++; 
        }
        
        displayOutput();
    }
    
    public static void displayOutput()
    {
        System.out.println("The following variables and constants were declared:");
        
        for(int i = 0; i < variableList.length; i++)
        {
            System.out.println((i + 1) + ") A " + getVariableOrConstant(variableModifiers[i]) + " of type " + variableTypes[i] 
                    + " with the identifier \"" + variableIdentifiers[i] + "\" and the value " + variableValues[i].toString());
        }  
    }
    
    public static String getVariableOrConstant(int i)
    {
        if(Modifier.isFinal(i))
        {
            return "constant";
        }
        else
        {
            return "variable";
        }
    }
    
    public static String getOppositeModifier(String modifier)
    {
        return modifier.equals("variable") ? "constant" : "variable"; 
    }
    
    public static boolean correctNumberOfVariables()
    {
        return variableList.length == 5; 
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
    
    public static void hasModifier(String name, String expected, int part)
    {
        hasVariable(name);
        String opposite = getOppositeModifier(expected); 
        assertEquals("The " + variableModifierMap.get(name) + " declared in part " + part + " should be a " + opposite + " instead.", expected, variableModifierMap.get(name));
    }
    
    public static void hasValue(String name, String expected, int part)
    {
        hasVariable(name);
        assertEquals("The variable or constant for part " + part + " has an incorrect value.", expected, variableValueMap.get(name));
    }
   
    @Test
    public void Question2_Part1_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable/constant declared for part 1) is incorrect", "double", variableTypes[0]);
        }
        else
        {
            hasType("worldRecordForLongestToenails", "double");
        }
    }
    
    @Test
    public void Question2_Part1_CorrectIdentifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the identifier for the variable/constant declared for part 1) is incorrect", "worldRecordForLongestToenails", variableIdentifiers[0]);
        }
        else
        {
            hasVariable("worldRecordForLongestToenails");
        }
    }
    
    @Test
    public void Question2_Part1_CorrectModifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if variable was declared instead of a constant (or vice versa) for part 1)", "variable", getVariableOrConstant(variableModifiers[0]));
        }
        else
        {
            hasModifier("worldRecordForLongestToenails", "variable", 1);
        }
    }
    
    @Test
    public void Question2_Part1_CorrectValue() 
    {
        if(correctNumberOfVariables())
        {
            // Can have any value so automatically correct
        }
        else
        {
            // Any value is correct so long as it exists
            hasVariable("worldRecordForLongestToenails");
        }
    }
    
    @Test
    public void Question2_Part2_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {     
            assertEquals("This test fails if the data type for the variable/constant declared for part 2) is incorrect", "String", variableTypes[1]);
        }
        else
        {
            hasType("secretsOfTheUniverse", "String");
        }
    }
    
    @Test
    public void Question2_Part2_CorrectIdentifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the identifier for the variable/constant declared for part 2) is incorrect", "secretsOfTheUniverse", variableIdentifiers[1]);
        }
        else
        {
            hasVariable("secretsOfTheUniverse");
        }
    }
    
    @Test
    public void Question2_Part2_CorrectModifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if variable was declared instead of a constant (or vice versa) for part 2)", "variable", getVariableOrConstant(variableModifiers[1]));
        }
        else
        {
            hasModifier("secretsOfTheUniverse", "variable", 2);
        }
    }
    
    @Test
    public void Question2_Part2_CorrectValue() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if variable/constant has an incorrect value for part 2)", "It wouldn\'t be a \"secret\" if I told you.", variableValues[1].toString());
        }
        else
        {
            hasValue("secretsOfTheUniverse", "It wouldn\'t be a \"secret\" if I told you.", 2);
        }
    }
    
    @Test
    public void Question2_Part3_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable/constant declared for part 3) is incorrect", "double", variableTypes[2]);
        }
        else
        {
            hasType("AVOGADROS_NUMBER", "double");
        }
    }
    
    @Test
    public void Question2_Part3_CorrectIdentifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the identifier for the variable/constant declared for part 3) is incorrect", "AVOGADROS_NUMBER", variableIdentifiers[2]);
        }
        else
        {
            hasVariable("AVOGADROS_NUMBER");
        }
    }
    
    @Test
    public void Question2_Part3_CorrectModifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if variable was declared instead of a constant (or vice versa) for part 3)", "constant", getVariableOrConstant(variableModifiers[2]));
        }
        else
        {
            hasModifier("AVOGADROS_NUMBER", "constant", 3);
        }
    }
    
    @Test
    public void Question2_Part3_CorrectValue() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if variable/constant has an incorrect value for part 3)", 6.0221413E23, (double)variableValues[2], 0.0);
        }
        else
        {
            hasValue("AVOGADROS_NUMBER", "6.0221413E23", 3);
        }
    }
    
    @Test
    public void Question2_Part4_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable/constant declared for part 4) is incorrect", "boolean", variableTypes[3]);
        }
        else
        {
            hasType("havingFunYet", "boolean");
        }
    }
    
    @Test
    public void Question2_Part4_CorrectIdentifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the identifier for the variable/constant declared for part 4) is incorrect", "havingFunYet", variableIdentifiers[3]);
        }
        else
        {
            hasVariable("havingFunYet");
        }
    }
    
    @Test
    public void Question2_Part4_CorrectModifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if variable was declared instead of a constant (or vice versa) for part 4)", "variable", getVariableOrConstant(variableModifiers[3]));
        }
        else
        {
            hasModifier("havingFunYet", "variable", 4);
        }
    }
    
    @Test
    public void Question2_Part4_CorrectValue() 
    {
        if(!correctNumberOfVariables())
        {
            hasVariable("havingFunYet");
        }
        if (!(boolean)variableValues[3])
        {
            // Can be any value, but why wouldn't they be having fun? 
            System.err.println("\nWHAT DO YOU MEAN YOU'RE NOT HAVING FUN YET! (>_<)");
        }
    }
    
    @Test
    public void Question2_Part5_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variable/constant declared for part 5) is incorrect", "double", variableTypes[4]);
        }
        else
        {
            hasType("MAGIC_NUMBER", "double");
        }
    }
    
    @Test
    public void Question2_Part5_CorrectIdentifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the identifier for the variable/constant declared for part 5) is incorrect", "MAGIC_NUMBER", variableIdentifiers[4]);
        }
        else
        {
            hasVariable("MAGIC_NUMBER");
        }
    }
    
    @Test
    public void Question2_Part5_CorrectModifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if variable was declared instead of a constant (or vice versa) for part 5)", "constant", getVariableOrConstant(variableModifiers[4]));
        }
        else
        {
            hasModifier("MAGIC_NUMBER", "constant", 5);
        }
    }
    
    @Test
    public void Question2_Part5_CorrectValue() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if variable/constant has an incorrect value for part 5)", (double)variableValues[0], (double)variableValues[4], 0.0);
        }
        else
        {
            hasVariable("MAGIC_NUMBER");
            hasVariable("worldRecordForLongestToenails");
            hasValue("MAGIC_NUMBER", variableValueMap.get("worldRecordForLongestToenails"), 5);
        }
    }
    
    @Test
    public void Question2_Part5_IsNotHardCoded()
    {
        hasVariable("MAGIC_NUMBER");
        hasVariable("worldRecordForLongestToenails");
        try
        {
            Scanner file = new Scanner(new File("src/Questions/Question2.java"));
            
            boolean flag = true; 
            
            while(file.hasNext())
            {
                String line = file.nextLine();
                line = line.replaceAll("\\s", ""); 
                if(line.contains("MAGIC_NUMBER=worldRecordForLongestToenails"))
                {
                    flag = false;
                    break;
                }
            }
            
            if(flag)
            {
                fail("It appears as though you have hard-coded part5. You should assign the the variable from part 1 to the constant in part 5.");
            }
        }
        catch(Exception e)
        {
            fail("Something has gone horribly wrong: " + e.getMessage());
        }
    }
}
