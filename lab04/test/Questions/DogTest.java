/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.awt.Color;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author araderma
 */
public class DogTest {
    
    static Object testDog; 
    
    static Field[] instanceVars; 
    static Constructor[] constructors;
    static Method[] methods;
    
    @BeforeClass
    public static void setUpClass() 
    {
        try {
            Class<?> testClass = Class.forName("Questions.Dog");

            instanceVars = testClass.getDeclaredFields();
            constructors = testClass.getDeclaredConstructors();
            methods = testClass.getDeclaredMethods();

            for (Constructor constructor : constructors) {
                if(constructor.getParameterCount() == 0) {
                    testDog = constructor.newInstance(null);
                }
            }
            
            outputInformation();
        }
        catch (ClassNotFoundException e) {
            fail("Could not find Dog class or the class may contain compiler errors.");
            e.printStackTrace();
        }
        catch (IllegalAccessException | IllegalArgumentException | InstantiationException | SecurityException | InvocationTargetException e) {
            fail("Could not create instance of the Dog class. Your class may not have a default constructor or it may not be correctly set up.");
            e.printStackTrace();
        }
        
    }
    
    public static void outputInformation()
    {
        System.out.println("Instance Variables:");
        for(Field f : instanceVars)
        {
            System.out.print(" Identifier: " + f.getName() + "\n");
            System.out.print(" Access Modifier: " + Modifier.toString(f.getModifiers()) + "\n");
            System.out.print(" Type: " + f.getType().getCanonicalName().substring(f.getType().getCanonicalName().lastIndexOf(".") + 1) + "\n\n");
            
        }
        
        System.out.println("Methods:");
        for(Method m : methods)
        {
             System.out.print(" Identifier: " + m.getName() + "\n");
             System.out.print(" Access Modifier: " + Modifier.toString(m.getModifiers()) + "\n");
             System.out.print(" Return Type: " + m.getReturnType().getCanonicalName().substring(m.getReturnType().getCanonicalName().lastIndexOf(".") + 1) + "\n");
             System.out.print(" Parameters:");
             
             Class[] params = m.getParameterTypes(); 
             
             for(int i = 0; i < params.length; i++)
             {
                 String name = params[i].getName().substring(params[i].getName().lastIndexOf(".") + 1);
                 
                 System.out.print(" " + name);
                 
                 if(i != params.length -1)
                 {
                     System.out.print(",");
                 }
             }
             
             System.out.println("\n");
        }   
        
        System.out.println("Constructors:");
        for(Constructor m : constructors)
        {
             System.out.print(" Identifier: " + m.getName().substring(m.getName().lastIndexOf(".") + 1) + "\n");
             System.out.print(" Access Modifier: " + Modifier.toString(m.getModifiers()) + "\n");
             System.out.print(" Parameters:");
             
             Class[] params = m.getParameterTypes(); 
             
             for(int i = 0; i < params.length; i++)
             {
                 String name = params[i].getName().substring(params[i].getName().lastIndexOf(".") + 1);
                 
                 System.out.print(" " + name);
                 
                 if(i != params.length -1)
                 {
                     System.out.print(",");
                 }
             }
             
             System.out.println("\n");
        }
    }
        
    
    @Test
    public void testInstanceVariables_CorrectNumber()
    {
        int num = instanceVars.length; 
        
        assertEquals("Incorrect number of instance variables." , 3, num);
    }
    
    @Test
    public void testInstanceVariables_CorrectAccessModifiers() 
    {
        if (instanceVars.length != 3)
        {
            fail("Incorrect number of instance variables");
        }
        
        for(Field f : instanceVars)
        {
            int mod = f.getModifiers();
            
            if(!Modifier.isPrivate(mod))
            {
                fail("The access modifier for the instance variable " + f.getName() + " is not set to private.");
            }
        }
    }
    
    @Test
    public void testInstanceVariables_GoodIdentifiers()
    {
        if (instanceVars.length != 3)
        {
            fail("Incorrect number of instance variables");
        }
        
        // Set booleans to make sure same similar identifiers aren't used.  
        boolean trick = false; 
        boolean name  = false;
        boolean color = false; 
        
        for(Field f : instanceVars)
        {
            String fName = f.getName(); 
            
            if(fName.toLowerCase().contains("trick") && !trick)
            {
                trick = true; 
            }
            else if(fName.toLowerCase().contains("name") && !name)
            {
                name = true; 
            }
            else if(fName.toLowerCase().contains("color") && !color)
            {
                color = false; 
            }
            else
            {
                fail(fName + " is not a meaningful identifier. Choose something more descriptive.");
            }
                    
        }
    }
    
