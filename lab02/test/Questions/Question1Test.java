/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import ProvidedClasses.Person;
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
    
    private static final String QUESTION = "Question1";
    
    private static Field[] fields;
    private static String[] fieldNames;
    private static String[] fieldTypes;
    private static Object[] fieldValues; 
    
    private static HashMap<String, String> fieldTypeMap = new HashMap<>(); 
    private static HashMap<String, Object> fieldValueMap = new HashMap<>();
    

    
    @BeforeClass
    public static void setUpClass() throws Exception
    {
        Question1 testObject = new Question1(); 
        
        fields = Question1.class.getDeclaredFields();
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
    
    private void hasVariable(String name, int number, int part)
    {
        if(fieldNames.length > number)
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
    
    private String getConstructorUsed(String name, int number, int part)
    {
        hasType(name, "Person", number, part);
        
        Person p = (Person) fieldValueMap.get(name);
        
        String pName = p.getName();
        int pAge = p.getAge();
        
        if(pAge == -41)
        {
            return "Person()";
        }
        else if(pAge == -1)
        {
            return "Person(String name)";
        }
        else if(pName.equals(""))
        {
            return "Person(int age)";
        }
        else
        {
            return "Person(String name, int age)";
        }
        
    }
    
    @Test
    public void Question1_Part1_CorrectConstructorUsed() 
    {
        String actual = getConstructorUsed("defaultPerson", 0, 1);
        String expected = "Person()";
        
        assertEquals("Improper constructor used.", expected, actual);
    }
    
    @Test
    public void Question1_Part2_CorrectConstructorUsed() 
    {
        String actual = getConstructorUsed("namedPerson", 1, 2);
        String expected = "Person(String name)";
        
        assertEquals("Improper constructor used.", expected, actual);
    }
    
    @Test
    public void Question1_Part3_CorrectConstructorUsed() 
    {
        String actual = getConstructorUsed("agedPerson", 2, 3);
        String expected = "Person(int age)";
        
        assertEquals("Improper constructor used.", expected, actual);
    }
    
    @Test
    public void Question1_Part4_CorrectConstructorUsed() 
    {
        String actual = getConstructorUsed("fullyCustom", 3, 4);
        String expected = "Person(String name, int age)";
        
        assertEquals("Improper constructor used.", expected, actual);
    }
    
}
