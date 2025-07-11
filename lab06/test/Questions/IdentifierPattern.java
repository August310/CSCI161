/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import java.lang.reflect.Field;
import java.util.InputMismatchException;

/**
 *
 * @author araderma
 */
public class IdentifierPattern
{
    String[][] patterns; 
    int[]      requiredMatches; 

    public IdentifierPattern(String[][] patterns, int... requiredMatches) throws InputMismatchException
    {
        // First check if there number of patterns and required mathces are the same
        if(patterns.length != requiredMatches.length) 
        {
            throw new InputMismatchException("Mismatched number of patterns ("+patterns.length+") and matches ("+requiredMatches.length+")"); 
        }
        // Check if we require more matches for a pattern than it has values to match against
        for(int i = 0; i < patterns.length; i++) // 
        {
            if(patterns[i].length < requiredMatches[i])
            {
                throw new InputMismatchException("Insufficient values for pattern " + i + ". Found " + patterns[i].length + ", but need " + requiredMatches[i] + "."); 
            }
        }

        this.patterns = patterns;
        this.requiredMatches = requiredMatches; 
    }

    public boolean testIdentifierForMatch(String fieldName)
    {
        // Convert everything to lowercase letters to avoid capital overly pedantic results
        fieldName = fieldName.toLowerCase(); 

        int[] matches = new int[requiredMatches.length]; 

        // Loop through all patterns
        for(int i = 0; i < matches.length; i++)
        {
            // Get the ith pattern and count the number of matches
            String[] pattern = patterns[i]; 
            for(int j = 0; j < pattern.length; j++)
            {
                if(fieldName.contains(pattern[j].toLowerCase()))
                {
                    matches[i]++; 
                }
            }

            // If we don't have the correct number of matches, return false
            if(matches[i] < requiredMatches[i])
            {
                return false; 
            }
        }

        // We haven't failed so it must be a good match
        return true; 
    }

    public boolean testIdentifierForMatch(Field field)
    {
        return this.testIdentifierForMatch(field.getName()); 
    }
}