    @Test
    public void testInstanceVariables_CorrectTypes()
    {
        if (instanceVars.length != 3)
        {
            fail("Incorrect number of instance variables");
        }
        
        for (Field f : instanceVars)
        {
            // Gets the type and removes package formatting
            String type = f.getType().toString().substring(f.getType().toString().lastIndexOf(".") + 1);
            
            if(f.getName().toLowerCase().contains("name"))
            {
                assertEquals(f.getName() + " is the wrong type.", "String", type);
            }
            else if(f.getName().toLowerCase().contains("trick"))
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
    public void testAccessorMethods_GoodIdentifiers()
    {
        if(methods.length == 0)
        {
            fail("No methods have been defined.");
        }
        
        String[] ivNames = new String[instanceVars.length];
        boolean[]  ivFlags = new boolean[instanceVars.length]; 
        
        for(int i = 0; i < ivNames.length; i++)
        {
            ivNames[i] = instanceVars[i].getName().toLowerCase(); 
        }
        
        for (Method m : methods)
        {
            if(!m.getReturnType().toString().equals("void"))
            {
                String mName = m.getName(); 
                
                if (mName.equals("Dog"))
                {
                    fail("Constructor methods should not have return type: " + m.getReturnType().toString());
                }
                if (!mName.equals("toString"))
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
    public void testMutatorMethod_GoodIdentifier()
    {
        if(methods.length == 0)
        {
            fail("No methods have been defined.");
        }
        
        String ivNameTricks = ""; 
        
        for (Field f : instanceVars)
        {
            String fName = f.getName().toLowerCase(); 
            
            if(fName.contains("trick"))
            {
                ivNameTricks = fName;
                break;
            }
        }
        
        if (ivNameTricks.isEmpty())
        {
            fail("Could not find an instance variable identifier for the number of tricks the dog knows.");
        }
        
        for(Method m : methods)
        {
            if(m.getReturnType().toString().equals("void"))
            {
                if(m.getName().equals("Dog"))
                {
                    fail("Constructor methods should not have return type void.");
                }
                else
                {        
                    if(!m.getName().startsWith("set"))
                    {
                        fail("Mutator method " + m.getName() + " should start with \"set\".");
                    }
                    
                    if (!m.getName().toLowerCase().substring(3).equals(ivNameTricks))
                    {
                        fail("Could not find matching instace variable for mutator method: " + m.getName());
                    }
                }
                
            }
        }
    }
    
    @Test
    public void testMethods_CorrectAccessModifier()
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
    public void testConstructors_CorrectAccessModifier()
    {
        if(constructors.length < 2)
        {
            fail("Could not find both default and alternate constructor.");
        }
        
        for(Constructor c : constructors)
        {
            int mod = c.getModifiers();
            
            if(!Modifier.isPublic(mod))
            {
                fail(c.getName() + " does not have a public access modifier.");
            }
        }
    }
    
    @Test
    public void testDefaultConstructor_CorrectNumberOfParameters()
    {
        if(constructors.length < 2)
        {
            fail("Could not find both default and alternate constructor.");
        }
        
        boolean match = false; 
        for(Constructor c : constructors)
        {
            int params = c.getParameterTypes().length;
            
            
            if(params == 0)
            {
                match = true; 
            }
        }
        
        if(!match)
        {
            fail("Could not find a constructor with 0 parameters.");
        }
    }
    
    @Test
    public void testAlternateConstructor_CorrectNumberOfParameters()
    {
        if(constructors.length < 2)
        {
            fail("Could not find both default and alternate constructor.");
        }
        
        boolean match = false; 
        for(Constructor c : constructors)
        {
            int params = c.getParameterTypes().length;
            
            
            if(params == 3)
            {
                match = true; 
            }
        }
        
        if(!match)
        {
            fail("Could not find a constructor with 3 parameters.");
        }
    }
    
    @Test
    public void testAlternateConstructor_CorrectParameterTypes()
    {
        if(constructors.length < 2)
        {
            fail("Could not find both default and alternate constructor.");
        }
        
        boolean color = false; 
        boolean string = false; 
        boolean intp  = false; 
        
        boolean match = false; 
        
        for(Constructor c : constructors)
        {
            Class[] params = c.getParameterTypes();
            
            if(params.length == 3)
            {
                match = true; 
                for(Class cl : params)
                {
                    String cn = cl.getName().substring(cl.getName().lastIndexOf(".") + 1);
                    
                    if(cn.equals("String"))
                    {
                        string = true; 
                    }
                    else if(cn.equals("int"))
                    {
                        intp = true; 
                    }
                    else if(cn.equals("Color"))
                    {
                        color = true; 
                    }
                }
            }
        }
        
        if(!match)
        {
            fail("Could not find a constructor with 3 parameters.");
        }
        
        if(!color)
        {
            fail("Constructor did not have a Color parameter.");
        }
        if(!string)
        {
            fail("Constructor did not have a String parameter.");
        }
        if(!intp)
        {
            fail("Constructor did not have an int parameter.");
        }
    }
    
    @Test
    public void testMutatorMethod_ModifiesInstanceVariable() throws Exception
    {
        String fieldForTricks = "";
        Field correct = null; 
        
        for(Field f : instanceVars)
        {
            if(f.getName().toLowerCase().contains("trick"))
            {
                fieldForTricks = f.getName(); 
                correct = f; 
            }
        }
        
        if (fieldForTricks.isEmpty())
        {
            fail("Could not find instance variable storing number of tricks. May be due to bad name.");
        }
        
        if(correct != null)
        {
            correct.setAccessible(true);
            correct.setInt(testDog, 10);
        }
        else
        {
            fail("Could not find instance variable storing number of tricks.");
        }
        
        
        Method methodToCall = null; 
        
        boolean found = false; 
        for (Method m : methods)
        {
            if(m.getName().startsWith("set") && m.getName().toLowerCase().contains(fieldForTricks.toLowerCase()))
            {
                found = true;
                methodToCall = m; 
                break;
            }
        }
        
        if(!found)
        {
            fail("Could not find appropriate mutator method to return the number of tricks known.");
        }
        
        methodToCall.invoke(testDog, 5);
        
        int actual = correct.getInt(testDog);
        
        assertEquals("This test fails if the mutator method for setting the tricks learned doesn't work.", 5, actual);
    }
    
    @Test
    public void testToStringMethod() throws Exception
    {
        for(Field f : instanceVars)
        {
            f.setAccessible(true);
        }
        
        Field fieldForName = null; 
        Field fieldForTricks = null;
        Field fieldForColor = null; 
        
        for(Field f : instanceVars)
        {
            if(f.getName().toLowerCase().contains("name"))
            {
                fieldForName = f; 
            }
            else if(f.getName().toLowerCase().contains("trick"))
            {
                fieldForTricks = f; 
            }
            else if(f.getName().toLowerCase().contains("color"))
            {
                fieldForColor = f; 
            }
        }
        
        if(fieldForName == null)
        {
            fail("Could not find a suitable instance variable for the \"name\" of the dog.");
        }
        else
        {
            fieldForName.set(testDog, "Clifford");
        }
        
        if(fieldForTricks == null)
        {
            fail("Could not find a suitable instance variable for number of \"tricks\" that dog knows.");
        }
        else
        {
            fieldForTricks.set(testDog, 7);
        }
        
        if(fieldForColor == null)
        {
            fail("Could not find a suitable instance variable for the \"color\" of the dog's fur.");
        }
        else
        {
            fieldForColor.set(testDog, Color.RED);
        }
        
        String out = testDog.toString();
        
        System.out.println("toString output: " + out);
        
        if(!out.toLowerCase().contains("clifford"))
        {
            fail("Correct name is not being output in toString method.");
        }
        if(!out.toLowerCase().contains("7"))
        {
            fail("Correct number of tricks is not being output in toString method.");
        }
        if(!out.toLowerCase().contains("red") && !out.contains("r=255"))
        {
            fail("Correct color of fur is not being output in toString method.");
        }
    }
    
}