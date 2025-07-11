package Questions;

import ProvidedClasses.Tool;
import java.awt.Color;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class CrowTest {
        
    static Field[]          fields;
    static Method[]         methods;
    static Constructor[]    constructors;
    static ArrayList<Field> superFields; 
    
    
    @BeforeClass
    public static void setUpClass() 
    {
        fields          = Crow.class.getDeclaredFields();
        methods         = Crow.class.getDeclaredMethods();
        constructors    = Crow.class.getDeclaredConstructors();
        superFields     = new ArrayList(); 
        
        superFields.addAll(Arrays.asList(Crow.class.getSuperclass().getSuperclass().getDeclaredFields()));
        superFields.addAll(Arrays.asList(Crow.class.getSuperclass().getDeclaredFields()));
        
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
    public void testCrow_InstanceVariables_MeaningfulIdentifiers() 
    {
        assertEquals("There are more instance variables than expected", 1, fields.length);
        
        String name = fields[0].getName().toLowerCase(); 
        
        if(!(name.contains("tool")))
        {
            fail("Instance variable for storing the list of Tools used Crow does not have a meaningful identifier.");
        }
    }
    
    @Test
    public void testCrow_DefaultConstructor_WorksProperly() throws Exception
    {
        assertEquals("There are an inapprorpriate number of constructors.", 1, constructors.length);
        
        assertEquals("There are an inapprorpriate number of instance variables.", 1, fields.length);
        
        Crow testCrow = new Crow(); 
             
        
        Object fieldValue = fields[0].get(testCrow);
        
        if(!(fieldValue instanceof Tool[] || fieldValue instanceof ArrayList))
        {
            fail("Instance variable is of unrecognized type. Should be Tool[] or ArrayList<Tool>.");
        }
        
        if(fieldValue == null)
        {
            fail("Default constructor did not properly initialize the instance variable for the Crow class.");
        }
        else
        {
            if(fieldValue instanceof Tool[])
            {
                Tool[] value = (Tool[])fieldValue; 
                
                Tool word = value[0]; 
                
                assertEquals("Unexpected value for tool used by Crow", "Chainsaw", word.getName());
            }
            else if(fieldValue instanceof ArrayList)
            {
                ArrayList<Tool> value = (ArrayList<Tool>) fieldValue; 
                
                Tool word = value.get(0);
                
                 assertEquals("Unexpected value for tool used by Crow", "Chainsaw", word.getName());
            }
        }
        
        for (Field field : superFields)
        {
            field.setAccessible(true);
            
            if(field.getName().equals("name"))
            {
                fieldValue = field.get(testCrow);
                
                String value = (String)fieldValue; 
                
                assertEquals("Unexpected default value for Crow name.", "Jacob", value);
            }
            else if(field.getName().equals("yearOfBirth"))
            {
                fieldValue = field.get(testCrow);
                
                int value = (int)fieldValue; 
                
                assertEquals("Unexpected default value for Crow name.", 2010, value);
            }
            else if(field.getName().toLowerCase().contains("feather") || field.getName().toLowerCase().contains("color"))
            {
                fieldValue = field.get(testCrow);
                
                Color value = (Color)fieldValue;
                
                assertEquals("Unexpected default value for Crow feather color", Color.BLACK, fieldValue);
            }
        }
    }
    
    @Test
    public void testCrow_addTool_WorksCorrectly() throws Exception
    {
        assertEquals("There are an inapprorpriate number of instance variables.", 1, fields.length);
        
        Crow testCrow = new Crow(); 
        
        Tool expected = Tool.HAMMER;
        
        testCrow.addTool(expected);
        
        Object fieldValue = fields[0].get(testCrow);
        
        if(!(fieldValue instanceof Tool[] || fieldValue instanceof ArrayList))
        {
            fail("Instance variable is of unrecognized type. Should be Tool[] or ArrayList<Tool>.");
        }
        
        if(fieldValue == null)
        {
            fail("Default constructor did not properly initialize the instance variable for the Crow class.");
        }
        else
        {
            if(fieldValue instanceof Tool[])
            {
                Tool[] value = (Tool[])fieldValue; 
                
                Tool word = value[0]; 
                
                if (word == null)
                {
                    fail("Found null value for tool used by Crow at index 0.");
                }
                
                assertEquals("Unexpected value for tool used by Crow.", "Chainsaw", word.getName());
                
                if (word == null)
                {
                    fail("Found null value for tool used by Crow at index 1.");
                }
                
                word = value[1]; 
                
                assertEquals("Unexpected value for second tool used by Crow.", expected.getName(), word.getName());
            }
            else if(fieldValue instanceof ArrayList)
            {
                ArrayList<Tool> value = (ArrayList<Tool>) fieldValue; 
                
                Tool word = value.get(0);
                
                if (word == null)
                {
                    fail("Found null value for tool used by Crow at index 0. at index 0.");
                }
                
                assertEquals("Unexpected value for tool used by Crow.", "Chainsaw", word.getName());
                
                word = value.get(1); 
                
                if (word == null)
                {
                    fail("Found null value for tool used by Crow at index 0. at index 1.");
                }
                assertEquals("Unexpected value for second tool used by Crow.", expected.getName(), word.getName());
            }
        }
    }
    
    @Test
    public void testCrow_getToolsUsed_WorksProperly() throws Exception
    {
        assertEquals("There are an inapprorpriate number of instance variables.", 1, fields.length);
        
        Crow testCrow = new Crow(); 
        
        Tool add = Tool.SCREWDRIVER;
        
        testCrow.addTool(add);
        
        Object test = testCrow.getToolsUsed();
        
        if(test instanceof ArrayList)
        {
            ArrayList<Tool> list = (ArrayList<Tool>) test; 
            
            list.add(Tool.SANDER); 
            
            ArrayList<Tool> actual = (ArrayList<Tool>)fields[0].get(testCrow);
        
            if(actual.size() != 2)
            {
                fail("getToolsUsed is allowing direct access to an instance variable.");
            }
        }
        else if (test instanceof Tool[])
        {
            Tool[] list = (Tool[]) test; 
            
            if(list == (Tool[])fields[0].get(testCrow))
            {
                fail("getToolsUsed is allowing direct access to an instance variable.");
            }
        }
        else
        {
            fail("getToolsUsed may not have a correct return type.");
        }
    }
    
    @Test
    public void testCrow_toString_WorksProperly()
    {
        assertEquals("There are an inapprorpriate number of instance variables.", 1, fields.length);
        
        Crow testCrow = new Crow(); 
        
        
        String expected = "Jacob, 2008, " + Color.BLACK.toString() + ", Chainsaw";
        
        assertEquals("Improper output for toString method.", expected, testCrow.toString());
    }
  

   
    
}
