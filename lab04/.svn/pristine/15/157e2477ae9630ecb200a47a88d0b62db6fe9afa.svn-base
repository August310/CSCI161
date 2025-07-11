/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.lang.reflect.*;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class CatTest {
    
    static Class<?> testClass; 
    static Object testCat;
    
    static Field[] instanceVars; 
    static Constructor[] constructors;
    static Method[] methods;
    
    static FieldMatcher fieldMatcher; 
    
    static String[] positions = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh"}; 
    
    @BeforeClass
    public static void setUpClass() 
    {
        try {
            testClass = Class.forName("Questions.Cat"); 


            instanceVars = testClass.getDeclaredFields();
            constructors = testClass.getDeclaredConstructors();
            methods = testClass.getDeclaredMethods();
            
            outputInformation();
            
            for(Constructor constructorMethod : constructors) {
                if(constructorMethod.getParameterCount() == 0) {
                    testCat = constructorMethod.newInstance(new Object[]{}); 
                }
            }
            
            if (testCat == null) {
                fail("Could not create an instance of the Cat class. You do not have a default constructor method.");
            }
            
            fieldMatcher = new FieldMatcher(3); 
            
            fieldMatcher.setValues(0, "name", null, new IdentifierPattern(new String[][]{{"name"}}, 1));
            fieldMatcher.setValues(1, "miceCaught", null, new IdentifierPattern(new String[][]{{"mice", "mouse"}, {"catch", "caught", "kill"}}, 1, 1));
            fieldMatcher.setValues(2, "secretPlot", null, new IdentifierPattern(new String[][] {{"secret"}, {"plot"}}, 1, 1));
            
            fieldMatcher.findMatches(instanceVars);
        }
        catch (Exception e) {
            fail("Could not find Cat class or the class contains compiler errors.");
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
    
    public static void testMethodHeader(Field field, String identifierStart, String returnType, Class<?>[] parameterTypes, String[] modifiers) {
        String fieldIdentifier = field.getName(); 
        String expectedMethodIdentifier = (identifierStart + fieldIdentifier.substring(0, 1).toUpperCase() + fieldIdentifier.substring(1));
        
        Method match = null;
        for (Method method : methods) {
            if(method.getName().equals(expectedMethodIdentifier)) {
                match = method; 
            }
        }
        
        if(match == null) {
            fail("Could not find method for field " + fieldIdentifier + ". Expected " + expectedMethodIdentifier);
            return; // removes compiler warning for possible null pointer dereference
        }
        
        if(returnType != null) {
            String actualReturnType = match.getReturnType().getSimpleName(); 
            assertEquals("The " + expectedMethodIdentifier + " method has an incorrect return type", returnType, actualReturnType);
        }
        
        if(parameterTypes != null) {
            int actualParameterCount = match.getParameterCount();
            assertEquals("The " + expectedMethodIdentifier + " method has an incorrect number of parameters", parameterTypes.length,actualParameterCount);
            Class<?>[] actualParameterTypes = match.getParameterTypes(); 
            for(int i = 0; i < parameterTypes.length; i++) {
                if(parameterTypes[i] != actualParameterTypes[i])
                {
                    assertEquals("Incorrect type for the " + positions[i] + " parameter in the " + expectedMethodIdentifier + " method.", parameterTypes[i].getSimpleName(), actualParameterTypes[i].getSimpleName());
                }
            }
        }
        
        if(modifiers != null && modifiers.length > 0) {
            for (String modifierName : modifiers) {
                if(modifierName.equals("public")) {
                    if(!Modifier.isPublic(match.getModifiers())) {
                        assertEquals("The method has an incorrect access modifier", "public", Modifier.toString(match.getModifiers()));
                    }
                }
                else if(modifierName.equals("private")) {
                    if(!Modifier.isPrivate(match.getModifiers())) {
                        assertEquals("The method has an incorrect access modifier", "private", Modifier.toString(match.getModifiers()));                     
                    }
                }
                else if(modifierName.equals("protected")) {
                    if(!Modifier.isProtected(match.getModifiers())) {
                        assertEquals("The method has an incorrect access modifier", "protected", Modifier.toString(match.getModifiers()));                     
                    }
                }
                else if(modifierName.equals("(no modifier)")) {
                    if(Modifier.isPrivate(match.getModifiers()) || Modifier.isPublic(match.getModifiers()) || Modifier.isProtected(match.getModifiers())) {
                        assertEquals("The method has an incorrect access modifier", "(no modifier)", Modifier.toString(match.getModifiers()));                     
                    }
                }
                
                else if(modifierName.equals("static")) {
                    if(!Modifier.isStatic(match.getModifiers())) {
                        assertEquals("The method has an incorrect access modifier", "static", Modifier.toString(match.getModifiers()));     
                    }
                }
                else if(modifierName.equals("non-static")) {
                    if(Modifier.isStatic(match.getModifiers())) {
                        assertEquals("The method has an incorrect access modifier", "non-static", "static");
                    }
                }
            }
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
        Field nameField = fieldMatcher.getFieldByDescription("name");
        Field miceCaughtField = fieldMatcher.getFieldByDescription("miceCaught");
        Field secretPlotField = fieldMatcher.getFieldByDescription("secretPlot");
        
        if(nameField == null) {
            fail("Could not find a field for the name of the Cat. Your identifier may not be meaningful.");
        }
        if(miceCaughtField == null) {
            fail("Could not find a field for the number of mice caught by the Cat. Your identifier my not be meaningful.");
        }
        if(secretPlotField == null) {
            fail("Could not find a field for whether or not the Cat is secretely plotting to kill you. Your identifier may not be meaningful");
        }
    }
    
    @Test
    public void testInstanceVariables_CorrectTypes()
    {
        testInstanceVariables_GoodIdentifiers();
        
        Field nameField = fieldMatcher.getFieldByDescription("name");
        Field miceCaughtField = fieldMatcher.getFieldByDescription("miceCaught");
        Field secretPlotField = fieldMatcher.getFieldByDescription("secretPlot");
        
        assertEquals(nameField.getName() + " is the wrong type.", "String", nameField.getType().getSimpleName());
        assertEquals(miceCaughtField.getName() + " is the wrong type.", "int", miceCaughtField.getType().getSimpleName());
        assertEquals(secretPlotField.getName() + " is the wrong type.", "boolean", secretPlotField.getType().getSimpleName());
    }
    
    @Test
    public void testAccessorMethods_GoodIdentifiers()
    {
        Field nameField = fieldMatcher.getFieldByDescription("name");
        Field miceCaughtField = fieldMatcher.getFieldByDescription("miceCaught");
        Field secretPlotField = fieldMatcher.getFieldByDescription("secretPlot");
        
        if(nameField != null) {
            testMethodHeader(nameField, "get", null, null, null);
        }
        else {
            fail("Could not find an instance variable for the Cat's name. Your identifier may not be meaningful.");
        }
        if(miceCaughtField != null) {
            testMethodHeader(miceCaughtField, "get", null, null, null);
        }
        else {
            fail("Could not find an instance variable for the number of mice caught by the Cat. Your identifier may not be meaningful.");
        }
        if(secretPlotField != null) {
            testMethodHeader(secretPlotField, "get", null, null, null);
        }
        else {
            fail("Could not find an instance variable for whether or not the Cat is secretly plotting to kill you. Your identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testMutatorMethod_GoodIdentifier()
    {
        Field nameField = fieldMatcher.getFieldByDescription("name");
        Field miceCaughtField = fieldMatcher.getFieldByDescription("miceCaught");
        Field secretPlotField = fieldMatcher.getFieldByDescription("secretPlot");
        
        if(nameField != null) {
            testMethodHeader(nameField, "set", null, null, null);
        }
        else {
            fail("Could not find an accessor method for the Cat's name. Your identifier may not follow Java style conventions");
        }
        if(miceCaughtField != null) {
            testMethodHeader(miceCaughtField, "set", null, null, null);
        }
        else {
            fail("Could not find an accessor method for the number of mice caught by the Cat. Your identifier may not follow Java style conventions");
        }
        if(secretPlotField != null) {
            testMethodHeader(secretPlotField, "set", null, null, null);
        }
        else {
            fail("Could not find an accessor method for whether or not the Cat is secretly plotting to kill you. Your identifier may not follow Java style conventions");
        }
    }
    
    @Test
    public void testMethods_CorrectAccessModifier()
    {
        testAccessorMethods_GoodIdentifiers();
        testMutatorMethod_GoodIdentifier();
        
        Field nameField = fieldMatcher.getFieldByDescription("name");
        Field miceCaughtField = fieldMatcher.getFieldByDescription("miceCaught");
        Field secretPlotField = fieldMatcher.getFieldByDescription("secretPlot");
        
        testMethodHeader(nameField, "get", null, null, new String[] {"public"});
        testMethodHeader(miceCaughtField, "get", null, null, new String[] {"public"});
        testMethodHeader(secretPlotField, "get", null, null, new String[] {"public"});
        testMethodHeader(nameField, "set", null, null, new String[] {"public"});
        testMethodHeader(miceCaughtField, "set", null, null, new String[] {"public"});
        testMethodHeader(secretPlotField, "set", null, null, new String[] {"public"});
    }
    
    @Test
    public void testMethods_CorrectReturnTypes() 
    {
        testAccessorMethods_GoodIdentifiers();
        testMutatorMethod_GoodIdentifier();
        
        Field nameField = fieldMatcher.getFieldByDescription("name");
        Field miceCaughtField = fieldMatcher.getFieldByDescription("miceCaught");
        Field secretPlotField = fieldMatcher.getFieldByDescription("secretPlot");
        
        testMethodHeader(nameField, "get", "String", null, null);
        testMethodHeader(miceCaughtField, "get", "int", null, null);
        testMethodHeader(secretPlotField, "get", "boolean", null, null);
        testMethodHeader(nameField, "set", "void", null, null);
        testMethodHeader(miceCaughtField, "set", "void", null, null);
        testMethodHeader(secretPlotField, "set", "void", null, null);
    }
    
    @Test
    public void testMethods_CorrectParameters() 
    {
        testAccessorMethods_GoodIdentifiers();
        testMutatorMethod_GoodIdentifier();
        
        Field nameField = fieldMatcher.getFieldByDescription("name");
        Field miceCaughtField = fieldMatcher.getFieldByDescription("miceCaught");
        Field secretPlotField = fieldMatcher.getFieldByDescription("secretPlot");
        
        testMethodHeader(nameField, "get", null, new Class<?>[] {}, null);
        testMethodHeader(miceCaughtField, "get", null, new Class<?>[] {}, null);
        testMethodHeader(secretPlotField, "get", null, new Class<?>[] {}, null);
        testMethodHeader(nameField, "set", null, new Class<?>[] {String.class}, null);
        testMethodHeader(miceCaughtField, "set", null, new Class<?>[] {int.class}, null);
        testMethodHeader(secretPlotField, "set", null, new Class<?>[] {boolean.class}, null);
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
        
        boolean bool = false; 
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
                    else if(cn.equals("boolean"))
                    {
                        bool = true; 
                    }
                }
            }
        }
        
        if(!match)
        {
            fail("Could not find a constructor with 3 parameters.");
        }
        
        if(!bool)
        {
            fail("Constructor did not have a boolean parameter.");
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
        String fieldForMiceCaught = "";
        Field correct = null; 
        
        for(Field f : instanceVars)
        {
            if(f.getName().toLowerCase().contains("mice"))
            {
                fieldForMiceCaught = f.getName(); 
                correct = f; 
            }
        }
        
        if (fieldForMiceCaught.isEmpty())
        {
            fail("Could not find instance variable storing number of mice caught. May be due to bad name.");
        }
        
        if(correct != null)
        {
            correct.setAccessible(true);
            correct.setInt(testCat, 10);
        }
        else
        {
            fail("Could not find instance variable storing number of mice caught.");
            return; 
        }
        
        
        Method methodToCall = null; 
        
        for (Method m : methods)
        {
            if(m.getName().startsWith("set") && m.getName().toLowerCase().contains(fieldForMiceCaught.toLowerCase()))
            {
                methodToCall = m; 
                break;
            }
        }
        
        if(methodToCall == null)
        {
            fail("Could not find appropriate mutator method to return the number of mice caught.");
            return; // Remove warning for null pointer dereference
        }
        
        methodToCall.invoke(testCat, 5);
        
        try {
            int actual = correct.getInt(testCat);
        
            assertEquals("This test fails if the mutator method for setting the mice caught doesn't work.", 5, actual);
        }
        catch (IllegalAccessException | IllegalArgumentException e) {
            fail("This test fails if the mutator method for setting the mice caught doesn't work. Your method probably has the wrong parameter type.");
        }
    }
    
    @Test
    public void testToStringMethod() throws Exception
    {
        for(Field f : instanceVars)
        {
            f.setAccessible(true);
        }
        
        Field fieldForName = null; 
        Field fieldForMiceCaught = null;
        Field fieldForSecretPlot = null; 
        
        for(Field f : instanceVars)
        {
            if(f.getName().toLowerCase().contains("name"))
            {
                fieldForName = f; 
            }
            else if(f.getName().toLowerCase().contains("mice") && f.getName().toLowerCase().contains("caught"))
            {
                fieldForMiceCaught = f; 
            }
            else if(f.getName().toLowerCase().contains("secret") && f.getName().toLowerCase().contains("plot"))
            {
                fieldForSecretPlot = f; 
            }
        }
        
        if(fieldForName == null)
        {
            fail("Could not find a suitable instance variable for the name of the Cat.");
        }
        else
        {
            fieldForName.set(testCat, "Mr. Whiskers");
        }
        
        if(fieldForMiceCaught == null)
        {
            fail("Could not find a suitable instance variable for number of mice caught by the Cat.");
        }
        else
        {
            fieldForMiceCaught.set(testCat, 5);
        }
        
        if(fieldForSecretPlot == null)
        {
            fail("Could not find a suitable instance variable for the whether or not the Cat is secretly plotting to kill you.");
        }
        else
        {
            fieldForSecretPlot.set(testCat, true);
        }
        
        String out = testCat.toString();
        
        System.out.println("toString output: " + out);
        
        if(!out.toLowerCase().contains("mr. whiskers"))
        {
            fail("Correct name is not being output in toString method.");
        }
        if(!out.toLowerCase().contains("5"))
        {
            fail("Correct number of mice caught is not being output in toString method.");
        }
        if(!out.toLowerCase().contains("true"))
        {
            fail("Correct value of whether or not the Cat is secretly plotting to kill you is not being output.");
        }
    }
    
}
