/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.awt.Component;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 *
 * @author araderma
 */
public class FieldMatcher
{
    private String[]              descriptions; 
    private IdentifierPattern[]   identifierPatterns; 
    private String[]              expectedTypes;
    private Field[]               matchedFields; 

    public FieldMatcher(int numberOfFields)
    {
        descriptions        = new String[numberOfFields];
        identifierPatterns  = new IdentifierPattern[numberOfFields];
        expectedTypes       = new String[numberOfFields];
        matchedFields       = new Field[numberOfFields];
    }

    public void setValues(int fieldNumber, String description, String expectedType, IdentifierPattern identifierPattern)
    {
        descriptions[fieldNumber] = description; 
        expectedTypes[fieldNumber] = expectedType;
        identifierPatterns[fieldNumber] = identifierPattern;             
    }

    public void findMatches(Field[] fields)
    {
        for(int i = 0; i < matchedFields.length; i++)
        {
            for(Field field : fields)
            {
                // Format the type by stripping out the package
                String formattedType = field.getType().toString().substring(field.getType().toString().lastIndexOf(".") + 1);

                // Check if the field type is correct
                if(formattedType.equals(expectedTypes[i]))
                {
                    // Check if the field identifier matches the pattern
                    if(identifierPatterns[i].testIdentifierForMatch(field))
                    {
                        matchedFields[i] = field; 
                        
                    }
                }
            }
        }
    }

    public Field getFieldByDescription(String description)
    {
        for(int i = 0; i < descriptions.length; i++)
        {
            if(description.equals(descriptions[i]))
            {
                return matchedFields[i]; 
            }
        }

        return null; 
    }

    public String[] getUnmatchedFieldDescriptions()
    {
        ArrayList<String> unmatched = new ArrayList(); 

        // Look for any unmatched field and add its description to the list
        for(int i = 0; i < matchedFields.length; i++)
        {
            if(matchedFields[i] == null)
            {
                unmatched.add(descriptions[i]);
            }
        }

        return (String[]) unmatched.toArray();
    }



}
