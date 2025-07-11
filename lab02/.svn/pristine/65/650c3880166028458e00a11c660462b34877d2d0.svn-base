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
public class Question3Test {
    
    private static final String QUESTION = "Question3";
    private static final int    EXPECTED_NUMBER_OF_FIELDS = 7; 
    
    private static Field[] fields;
    private static String[] fieldNames;
    private static String[] fieldTypes;
    private static Object[] fieldValues; 
    
    private static HashMap<String, String> fieldTypeMap = new HashMap<>(); 
    private static HashMap<String, Object> fieldValueMap = new HashMap<>();
    

    
    @BeforeClass
    public static void setUpClass() throws Exception
    {
        Question3 testObject = new Question3(); 
        
        fields = Question3.class.getDeclaredFields();
        fieldNames = new String[fields.length];
        fieldTypes = new String[fields.length];
        fieldValues = new Object[fields.length];
        
        int i = 0; 
        for(Field f : fields)
        {
            f.setAccessible(true);
            
            fieldNames[i] = f.getName();
            fieldTypes[i] = f.getType().getCanonicalName().substring(f.getType().getCanonicalName().lastIndexOf(".") + 1);
            fieldValues[i] = f.get(testObject);
            
            fieldTypeMap.put(fieldNames[i], fieldTypes[i]);
            fieldValueMap.put(fieldNames[i], fieldValues[i]);
            
            i++; 
        }
        outputVariables();
    }
    
    public static void outputVariables()
    {
        System.out.println(QUESTION + " values:");
        for(int i = 0; i < fieldNames.length; i++)
        {
            System.out.println(fieldNames[i] + ": " + fieldValues[i]);
        }
    }
    
    public static void hardCodeCheck(String checkFor, int part) {
        try {
            boolean flag;
            try (Scanner file = new Scanner(new File("src/Questions/Question3.java"))) {
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
                fail("It appears as though you have hard-coded part " + part + ". You will need to call the appropriate String class method.");
            }
        }
        catch(Exception e)
        {
            fail("Something has gone horribly wrong: " + e.getMessage());
        }
    }
    
    
    private void hasVariable(String name, int number, int part)
    {
        if(fieldNames.length == EXPECTED_NUMBER_OF_FIELDS)
        {
            if(!fieldNames[number].equals(name))
            {
                assertEquals("Missing or unexpected variable identifier for part " + part + ".", name, fieldNames[number]);
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
    
    private void hasValue(String name, Object value, int number, int part)
    {
        hasVariable(name, number, part);
        assertEquals("Unexpected value for the variable for part " + part + ".", value, fieldValueMap.get(name));
    }
    
    
    @Test
    public void testQuestion3_movieName_IsCorrect()
    {
        String expectedValue = "It's a Mad, Mad, Mad, Mad World";
        hasType("movieName", "String", 0, 1);
        hasValue("movieName", expectedValue, 0, 1);
    }
    
    @Test
    public void testQuestion3_upperCase_IsCorrect()
    {
        String expectedValue = "IT'S A MAD, MAD, MAD, MAD WORLD";
        hasType("upperCase", "String", 1, 2);
        hasValue("upperCase", expectedValue, 1, 2);
        hardCodeCheck("upperCase=\"IT'SAMAD,MAD,MAD,MADWORLD\"", 2);
    }
    
    @Test
    public void testQuestion3_lowerCase_IsCorrect()
    {
        String expectedValue = "it's a mad, mad, mad, mad world";
        hasType("lowerCase", "String", 2, 3);
        hasValue("lowerCase", expectedValue, 2, 3);
        hardCodeCheck("lowerCase=\"it'samad,mad,mad,madworld\"", 3);
    }
    
    @Test
    public void testQuestion3_noCommas_IsCorrect()
    {
        String expectedValue = "It's a Mad Mad Mad Mad World";
        hasType("noCommas", "String", 3, 4);
        hasValue("noCommas", expectedValue, 3, 4);
        hardCodeCheck("noCommas=\"It'saMadMadMadMadWorld\"", 4);
    }
   
    @Test
    public void testQuestion3_firstCharacter_IsCorrect()
    {
        char expectedValue = 'I';
        hasType("firstCharacter", "char", 4, 5);
        hasValue("firstCharacter", expectedValue, 4, 5);
        hardCodeCheck("firstCharacter='I'", 5);
    }
    
    @Test
    public void testQuestion3_lengthOfString_IsCorrect()
    {
        int expectedValue = 31;
        hasType("lengthOfString", "int", 5, 6);
        hasValue("lengthOfString", expectedValue, 5, 6);
        hardCodeCheck("lengthOfString=31", 6);
    }
    
    @Test
    public void testQuestion3_indexOfFirstLowerCaseA_IsCorrect()
    {
        int expectedValue = 5;
        hasType("indexOfFirstLowerCaseA", "int", 6, 7);
        hasValue("indexOfFirstLowerCaseA", expectedValue, 6, 7);
        hardCodeCheck("indexOfFirstLowerCaseA=5", 7);
    }  
    
    @Test
    public void testQuestion3_indexOfLastLowerCaseA_IsCorrect()
    {
        int expectedValue = 23;
        hasType("indexOfLastLowerCaseA", "int", 7, 8);
        hasValue("indexOfLastLowerCaseA", expectedValue, 7, 8);
        hardCodeCheck("indexOfLastLowerCaseA=23", 8);
    }
    
    @Test
    public void testQuestion3_substring_IsCorrect()
    {
        String expectedValue = "Mad";
        hasType("substring", "String", 8, 9);
        hasValue("substring", expectedValue, 8, 9);
        hardCodeCheck("substring=\"Mad\"", 9);
    }
    
    @Test
    public void testQuestion3_containsWordMad_IsCorrect()
    {
        boolean expecedValue = true; 
        hasType("containsWordMad", "boolean", 9, 10);
        hasValue("containsWordMad", expecedValue, 9, 10);
        hardCodeCheck("containsWordMad=true", 10);
    }
    
    @Test
    public void testQuestion3_endsWith_world_IsCorrect()
    {
        boolean expectedValue = false;
        hasType("endsWith_world", "boolean", 10, 11);
        hasValue("endsWith_world", expectedValue, 10, 11);
        hardCodeCheck("endsWith_world=false", 11);
    }
    
}
