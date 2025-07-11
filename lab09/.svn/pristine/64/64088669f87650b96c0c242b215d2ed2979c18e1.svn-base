package Questions;

import static Questions.DrawableTest.methods;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoveableTest {
    
  
    public static Method[] methods;
    
    @BeforeClass
    public static void setUpClass() 
    {
        methods = Moveable.class.getDeclaredMethods(); 
        
    }
    
    @Test
    public void testMoveable_HasCorrectModifiers() 
    {
        int mod = Moveable.class.getModifiers();
        
        if (!Modifier.isPublic(mod))
        {
            fail("Moveable is not defined as a \"public\" interface.");
        }
        if (!Modifier.isAbstract(mod))
        {
            fail("Moveable is not defined as an \"abstract\" interface.");
        }
    }
    
    @Test
    public void testMoveable_HasMoveMethod()
    {
        String message = "Moveable has an inappropriate number of methods.";
        assertEquals(message, 1, methods.length);
        
        assertEquals("Moveable does not have an appropriately named method.", "move", methods[0].getName());
        
    }
    
    @Test
    public void testMoveable_MoveMethod_HasCorrectModifiers()
    {
        String message = "Moveable has an inappropriate number of methods.";
        assertEquals(message, 1, methods.length);
        
        assertEquals("Moveable does not have an appropriately named method.", "move", methods[0].getName());
        
        int mod = methods[0].getModifiers();
        
        if (!Modifier.isPublic(mod))
        {
            fail("move is not defined as a \"public\" method.");
        }
        if (!Modifier.isAbstract(mod))
        {
            fail("move is not defined as an \"abstract\" method.");
        }
    }
    
    @Test
    public void testMoveable_MoveMethod_HasCorrectParameters()
    {
        String message = "Moveable has an inappropriate number of methods.";
        assertEquals(message, 1, methods.length);
        
        assertEquals("Moveable does not have an appropriately named method.", "move", methods[0].getName());
        
        Class[] parameters = methods[0].getParameterTypes();
        
        assertEquals("move does not the the correct number of parameters", 0, parameters.length); 
    }
   
    
}
