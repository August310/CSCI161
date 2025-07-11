/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
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
public class NumberGuessTest
{
    
    static NumberGuess testGUI;
    
    static Field[] instanceVars; 
    static Method[] methods;
    
    static FieldMatcher fieldMatcher; 
    
    @BeforeClass
    public static void setUpClass() 
    {
        testGUI = new NumberGuess();
        
        instanceVars = testGUI.getClass().getDeclaredFields();
        methods = testGUI.getClass().getDeclaredMethods();
        
        outputInformation();
        
        fieldMatcher = new FieldMatcher(5); 
        
        fieldMatcher.setValues(0, "Instructions Label", "JLabel", new IdentifierPattern(new String[][] {{"instruction", "description", "how"},{"label"}},1,1));
        fieldMatcher.setValues(1, "Result Label", "JLabel", new IdentifierPattern(new String[][] {{"result", "output", "guess"}, {"label"}}, 1,1));
        fieldMatcher.setValues(2, "Guess Button", "JButton", new IdentifierPattern(new String[][] {{"guess", "check"}, {"button"}}, 1,1));
        fieldMatcher.setValues(3, "New Game Button", "JButton", new IdentifierPattern(new String[][] {{"new", "game", "restart", "again"}, {"button"}}, 1,1));
        fieldMatcher.setValues(4, "Guess Text Field", "JTextField", new IdentifierPattern(new String[][] {{"guess", "input", "entry", "value", "outcome", "check"},{"textfield"}},1,1));
        

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
    public void testInstructionsLabelPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Instructions Label"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Instructions Label. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testResultLabelPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Result Label"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Result Label. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testGuessButtonPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Guess Button"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Guess Button. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testNewGameButtonPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("New Game Button"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the New Game Button. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testGuessTextFieldPresent()
    {
        Field f = fieldMatcher.getFieldByDescription("Guess Text Field"); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the Guess Text Field. Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testGameIsWinnable() throws IllegalArgumentException, IllegalAccessException
    {
        boolean flag = false;
 
        for(int i = 1; i <= 100; i++)
        {
            Field theField = fieldMatcher.getFieldByDescription("Guess Text Field");
            
            if(theField == null)
            {
                fail("Could not find an instance variable for the Guess Text Field. Identifier may not be meaningful.");
            }
            
            JTextField guessTextField = (JTextField) theField.get(testGUI); 
            
            guessTextField.setText("" + i);
            
            theField = fieldMatcher.getFieldByDescription("Guess Button");
            
            JButton guessButton = (JButton) theField.get(testGUI);
            
            ActionListener[] listeners = guessButton.getActionListeners(); 
            
            if(listeners.length < 1)
            {
                fail("Couldn't find action listener for the guess button!");
            }
            
            listeners[0].actionPerformed(null);
            
            theField = fieldMatcher.getFieldByDescription("Result Label");
            
            if(theField == null)
            {
                fail("Could not find an instance variable for the Result Label. Identifier may not be meaningful.");
            }
            
            JLabel resultLabel = (JLabel)theField.get(testGUI);
            
            String result = resultLabel.getText();
            
            if(result.toLowerCase().contains("correct"))
            {
                flag = true; 
            }
        }
        
        if(!flag)
        {
            fail("Could not win the game after trying all values.");
        } 
    }
    
    @Test
    public void testNewGameWorks() throws IllegalArgumentException, IllegalAccessException
    {
        boolean flag = false;
        
        int test = -1; 
 
        for(int i = 1; i <= 100; i++)
        {
            Field theField = fieldMatcher.getFieldByDescription("Guess Text Field");
            
            if(theField == null)
            {
                fail("Could not find an instance variable for the Guess Text Field. Identifier may not be meaningful.");
            }
            
            JTextField guessTextField = (JTextField) theField.get(testGUI); 
            
            guessTextField.setText("" + i);
            
            theField = fieldMatcher.getFieldByDescription("Guess Button");
            
            JButton guessButton = (JButton) theField.get(testGUI);
            
            ActionListener[] listeners = guessButton.getActionListeners(); 
            
            if(listeners.length < 1)
            {
                fail("Couldn't find action listener for the guess button!");
            }
            
            listeners[0].actionPerformed(null);
            
            theField = fieldMatcher.getFieldByDescription("Result Label");
            
            if(theField == null)
            {
                fail("Could not find an instance variable for the Result Label. Identifier may not be meaningful.");
            }
            
            JLabel resultLabel = (JLabel)theField.get(testGUI);
            
            String result = resultLabel.getText();
            
            if(result.toLowerCase().contains("correct"))
            {
                flag = true; 
                test = i; 
                break; 
            }
        }
        
        if(!flag)
        {
            fail("Could not win the game after trying all values.");
        } 
        
        flag = false; 
        
        for(int i = 0; i < 5; i++)
        {
            Field theField = fieldMatcher.getFieldByDescription("New Game Button");
            
            if(theField == null)
            {
                fail("Could not find an instance variable for the New Game Button. Identifier may not be meaningful.");
            }
            
            JButton newButton = (JButton)theField.get(testGUI);
            
            ActionListener[] listeners = newButton.getActionListeners(); 
            
            if(listeners.length < 1)
            {
                fail("Couldn't find action listener for the New Game Button!");
            }
            
            listeners[0].actionPerformed(null);
            
            theField = fieldMatcher.getFieldByDescription("Guess Text Field");
            
            if(theField == null)
            {
                fail("Could not find an instance variable for the Guess Text Field. Identifier may not be meaningful.");
            }
            
            JTextField guessTextField = (JTextField) theField.get(testGUI); 
            
            guessTextField.setText(test + "");
            
            theField = fieldMatcher.getFieldByDescription("Guess Button");
            
            JButton guessButton = (JButton) theField.get(testGUI);
            
            listeners = guessButton.getActionListeners(); 
            
            if(listeners.length < 1)
            {
                fail("Couldn't find action listener for the guess button!");
            }
            
            listeners[0].actionPerformed(null);
            
            theField = fieldMatcher.getFieldByDescription("Result Label");
            
            if(theField == null)
            {
                fail("Could not find an instance variable for the Result Label. Identifier may not be meaningful.");
            }
            
            JLabel resultLabel = (JLabel)theField.get(testGUI);
            
            String result = resultLabel.getText();
            
            if(!result.toLowerCase().contains("correct"))
            {
                flag = true; 
                break; 
            }
        }
        
        if(!flag)
        {
            fail("New Game Button does not appear to generate a new random number.");
        }
    }
    
    @Test
    public void testGuessingTooLowDisplaysProperly() throws IllegalArgumentException, IllegalAccessException
    {
        boolean flag = false;
        
        int test = -1; 
 
        for(int i = 1; i <= 100; i++)
        {
            Field theField = fieldMatcher.getFieldByDescription("Guess Text Field");
            
            if(theField == null)
            {
                fail("Could not find an instance variable for the Guess Text Field. Identifier may not be meaningful.");
            }
            
            JTextField guessTextField = (JTextField) theField.get(testGUI); 
            
            guessTextField.setText("" + i);
            
            theField = fieldMatcher.getFieldByDescription("Guess Button");
            
            JButton guessButton = (JButton) theField.get(testGUI);
            
            ActionListener[] listeners = guessButton.getActionListeners(); 
            
            if(listeners.length < 1)
            {
                fail("Couldn't find action listener for the guess button!");
            }
            
            listeners[0].actionPerformed(null);
            
            theField = fieldMatcher.getFieldByDescription("Result Label");
            
            if(theField == null)
            {
                fail("Could not find an instance variable for the Result Label. Identifier may not be meaningful.");
            }
            
            JLabel resultLabel = (JLabel)theField.get(testGUI);
            
            String result = resultLabel.getText();
            
            if(result.toLowerCase().contains("correct"))
            {
                flag = true; 
                test = i; 
                break; 
            }

        }
        
    Field theField = fieldMatcher.getFieldByDescription("Guess Text Field");

        if(theField == null)
        {
            fail("Could not find an instance variable for the Guess Text Field. Identifier may not be meaningful.");
        }

        JTextField guessTextField = (JTextField) theField.get(testGUI); 

        guessTextField.setText("" + (test - 1));

        theField = fieldMatcher.getFieldByDescription("Guess Button");

        JButton guessButton = (JButton) theField.get(testGUI);

        ActionListener[] listeners = guessButton.getActionListeners(); 

        if(listeners.length < 1)
        {
            fail("Couldn't find action listener for the guess button!");
        }

        listeners[0].actionPerformed(null);

        theField = fieldMatcher.getFieldByDescription("Result Label");

        if(theField == null)
        {
            fail("Could not find an instance variable for the Result Label. Identifier may not be meaningful.");
        }

        JLabel resultLabel = (JLabel)theField.get(testGUI);

        String result = resultLabel.getText();

        if(!result.toLowerCase().contains("too low"))
        {
            fail("Game does not correctly report when a guess is too low."); 
        }

    }
    
    @Test
    public void testGuessingTooHighDisplaysProperly() throws IllegalArgumentException, IllegalAccessException
    {
        boolean flag = false;
        
        int test = -1; 
 
        for(int i = 1; i <= 100; i++)
        {
            Field theField = fieldMatcher.getFieldByDescription("Guess Text Field");
            
            if(theField == null)
            {
                fail("Could not find an instance variable for the Guess Text Field. Identifier may not be meaningful.");
            }
            
            JTextField guessTextField = (JTextField) theField.get(testGUI); 
            
            guessTextField.setText("" + i);
            
            theField = fieldMatcher.getFieldByDescription("Guess Button");
            
            JButton guessButton = (JButton) theField.get(testGUI);
            
            ActionListener[] listeners = guessButton.getActionListeners(); 
            
            if(listeners.length < 1)
            {
                fail("Couldn't find action listener for the guess button!");
            }
            
            listeners[0].actionPerformed(null);
            
            theField = fieldMatcher.getFieldByDescription("Result Label");
            
            if(theField == null)
            {
                fail("Could not find an instance variable for the Result Label. Identifier may not be meaningful.");
            }
            
            JLabel resultLabel = (JLabel)theField.get(testGUI);
            
            String result = resultLabel.getText();
            
            if(result.toLowerCase().contains("correct"))
            {
                flag = true; 
                test = i; 
                break; 
            }

        }
        
    Field theField = fieldMatcher.getFieldByDescription("Guess Text Field");

        if(theField == null)
        {
            fail("Could not find an instance variable for the Guess Text Field. Identifier may not be meaningful.");
        }

        JTextField guessTextField = (JTextField) theField.get(testGUI); 

        guessTextField.setText("" + (test + 1));

        theField = fieldMatcher.getFieldByDescription("Guess Button");

        JButton guessButton = (JButton) theField.get(testGUI);

        ActionListener[] listeners = guessButton.getActionListeners(); 

        if(listeners.length < 1)
        {
            fail("Couldn't find action listener for the guess button!");
        }

        listeners[0].actionPerformed(null);

        theField = fieldMatcher.getFieldByDescription("Result Label");

        if(theField == null)
        {
            fail("Could not find an instance variable for the Result Label. Identifier may not be meaningful.");
        }

        JLabel resultLabel = (JLabel)theField.get(testGUI);

        String result = resultLabel.getText();

        if(!result.toLowerCase().contains("too high"))
        {
            fail("Game does not correctly report when a guess is too low."); 
        }

    }
}
