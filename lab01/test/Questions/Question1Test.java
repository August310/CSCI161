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
public class Question1Test {
    
    static Field[] variableList;
    static String[] variableTypes;
    static String[] variableIdentifiers;
    
    static HashMap<String, String> variableTypeMap; 
    
    @BeforeClass
    public static void setUpClass() 
    {        
        variableList = Question1.class.getDeclaredFields(); 
        variableTypes = new String[variableList.length];
        variableIdentifiers = new String[variableList.length]; 
        
        variableTypeMap = new HashMap();
        
        int i = 0; 
        for(Field f : variableList)
        {
            f.setAccessible(true);
            variableTypes[i] = f.getType().getCanonicalName().substring(f.getType().getCanonicalName().lastIndexOf(".") + 1);
            variableIdentifiers[i] = f.getName(); 
            variableTypeMap.put(variableIdentifiers[i], variableTypes[i]);
            i++; 
        }
    }
    
    public static void hasVariable(String name)
    {
        if(!variableTypeMap.containsKey(name))
        {
            fail("Could not find a variable with the identifier \""+ name + "\" which is required for this test."); 
        }
    }
    
    public static void hasType(String name, String expected)
    {
        hasVariable(name);
        assertEquals("The variable \"" + name + "\n has an unexpected type.", expected, variableTypeMap.get(name));
    }
    
    public static boolean correctNumberOfVariables()
    {
        return variableList.length == 5; 
    }
    

    @Test
    public void Question1_Part1_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variabled declared for part 1) is incorrect", "int", variableTypes[0]);
        }
        else
        {
            hasVariable("sizeOfComicBookCollection");
            assertEquals("This test fails if the data type for the variabled declared for part 1) is incorrect", "int", variableTypeMap.get("sizeOfComicBookCollection"));
        }
    }
    
    @Test
    public void Question1_Part1_CorrectIdentifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the identifer for the variabled declared for part 1) is incorrect", "sizeOfComicBookCollection", variableIdentifiers[0]);
        }
        else
        {
            hasVariable("sizeOfComicBookCollection");
        }
    }
    
    @Test
    public void Question1_Part2_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variabled declared for part 2) is incorrect", "String", variableTypes[1]);
        }
        else
        {
            hasVariable("mostPopularMovieStar");
            assertEquals("This test fails if the data type for the variabled declared for part 2) is incorrect", "String", variableTypeMap.get("mostPopularMovieStar"));
        }
    }
    
    @Test
    public void Question1_Part2_CorrectIdentifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the identifer for the variabled declared for part 2) is incorrect", "mostPopularMovieStar", variableIdentifiers[1]);
        }
        else
        {
            hasVariable("mostPopularMovieStar");
        }
    }
    
    @Test
    public void Question1_Part3_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variabled declared for part 3) is incorrect", "double", variableTypes[2]);
        }
        else
        {
            hasVariable("usDollarBritishPoundConversionRate");
            assertEquals("This test fails if the data type for the variabled declared for part 3) is incorrect", "double", variableTypeMap.get("usDollarBritishPoundConversionRate"));
        } 
    }
    
    @Test
    public void Question1_Part3_CorrectIdentifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the identifer for the variabled declared for part 3) is incorrect", "usDollarBritishPoundConversionRate", variableIdentifiers[2]);
        }
        else
        {
            hasVariable("usDollarBritishPoundConversionRate");
        }
        
    }
    
    @Test
    public void Question1_Part4_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variabled declared for part 4) is incorrect", "short", variableTypes[3]);
        }
        else
        {
            hasVariable("shoppingDaysUntilHalloween");
            assertEquals("This test fails if the data type for the variabled declared for part 4) is incorrect", "short", variableTypeMap.get("shoppingDaysUntilHalloween"));
        } 
    }
    
    @Test
    public void Question1_Part4_CorrectIdentifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the identifer for the variabled declared for part 4) is incorrect", "shoppingDaysUntilHalloween", variableIdentifiers[3]);
        }
        else
        {
            hasVariable("shoppingDaysUntilHalloween");
        }  
    }
    
    @Test
    public void Question1_Part5_CorrectDataType() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the data type for the variabled declared for part 5) is incorrect", "long", variableTypes[4]);
        }
        else
        {
            hasVariable("starsInTheMilkyWay");
            assertEquals("This test fails if the data type for the variabled declared for part 5) is incorrect", "long", variableTypeMap.get("starsInTheMilkyWay"));
        } 
    }
    
    @Test
    public void Question1_Part5_CorrectIdentifier() 
    {
        if(correctNumberOfVariables())
        {
            assertEquals("This test fails if the identifer for the variabled declared for part 5) is incorrect", "starsInTheMilkyWay", variableIdentifiers[4]);
        }
        else
        {
            hasVariable("starsInTheMilkyWay");
        }
    }
    
}
