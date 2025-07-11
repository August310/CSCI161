/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.lang.reflect.*;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class CycleTest {
    
    static Field[] instanceVars; 
    static Method[] methods;
    static Constructor[] constructors;
    
    static FieldMatcher fieldMatcher; 
    
    @BeforeClass
    public static void setUpClass() {
        
        try {
            Class<?> testClass = Class.forName("Questions.Cycle"); 
            instanceVars = testClass.getDeclaredFields();
            methods = testClass.getDeclaredMethods();
            constructors = testClass.getDeclaredConstructors(); 
        }
        catch (Exception e) {
            fail("Could not find Cycle class or the class may contain compiler errors.");
        }
        
        outputInformation();
        
        fieldMatcher = new FieldMatcher(2);
        
        fieldMatcher.setValues(0, "Cycle Name", null, new IdentifierPattern(new String[][] {{"name"}}, 1));
        fieldMatcher.setValues(1, "Cycle Number of Wheels", null, new IdentifierPattern(new String[][] {{"num", "amount", "amt", "count"}, {"wheel", "tire"}}, 1, 1));
        
        fieldMatcher.findMatches(instanceVars);
    }
    
    public static void outputInformation()
    {
        System.out.println("Instance Variables:");
        for(Field f : instanceVars)
        {
            f.setAccessible(true);
            System.out.print("  Identifier: " + f.getName() + "; ");
            System.out.print("Access Modifier: " + Modifier.toString(f.getModifiers()) + "; ");
            System.out.print("Type: " + f.getType().getCanonicalName().substring(f.getType().getCanonicalName().lastIndexOf(".") + 1) + "\n");
            
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
        
        System.out.println("Methods:");
        for(Method m : methods)
        {
             System.out.print("  Identifier: " + m.getName() + "; ");
             System.out.print("Access Modifier: " + Modifier.toString(m.getModifiers()) + "; ");
             System.out.print("Return Type: " + m.getReturnType().getCanonicalName().substring(m.getReturnType().getCanonicalName().lastIndexOf(".") + 1) + "; ");
             System.out.print("Parameters:");
             
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
             System.out.println("");
        }   
    }
    
    @Test
    public void testInstanceVariable_CycleName() {
        Field f = fieldMatcher.getFieldByDescription("Cycle Name"); 
        
        if(f == null) {
            fail("Could not find an instance variable for the name of the Cycle. Identifier may not be meaningful or data type may be incorrect.");
        }
        
        if(f.getType() != String.class) {
            assertEquals("Field for the Cycle's name has an incorrect type", "String", f.getType().getSimpleName());
        }
    }
    
    @Test
    public void testInstanceVariable_CycleNumberOfWheels() {
        Field f = fieldMatcher.getFieldByDescription("Cycle Number of Wheels"); 
        
        if(f == null) {
            fail("Could not find an instance variable for the number of wheels of the Cycle. Identifier may not be meaningful or data type may be incorrect.");
        }
        
        if(f.getType() != int.class) {
            assertEquals("Field for the Cycle's number of wheels has an incorrect type", "int", f.getType().getSimpleName());
        }
    }
    
    @Test
    public void testAccessorMethod_CycleName() {
        Field f = fieldMatcher.getFieldByDescription("Cycle Name");
        
        if(f == null) {
            fail("Could not find field for the name of the Cycle.");
        }
        
        String fieldIdentifier = f.getName(); 
        String expectedMethodIdentifier = ("get" + fieldIdentifier.substring(0, 1).toUpperCase() + fieldIdentifier.substring(1));
        
        boolean match = false; 
        for(Method method : methods) {
            String methodIdentifier = method.getName(); 
            if(methodIdentifier.equalsIgnoreCase(expectedMethodIdentifier)) {
                match = true; 
            }
        }
        
        if(!match) {
            fail("Could not find an accessor method for the instance variable " + fieldIdentifier + ". Expected " + expectedMethodIdentifier);
        }
    }
    
    @Test
    public void testAccessorMethod_CycleNumberOfWheels() {
        Field f = fieldMatcher.getFieldByDescription("Cycle Number of Wheels");
        
        if(f == null) {
            fail("Could not find field for the number of wheels of the Cycle.");
        }
        
        
        String fieldIdentifier = f.getName(); 
        String expectedMethodIdentifier = ("get" + fieldIdentifier.substring(0, 1).toUpperCase() + fieldIdentifier.substring(1));
        
        boolean match = false; 
        for(Method method : methods) {
            String methodIdentifier = method.getName(); 
            if(methodIdentifier.equalsIgnoreCase(expectedMethodIdentifier)) {
                match = true; 
            }
        }
        
        if(!match) {
            fail("Could not find an accessor method for the instance variable " + fieldIdentifier + ". Expected " + expectedMethodIdentifier);
        }
    }
    
    @Test
    public void testFactoryMethod_getBicycleInstance() {
        String expectedMethodIdentifier = "getBicycleInstance"; 
   
        Method match = null; 
        for(Method method : methods) {
            String methodIdentifier = method.getName(); 
            if(methodIdentifier.equalsIgnoreCase(expectedMethodIdentifier)) {
                match = method; 
            }
        }
        
        if(match == null) {
            fail("Could not find method: " + expectedMethodIdentifier);
        }
        
        if(!Modifier.isStatic(match.getModifiers())) {
            fail("The method " + expectedMethodIdentifier + " is not static.");
        }
        
        if(!Modifier.isPublic(match.getModifiers())) {
            fail("The method " + expectedMethodIdentifier + " is not public.");
        }
        
        String returnType = match.getReturnType().getSimpleName();
        
        assertEquals("The return type for the " + expectedMethodIdentifier + " method is incorrect.","Cycle", returnType);
        
        int parametersRequired = match.getParameterCount();
        
        assertEquals("The number of parameters for the " + expectedMethodIdentifier + " method is incorrect.", 0, parametersRequired);
        
        try {
            Object result = match.invoke(null,null); 
            
            Field nameField = fieldMatcher.getFieldByDescription("Cycle Name");
            Object fieldValue = nameField.get(result); 
            assertEquals("Cycle object returned by method has incorrect name value.", "bicycle", fieldValue);
            
            Field numberOfWheelsField = fieldMatcher.getFieldByDescription("Cycle Number of Wheels");
            fieldValue = numberOfWheelsField.get(result);
            assertEquals("Cycle object returned by method has incorrect number of wheels value.",2, fieldValue);
        }
        catch(Exception e) {
            e.printStackTrace();
            fail("The method generated an exception.");
        }
    }
    
    @Test
    public void testFactoryMethod_getTricycleInstance() {
        String expectedMethodIdentifier = "getTricycleInstance"; 
   
        Method match = null; 
        for(Method method : methods) {
            String methodIdentifier = method.getName(); 
            if(methodIdentifier.equalsIgnoreCase(expectedMethodIdentifier)) {
                match = method; 
            }
        }
        
        if(match == null) {
            fail("Could not find method: " + expectedMethodIdentifier);
        }
        
        if(!Modifier.isStatic(match.getModifiers())) {
            fail("The method " + expectedMethodIdentifier + " is not static.");
        }
        
        if(!Modifier.isPublic(match.getModifiers())) {
            fail("The method " + expectedMethodIdentifier + " is not public.");
        }
        
        String returnType = match.getReturnType().getSimpleName();
        
        assertEquals("The return type for the " + expectedMethodIdentifier + " method is incorrect.","Cycle", returnType);
        
        int parametersRequired = match.getParameterCount();
        
        assertEquals("The number of parameters for the " + expectedMethodIdentifier + " method is incorrect.", 0, parametersRequired);
        
        try {
            Object result = match.invoke(null,null); 
            
            Field nameField = fieldMatcher.getFieldByDescription("Cycle Name");
            Object fieldValue = nameField.get(result); 
            assertEquals("Cycle object returned by method has incorrect name value.", "tricycle", fieldValue);
            
            Field numberOfWheelsField = fieldMatcher.getFieldByDescription("Cycle Number of Wheels");
            fieldValue = numberOfWheelsField.get(result);
            assertEquals("Cycle object returned by method has incorrect number of wheels value.",3, fieldValue);
        }
        catch(Exception e) {
            e.printStackTrace();
            fail("The method generated an exception.");
        }
    }
    
    @Test
    public void testConstructorMethod() {
        
        assertEquals("Incorrect number of constructor methods", 1, constructors.length);
        
        Constructor constructorMethod = constructors[0];
        
        if (!Modifier.isPrivate(constructorMethod.getModifiers())) {
            assertEquals("Incorrect access modifier for constructor method.", "private", Modifier.toString(constructorMethod.getModifiers()));
        }
        
        assertEquals("Incorrect number of parameters for constructor method.", 2, constructorMethod.getParameterCount());
        
        Class[] parameterTypes = constructorMethod.getParameterTypes(); 
        String typeNames = parameterTypes[0].getSimpleName() + ", " + parameterTypes[1].getSimpleName();
        
        assertEquals("Incorrect parameter types for constructor method.", "String, int", typeNames);
    }
}
