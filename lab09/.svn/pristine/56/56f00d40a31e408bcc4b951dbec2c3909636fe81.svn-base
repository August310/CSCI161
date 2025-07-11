package Questions;

import java.awt.Color;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class BirdTest {

    static Field[]          fields;
    static Method[]         methods;
    static Constructor[]    constructors;
    
    @BeforeClass
    public static void setUpClass() 
    {
        fields          = Bird.class.getDeclaredFields();
        methods         = Bird.class.getDeclaredMethods();
        constructors    = Bird.class.getDeclaredConstructors();
        
        for(Field f : fields)
        {
            f.setAccessible(true);
        }
    }
    
    @Test
    public void testBird_InstanceVariables_MeaningfulIdentifiers() 
    {
        assertEquals("There are more instance variables than expected", 1, fields.length);
        
        String name = fields[0].getName().toLowerCase(); 
        
        if(!(name.contains("color") || name.contains("feather")))
        {
            fail("Instance variable for storing the color of a Bird's feathers does not have a meaningful identifier.");
        }
    }
    
    @Test
    public void testBird_DefaultConstructor_WorksProperly() throws Exception
    {
        assertEquals("There are an inapprorpriate number of constructors.", 2, constructors.length);
        
        assertEquals("There are an inapprorpriate number of instance variables.", 1, fields.length);
        
        Bird testBird = new Bird(); 
        
        Field[] superFields = Bird.class.getSuperclass().getDeclaredFields(); 
        
        Object fieldValue = fields[0].get(testBird);
        
        if(!(fieldValue instanceof Color))
        {
            fail("Instance variable is of incorrect type.");
        }
        
        if(fieldValue == null)
        {
            fail("Default constructor did not properly initialize the instance variable for the Bird class.");
        }
        
        for (Field field : superFields)
        {
            field.setAccessible(true);
            
            if(field.getName().equals("name"))
            {
                fieldValue = field.get(testBird);
                
                String value = (String)fieldValue; 
                
                assertEquals("Unexpected default value for Bird name.", "No Name", value);
            }
            else if(field.getName().equals("yearOfBirth"))
            {
                fieldValue = field.get(testBird);
                
                int value = (int)fieldValue; 
                
                assertEquals("Unexpected default value for Bird name.", 2008, value);
            }
        }
    }
    
    @Test
    public void testBird_AlternateConstructor_WorksProperly() throws Exception
    {
        assertEquals("There are an inapprorpriate number of constructors.", 2, constructors.length);
        
        assertEquals("There are an inapprorpriate number of instance variables.", 1, fields.length);
        
        Bird testBird = new Bird("Tobias", 1988, Color.BLACK); 
        
        Field[] superFields = Bird.class.getSuperclass().getDeclaredFields(); 
        
        Object fieldValue = fields[0].get(testBird);
        
        if(!(fieldValue instanceof Color))
        {
            fail("Instance variable is of incorrect type.");
        }
        
        if(fieldValue == null)
        {
            fail("Alternate constructor did not properly initialize the instance variable for the Bird class.");
        }
        else
        {
            Color c = (Color) fieldValue; 
            assertEquals("Alternate constructor did not properly initialize instance variable for feather color.", Color.BLACK, c);
        }
        
        for (Field field : superFields)
        {
            field.setAccessible(true);
            
            if(field.getName().equals("name"))
            {
                fieldValue = field.get(testBird);
                
                String value = (String)fieldValue; 
                
                assertEquals("Unexpected default value for Bird name.", "Tobias", value);
            }
            else if(field.getName().equals("yearOfBirth"))
            {
                fieldValue = field.get(testBird);
                
                int value = (int)fieldValue; 
                
                assertEquals("Unexpected default value for Bird name.", 1988, value);
            }
        }
    }
    
    @Test
    public void testBird_toString_WorksProperly()
    {
        Bird testBird = new Bird("Tobias", 1988, Color.BLACK); 
        
        String expected = "Tobias, 1988, " + Color.BLACK.toString(); 
        
        String actual = testBird.toString(); 
        
        assertEquals("This method fails if the toString method is incorrectly implemented.", expected, actual);
    }
    
  
   
    
}
