/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static org.junit.Assert.fail;
import org.junit.BeforeClass;

/**
 *
 * @author araderma
 */
public class TestGUIHelper
{
    protected static JFrame testGUI;
    
    protected static Field[] instanceVars; 
    protected static Method[] methods;
    protected static FieldMatcher fieldMatcher;
    

    public static void getMembers(Class clazz) throws InstantiationException, IllegalAccessException 
    {
        testGUI = (JFrame) clazz.newInstance();
        
        instanceVars = testGUI.getClass().getDeclaredFields();
        methods = testGUI.getClass().getDeclaredMethods();
        
        outputInformation();
        
    }
    
    protected static void outputInformation()
    {
        System.out.println(testGUI.getClass().getName());
        System.out.println("Instance Variables:");
        for(Field f : instanceVars)
        {
            f.setAccessible(true);
            System.out.print("  Identifier: " + f.getName() + "; ");
            System.out.print("Access Modifier: " + Modifier.toString(f.getModifiers()) + "; ");
            System.out.print("Type: " + getSimpleName(f.getType()) + "\n");
            
        }
        
        System.out.println("Methods:");
        for(Method m : methods)
        {
            if(m.getName().contains("$"))
            {
                continue;
            }
            
             System.out.print("  Identifier: " + m.getName() + "; ");
             System.out.print("Access Modifier: " + Modifier.toString(m.getModifiers()) + "; ");
             System.out.print("Return Type: " + getSimpleName(m.getReturnType()) + "; ");
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
        
    protected static String getSimpleName(Class<?> c)
    {
        // Find the location of the last '.' which is the end of the package
        int lastDot = c.getCanonicalName().lastIndexOf(".");
        
        // Get substring starting immediately after the package
        return c.getCanonicalName().substring(lastDot + 1);
    }
    
    protected static String harvestMethodName()
    {
        String callingMethod = TestInputHelper.getTestName(3);
        int start = callingMethod.indexOf("_") + 1;
        int end = callingMethod.lastIndexOf("_");
        
        return callingMethod.substring(start, end);
    }
    
    protected void pushButton(String fieldMatchName) throws IllegalArgumentException, IllegalAccessException
    {
        Field theField = fieldMatcher.getFieldByDescription(fieldMatchName);
        
        theField.setAccessible(true);
            
        JButton guessButton = (JButton) theField.get(testGUI);

        ActionListener[] listeners = guessButton.getActionListeners(); 

        if(listeners.length < 1)
        {
            fail("Couldn't find action listener for the guess button!");
        }

        listeners[0].actionPerformed(null);
    }
    
    protected void setComponentText(String fieldMatchName, String value) throws IllegalArgumentException, IllegalAccessException
    {
        Field f = fieldMatcher.getFieldByDescription(fieldMatchName);
         
         f.setAccessible(true);
         
         Class<?> type = f.getType(); 
         
         if(type.equals(JLabel.class))
         {
             setJLabelText(f, value);
         }
         else if(type.equals(JTextField.class))
         {
             setJTextFieldText(f, value);
         }
         else if(type.equals(JTextArea.class))
         {
             setJTextAreaText(f, value);
         }
         else
         {
             throw new IllegalArgumentException("Component does not exit"); 
         }
    }
    
    protected String getComponentText(String fieldMatchName) throws IllegalArgumentException, IllegalAccessException
    {
         Field f = fieldMatcher.getFieldByDescription(fieldMatchName);
         
         f.setAccessible(true);
         
         Class<?> type = f.getType(); 
         
         if(type.equals(JLabel.class))
         {
             return getJLabelText(f);
         }
         else if(type.equals(JTextField.class))
         {
             return getJTextFieldText(f);
         }
         else if(type.equals(JTextArea.class))
         {
             return getJTextAreaText(f);
         }
         else
         {
             throw new IllegalArgumentException("Component does not exit"); 
         }
    }
    
    private String getJLabelText(Field f) throws IllegalArgumentException, IllegalAccessException
    {
        JLabel theLabel = (JLabel)f.get(testGUI);
        return theLabel.getText();
    }
    
    private String getJTextFieldText(Field f) throws IllegalArgumentException, IllegalAccessException
    {
        JTextField theTextField = (JTextField)f.get(testGUI);
        return theTextField.getText();
    }
    
    private String getJTextAreaText(Field f) throws IllegalArgumentException, IllegalAccessException
    {
        JTextArea theTextArea = (JTextArea)f.get(testGUI);
        return theTextArea.getText();
    }
    
    private void setJLabelText(Field f, String text) throws IllegalArgumentException, IllegalAccessException
    {
        JLabel theLabel = (JLabel)f.get(testGUI);
        theLabel.setText(text);
    }
    
    private void setJTextFieldText(Field f, String text) throws IllegalArgumentException, IllegalAccessException
    {
        JTextField theTextField = (JTextField)f.get(testGUI);
        theTextField.setText(text);
    }
    
    private void setJTextAreaText(Field f, String text) throws IllegalArgumentException, IllegalAccessException
    {
        JTextArea theTextArea = (JTextArea)f.get(testGUI);
        theTextArea.setText(text);
    }
}
