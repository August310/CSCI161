package Questions;

import java.awt.Color;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class ParrotTest {
    

    static Field[]          fields;
    static Method[]         methods;
    static Constructor[]    constructors;
    static ArrayList<Field> superFields; 
    
    @BeforeClass
    public static void setUpClass() 
    {
        fields          = Parrot.class.getDeclaredFields();
        methods         = Parrot.class.getDeclaredMethods();
        constructors    = Parrot.class.getDeclaredConstructors();
        superFields     = new ArrayList(); 
        
        superFields.addAll(Arrays.asList(Parrot.class.getSuperclass().getSuperclass().getDeclaredFields()));
        superFields.addAll(Arrays.asList(Parrot.class.getSuperclass().getDeclaredFields()));
        
        for(Field f : fields)
        {
            f.setAccessible(true);
        }
        
        for(Field f : superFields)
        {
            f.setAccessible(true);
        }
    }
 
    @Test
    public void testParrot_InstanceVariables_MeaningfulIdentifiers() 
    {
        assertEquals("There are more instance variables than expected", 1, fields.length);
        
        String name = fields[0].getName().toLowerCase(); 
        
        if(!(name.contains("word") || name.contains("known")))
        {
            fail("Instance variable for storing the list of words known by the Parrot does not have a meaningful identifier.");
        }
    }
    
    @Test
    public void testParrot_DefaultConstructor_WorksProperly() throws Exception
    {
        assertEquals("There are an inapprorpriate number of constructors.", 1, constructors.length);
        
        assertEquals("There are an inapprorpriate number of instance variables.", 1, fields.length);
        
        Parrot testParrot = new Parrot(); 
             
        
        Object fieldValue = fields[0].get(testParrot);
        
        if(!(fieldValue instanceof String[] || fieldValue instanceof ArrayList))
        {
            fail("Instance variable is of unrecognized type. Should be String[] or ArrayList<String>.");
        }
        
        if(fieldValue == null)
        {
            fail("Default constructor did not properly initialize the instance variable for the Parrot class.");
        }
        else
        {
            if(fieldValue instanceof String[])
            {
                String[] value = (String[])fieldValue; 
                
                String word = value[0]; 
                
                assertEquals("Unexpected value for word known by Parrot.", "Polly", word);
            }
            else if(fieldValue instanceof ArrayList)
            {
                ArrayList<String> value = (ArrayList<String>) fieldValue; 
                
                String word = value.get(0);
                
                assertEquals("Unexpected value for word known by Parrot.", "Polly", word);
            }
        }
        
        for (Field field : superFields)
        {
            field.setAccessible(true);
            
            if(field.getName().equals("name"))
            {
                fieldValue = field.get(testParrot);
                
                String value = (String)fieldValue; 
                
                assertEquals("Unexpected default value for Parrot name.", "Polly", value);
            }
            else if(field.getName().equals("yearOfBirth"))
            {
                fieldValue = field.get(testParrot);
                
                int value = (int)fieldValue; 
                
                assertEquals("Unexpected default value for Parrot name.", 2010, value);
            }
            else if(field.getName().toLowerCase().contains("feather") || field.getName().toLowerCase().contains("color"))
            {
                fieldValue = field.get(testParrot);
                
                Color value = (Color)fieldValue;
                
                assertEquals("Unexpected default value for Parrot feather color", Color.GREEN, fieldValue);
            }
        }
    }
    
    @Test
    public void testParrot_addWord_WorksCorrectly() throws Exception
    {
        assertEquals("There are an inapprorpriate number of instance variables.", 1, fields.length);
        
        Parrot testParrot = new Parrot(); 
        
        String expected = "Pieces of eight";
        
        testParrot.addWord(expected);
        
        Object fieldValue = fields[0].get(testParrot);
        
        if(!(fieldValue instanceof String[] || fieldValue instanceof ArrayList))
        {
            fail("Instance variable is of unrecognized type. Should be String[] or ArrayList<String>.");
        }
        
        if(fieldValue == null)
        {
            fail("Default constructor did not properly initialize the instance variable for the Parrot class.");
        }
        else
        {
            if(fieldValue instanceof String[])
            {
                String[] value = (String[])fieldValue; 
                
                String word = value[0]; 
                
                if (word == null)
                {
                    fail("Found null value for word known by parrot at index 0.");
                }
                
                assertEquals("Unexpected value for word known by Parrot.", "Polly", word);
                
                if (word == null)
                {
                    fail("Found null value for word known by parrot at index 1.");
                }
                
                word = value[1]; 
                
                assertEquals("Unexpected value for second word known by Parrot.", expected, word);
            }
            else if(fieldValue instanceof ArrayList)
            {
                ArrayList<String> value = (ArrayList<String>) fieldValue; 
                
                String word = value.get(0);
                
                if (word == null)
                {
                    fail("Found null value for word known by parrot at index 0.");
                }
                
                assertEquals("Unexpected value for word known by Parrot.", "Polly", word);
                
                word = value.get(1); 
                
                if (word == null)
                {
                    fail("Found null value for word known by parrot at index 1.");
                }
                assertEquals("Unexpected value for second word known by Parrot.", expected, word);
            }
        }
    }
    
    @Test
    public void testParrot_listKnownWords_WorksProperly()
    {
        assertEquals("There are an inapprorpriate number of instance variables.", 1, fields.length);
        
        Parrot testParrot = new Parrot(); 
        
        String add = "Pieces of eight";
        
        testParrot.addWord(add);
        
        String expected = "Polly; Pieces of eight; ";
        
        assertEquals("Improper output for listKnownWords.", expected, testParrot.listWordsKnown());
    }
    
    @Test
    public void testParrot_toString_WorksProperly()
    {
        assertEquals("There are an inapprorpriate number of instance variables.", 1, fields.length);
        
        Parrot testParrot = new Parrot(); 
        
        String add = "Pieces of eight";
        
        testParrot.addWord(add);
        
        String expected = "Polly, 2010, " + Color.GREEN.toString() + ", Polly; Pieces of eight; ";
        
        assertEquals("Improper output for listKnownWords.", expected, testParrot.toString());
    }
}
