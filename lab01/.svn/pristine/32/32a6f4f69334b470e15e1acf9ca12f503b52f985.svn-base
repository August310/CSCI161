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
 * @author araderma, oborcher
 */
public class Question3Test 
{
    static Field[] variableList;
    static String[] variableTypes;
    static String[] variableValues;
    static String[] variableNames; 
    
    static HashMap<String, String> variableValueMap; 
    static HashMap<String, String> variableTypeMap; 
    
    @BeforeClass
    public static void setUpClass() throws Exception
    {
        Question3 testObject = new Question3();
        
        variableList = Question3.class.getDeclaredFields(); 
        variableTypes = new String[variableList.length];
        variableNames = new String[variableList.length];
        variableValues = new String[variableList.length]; 
        
        variableValueMap = new HashMap(); 
        variableTypeMap = new HashMap(); 
        
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
            System.out.printf("%-16s%s%n", variableNames[i] + ":", variableValues[i]);            
            //System.out.println(variableNames[i] + ":\t" + variableValues[i]);
        }
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
    
    public static void isHardCoded(String stringToCheckFor, String fileToCheck, String errorMessage) {
        try
        {
            boolean flag;
            try (Scanner file = new Scanner(new File(fileToCheck))) {
                flag = true;
                while(file.hasNext())
                {
                    String line = file.nextLine();
                    line = line.replaceAll("\\s", "");
                    if(line.contains(stringToCheckFor))
                    {
                        flag = false;
                        break;
                    }
                }
            }
            
            if(flag)
            {
                fail(errorMessage);
            }
        }
        catch(Exception e)
        {
            fail("Something has gone horribly wrong: " + e.getMessage());
        }
    }
    

    @Test
    public void Question3_Part1_Correct() 
    {
        hasType("sentence1", "String"); 
    }
    
    @Test
    public void Question3_Part2_Correct() 
    {
        hasType("sentence2", "String");
    }
    
    @Test
    public void Question3_Part3_Correct() 
    {
        hasType("points", "int");
    }
    
    @Test
    public void Question3_Part4_Correct()
    {
        hasType("sentence1", "String");
        hasType("sentence2", "String");
        hasType("noSpace", "String");
        
        String expected = variableValueMap.get("sentence1").concat(variableValueMap.get("sentence2")); 
        
        assertEquals("The variable noSpaces does not have the correct value", expected, variableValueMap.get("noSpace")); 
    }
    
    @Test
    public void Question3_Part4_IsNotHardCoded()
    {
        hasType("sentence1", "String");
        hasType("sentence2", "String");
        hasType("noSpace", "String");
        
        isHardCoded("sentence1+sentence2", "src/Questions/Question3.java", 
                "It appears as though you have hard-coded part 4. Concatenate "
                        + "sentence1 and sentence2 without a space to finish part 4.");
    }

    
    @Test
    public void Question3_Part5_Correct()
    {
        hasType("sentence1", "String");
        hasType("sentence2", "String");
        hasType("withSpace", "String");
        
        String expected = variableValueMap.get("sentence1").concat(" ").concat(variableValueMap.get("sentence2")); 
        
        assertEquals("The variable withSpace does not have the correct value", expected, variableValueMap.get("withSpace")); 
    }
    
    @Test
    public void Question3_Part5_IsNotHardCoded()
    {
        hasType("sentence1", "String");
        hasType("sentence2", "String");
        hasType("withSpace", "String");
        
        isHardCoded("sentence1+\"\"+sentence2", "src/Questions/Question3.java", 
                "It appears as though you have hard-coded part 5. Concatenate "
                        + "sentence1 and sentence2 with a space to finish part 5.");
    }

    
    @Test
    public void Question3_Part6_Correct()
    {
        hasType("message1", "String");
        hasType("points", "int");
        
        String expected = "I hope I score at least ".concat(variableValueMap.get("points")).concat(" points on this assignment.");
        
        assertEquals("The variable message1 does not have the correct value", expected, variableValueMap.get("message1"));
    }
    
    @Test
    public void Question3_Part6_IsNotHardCoded()
    {
        hasType("message1", "String");
        hasType("points", "int");
        
        isHardCoded("+points+", "src/Questions/Question3.java", 
                "It appears as though you have hard-coded part 6. Use concatenation "
                        + "to finish part 6.");
    }
    
    
    @Test
    public void Question3_Part7_Correct()
    {
        hasType("message2", "String");
        hasType("firstName", "String");
        hasType("lastName", "String");
        hasType("numberOfFilms", "int");
        
        StringBuilder message = new StringBuilder(); 
        
        message.append(variableValueMap.get("firstName"));
        message.append(" ");
        message.append(variableValueMap.get("lastName"));
        message.append(" was an actor who starred in ");
        message.append(variableValueMap.get("numberOfFilms"));
        message.append(" movies.");
        
        String expected = message.toString();
        
        assertEquals("The variable message2 does not have the correct value", expected, variableValueMap.get("message2"));
                
    }
    
    @Test
    public void Question3_Part7_firstName_IsNotHardCoded()
    {
        hasType("message2", "String");
        hasType("firstName", "String");
        
        isHardCoded("firstName+", "src/Questions/Question3.java", 
                "It appears as though you have hard-coded the first name in part 7."
                        + " Use concatenation to finish part 7.");
    }
    
    @Test
    public void Question3_Part7_lastName_IsNotHardCoded()
    {
        hasType("message2", "String");
        hasType("lastName", "String");
        
        isHardCoded("+lastName+", "src/Questions/Question3.java", 
                "It appears as though you have hard-coded the last name in part 7."
                        + " Use concatenation to finish part 7.");
    }
    
    @Test
    public void Question3_Part7_numberOfFilms_IsNotHardCoded()
    {
        hasType("message2", "String");
        hasType("numberOfFilms", "int");
        
        isHardCoded("+numberOfFilms+", "src/Questions/Question3.java", 
                "It appears as though you have hard-coded the number of films in part 7."
                        + " Use concatenation to finish part 7.");
    }

    
    
}
