/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import static Questions.SimpleGUITest.fieldMatcher;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.NumberFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class TipCalculatorTest
{
    
    static TipCalculator testGUI;
    
    static Field[] instanceVars; 
    static Method[] methods;
    
    static FieldMatcher fieldMatcher; 
    
    @BeforeClass
    public static void setUpClass() 
    {
        testGUI = new TipCalculator();
        
        instanceVars = testGUI.getClass().getDeclaredFields();
        methods = testGUI.getClass().getDeclaredMethods();
        
        outputInformation();
        
        fieldMatcher = new FieldMatcher(7); 
        
        fieldMatcher.setValues(0, "Bill Display Label", "JLabel", new IdentifierPattern(new String[][] {{"bill", "cost", "total", "display"},{"label"}},2,1));
        fieldMatcher.setValues(1, "Tip Display Label", "JLabel", new IdentifierPattern(new String[][] {{"tip", "display"}, {"label"}}, 2,1));
        fieldMatcher.setValues(2, "10% Tip Button", "JButton", new IdentifierPattern(new String[][] {{"tip"}, {"10", "ten"}, {"button"}}, 1,1,1));
        fieldMatcher.setValues(3, "15% Tip Button", "JButton", new IdentifierPattern(new String[][] {{"tip"}, {"15", "fifteen"}, {"button"}}, 1,1,1));
        fieldMatcher.setValues(4, "20% Tip Button", "JButton", new IdentifierPattern(new String[][] {{"tip"}, {"20", "twenty"}, {"button"}}, 1,1,1));
        fieldMatcher.setValues(5, "Tip Amount Label", "JLabel", new IdentifierPattern(new String[][] {{"tipa", "amount"},{"label"}},2,1));
        fieldMatcher.setValues(6, "Bill Text Field", "JTextField", new IdentifierPattern(new String[][] {{"bill", "cost"},{"textfield"}},1,1));
        

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
    public void testBillDisplayLabelPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Bill Display Label"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Bill Display Label. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testTipDisplayLabelPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Tip Display Label"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Tip Display Label. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test10PercentTipButtonPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("10% Tip Button"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the 10% Tip Button. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test15PercentTipButtonPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("15% Tip Button"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the 15% Tip Button. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test20PercentTipButtonPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("20% Tip Button"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the 20% Tip Button. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testTipAmountLabelPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Tip Amount Label"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Tip Amount Label. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testBillTextFieldPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Bill Text Field"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Bill Text Field. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test10PercentTipButtonFunctions()
    {
        // Get the 3 fields that we'll need to use
        Field button = fieldMatcher.getFieldByDescription("10% Tip Button"); 
        Field textField = fieldMatcher.getFieldByDescription("Bill Text Field");
        Field label = fieldMatcher.getFieldByDescription("Tip Amount Label");
        
        // Make sure we found a match for all of them otherwise fail. 
        // Also set them to be accessible as they should be private by default
        if(button == null)
        {
            fail("Could not find an instance variable for the 10% Tip Button. Identifier may not be meaningful.");
        }
        else
        {
            button.setAccessible(true);
        }
        
        if(textField == null)
        {
            fail("Could not find an instance variable for the Bill Text Field. Identifier may not be meaningful.");
        }
        else
        {
            textField.setAccessible(true);
        }
        
        if(label == null)
        {
            fail("Could not find an instance variable for the Tip Amount Label. Identifier may not be meaningful.");
        }
        else
        {
            label.setAccessible(true);
        }
        
        try 
        {
            // Get the instance values
            JButton tipButton = (JButton) button.get(testGUI);
            JTextField billField = (JTextField) textField.get(testGUI); 
            JLabel tipAmountLabel = (JLabel) label.get(testGUI); 
            
            // Generate a random value to use for testing
            Random rand = new Random(); 
            int input = rand.nextInt(101) + 100; 
            
            // Put that value in the text field
            billField.setText(String.valueOf(input));
            
            // Pre-calculate expected result
            String expected = NumberFormat.getCurrencyInstance().format(input * .10); 
            
            // Check to see if the button has an ActionListerer set up and then invoke it
            ActionListener[] listeners = (ActionListener[])tipButton.getListeners(ActionListener.class);
            
            if(listeners.length < 1)
            {
                fail("Could not find an action listener for the 10% Tip Button.");
            }
            
            listeners[0].actionPerformed(null);
            
            String actual = tipAmountLabel.getText();
            
            assertEquals("10% tip button procued incorrect result", expected, actual);
        } 
        catch (IllegalArgumentException | IllegalAccessException ex)
        {
            fail(ex.toString());
        }
    }
    
    @Test
    public void test15PercentTipButtonFunctions()
    {
        Field button = fieldMatcher.getFieldByDescription("15% Tip Button"); 
        Field textField = fieldMatcher.getFieldByDescription("Bill Text Field");
        Field label = fieldMatcher.getFieldByDescription("Tip Amount Label");
        
        if(button == null)
        {
            fail("Could not find an instance variable for the 15% Tip Button. Identifier may not be meaningful.");
        }
        else
        {
            button.setAccessible(true);
        }
        
        if(textField == null)
        {
            fail("Could not find an instance variable for the Bill Text Field. Identifier may not be meaningful.");
        }
        else
        {
            textField.setAccessible(true);
        }
        
        if(label == null)
        {
            fail("Could not find an instance variable for the Tip Amount Label. Identifier may not be meaningful.");
        }
        else
        {
            label.setAccessible(true);
        }
        
        try 
        {
            JButton tipButton = (JButton) button.get(testGUI);
            JTextField billField = (JTextField) textField.get(testGUI); 
            JLabel tipAmountLabel = (JLabel) label.get(testGUI); 
                        
            Random rand = new Random(); 
            
            int input = rand.nextInt(101) + 100; 
            
            billField.setText(String.valueOf(input));
            
            String expected = NumberFormat.getCurrencyInstance().format(input * .15); 
            
            ActionListener[] listeners = (ActionListener[])tipButton.getListeners(ActionListener.class);
            
            if(listeners.length < 1)
            {
                fail("Could not find an action listener for the 15% Tip Button.");
            }
            
            listeners[0].actionPerformed(null);
            
            String actual = tipAmountLabel.getText();
            
            assertEquals("15% tip button procued incorrect result", expected, actual);
        } 
        catch (IllegalArgumentException | IllegalAccessException ex)
        {
            fail(ex.toString());
        }
    }
    
    @Test
    public void test20PercentTipButtonFunctions()
    {
        Field button = fieldMatcher.getFieldByDescription("20% Tip Button"); 
        Field textField = fieldMatcher.getFieldByDescription("Bill Text Field");
        Field label = fieldMatcher.getFieldByDescription("Tip Amount Label");
        
        if(button == null)
        {
            fail("Could not find an instance variable for the 20% Tip Button. Identifier may not be meaningful.");
        }
        else
        {
            button.setAccessible(true);
        }
        
        if(textField == null)
        {
            fail("Could not find an instance variable for the Bill Text Field. Identifier may not be meaningful.");
        }
        else
        {
            textField.setAccessible(true);
        }
        
        if(label == null)
        {
            fail("Could not find an instance variable for the Tip Amount Label. Identifier may not be meaningful.");
        }
        else
        {
            label.setAccessible(true);
        }
        
        try 
        {
            JButton tipButton = (JButton) button.get(testGUI);
            JTextField billField = (JTextField) textField.get(testGUI); 
            JLabel tipAmountLabel = (JLabel) label.get(testGUI); 
                        
            Random rand = new Random(); 
            
            int input = rand.nextInt(101) + 100; 
            
            billField.setText(String.valueOf(input));
            
            String expected = NumberFormat.getCurrencyInstance().format(input * .20); 
            
            ActionListener[] listeners = (ActionListener[])tipButton.getListeners(ActionListener.class);
            
            if(listeners.length < 1)
            {
                fail("Could not find an action listener for the 20% Tip Button.");
            }
            
            listeners[0].actionPerformed(null);
            
            String actual = tipAmountLabel.getText();
            
            assertEquals("20% tip button procued incorrect result", expected, actual);
        } 
        catch (IllegalArgumentException | IllegalAccessException ex)
        {
            fail(ex.toString());
        }
    }
    
}
