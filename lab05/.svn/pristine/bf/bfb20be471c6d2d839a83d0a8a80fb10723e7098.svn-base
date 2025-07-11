/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class SimpleGUITest
{
    static SimpleGUI testGUI;
    
    static Field[] instanceVars; 
    static Method[] methods;
    
    static FieldMatcher fieldMatcher; 
    
    @BeforeClass
    public static void setUpClass() 
    {
        testGUI = new SimpleGUI();
        
        instanceVars = testGUI.getClass().getDeclaredFields();
        methods = testGUI.getClass().getDeclaredMethods();
        
        outputInformation();
        
        fieldMatcher = new FieldMatcher(14); 
        
        fieldMatcher.setValues(0, "Name Label", "JLabel", new IdentifierPattern(new String[][] {{"name"},{"label"}},1,1));
        fieldMatcher.setValues(1, "Address Line 1 Label", "JLabel", new IdentifierPattern(new String[][] {{"address", "addr", "line"}, {"1", "first", "one"}, {"label"}}, 1,1,1));
        fieldMatcher.setValues(2, "Address Line 2 Label", "JLabel", new IdentifierPattern(new String[][] {{"address", "addr", "line"}, {"2", "second", "two"}, {"label"}}, 1,1,1));
        fieldMatcher.setValues(3, "City Label", "JLabel", new IdentifierPattern(new String[][] {{"city"},{"label"}},1,1));
        fieldMatcher.setValues(4, "State Label", "JLabel", new IdentifierPattern(new String[][] {{"state"},{"label"}},1,1));
        fieldMatcher.setValues(5, "ZIP Code Label", "JLabel", new IdentifierPattern(new String[][] {{"zip", "zc"},{"label"}},1,1));
        fieldMatcher.setValues(6, "Name TextField", "JTextField", new IdentifierPattern(new String[][] {{"name"},{"textfield"}},1,1));
        fieldMatcher.setValues(7, "Address Line 1 TextField", "JTextField", new IdentifierPattern(new String[][] {{"address", "addr", "line"}, {"1", "first", "one"}, {"textfield"}}, 1,1,1));
        fieldMatcher.setValues(8, "Address Line 2 TextField", "JTextField", new IdentifierPattern(new String[][] {{"address", "addr", "line"}, {"2", "second", "two"}, {"textfield"}}, 1,1,1));
        fieldMatcher.setValues(9, "City TextField", "JTextField", new IdentifierPattern(new String[][] {{"city"},{"textfield"}},1,1));
        fieldMatcher.setValues(10, "State TextField", "JTextField", new IdentifierPattern(new String[][] {{"state"},{"textfield"}},1,1));
        fieldMatcher.setValues(11, "ZIP Code TextField", "JTextField", new IdentifierPattern(new String[][] {{"zip", "zc"},{"textfield"}},1,1));
        fieldMatcher.setValues(12, "Clear Button", "JButton", new IdentifierPattern(new String[][] {{"clear"},{"button"}},1,1));
        fieldMatcher.setValues(13, "Submit Button", "JButton", new IdentifierPattern(new String[][] {{"submit"},{"button"}},1,1));
        
        
        fieldMatcher.findMatches(instanceVars);
    }
    
    public static void outputInformation()
    {
        System.out.println("Instance Variables:");
        for(Field f : instanceVars)
        {
            System.out.print("  Identifier: " + f.getName() + "; ");
            System.out.print("Access Modifier: " + Modifier.toString(f.getModifiers()) + "; ");
            System.out.print("Type: " + f.getType().getCanonicalName().substring(f.getType().getCanonicalName().lastIndexOf(".") + 1) + "\n");
            
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
    public void testNameLabelPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Name Label"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Name Label. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testAddressLine1LabelPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Address Line 1 Label"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Address Line 1 Label. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testAddressLine2LabelPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Address Line 2 Label"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Address Line 2 Label. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testCityLabelPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("City Label"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the City Label. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testStateLabelPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("State Label"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the State Label. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testZipCodeLabelPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("ZIP Code Label"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the ZIP Code Label. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testNameTextFieldPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Name TextField"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Name Text Field. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testAddressLine1TextFieldPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Address Line 1 TextField"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Address Line 1 Text Field. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testAddressLine2TextFieldPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Address Line 2 TextField"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Address Line 2 Text Field. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testCityTextFieldPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("City TextField"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the City Text Field. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testStateTextFieldPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("State TextField"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the State Text Field. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testZipCodeTextFieldPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("ZIP Code TextField"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the ZIP Code Text Field. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testClearButtonPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Clear Button"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Clear Button. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testSubmitButtonPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Submit Button"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Submit Button. Identifier may not be meaningful.");
        }
    }
    
    
    
}
