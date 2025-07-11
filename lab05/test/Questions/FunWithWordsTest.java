/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;


import java.lang.reflect.Field;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class FunWithWordsTest extends TestGUIHelper
{
    
    @BeforeClass
    public static void setUpClass() throws InstantiationException, IllegalAccessException
    {
        getMembers(FunWithWords.class);
        
        fieldMatcher = new FieldMatcher(16); 
        
        fieldMatcher.setValues(0, "Verb1Label", "JLabel", new IdentifierPattern(new String[][] {{"verb"}, {"one", "first", "1st", "1"},{"label"}},1,0,1));
        fieldMatcher.setValues(1, "Noun1Label", "JLabel", new IdentifierPattern(new String[][] {{"noun"}, {"one", "first", "1st", "1"},{"label"}},1,1,1));
        fieldMatcher.setValues(2, "Adverb1Label", "JLabel", new IdentifierPattern(new String[][] {{"adverb"}, {"one", "first", "1st", "1"},{"label"}},1,0,1));
        fieldMatcher.setValues(3, "Preposition1Label", "JLabel", new IdentifierPattern(new String[][] {{"preposition"}, {"one", "first", "1st", "1"},{"label"}},1,0,1));
        fieldMatcher.setValues(4, "Noun2Label", "JLabel", new IdentifierPattern(new String[][] {{"noun"}, {"two", "second", "2nd", "2"},{"label"}},1,1,1));
        fieldMatcher.setValues(5, "Noun3Label", "JLabel", new IdentifierPattern(new String[][] {{"noun"}, {"three", "third", "3rd", "3"},{"label"}},1,1,1));
        fieldMatcher.setValues(6, "Noun4Label", "JLabel", new IdentifierPattern(new String[][] {{"noun"}, {"four", "forth", "4th", "4"},{"label"}},1,1,1));
        fieldMatcher.setValues(7, "Verb1TextField", "JTextField", new IdentifierPattern(new String[][] {{"verb"}, {"one", "first", "1st", "1"},{"textfield"}},1,0,1));
        fieldMatcher.setValues(8, "Noun1TextField", "JTextField", new IdentifierPattern(new String[][] {{"noun"}, {"one", "first", "1st", "1"},{"textfield"}},1,1,1));
        fieldMatcher.setValues(9, "Adverb1TextField", "JTextField", new IdentifierPattern(new String[][] {{"adverb"}, {"one", "first", "1st", "1"},{"textfield"}},1,0,1));
        fieldMatcher.setValues(10, "Preposition1TextField", "JTextField", new IdentifierPattern(new String[][] {{"preposition"}, {"one", "first", "1st", "1"},{"textfield"}},1,0,1));
        fieldMatcher.setValues(11, "Noun2TextField", "JTextField", new IdentifierPattern(new String[][] {{"noun"}, {"two", "second", "2nd", "2"},{"textfield"}},1,1,1));
        fieldMatcher.setValues(12, "Noun3TextField", "JTextField", new IdentifierPattern(new String[][] {{"noun"}, {"three", "third", "3rd", "3"},{"textfield"}},1,1,1));
        fieldMatcher.setValues(13, "Noun4TextField", "JTextField", new IdentifierPattern(new String[][] {{"noun"}, {"four", "forth", "4th", "4"},{"textfield"}},1,1,1));
        fieldMatcher.setValues(14, "OutputTextArea", "JTextArea", new IdentifierPattern(new String[][] {{"output", "display", "rhyme", "poem"},{"textarea"}},1,1));
        fieldMatcher.setValues(15, "SubmitButton", "JButton", new IdentifierPattern(new String[][] {{"submit","build","make","do"},{"button"}},1,1));

        fieldMatcher.findMatches(instanceVars);
    }
    
    @Test
    public void test_Verb1Label_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_Noun1Label_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_Adverb1Label_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_Preposition1Label_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_Noun2Label_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_Noun3Label_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_Noun4Label_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    
    @Test
    public void test_Verb1TextField_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_Noun1TextField_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_Adverb1TextField_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_Preposition1TextField_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_Noun2TextField_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_Noun3TextField_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_Noun4TextField_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    
    @Test
    public void test_SubmitButton_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void test_OutputTextArea_ComponentExists()
    {
        String fieldName = harvestMethodName();
        Field f = fieldMatcher.getFieldByDescription(fieldName); 
        
        if(f == null)
        {
            fail("Could not find an instance variable for the " + fieldName + ". Identifier may not be meaningful.");
        }
    }
    
    @Test
    public void testOutputsRhymeCorrectly() throws Exception
    {
        setComponentText("Verb1TextField", "row");
        setComponentText("Noun1TextField", "boat");
        setComponentText("Adverb1TextField", "gently");
        setComponentText("Preposition1TextField", "down");
        setComponentText("Noun2TextField", "stream");
        setComponentText("Noun3TextField", "life");
        setComponentText("Noun4TextField", "dream");
        

        
        pushButton("SubmitButton");
        
        String result = getComponentText("OutputTextArea");
        
        if(!result.contains("row"))
        {
            fail("Could not find verb1 in the output");
        }
        if(!result.contains("boat"))
        {
            fail("Could not find noun1 in the output");
        }
        if(!result.contains("gently"))
        {
            fail("Could not find adverb1 in the output");
        }
        if(!result.contains("down"))
        {
            fail("Could not find preposition1 in the output");
        }
        if(!result.contains("stream"))
        {
            fail("Could not find noun2 in the output");
        }
        if(!result.contains("life"))
        {
            fail("Could not find noun3 in the output");
        }
        if(!result.contains("dream"))
        {
            fail("Could not find noun4 in the output");
        }
    }

}
