/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class GameObjectTest 
{

    static Field[] fields;
    static Method[] methods;
    static Constructor[] constructors;
    
    @BeforeClass
    public static void setUpClass() 
    {
        fields = GameObject.class.getDeclaredFields();
        methods = GameObject.class.getDeclaredMethods();
        constructors = GameObject.class.getDeclaredConstructors();
    }
    
    @Test
    public void testGameObject_ClassIsAbstract()
    {
        int mod = GameObject.class.getModifiers();
        
        if(!Modifier.isAbstract(mod))
        {
            fail("GameObject is not defined as an \"abstract\" class.");
        }
    }
    
    @Test
    public void testGameObject_ClassIsPublic()
    {
        int mod = GameObject.class.getModifiers();
        
        if(!Modifier.isPublic(mod))
        {
            fail("GameObject is not defined as a \"public\" class.");
        }
    }
    
    @Test
    public void testGameObject_ImplementsDrawable()
    {
        Class interfaces[] = GameObject.class.getInterfaces();
        
        assertEquals("This method fails if GameObject does not implement the correct number of interfaces.", 1, interfaces.length);
        
        String name = interfaces[0].getCanonicalName(); 
        
        String type = name.substring(name.lastIndexOf(".") + 1); 
        
        assertEquals("GameObject does not implement the correct interface", "Drawable", type);
    }
    
    @Test
    public void testGameObject_InstanceVariables_CorrectNumber()
    {
        int num = fields.length; 
        
        assertEquals("Incorrect number of instance variables." , 3, num);
    }
    
    @Test
    public void testGameObject_InstanceVariables_CorrectAccessModifiers() 
    {
        if (fields.length != 3)
        {
            fail("Incorrect number of instance variables");
        }
        
        for(Field f : fields)
        {
            int mod = f.getModifiers();
            
            if(!Modifier.isProtected(mod))
            {
                fail("The access modifier for the instance variable " + f.getName() + " is not set to protected.");
            }
        }
    }
    
    @Test
    public void testInstanceVariables_GoodIdentifiers()
    {
        if (fields.length != 3)
        {
            fail("Incorrect number of instance variables");
        }
        
        // Set booleans to make sure same similar identifiers aren't used.  
        boolean x = false; 
        boolean y  = false;
        boolean color = false; 
        
        for(Field f : fields)
        {
            String fName = f.getName(); 
            
            if(fName.toLowerCase().contains("x") && (fName.toLowerCase().contains("cord") || fName.toLowerCase().contains("pos") )&& !x)
            {
                x = true; 
            }
            else if(fName.toLowerCase().contains("y") && (fName.toLowerCase().contains("cord") || fName.toLowerCase().contains("pos") )&& !y)
            {
                y = true; 
            }
            else if(fName.toLowerCase().contains("color") && !color)
            {
                color = true; 
            }
            else
            {
                fail(fName + " is not a meaningful identifier. Choose something more descriptive.");
            }       
        }
    }
    
    @Test
    public void testGameObject_InstanceVariables_CorrectTypes()
    {
        if (fields.length != 3)
        {
            fail("Incorrect number of instance variables");
        }
        
        for (Field f : fields)
        {
            // Gets the type and removes package formatting
            String type = f.getType().toString().substring(f.getType().toString().lastIndexOf(".") + 1);
            
            if(f.getName().toLowerCase().contains("x"))
            {
                assertEquals(f.getName() + " is the wrong type.", "int", type);
            }
            else if(f.getName().toLowerCase().contains("y"))
            {
                assertEquals(f.getName() + " is the wrong type.", "int", type);
            }
            else if(f.getName().toLowerCase().contains("color"))
            {
                assertEquals(f.getName() + " is the wrong type.", "Color", type);
            }
            else
            {
                fail(f.getName() + " may not be a good identifier.");
            }
        }   
    }
    
    @Test
    public void testGameObject_AccessorMethods_GoodIdentifiers()
    {
        if(methods.length == 0)
        {
            fail("No methods have been defined.");
        }
        
        String[] ivNames = new String[fields.length];
        boolean[]  ivFlags = new boolean[fields.length]; 
        
        for(int i = 0; i < ivNames.length; i++)
        {
            ivNames[i] = fields[i].getName().toLowerCase(); 
        }
        
        for (Method m : methods)
        {
            if(!m.getReturnType().toString().equals("void"))
            {
                String mName = m.getName(); 
                
                if (mName.equals("GameObject"))
                {
                    fail("Constructor methods should not have return type: " + m.getReturnType().toString());
                }
                if (!mName.equals("getBounds"))
                {
                    if(!mName.startsWith("get"))
                    {
                        fail("Accessor method " + mName + " should start with get.");
                    }
                    
                    boolean match = false; 
                    
                    for (int i = 0; i < ivNames.length; i++)
                    {
                        String smName = mName.substring(3).toLowerCase();
                        
                        if(smName.equals(ivNames[i]) && !ivFlags[i])
                        {
                            ivFlags[i] = true;
                            match = true;
                        }
                    }
                    
                    if(!match)
                    {
                        fail("Could not find a matching instance variable for method: " + mName);
                    }
                }
            }
        }
    }
    
    @Test
    public void testGameObject_MutatorMethods_GoodIdentifiers()
    {
        if(methods.length == 0)
        {
            fail("No methods have been defined.");
        }
        
        String[] ivNames = new String[fields.length];
        boolean[]  ivFlags = new boolean[fields.length]; 
        
        for(int i = 0; i < ivNames.length; i++)
        {
            ivNames[i] = fields[i].getName().toLowerCase(); 
        }
        
        for (Method m : methods)
        {
            if(m.getReturnType().toString().equals("void"))
            {
                String mName = m.getName(); 
                
                if (mName.equals("GameObject"))
                {
                    fail("Constructor methods should not have return type: " + m.getReturnType().toString());
                }
                if (!mName.equals("draw"))
                {
                    if(!mName.startsWith("set"))
                    {
                        fail("Accessor method " + mName + " should start with set.");
                    }
                    
                    boolean match = false; 
                    
                    for (int i = 0; i < ivNames.length; i++)
                    {
                        String smName = mName.substring(3).toLowerCase();
                        
                        if(smName.equals(ivNames[i]) && !ivFlags[i])
                        {
                            ivFlags[i] = true;
                            match = true;
                        }
                    }
                    
                    if(!match)
                    {
                        fail("Could not find a matching instance variable for method: " + mName);
                    }
                }
            }
        }
    }
    
    @Test
    public void testGameObject_MethodsHaveCorrectAccessModifier()
    {
        if(methods.length == 0)
        {
            fail("No methods have been defined.");
        }
        
        for (Method m : methods)
        {
            int mod = m.getModifiers();
            
            if(!Modifier.isPublic(mod))
            {
                fail(m.getName() + " does not have the public access modifier.");
            }
        }
    }
    
    @Test
    public void testGameObject_HasGetBoundsMethod()
    {
        boolean flag = false;
        
        for(Method m : methods)
        {
            if(m.getName().equals("getBounds"))
            {
                flag = true; 
            }
        }
        
        if(!flag)
        {
            fail("Could not find method with identifier \"getBounds\".");
        }
    }
    
    @Test
    public void testGameObject_getBounds_IsAbstract()
    {
        boolean flag = false;
        
        for(Method m : methods)
        {
            if(m.getName().equals("getBounds"))
            {
                int mod = m.getModifiers(); 
                
                if(!Modifier.isAbstract(mod))
                {
                    fail("The getBounds method is not declared as abstract.");
                }
                
                flag = true; 
            }
        }
        
        if(!flag)
        {
            fail("Could not find method with identifier \"getBounds\".");
        }
    }
    
    @Test
    public void testGameObject_draw_IsAbstract()
    {
        boolean flag = false;
        
        for(Method m : methods)
        {
            if(m.getName().equals("draw"))
            {
                int mod = m.getModifiers(); 
                
                if(!Modifier.isAbstract(mod))
                {
                    fail("The draw method is not declared as abstract.");
                }
                
                flag = true; 
            }
        }
        
        if(!flag)
        {
            fail("Could not find method with identifier \"draw\".");
        }
    }
    
}
